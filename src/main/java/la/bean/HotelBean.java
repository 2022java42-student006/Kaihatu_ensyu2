package la.bean;
import java.io.Serializable;


public class HotelBean implements Serializable {
	
	private int ac_id;
	private String ac_name;
	private int ac_code;
	private String ac_address;
	private String ac_tel;
	private int ac_room;
	private int plan_id;
	
	public HotelBean() {
		
	}
	
	public HotelBean(int ac_id,String ac_name,int ac_code,String ac_address,String ac_tel,int ac_room,int plan_id) {
		this.ac_id = ac_id;
		this.ac_name = ac_name;
		this.ac_code = ac_code;
		this.ac_address = ac_address;
		this.ac_tel = ac_tel;
		this.ac_room = ac_room;
		this.plan_id = plan_id;
	}
	 
	public void setAc_id(int ac_id) {
		this.ac_id = ac_id;
	}
	
	public int getAc_id() {
		return ac_id;
	}
	
	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}
	
	public String getAc_name() {
		return ac_name;
	}
	
	public void setAc_code(int ac_code) {
		this.ac_code = ac_code;
	}
	
	public int getAc_code() {
		return ac_code;
	}
	
	public void setAc_address(String ac_address) {
		this.ac_address = ac_address;
	}
	
	public String getAc_address() {
		return ac_address;
	}
	
	public void setAc_tel(String ac_tel) {
		this.ac_tel = ac_tel;
	}
	
	public String getAc_tel() {
		return ac_tel;
	}
	
	public void setAc_Room(int ac_room) {
		this.ac_room= ac_room;
	}
	
	public int getAc_room() {
		return ac_room;
	}
	
	public void set(int plan_id) {
		this.plan_id = plan_id;
	}
	
	public int getplan_id() {
		return plan_id;
	}
} 

