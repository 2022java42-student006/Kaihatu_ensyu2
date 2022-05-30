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

import la.bean.MemberBean;
import la.bean.ReservationBean;
import la.dao.CheckDAO;
import la.dao.DAOException;

@WebServlet("/checkReserveServlet")
public class checkReserveServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession(false);
		if (session == null) {
			request.setAttribute("message", "セッションが切れております。ログインしなおしてください");
			gotoPage(request, response, "mem_Login.jsp");
			return;
		}
		String action = request.getParameter("action");
		if (action.equals("check")) {
			MemberBean member = (MemberBean) session.getAttribute("member");
			int mem_id = member.getMem_id();
			try {
				CheckDAO dao = new CheckDAO();
				List<ReservationBean> list = dao.listReservarion(mem_id);
				request.setAttribute("relist", list);
				gotoPage(request, response, "/CheckReservation.jsp");
			} catch (DAOException e) {
				e.printStackTrace();
			}

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void gotoPage(HttpServletRequest request, HttpServletResponse response, String page)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);

	}
}
