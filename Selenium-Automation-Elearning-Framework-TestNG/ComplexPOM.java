package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ComplexPOM {
	
private WebDriver driver; 
	
	public ComplexPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement cyclosUsername; 
	
	public void sendUserName(String Admin) {
		this.cyclosUsername.clear();
		this.cyclosUsername.sendKeys(Admin);
	}
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	public void password() {
		this.password.click();;
	}
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement but1;
	
	public void But1(){
	this.but1.click();
	}
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement but2;
	
	public void But2(){
	this.but2.click();
	}
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement but3;
	
	public void But3()
	{
	this.but3.click();
	}
	@FindBy(xpath="//input[@value='4']")
	private WebElement but4;
	
	public void But4(){
	this.but4.click();
	}
	
	
	
	@FindBy(xpath="//tr//td//input[@type='submit']")
	private WebElement loginBtn; 
	
	public void submit() {
		this.loginBtn.click(); 
	}
	
	
	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement member;
	
	public void member(String Nikita) {
		this.member.clear();
		this.member.sendKeys(Nikita);
	}

	@FindBy(xpath="//input[@linkurl='grantLoan?memberId=10']")
	private WebElement grant;
	
	public void grant1() {
		this.grant.click();
	}
	
	@FindBy(xpath="//input[@name='loan(amount)']")
	private WebElement loan;
	
	public void amount(String amount) {
		this.loan.sendKeys("1000");
	}
	
	@FindBy(xpath="//textarea[@name='loan(description)']")
	private WebElement desc;
	
	public void description(String description) {
		this.desc.sendKeys("Home Loan");
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement sub4;
	
	public void subm() {
		this.sub4.click();
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement sub5;
	
	public void subm1() {
		this.sub5.click();
	}	
	
	public void assert1() {
		Alert at=driver.switchTo().alert();
		String actual=at.getText();
		String expected="The loan was successfully granted";
		Assert.assertEquals(expected,actual);
	}
	public void alert() {
		 Alert ae=driver.switchTo().alert();
		   ae.accept();
	}}

	