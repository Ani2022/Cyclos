package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MemberPOM {
	private WebDriver driver; 
	
	public MemberPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement click1;
	
	public void But1(){
	this.click1.click();
	}
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement click2;
	
	public void But2()
	{
	this.click2.click();
	}
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement click3;
	
	public void But3()
	{
	this.click3.click();
	}
	@FindBy(xpath="//input[@value='4']")
	private WebElement click4;
	
	public void But4(){
	this.click4.click();
	}
	
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn; 
	
	public void submit() {
		this.loginBtn.click(); 
	}
}