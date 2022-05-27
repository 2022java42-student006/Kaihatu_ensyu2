package la.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import la.bean.HotelBean;


@WebServlet("/Add_ChHotelServlet")
public class Add_ChHotelServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		HotelBean bean = new HotelBean();
		
		bean.setAc_name(request.getParameter("hotel_name"));
		bean.setAc_id(Integer.parseInt(request.getParameter("hotel_code")));
		bean.setAc_address(request.getParameter("hotel_address"));
		bean.setAc_tel(request.getParameter("hotel_tel"));
		bean.setAc_Room(Integer.parseInt(request.getParameter("hotel_room")));
		bean.setplan_id(Integer.parseInt(request.getParameter("plan_id")));
		bean.setCheckin_time(Integer.parseInt(request.getParameter("checkin_time")));
		bean.setCheckout_time(Integer.parseInt(request.getParameter("checkout_time")));
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
