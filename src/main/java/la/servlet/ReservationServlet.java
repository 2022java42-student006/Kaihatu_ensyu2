package la.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import la.bean.ReservationBean;
import la.dao.DAOException;
import la.dao.ReservationDAO;

@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			request.setCharacterEncoding("UTF-8");

			String action = request.getParameter("action");
			if (action.equals("reserve")) {
				int cidate = Integer.parseInt(request.getParameter("ci_date"));
				int codate = Integer.parseInt(request.getParameter("co_date"));
				int planid = Integer.parseInt(request.getParameter("plan_id"));
				if (cidate - codate < 0) {
					// error
					gotoPage(request, response, "/hotel_SelectPlan2.jsp");
				}
				ReservationDAO dao = new ReservationDAO();
				List<ReservationBean> list = dao.CheckDate(planid);
				for (ReservationBean li : list) {
					if (li.getCi_date() > codate || li.getCo_date() < cidate) {
						ReservationBean bean = new ReservationBean();
						//bean.setMem_id(bean.getMem_id());
						bean.setMem_id(3);
						bean.setPlan_id(planid);
						bean.setCi_date(cidate);
						bean.setCo_date(codate);
						bean.setNum_people(Integer.parseInt(request.getParameter("num_people")));

						dao.AcReserved(bean);

						session.setAttribute("reserve", bean);

						gotoPage(request, response, "/mem_MyPage.jsp");
					}
				}

			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

	protected void gotoPage(HttpServletRequest request, HttpServletResponse response, String page)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
