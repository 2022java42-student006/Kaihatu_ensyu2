package la.servlet;

import java.io.IOException;

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
		try {
			request.setCharacterEncoding("UTF-8");

			String action = request.getParameter("action");
			if (action.equals("reserve")) {
				ReservationBean bean = new ReservationBean();
				bean.setMem_id(Integer.parseInt(request.getParameter("mem_id")));
				bean.setPlan_id(Integer.parseInt(request.getParameter("plan_id")));
				bean.setCi_date(Integer.parseInt(request.getParameter("ci_date")));
				bean.setCo_date(Integer.parseInt(request.getParameter("co_date")));
				bean.setNum_people(Integer.parseInt(request.getParameter("num_people")));

				ReservationDAO dao = new ReservationDAO();

				dao.AcReserved(bean);
				
				HttpSession session = request.getSession();

				session.setAttribute("reserve", bean);
				
				gotoPage(request, response, "/top.jsp");

			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}
	protected void gotoPage(HttpServletRequest request,HttpServletResponse response,String page)throws ServletException,IOException{
		RequestDispatcher rd =request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
