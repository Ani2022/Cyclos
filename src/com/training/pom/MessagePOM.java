package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePOM {

	private WebDriver driver;

	public MessagePOM(WebDriver driver) {

		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//li[@id='menu1']")
	private WebElement clickpersonal;
	
	@FindBy(xpath="//li[@id='submenu1.1']")
	private WebElement clickmessages;                                       
																				
	@FindBy(id="newButton")
	private WebElement clicksubmit;
	
	@FindBy(xpath="//select[@id='sendToSelect']/option[@value='ADMIN']")
	private WebElement clickadmin; 
	
	@FindBy(xpath="//select[@id='categorySelect']/option[@value='3']")
	private WebElement clickloan;
	
	@FindBy(name="message(subject)")
	private WebElement sendsubject;
	
	@FindBy(tagName="iframe")
	private WebElement clickdes;
	
	@FindBy(xpath="//td//input[@value='Submit']")
	private WebElement sendmsg;
	
	@FindBy(xpath="	//li[@id='menu6']")
	private WebElement clicklogout;
	
	public void personal() {
		this.clickpersonal.click();
	}
	 
	public void messages() {
		this.clickmessages.click(); 	 
	}
	public void Submit() {
		this.clicksubmit.click(); 
	}
	
	public void Admin() {
		this.clickadmin.click(); 
	}
	public void loan() {
		this.clickloan.click(); 
	}
	public void Subject(String sub) {
		this.sendsubject.sendKeys(sub); 
	}
	public void Description(String des) {
		this.clickdes.sendKeys(des);
	}
	public void submit1() {
		this.sendmsg.click(); 
	}
	public void logout() {
		this.clicklogout.click(); 
	}
	

}
