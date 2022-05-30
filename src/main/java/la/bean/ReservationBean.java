package la.bean;

public class ReservationBean {

	private int mem_id;
	private int plan_id;
	private int login_id;
	private String password;
	private int ci_date;
	private int co_date;
	private int num_pepole;
	private int price;

	private String ac_name;
	private String ac_address;
	private String plan_name;
	private int checkin_time;
	private int checkout_time;
	private String plan_sub;

	public ReservationBean() {

	}

	public ReservationBean(int mem_id, int plan_id, int login_id, String password, int ci_date, int co_date,
			int num_people) {
		this.mem_id = mem_id;
		this.plan_id = plan_id;
		this.login_id = login_id;
		this.password = password;
		this.ci_date = ci_date;
		this.co_date = co_date;
		this.num_pepole = num_people;
	}

	public ReservationBean(int ci_date, int co_date) {
		this.ci_date = ci_date;
		this.co_date = co_date;
	}

	public ReservationBean(String ac_name, String ac_address, String plan_name, String plan_sub, int price,
			int num_people, int ci_date, int checkin_time, int co_date, int checkout_time) {
		this.ac_name = ac_name;
		this.ac_address = ac_address;
		this.plan_name = plan_name;
		this.plan_sub = plan_sub;
		this.price = price;
		this.num_pepole = num_people;
		this.ci_date = ci_date;
		this.checkin_time = checkin_time;
		this.co_date = co_date;
		this.checkout_time = checkout_time;

	}

	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}

	public int getMem_id() {
		return mem_id;
	}

	public void setPlan_id(int ac_id) {
		this.plan_id = ac_id;
	}

	public int getPlan_id() {
		return plan_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public int getLogin_id() {
		return login_id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setCi_date(int ci_date) {
		this.ci_date = ci_date;
	}

	public int getCi_date() {
		return ci_date;
	}

	public void setCo_date(int co_date) {
		this.co_date = co_date;
	}

	public int getCo_date() {
		return co_date;
	}

	public void setNum_people(int num_people) {
		this.num_pepole = num_people;
	}

	public int getNum_people() {
		return num_pepole;
	}

	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}

	public String getAc_name() {
		return ac_name;
	}

	public void setAc_address(String ac_address) {
		this.ac_address = ac_address;
	}

	public String getAc_address() {
		return ac_address;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setCheckin_time(int checkin_time) {
		this.checkin_time = checkin_time;
	}

	public int getCheckin_time() {
		return checkin_time;
	}

	public void setCheckout_time(int checkout_time) {
		this.checkout_time = checkout_time;
	}

	public int getCheckout_time() {
		return checkout_time;
	}

	public void setPlan_sub(String plan_sub) {
		this.plan_sub = plan_sub;
	}

	public String getPlan_sub() {
		return plan_sub;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}