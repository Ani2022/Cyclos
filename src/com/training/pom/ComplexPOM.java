package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ComplexPOM {
	private WebDriver driver; 
	
	public ComplexPOM(WebDriver driver) {
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
	
	public void button1(){
	this.click1.click();
	}
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement click2;
	
	public void button2()
	{
	this.click2.click();
	}
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement click3;
	
	public void button3()
	{
	this.click3.click();
	}
	@FindBy(xpath="//input[@value='4']")
	private WebElement click4;
	
	public void button4(){
	this.click4.click();
	}
	
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn; 
	
	public void submit() {
		this.loginBtn.click(); 
	}
	
	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement member;
	
	public void member1() {
		this.member.sendKeys("samsaravanan");
	}
	
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.Seconds);
	
	@FindBy(xpath="//input[@linkurl='grantLoan?memberId=2']")
	private WebElement grant;
	
	public void grant1() {
		this.grant.click();
	}
	
	@FindBy(xpath="//input[@name='loan(amount)']")
	private WebElement loan;
	
	public void loan1() {
		this.loan.sendKeys("900");
	}
	
	@FindBy(xpath="//textarea[@name='loan(description)']")
	private WebElement desc;
	
	public void dep() {
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
	}
	
	@FindBy(xpath="//li[@id='menu15']//span[@class='menuText']")
	private WebElement sde;
	
	public void logout() {
		this.sde.click();
	}
	@FindBy(xpath="//input[@value='Submit' and @linkurl='searchLoans?memberId=2']")
	private WebElement del;
	
	public void loan() {
		this.del.click();
	}
	
	@FindBy(xpath="//img[@loanid='12']")
	private WebElement dew;
	
	public void searc() {
		this.dew.click();
	}
	
	@FindBy(xpath="//input[@id='amountText']")
	private WebElement desc1;
	
	public void text() {
		this.desc1.sendKeys("0");
	}
	
	@FindBy(xpath="//input[@value='Repay']")
	private WebElement desc2;
	
	public void repay() {
		this.desc2.click();
	} 
	public void assert2() {
		Alert at=driver.switchTo().alert();
		String actual=at.getText();
		String expected="The repayment was succesfully processed";
		Assert.assertEquals(expected,actual);
	}
	
	
	}
