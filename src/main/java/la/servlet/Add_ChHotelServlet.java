package la.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import la.bean.HotelBean;
import la.bean.MemberBean;
import la.dao.Add_ChHotelDAO;
import la.dao.SearchMemberDAO;

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
	
		Add_ChHotelDAO change = new Add_ChHotelDAO();
		
		HttpSession session = request.getSession();
		HotelBean bean1 = (HotelBean)session.getAttribute("");
		
		int mem_id = bean1.getAc_id();

		change.saveHotel(bean, mem_id);

	    dao = new(); 
		HotelBean bean2 = dao.saveHotel(bean.getAc_id());
		
		session.setAttribute("", bean2);
		
		gotoPage(request, response, "/add_memInfo.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
