package la.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import la.bean.HotelBean;

public class ADD_searchHotelInfoDAO {
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public ADD_searchHotelInfoDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}
	
	public List<HotelBean> findHotel(String ac_Name) throws DAOException{
		String sql ="SELECT * FROM accommodation_information WHERE ac_name =?";
		
		
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.setString(1, ac_Name);

			try (ResultSet rs = st.executeQuery();) {
				List<HotelBean> list = new ArrayList<HotelBean>();
				while (rs.next()) {
					int ac_id = rs.getInt("ac_id");
					String ac_name = rs.getString("ac_name"); 
				
					String ac_address = rs.getString("ac_address");
					String ac_tel = rs.getString("ac_tel");
					int ac_room = rs.getInt("ac_room");
					int checkin_time = rs.getInt("checkin_time");
					int checkout_time=rs.getInt("checkout_time");
					HotelBean bean = new HotelBean(ac_id, ac_name, ac_address, ac_tel, ac_room,checkin_time,checkout_time);
					list.add(bean);
				}
				return list;

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
