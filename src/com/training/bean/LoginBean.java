package com.training.bean;

public class LoginBean {
	//private String userName;
	//private String password; 
	private String memberlogin;
	private String amount;
	private String description;
	public LoginBean(){
	}
	

	
public LoginBean(String memberlogin, String amount,String description) {
		super();
		//this.userName=userName;
		//this.password=password;
		this.memberlogin = memberlogin;
		this.amount = amount;
		this.description = description;
	}
	/*public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}*/
	public String getmembername() {
		return memberlogin;
	}

	public void setmemberName(String userName) {
		this.memberlogin = userName;
	}

	public String getamount() {
		return amount;
	}

	public void setamount(String amount) {
		this.amount = amount;
	}
	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "LoginBean [memberlogin=" + memberlogin + ", amount=" + amount +" , password=" + description + "]";
	}

}
