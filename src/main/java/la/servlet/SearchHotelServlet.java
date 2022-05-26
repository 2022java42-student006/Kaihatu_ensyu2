package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import la.bean.HotelBean;
import la.dao.DAOException;
import la.dao.SearchHotelDAO;


@WebServlet("/SearchHotelServlet")
public class SearchHotelServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");

			String action = request.getParameter("action");
			SearchHotelDAO dao = new SearchHotelDAO();

			if (action.equals("search")) {
				HttpSession session = request.getSession();
				int ac_id = Integer.parseInt(request.getParameter("ac_id"));
				HotelBean bean = dao.findHotel(ac_id);

				session.setAttribute("hotel", bean);
				gotoPage(request, response, "/add_hotelInfo.jsp");

			}
		} catch (DAOException e) {
			e.printStackTrace();

		}

	}
	

	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String page)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
