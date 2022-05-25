package la.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import la.bean.ItemBean;
import la.dao.DAOException;
import la.dao.itemForm2;

/**
 * Servlet implementation class ItemServlet3
 */

@WebServlet("/ItemServlet3")
public class ItemServlet3 extends HttpServlet {
	
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			request.setCharacterEncoding("UTF-8");
			// パラメータの解析
			String action = request.getParameter("action");
			// モデルのDAOを作成
			ItemDAO3 dao = new ItemDAO3();
			// パラメータなしの場合はレコードを表示
			if (action == null || action.length() == 0) {
				List<ItemBean> list = dao.findAll();
				// Listをリクエストスコープに入れてJSPへフォーワードする
				request.setAttribute("items", list);
				gotoPage(request, response, "/showItem3.jsp");
			}
			// addは追加
			else if (action.equals("add")) {
				String name = request.getParameter("name");
				int price = Integer.parseInt(request.getParameter("price"));
			    dao.addItem(name, price);
			    // 追加後、全レコード表示
			    List<ItemBean> list = dao.findAll();
			    // Listをリクエストスコープに入れてJSPへフォーワードする
			    request.setAttribute("items", list);
			    gotoPage(request, response, "/showItem3.jsp");
			}
			// sortはソート
			else if (action.equals("sort")) {
				String key = request.getParameter("key");
				List<ItemBean> list;
				if (key.equals("price_asc")) {
					list = dao.sortPrice(true);
				} else {
					list = dao.sortPrice(false);
				}
				// Listをリクエストスコープに入れてJSPへフォーワードする
				request.setAttribute("items", list);
				gotoPage(request, response, "/showItem3.jsp");
				}
			// 変更後、全レコード表示
			List<ItemBean> list = dao.findAll();
			// Listをリクエストスコープに入れてJSPへフォーワードする
			request.setAttribute("items", list);
			gotoPage(request, response, "/showItem3.jsp");
		} else {
			request.setAttribute("message", "正しく操作してください。");
			gotoPage(request, response, "/errInternal.jsp");
		 }
	} catch (DAOException e) {
		e.printStackTrace();
		request.setAttribute("message", "内部エラーが発生しました。");
		gotoPage(request, response, "/errInternal.jsp");
			}
         }

        private void gotoPage(HttpServletRequest request, HttpServletResponse response, String page)
                     throws ServletException, IOException {
        	RequestDispatcher rd = request.getRequestDispatcher(page);
        	rd.forward(request, response);
        }	
        
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                       throws ServletException, IOException {
        	doGet(request, response);
    
        }
}