package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import la.dao.Add_LoginDAO;
import la.dao.DAOException;


@WebServlet("/Add_LoginServlet")
public class Add_LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");

		String action = request.getParameter("action");

		if (action.equals("login_info")) {

			int login_id = Integer.parseInt(request.getParameter("login_id"));
			String password = request.getParameter("password");
			
			try {

				Add_LoginDAO dao = new Add_LoginDAO();

				if (dao.DisplayMemInfo(login_id, password)) {

					HttpSession session = request.getSession();

					session.setAttribute("kanri", dao.findKanri(login_id));

					gotoPage(request, response, "/add_Top.jsp");
					
				} else {
					
					gotoPage(request, response, "/add_Login.jsp");

				}

			} catch (DAOException e) {
				e.printStackTrace();
			}
		}
	}

	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String page)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}
	

}
