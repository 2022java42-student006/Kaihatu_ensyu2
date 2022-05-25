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
import la.dao.DeleteDAO;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");

			String action = request.getParameter("action");
			DeleteDAO dao = new DeleteDAO();

			if (action.equals("confirm")) {
				
				//テスト用 mem_id=3を消しました
				HttpSession session = request.getSession();
				MemberBean bean = new MemberBean();
				bean.setMem_id(3);
				session.setAttribute("member", bean);
				//ここまでテスト用
				//MemberBean bean = (MemberBean) session.getAttribute("member");
				gotoPage(request, response, "/add_memDel.jsp");
				return;
			}
			if (action.equals("delete")) {
				HttpSession session = request.getSession();
				// 結合テスト時"memberを要変更
				MemberBean bean = (MemberBean) session.getAttribute("member");
				int mem_id = bean.getMem_id();
				dao.deleteBymemberID(mem_id);
				gotoPage(request, response, "/add_memDelRes.jsp");
				return;
			}

		} catch (DAOException e) {
			e.printStackTrace();

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
