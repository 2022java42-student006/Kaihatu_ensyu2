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
import la.dao.ADD_searchHotelInfoDAO;
import la.dao.DAOException;
import la.dao.SearchHotelDAO;

@WebServlet("/SearchHotelServlet")
public class SearchHotelServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String action = request.getParameter("action");

		if (action.equals("hotelsearch")) {
			try {
				
				SearchHotelDAO dao = new SearchHotelDAO();
				HttpSession session = request.getSession();
				String ac_name = request.getParameter("ac_Name");
				List<HotelBean> list = dao.findHotel(ac_name);
				session.setAttribute("hotel", list);
				gotoPage(request, response, "/hotel_SeaNameRes.jsp");
			} catch (DAOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		
		
		if(action.equals("search")){
			try {
				 ADD_searchHotelInfoDAO dao = new ADD_searchHotelInfoDAO();
				 HttpSession session = request.getSession();
					String ac_name = request.getParameter("ac_name");
					List<HotelBean> list = dao.findHotel(ac_name);
					session.setAttribute("hotels", list);
					gotoPage(request, response, "/add_hotelInfo.jsp");
				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
				 
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String page)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
}
