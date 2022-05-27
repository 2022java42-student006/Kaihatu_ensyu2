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
import la.dao.Add_RegHotelPlanDAO;
import la.dao.DAOException;


@WebServlet("/Add_RegHotelPlanServlet")
public class Add_RegHotelPlanServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			request.setCharacterEncoding("UTF-8");
			
			HotelBean bean = new HotelBean();
		
			bean.setPlan_name(request.getParameter("plan_name"));
			bean.setPlan_sub(request.getParameter("plan_sub"));
			bean.setPrice(Integer.parseInt(request.getParameter("price")));
			bean.setRoom_num(Integer.parseInt(request.getParameter("room_num")));

			HttpSession session = request.getSession();
			
			int ac_id = (int) session.getAttribute("ac_id");
			
			Add_RegHotelPlanDAO reg = new Add_RegHotelPlanDAO();
			reg.savePlan(bean, ac_id);
			
			
			List<HotelBean>list=reg.showPlan(ac_id);
			session.setAttribute("plans", list);
			
			gotoPage(request,response,"/add_hotelPlanReg.jsp");
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