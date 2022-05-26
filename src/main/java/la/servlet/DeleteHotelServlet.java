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
import la.dao.DeleteHotelDAO;

@WebServlet("/DeleteHotelServlet")
public class DeleteHotelServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");

			String action = request.getParameter("action");
			DeleteHotelDAO dao = new DeleteHotelDAO();

			if (action.equals("delete")) {
				HttpSession session = request.getSession();

				HotelBean bean = (HotelBean) session.getAttribute("hotel");
				int ac_id = bean.getAc_id();
				dao.deleteByHotelID(ac_id);
				gotoPage(request, response, "/add_hotelDelRes.jsp");
				return;
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
