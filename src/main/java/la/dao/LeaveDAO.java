package la.dao;

public class LeaveDAO {
	private String url = "jdbc:postgresql:webinn";
	private String user = "webinnuser";
	private String pass = "himitu";

	public LeaveDAO() throws DAOException{
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("JDBCドライバの登録に失敗しました。");
		}
	}
	
	public void LeaveMember(int Mem_id) throws DAOException{
		String sql = "INSERT INTO member_information(se_date) VALUES() "
	}

}
