package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import la.bean.MemberBean;


public class LoginDAO {
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public LoginDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("ドライバの登録に失敗しました。");
		}
	}

	public boolean DisplayMemInfo(int login_id, String password) throws DAOException {
		
		String sql = "SELECT * FROM member_information WHERE login_id = ? AND password = ? AND se_date IS NULL;";
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


	public MemberBean findMember(int key) throws DAOException {

		String sql = "SELECT * FROM member_information WHERE login_id = ?";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setInt(1, key);
			try (ResultSet rs = st.executeQuery();) {
				if (rs.next()) {
					int mem_id=rs.getInt("mem_id");
					String name = rs.getString("name");
					String tel = rs.getString("tel");
					String email = rs.getString("email");
					String mem_address = rs.getString("address");
					String birthday = rs.getString("birthday");
					int loginID = rs.getInt("login_id");
					String password = rs.getString("password");
					MemberBean bean = new MemberBean(mem_id,name, tel, email, mem_address, birthday, loginID,
							password);
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
