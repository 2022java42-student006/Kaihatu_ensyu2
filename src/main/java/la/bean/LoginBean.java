package la.bean;

public class LoginBean {
	private int login_id;
	private String password;
	
	public LoginBean(int login_id,String password) {
		this.login_id=login_id;
		this.password=password;
		}
	public LoginBean() {	
	}
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id=login_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}

}
