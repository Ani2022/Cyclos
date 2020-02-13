package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediumPOM {
 
private WebDriver driver; 
	
	public MediumPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cyclosUsername")
	private WebElement cyclosUsername ;
	
	@FindBy(id="cyclosPassword")
	private WebElement cyclosPassword;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement bttn1;
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement bttn2;
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement bttn3;
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement bttn4;
	
	@FindBy(xpath="//input[@value='5']")
	private WebElement bttn5;
	
	@FindBy(xpath="//tr//tr//td//input[@value='Submit']")
	private WebElement LoginSubmit;
	
	@FindBy(xpath="//li[@id='menu2']/span[@class='menuText']")
	private WebElement Account;
	
	@FindBy(xpath="//li[@id='submenu2.4']/span[@class='subMenuText']")
	private WebElement MemberPayment;
	
	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement LoginR;
	
	@FindBy(xpath="//input[@id='memberName']")
	private WebElement NameR;
	
	@FindBy(xpath="//input[@name='amount']")
	private WebElement Amount;
	
	@FindBy(id="schedulingTypeSelect")
	private WebElement Scheduling;
	
	@FindBy(xpath="//input[@id='scheduleForText']")
	private WebElement Date;
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement Description;
	
	@FindBy(xpath="//tr//td//tr//input[@type='submit']")
	private WebElement Submit;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Submit1;
	
	public void sendUserName(String Nikita) {
		this.cyclosUsername.clear();
		this.cyclosUsername.sendKeys(Nikita);
	}

	public void sendUserPassword() {
		this.cyclosPassword.click();;
	}

	public void  bttn1() {
		this.bttn1.click(); 
	}
	public void  bttn2() {
		this.bttn2.click(); 
	}
	public void  bttn3() {
		this.bttn3.click(); 
	}
	public void  bttn4() {
		this.bttn4.click(); 
	}
	public void  bttn5() {
		this.bttn5.click(); 
	}
	public void LoginSubmit() {
		this.LoginSubmit.click(); 
	}
	public void Account() {
		this.Account.click(); 
	}
	public void MemberPayment() {
		this.MemberPayment.click(); 
	}
	public void LoginR() {
		this.LoginR.sendKeys("saanvi");}

	public void NameR() {
		this.NameR.sendKeys("saanvi");
 
	}
	public void Amount() {
		this.Amount.sendKeys("500");
	}
	public void Scheduling() {
		this.Scheduling.click(); 
	}
	public void Date() {
		this.Date.click(); 
	}
	public void Description() {
		this.Description.sendKeys("I want 500 loan"); 
	}
	public void Submit() {
		this.Submit.click(); 
	}
	public void Submit1() {
		this.Submit1.click(); 
	}
	
	
	
	
}
