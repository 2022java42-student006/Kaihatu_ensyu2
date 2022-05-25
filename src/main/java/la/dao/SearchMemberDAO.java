package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

	public List<MemberBean> findMember(String email) throws DAOException {
		String sql = "SELECT * FROM member_information WHERE email = ?";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.setString(1, email);
			
			try(
					ResultSet rs= st.executeQuery();){
				List<MemberBean>list= new ArrayList<MemberBean>();
				while(rs.next()) {
					int mem_id = rs.getInt("mem_id");
					String name= rs.getString("name");
					String address = rs.getString("address");
					String tel= rs.getString("tel");
					String emailAddress = rs.getString("email");
					String birthday = rs.getString("birthday");
					int login_id = rs.getInt("login_id");
					String password = rs.getString("password");
					MemberBean bean= new MemberBean(mem_id, name, address, tel, emailAddress, birthday, login_id, password);
					list.add(bean);
				
				}
				return list;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new DAOException("レコードの操作に失敗しました。");
		}catch(SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの操作に失敗しました。");
		}
		
		}

	}
