package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import la.bean.Add_LoginBean;

	public class Add_LoginDAO {
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public Add_LoginDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("ドライバの登録に失敗しました。");
		}
	}

	public boolean DisplayMemInfo(int login_id, String password) throws DAOException {

		String sql = "SELECT * FROM kanri_information WHERE login_id = ? AND password = ?";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.setInt(1, login_id);
			st.setString(2, password);

			try (ResultSet rs = st.executeQuery();) {

				if (rs.next()) {
					return true;
				}
					return false;

			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException("レコードの取得に失敗しました。");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		}
	}

	public Add_LoginBean findKanri(int key) throws DAOException {

		String sql = "SELECT * FROM kanri_information WHERE login_id = ?";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			
			st.setInt(1, key);
			
			try (ResultSet rs = st.executeQuery();) {
				if (rs.next()) {
					int login_id = rs.getInt("login_id");
					String kanri_name = rs.getString("kanri_name");
					String password = rs.getString("password");
					Add_LoginBean bean = new Add_LoginBean(login_id, kanri_name, password);
					
					return bean;
					
				} else {
					return null;
				}
				
			} catch (SQLException e) {

				e.printStackTrace();
				throw new DAOException("レコードの取得に失敗しました。");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		}

	}
}
