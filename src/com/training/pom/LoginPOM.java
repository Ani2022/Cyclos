package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPOM {
	private WebDriver driver; 
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cyclosUsername")
	private WebElement userName;
	
	@FindBy(id="cyclosPassword")
	private WebElement userPassword; 
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement password1;
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement password2;
	@FindBy(xpath="//input[@value='3']")
	private WebElement password3;
	@FindBy(xpath="//input[@value='4']")
	private WebElement password4;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//li[@id='menu2']/span[@class='menuText']")
	private WebElement account;
	
	@FindBy(xpath="//li[@id='submenu2.0']/span[@class='subMenuText']")
	private WebElement accountinfo;
	
	
	@FindBy(id="filterSelect")
	private WebElement PaymentType;
	
	
	


public void sendUserName(String username){
		this.userName.clear();
		this.userName.sendKeys(username);
	}
	public void cyclosPassword() {
		this.userPassword.click();
	}
	
	public void Password1() {
		this.password1.click();
	}
	public void Password2() {
		this.password2.click();
	}
	public void Password3() {
		this.password3.click();
	}
	public void Password4() {
		this.password4.click();
	}
		
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void account() {
		this.account.click();}
	public void manageinv() {
		this.accountinfo.click();
	}
		
	public void search() {
		this.PaymentType.click();}
		
	}

	
