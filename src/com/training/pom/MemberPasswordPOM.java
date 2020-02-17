package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberPasswordPOM {
private WebDriver driver; 
	
	public MemberPasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement cyclosUsername; 
	
	@FindBy(id="cyclosPassword")
	private WebElement cyclosPassword;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement Button1; 
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement Button2; 
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement Button3; 
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement Button4; 
	
	@FindBy(xpath="//tr//tr//td//input[@value='Submit']")
	private WebElement Submitbtn; 
	
	@FindBy(id="memberUsername")
	private WebElement memberUsername; 
	
	@FindBy(xpath="//input[@linkurl='managePasswords?userId=9']")
	private WebElement Mansubbtn; 
	
	@FindBy(xpath="//input[@name='newPassword']")
	private WebElement Newpwd; 
	
	@FindBy(xpath="//input[@name='newPasswordConfirmation']")
	private WebElement Conpwd; 
	
	@FindBy(xpath="//input[@name='forceChange']")
	private WebElement Checkbox; 
	
	@FindBy(xpath="//input[@id='resetAndSendButton']")
	private WebElement Resetsub; 
	
	
	
	public void sendUserName(String userName) {
		this.cyclosUsername.sendKeys(userName);
	}
	
	public void sendPassword() {
		this.cyclosPassword.click(); 
		 
	}
	
	public void Btn1() {
		this.Button1.click(); 
	}
	
	public void Btn2() {
		this.Button2.click(); 
	}
	public void Btn3() {
		this.Button3.click(); 
	}
	public void Btn4() {
		this.Button4.click(); 
	}
	public void Submitbuton() {
		this.Submitbtn.click(); 
	}
	public void memberlogin(String member){
		this.memberUsername.sendKeys(member);
	}
	public void ManageSubmitbtn() {
		this.Mansubbtn.click(); 
	}
	public void Newpassword(String newpwd) {
		this.Newpwd.sendKeys(newpwd);; 
	}
	public void Confirmpassword(String conpwd) {
		this.Conpwd.sendKeys(conpwd); 
	}
	public void Forcechange() {
		this.Checkbox.click(); 
	}
	public void ResetSubmit() {
		this.Resetsub.click(); 
	}


}
