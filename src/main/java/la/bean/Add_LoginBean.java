package la.bean;

import java.io.Serializable;


//管理ログイン用Bean

public class Add_LoginBean implements Serializable{

	private int login_id;
	private String password;
	private String kanri_name;
	
	public Add_LoginBean (int login_id,	String kanri_name, String password) {
		this.login_id = login_id;
		this.kanri_name = kanri_name;
		this.password = password;
		
	}
	
	public Add_LoginBean() {
		
	}
	
	public int getLogin_id() {
		return login_id;
	}
	
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}
	
	public String getKanri_name() {
		return kanri_name;
	}
	
	public void setKanri_name(String kanri_name) {
		this.kanri_name = kanri_name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
