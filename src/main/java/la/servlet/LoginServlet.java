package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import la.dao.DAOException;
import la.dao.LoginDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String action = request.getParameter("action");

		if (action.equals("login")) {

			int login_id = Integer.parseInt(request.getParameter("login_id"));
			String password = request.getParameter("password");
			
			try {

				LoginDAO dao = new LoginDAO();

				if (dao.DisplayMemInfo(login_id, password)) {

					HttpSession session = request.getSession();

					session.setAttribute("member", dao.findMember(login_id));
					
					gotoPage(request, response, "/mem_MyPage.jsp");
				} else {
					
					gotoPage(request, response, "/mem_Login.jsp");
					request.setAttribute("message", "もう一度ログインしてください");
					

				}

			} catch (DAOException e) {
				e.printStackTrace();
				
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String page)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);

	}

}
