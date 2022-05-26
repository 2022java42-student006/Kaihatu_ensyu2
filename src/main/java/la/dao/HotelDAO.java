package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import la.bean.HotelBean;

public class HotelDAO {
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";
	
	public HotelDAO() throws DAOException{
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}
	
	public void saveHotel(HotelBean hotel) throws DAOException{
	String sql = "INSERT INTO accommodation_information(ac_name,ac_code,ac_address,ac_tel,ac_room,plan_id) VALUES(?,?,?,?,?,?)";
		
	try(
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(sql);){
		
		st.setString(1, hotel.getAc_name());
		st.setInt(2, hotel.getAc_code());
		st.setString(3, hotel.getAc_address());
		st.setString(4, hotel.getAc_tel());
		st.setInt(5, hotel.getAc_room());
		st.setInt(6, hotel.getplan_id());
		
		st.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
		throw new DAOException("レコードの操作に失敗しました。");
	}
	}
}
