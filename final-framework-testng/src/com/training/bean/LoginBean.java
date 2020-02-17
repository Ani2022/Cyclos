package com.training.bean;

public class LoginBean {
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;

	public LoginBean() {
	}

	public LoginBean(String FirstName, String LastName, String Email,String Password) {
		super();
		this.FirstName = FirstName;
		this.LastName = LastName;	
	
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
 
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	@Override
	public String toString() {
		return "LoginBean [FirstName=" + FirstName + ",LastName=" + LastName + ",Email=" + Email + ", Password=" + Password + "]";
	}

}
