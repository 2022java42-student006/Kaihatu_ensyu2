package la.bean;

public class ReservationBean {

	private int mem_id;
	private int plan_id;
	private int ci_date;
	private int co_date;
	private int num_pepole;

	public ReservationBean() {

	}

	ReservationBean(int mem_id, int plan_id, int ci_date, int co_date,int num_people) {
		this.mem_id = mem_id;
		this.plan_id = plan_id;
		this.ci_date = ci_date;
		this.co_date = co_date;
		this.num_pepole=num_people;
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
		this.num_pepole=num_people;
	}
	public int getNum_people() {
		return num_pepole;
	}
}