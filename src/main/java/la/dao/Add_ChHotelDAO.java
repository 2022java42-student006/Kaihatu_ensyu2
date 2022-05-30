package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import la.bean.HotelBean;

public class Add_ChHotelDAO {
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public Add_ChHotelDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}

	public void saveHotel(HotelBean hotel, int i) throws DAOException {

		String sql = "UPDATE accommodation_information SET ac_name = ?, ac_address= ?, ac_tel= ?, ac_room= ?,plan_id= ?,checkin_time= ?,checkout_time= ? WHERE ac_id = ?";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.setString(1, hotel.getAc_name());
			st.setString(2, hotel.getAc_address());
			st.setString(3, hotel.getAc_tel());
			st.setInt(4, hotel.getAc_room());
			st.setInt(5, hotel.getplan_id());
			st.setInt(6, hotel.getCheckin_time());
			st.setInt(7, hotel.getCheckout_time());
			
			st.setInt(8, i);

			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの操作に失敗しました。");
		}

	}

}
