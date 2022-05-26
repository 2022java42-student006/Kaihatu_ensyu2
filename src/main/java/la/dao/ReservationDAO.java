package la.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

	public void AcReserved(ReservationBean reserve) throws DAOException {
		String sql = "INSERT INTO reservation(mem_id,plan_id,ci_date,co_date,num_people) VALUES(?,?,?,?)";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setInt(1, reserve.getMem_id());
			st.setInt(2, reserve.getPlan_id());
			st.setInt(3, reserve.getCi_date());
			st.setInt(4, reserve.getCo_date());
			st.setInt(5, reserve.getNum_people());
			
			st.executeQuery();
		}catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの操作に失敗しました。");
		}
	}
}
