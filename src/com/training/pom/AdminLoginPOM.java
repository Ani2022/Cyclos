package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPOM {
	private WebDriver driver;
	
	public AdminLoginPOM(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}

	@FindBy(id="cyclosUsername")
	private WebElement adminUsername; 
	
	@FindBy(id="cyclosPassword")
	private WebElement adminPassword;
	
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
	
	public void sendUserName(String userName) {
		this.adminUsername.sendKeys(userName);
	}
	
	public void sendPassword() {
		this.adminPassword.click(); 
		 
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

	

}
