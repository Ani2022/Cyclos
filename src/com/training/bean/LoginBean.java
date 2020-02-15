package com.training.bean;

public class LoginBean {
	private String userName;
	private String password;
	private int employee;

	public LoginBean() {
	}

	public LoginBean(String userName, String password, int employee) {
		super();
		this.userName = userName;
		this.password = password;
		this.employee=employee;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getemployee() {
		return employee;
	}
	public void setemployee(int employee) {
		this.employee = employee;
	}
	

	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + "]";
	}

}
