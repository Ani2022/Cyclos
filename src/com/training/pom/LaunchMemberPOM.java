package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchMemberPOM {
	private WebDriver driver;

	public void LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="cyclosUsername")
	private WebElement memberUsername; 
	
	@FindBy(id="cyclosPassword")
	private WebElement memberPassword;
	
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
	

}
