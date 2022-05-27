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
import la.dao.ChangeDAO;
import la.dao.DAOException;
import la.dao.SearchMemberDAO;

@WebServlet("/Add_ChServlet")
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
			bean.setMem_address(request.getParameter("mem_address"));
			bean.setTel(request.getParameter("Tel"));
			bean.setEmail(request.getParameter("Email"));
			bean.setBirthday(Birthday);
			bean.setLogin_id(Integer.parseInt(request.getParameter("login_id")));
			bean.setPass(request.getParameter("password"));

			ChangeDAO change = new ChangeDAO();
			
			HttpSession session = request.getSession();
			MemberBean bean1 = (MemberBean)session.getAttribute("member");
			
			int mem_id = bean1.getMem_id();

			change.saveMember(bean, mem_id);

			SearchMemberDAO dao = new SearchMemberDAO();
			MemberBean bean2 = dao.findMember(bean.getLogin_id());
			
			session.setAttribute("member", bean2);
			
			gotoPage(request, response, "/add_memInfo.jsp");

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