package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPOM {
	
private WebDriver driver; 

	public AdminPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='menu3']//span[@class='menuText']")
	private WebElement account;

	@FindBy(xpath="//li[@id='submenu3.6']//span[@class='subMenuText']")
	private WebElement memberPaym;

	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement memberUsername;

	@FindBy(xpath="//input[@id='memberName']")
	private WebElement memberName;

	@FindBy(xpath="//input[@id='amount']")
	private WebElement amount;

	@FindBy(xpath="//textarea[@id='description']")
	private WebElement description;

	@FindBy(id="type")//by inspecting we need to take id
	private WebElement type ;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement subbtn1;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement subbtn2;

	
/*	@FindBy(xpath="//li[@id='menu3']")
	private WebElement Account;
	
	@FindBy(xpath="//li[@linkurl='/do/admin/payment?selectMember=true&fromMenu=true']")
	private WebElement MemPayment;
	
	@FindBy(id="memberUsername")
	private WebElement LoginName;
	
	@FindBy(id="amount")
	private WebElement Money;
	
	@FindBy(xpath="//select[@id='type']")
	private WebElement Transaction;
	
	@FindBy(id="description")
	private WebElement Description;
	
	@FindBy(id="submitButton")
	private WebElement Submit1;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Submit2;*/

	@FindBy(xpath="//li[@id='menu15']")
	private WebElement LogOut;
	
	public void clickAccount() {
		this.account.click();
		}
		public void memberPaym() {
		this.memberPaym.click();
		}

		public void memberUsername(String mUserName) {
		this.memberUsername.sendKeys(mUserName);
		}
		public void memberName(String MemName) throws InterruptedException {
		this.memberName.sendKeys(MemName);
		Thread.sleep(4000);
	
		}
		public void amount(String num){
		this.amount.sendKeys(num);
		}
		public void sel(){
			Select sel=new Select(type);

			sel.selectByVisibleText("Debit to member");;
			}


		public void description(String des){
		this.amount.sendKeys(des);
		}
	
		
		public void submitBtn1(){
		this.subbtn1.click();
		}

		public void submitBtn2(){
		this.subbtn2.click();
		}
/*	public void clickAccount() {
		this.Account.click();		
	}

	public void clickMemberPayment() {
		this.MemPayment.click();	
	}

	public void sendLoginName(String LoginName) {
		this.LoginName.sendKeys(LoginName);		
	}

	public void sendAccount(String Money) {
		this.Money.sendKeys(Money);
		
	}

	public void clickTrans() {
		this.Transaction.click();
		
	}

	public void sendDesc(String Description) {
		this.Description.sendKeys(Description);		
	}

	public void clickSubtn1() {
		this.Submit1.click();
		
	}

	public void clickSubtn2() {
		this.Submit2.click();
		
	} */

	public void clickLogOut() {
		this.LogOut.click();
		
	}

	


}
