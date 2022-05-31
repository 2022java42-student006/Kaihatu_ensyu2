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

import la.bean.HotelBean;
import la.bean.MemberBean;
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
				HotelBean hotel = (HotelBean) session.getAttribute("choice");
				int planid = hotel.getplan_id();
				if (cidate - codate > 0) {
					// error
					System.out.println("日にちエラー");
					gotoPage(request, response, "/hotel_SelectPlan2.jsp");
				} else {
					ReservationDAO dao = new ReservationDAO();
					List<ReservationBean> list = dao.CheckDate(planid);
					MemberBean member = (MemberBean)session.getAttribute("member");
					ReservationBean bean = new ReservationBean();
					Boolean bool = true;
					
					for (ReservationBean li : list) {
						if (li.getCi_date() > codate || li.getCo_date() < cidate) {
							
							// bean.setMem_id(bean.getMem_id());
//							bean.setMem_id(3);
//							bean.setPlan_id(planid);
//							bean.setCi_date(cidate);
//							bean.setCo_date(codate);
//							bean.setNum_people(Integer.parseInt(request.getParameter("num_people")));

							System.out.println("正常");
							
						}else {
							System.out.println("範囲エラー");
							bool = false;
							break;
						}
					}
					if(bool) {
						bean.setMem_id(member.getMem_id());
						bean.setPlan_id(planid);
						bean.setCi_date(cidate);
						bean.setCo_date(codate);
						bean.setNum_people(Integer.parseInt(request.getParameter("num_people")));
						session.setAttribute("reserve", bean);
						System.out.println("予約完了");
						gotoPage(request, response, "/mem_MyPage.jsp");
						dao.AcReserved(bean);
					}else {
						gotoPage(request, response, "/hotel_SelectPlan2.jsp");
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
