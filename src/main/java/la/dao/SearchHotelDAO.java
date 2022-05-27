package la.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import la.bean.HotelBean;

public class SearchHotelDAO {
	
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public SearchHotelDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}
	
	public HotelBean findHotel(int ac_id) throws DAOException{
		String sql ="SELECT * FROM accommodation_information WHERE ac_id =?";
		
		
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.setInt(1, ac_id);

			try (ResultSet rs = st.executeQuery();) {
				HotelBean bean=null;
				while (rs.next()) {
					int acId = rs.getInt("ac_id");
					String ac_name = rs.getString("ac_name");
					int ac_code = rs.getInt("ac_code");
					String ac_address = rs.getString("ac_address");
					String ac_tel = rs.getString("ac_tel");
					int ac_room = rs.getInt("ac_room");
					int plan_id = rs.getInt("plan_id");
					int checkin_time = rs.getInt("checkin_time");
					int checkout_time = rs.getInt("checkout_time");
					bean = new HotelBean(acId, ac_name, ac_code, ac_address, ac_tel, ac_room, plan_id, checkin_time, checkout_time);
					
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
