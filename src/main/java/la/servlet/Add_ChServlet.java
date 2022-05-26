package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import la.bean.MemberBean;
import la.dao.ChangeDAO;
import la.dao.DAOException;

@WebServlet("/Add_ChangeServlet")
public class Add_ChServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			request.setCharacterEncoding("UTF-8");

			String year = request.getParameter("year");
			String month = request.getParameter("month");
			String day = request.getParameter("day");

			String Birthday = year + "-" + month + "-" + day;

			MemberBean bean = new MemberBean();
			bean.setName(request.getParameter("name"));
			bean.setMem_address(request.getParameter("Mem_address"));
			bean.setTel(request.getParameter("Tel"));
			bean.setEmail(request.getParameter("Email"));
			bean.setBirthday(Birthday);

			bean.setLogin_id(Integer.parseInt(request.getParameter("login_id")));
			bean.setPass(request.getParameter("password"));

			ChangeDAO change = new ChangeDAO();

			change.saveMember(bean);

			gotoPage(request, response, "/add_memTop.jsp");

		} catch (DAOException e) {
			e.printStackTrace();
		}

	}

	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String page)
			throws ServletException, IOException {
		RequestDispatcher change = request.getRequestDispatcher(page);
		change.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}                                      