package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import la.bean.HotelBean;

public class Add_RegHotelPlanDAO {
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public Add_RegHotelPlanDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}

	public void savePlan(HotelBean hotel, int ac_id) throws DAOException {
		String sql = "INSERT INTO plan_information(ac_id, plan_name, plan_sub, price, room_num) VALUES(?,?,?,?,?)";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.setInt(1, ac_id);
			st.setString(2, hotel.getPlan_name());
			st.setString(3, hotel.getPlan_sub());
			st.setInt(4, hotel.getPrice());
			st.setInt(5, hotel.getRoom_num());
			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの操作に失敗しました。");
		}
	}

	public List<HotelBean> showPlan(int ac_id) throws DAOException {
		String sql = "SELECT plan_id, plan_name, plan_sub, price, room_num FROM plan_information WHERE ac_id = ?";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.setInt(1, ac_id);

			ResultSet rs = st.executeQuery();
			List<HotelBean> list = new ArrayList<HotelBean>();
			while (rs.next()) {
				int plan_id = rs.getInt("plan_id");
				String plan_name = rs.getString("plan_name");
				String plan_sub = rs.getString("plan_sub");
				int price = rs.getInt("price");
				int room_num = rs.getInt("room_num");
				HotelBean bean = new HotelBean(ac_id, plan_id, plan_name, plan_sub, price, room_num);
				list.add(bean);

			}

			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの操作に失敗しました。");
		}
	}
}
