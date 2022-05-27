package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import la.bean.MemberBean;

public class ChangeDAO {

	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public ChangeDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}

	public void saveMember(MemberBean member, int i) throws DAOException {

		String sql = "UPDATE member_information SET name = ?, address= ?, tel= ?, email= ?, birthday= ?,login_id= ?,password= ? WHERE mem_id = ?";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.setString(1, member.getName());
			st.setString(2, member.getMem_address());
			st.setString(3, member.getTel());
			st.setString(4, member.getEmail());
			st.setDate(5, java.sql.Date.valueOf(member.getBirthday()));
			st.setInt(6, member.getLogin_id());
			st.setString(7, member.getPassword());

			st.setInt(8, i);

			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの操作に失敗しました。");
		}

	}
}
