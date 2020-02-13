package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemPayPOM {
	
	private WebDriver driver; 
	
	public MemPayPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='menu3']")
	private WebElement Account;
	
	@FindBy(id="menu2")
	private WebElement CAccount;
	
	@FindBy(xpath="//li[@id='submenu2.0']")
	private WebElement Info;

	
	public void clickAccount() {
		this.Account.click();
	}
	
	public void Account() {
		this.CAccount.click();
		
	}
	public void clickInfo() {
		this.Info.click();
		
	}


	
	
	


}
