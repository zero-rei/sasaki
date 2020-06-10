package dto;

public class Employee {
	private String name;
	private String nai;
	private String mail;
	private String time;
	private String times;


	public Employee(String name , String nai,String mail,String time,String times){
		super();
		this.name = name;
		this.nai=nai;
		this.mail =mail;
		this.time = time;
		this.times = times;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getNai() {
		return nai;
	}

	public void setNai(String nai) {
		this.nai = nai;
	}
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public String getTimes() {
		return times;
	}

	public void setTimes(String times) {
		this.times = times;
	}

}
