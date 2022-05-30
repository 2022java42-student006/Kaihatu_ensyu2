package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import la.bean.ReservationBean;

public class CheckDAO {
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public CheckDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}

	}

	public List<ReservationBean> listReservarion(int mem_id) throws DAOException {
		String sql = "SELECT ac.ac_name,ac.ac_address,pl.plan_name,pl.plan_sub,pl.price,re.num_people,re.ci_date,ac.checkin_time,re.co_date,ac.checkout_time "
				+ "FROM(reservation re INNER JOIN plan_information pl ON re.plan_id=pl.plan_id)\r\n"
				+ "INNER JOIN accommodation_information ac ON pl.ac_id=ac.ac_id WHERE mem_id = ?;";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setInt(1, mem_id);
			try (ResultSet rs = ps.executeQuery();) {
				List<ReservationBean> list = new ArrayList<ReservationBean>();
				while (rs.next()) {
					String ac_name = rs.getString("ac_name");
					String ac_address = rs.getString("ac_address");
					String plan_name = rs.getString("plan_name");
					String plan_sub = rs.getString("plan_sub");
					int price = rs.getInt("price");
					int num_people = rs.getInt("num_people");
					int ci_date = rs.getInt("ci_date");
					int checkin_time = rs.getInt("checkin_time");
					int co_date = rs.getInt("co_date");
					int checkout_time = rs.getInt("checkout_time");
					ReservationBean bean = new ReservationBean(ac_name, ac_address, plan_name, plan_sub, price,
							num_people, ci_date, checkin_time, co_date, checkout_time);
					list.add(bean);
				}
				return list;

			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException("レコードの取得に失敗しました。");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		}
	}
}
