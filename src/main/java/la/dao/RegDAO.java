package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import la.bean.MemberBean;

public class RegDAO {

	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";
	
	public RegDAO() throws DAOException{
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}

public void saveMember(MemberBean member) throws DAOException{
		
		String sql = "INSERT INTO member_information(name, mem_address, tel, email, birthday,login_id, password, en_date) VALUES(?, ?, ?, ?, '"+member.getBirthday()+"', ?, ?, current_date)";
		
		try(
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement st = con.prepareStatement(sql);){
				
				
				st.setString(1, member.getName());
				st.setString(2, member.getMem_address());
				st.setString(3, member.getTel());
				st.setString(4, member.getEmail());
				st.setInt(5, member.getLogin_id());
				st.setString(6, member.getPass());
				
				st.executeUpdate();
				
			}catch(SQLException e) {
				e.printStackTrace();
				throw new DAOException("レコードの操作に失敗しました。");
			}
		
	}

}
