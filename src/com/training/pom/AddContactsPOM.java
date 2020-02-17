package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddContactsPOM {
private WebDriver driver;
	
	public AddContactsPOM(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//li[@id='menu1']")
	private WebElement clickPersonal; 
	
	public void personal(){
		this.clickPersonal.click();
	}
	
	@FindBy(xpath="//li[@id='submenu1.3']")
	private WebElement clickContacts; 
	
	public void contacts(){
		this.clickContacts.click();
	}
	

	@FindBy(id="memberUsername")
	private WebElement loginName;
	
	public void loginName(String lname) {
		this.loginName.sendKeys(lname);
		
	}
	
	@FindBy(id="memberName")
	private WebElement membername; 
	
	public void memberName(String mname) {
		this.membername.sendKeys(mname);
		
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement csubmit;
	
	public void submit() {
		this.csubmit.click();
		
	}
	
	@FindBy(id="memberUsername")
	private WebElement loginName1;
	
	public void loginName1(String lname) {
		this.loginName1.sendKeys(lname);
		
	}
	
	@FindBy(id="memberName")
	private WebElement membername1; 
	
	public void memberName1(String mname) {
		this.membername1.sendKeys(mname);
		
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement csubmit1;
	
	public void submit1() {
		this.csubmit1.click();
		
	}
	
	@FindBy(id="memberUsername")
	private WebElement loginName2;
	
	public void loginName2(String lname) {
		this.loginName2.sendKeys(lname);
		
	}
	
	@FindBy(id="memberName")
	private WebElement membername2; 
	
	public void memberName2(String mname) {
		this.membername2.sendKeys(mname);
		
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement csubmit2;
	
	public void submit2() {
		this.csubmit2.click();
		
	}
	
	@FindBy(xpath="//li[@id='menu6']")
	private WebElement logout;
	
	
	public void logout1() {
		this.logout.click();

	}
	
	
	
	
	
	


}
