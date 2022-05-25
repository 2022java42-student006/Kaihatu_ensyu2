package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import la.dao.DAOException;
import la.dao.DeleteDAO;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try{
			request.setCharacterEncoding("UTF-8");
			
			String action = request.getParameter("action");
			DeleteDAO dao = new DeleteDAO();
			
			
			
			if(action.equals("delete")) {
				int mem_id= Integer.parseInt(request.getParameter("memberID"));
				dao.deleteBymemberID(mem_id);
				
				
				gotoPage(request, response, "/add_memDelRes.jsp");
			}
			
		}catch(DAOException e) {
			e.printStackTrace();

		}
		
		
		
		
		}

	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String page) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
