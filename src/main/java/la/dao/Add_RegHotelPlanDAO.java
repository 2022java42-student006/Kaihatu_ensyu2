package la.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import la.bean.HotelBean;

public class Add_RegHotelPlanDAO {
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";
	
	public Add_RegHotelPlanDAO() throws DAOException{
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}
	
	public void savePlan(HotelBean hotel, int ac_id)throws DAOException{
		String sql ="INSERT INTO plan_information(ac_id, plan_name, plan_sub, price, room_num) VALUES(?,?,?,?,?)";
		
		try(
				Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);){
			
			st.setInt(1, ac_id);
			st.setString(2, hotel.getPlan_name());
			st.setString(3, hotel.getPlan_sub());
			st.setInt(4, hotel.getPrice());
			st.setInt(5, hotel.getRoom_num());
			st.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの操作に失敗しました。");
		}
	}
	
}
