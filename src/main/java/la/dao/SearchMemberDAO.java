package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import la.bean.MemberBean;

public class SearchMemberDAO {

	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public SearchMemberDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}

	public MemberBean findMember(int login_id) throws DAOException {
		String sql = "SELECT mem_id, name, address, tel, email, birthday, login_id, password, en_date, se_date "
				+ "FROM member_information WHERE login_id = ?";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.setInt(1, login_id);

			try (ResultSet rs = st.executeQuery();) {
				MemberBean bean = null;
				while (rs.next()) {
					int mem_id = rs.getInt("mem_id");
					String name = rs.getString("name");
					String address = rs.getString("address");
					String tel = rs.getString("tel");
					String emailAddress = rs.getString("email");
					String birthday = rs.getString("birthday");
					int loginId = rs.getInt("login_id");
					String password = rs.getString("password");
					String en_date = rs.getString("en_date");
					String se_date = rs.getString("se_date");
					bean = new MemberBean(mem_id, name, tel, emailAddress, address, birthday, loginId, password,
							en_date, se_date);

				}
				return bean;

			} catch (SQLException e) {

				e.printStackTrace();
				throw new DAOException("レコードの操作に失敗しました。");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの操作に失敗しました。");

		}

	}
}
