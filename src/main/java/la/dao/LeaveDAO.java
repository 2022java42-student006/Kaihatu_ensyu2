package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LeaveDAO {
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public LeaveDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}

	/*
	 * public MemberBean LeaveMember(String name, int login_id, String password)
	 * throws DAOException { String sql =
	 * "SELECT mem_id FROM member_information WHERE name=? AND login_id=? AND password = ?"
	 * ; try (Connection con = DriverManager.getConnection(url, user, pass);
	 * PreparedStatement ps = con.prepareStatement(sql);) { ps.setString(1, name);
	 * ps.setInt(2, login_id); ps.setString(3, password);
	 * 
	 * try (ResultSet rs = ps.executeQuery();) { if (rs.next()) { int mem_id =
	 * rs.getInt("mem_id"); String Name = rs.getString("name"); String tel =
	 * rs.getString("tel"); String email = rs.getString("email"); String mem_address
	 * = rs.getString("mem_address"); String birthday = rs.getString("birthday");
	 * int Login_id = rs.getInt("login_id"); String Password =
	 * rs.getString("password"); String en_date = rs.getString("en_date");
	 * MemberBean bean = new MemberBean(mem_id, Name, tel, email, mem_address,
	 * birthday, Login_id, Password, en_date); return bean; }
	 * 
	 * } catch (Exception e) { // TODO 自動生成された catch ブロック e.printStackTrace(); }
	 * return null;
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); throw new
	 * DAOException("レコードの取得に失敗しました。"); }
	 * 
	 * }
	 */
	public int Updateinfo(String name, int login_id, String password) throws DAOException {
		String sql = "UPDATE member_information SET se_date = current_date WHERE name=? AND login_id=? AND password=?";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setString(1, name);
			st.setInt(2, login_id);
			st.setString(3, password);

			int up = st.executeUpdate();
			return up;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの操作に失敗しました。");
		}
	}

}
