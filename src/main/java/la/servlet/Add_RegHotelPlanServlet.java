package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import la.bean.HotelBean;
import la.dao.DAOException;
import la.dao.HotelDAO;


@WebServlet("/Add_RegHotelPlanServlet")
public class Add_RegHotelPlanServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			request.setCharacterEncoding("UTF-8");
			
			HotelBean bean = new HotelBean();
			
			bean.setplan_id(Integer.parseInt(request.getParameter("plan_id")));
			bean.setAc_id(Integer.parseInt(request.getParameter("ac_id")));
			bean.setAc_name(request.getParameter("hotel_name"));
			bean.setPlan_sub(request.getParameter("plan_sub"));
			bean.setPrice(Integer.parseInt(request.getParameter("price")));
			bean.setRoom_num(Integer.parseInt(request.getParameter("room_num")));

			
			
			HotelDAO reg = new HotelDAO();
			reg.saveHotel(bean);
			
			gotoPage(request,response,"/add_hotelTop.jsp");
		}catch(DAOException e) {
			e.printStackTrace();
		}
	}
	private void gotoPage(HttpServletRequest request, HttpServletResponse response,String page ) throws ServletException, IOException{
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}