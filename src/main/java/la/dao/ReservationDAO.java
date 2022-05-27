package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import la.bean.ReservationBean;

public class ReservationDAO {
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public ReservationDAO() throws DAOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("ドライバの登録に失敗しました。");
		}
	}


	public List<ReservationBean> CheckDate(int plan_id) throws DAOException {
		String sql = "SELECT ci_date,co_date FROM reservation WHERE plan_id = ?";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setInt(1, plan_id);
			try (ResultSet rs = st.executeQuery();) {
				List<ReservationBean> list = new ArrayList<ReservationBean>();
				while (rs.next()) {
					int ci_date = rs.getInt("ci_date");
					int co_date = rs.getInt("co_date");
					ReservationBean bean = new ReservationBean(ci_date, co_date);
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
	public void AcReserved(ReservationBean reserve) throws DAOException {
		String sql = "INSERT INTO reservation(mem_id,plan_id,ci_date,co_date,num_people) VALUES(?,?,?,?,?)";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setInt(1, reserve.getMem_id());
			st.setInt(2, reserve.getPlan_id());
			st.setInt(3, reserve.getCi_date());
			st.setInt(4, reserve.getCo_date());
			st.setInt(5, reserve.getNum_people());

			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの操作に失敗しました。");
		}
	}
}
