package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePOM {

	private WebDriver driver;

	public void LoginPOM(WebDriver driver) {
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
}
