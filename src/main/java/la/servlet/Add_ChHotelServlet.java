package la.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import la.bean.HotelBean;
import la.dao.Add_ChHotelDAO;
import la.dao.DAOException;

@WebServlet("/Add_ChHotelServlet")
public class Add_ChHotelServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		try {

			String action = request.getParameter("action");

			if (action.equals("change")) {
				String i = request.getParameter("ac_id");
				request.setAttribute("ac_id", i);
				gotoPage(request, response, "/add_hotelCh.jsp");

			}
			if (action.equals("hotel")) {
				int i1 = Integer.parseInt(request.getParameter("ac_id"));
				
				HotelBean bean = new HotelBean();

				bean.setAc_id(i1);
				bean.setAc_name(request.getParameter("hotel_name"));
				bean.setAc_address(request.getParameter("hotel_address"));
				bean.setAc_tel(request.getParameter("hotel_tel"));
				bean.setAc_Room(Integer.parseInt(request.getParameter("hotel_room")));
				bean.setCheckin_time(Integer.parseInt(request.getParameter("checkin_time")));
				bean.setCheckout_time(Integer.parseInt(request.getParameter("checkout_time")));

				Add_ChHotelDAO change = new Add_ChHotelDAO();

				change.saveHotel(bean, i1);

				List<HotelBean> list = new ArrayList<HotelBean>();
				
				list.add(bean);
				
				HttpSession session = request.getSession();
				
				session.setAttribute("hotels", list);

				gotoPage(request, response, "/add_changedHotelInfo.jsp");
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}

	}

	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String page)
			throws ServletException, IOException {
		RequestDispatcher rb = request.getRequestDispatcher(page);
		rb.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
