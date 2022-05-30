package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import la.bean.MemberBean;
import la.dao.DAOException;
import la.dao.SearchMemberDAO;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");

			String action = request.getParameter("action");
			SearchMemberDAO dao = new SearchMemberDAO();

			if (action.equals("search")) {
				HttpSession session = request.getSession();
				int login_id = Integer.parseInt(request.getParameter("login_id"));
				MemberBean bean = dao.findMember(login_id);

				session.setAttribute("member", bean);
				gotoPage(request, response, "/add_memInfo.jsp");

			}
		} catch (DAOException e) {
			e.printStackTrace();
			request.setAttribute("message", "エラーが発生しました");
			gotoPage(request, response, "/errMessage.jsp");

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
