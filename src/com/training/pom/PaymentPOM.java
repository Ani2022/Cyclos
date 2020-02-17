package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPOM {
private WebDriver driver;
	
	public PaymentPOM(WebDriver driver) {

		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath="//li[@id='menu3']")
	private WebElement clickAccount; 
	
	public void account(){
		this.clickAccount.click();
	}
	
	@FindBy(xpath="//li[@id='submenu3.6']")
	private WebElement managePayment; 
	
	public void managePayment(){
		this.managePayment.click();
	}
	
	//Transaction 1

	@FindBy(id="memberUsername")
	private WebElement loginName;
	
	public void loginName(String lname) {
		this.loginName.sendKeys(lname);
		
	}
	
	@FindBy(id="memberName")
	private WebElement membername; 
	
	public void memberName(String mname) {
		this.membername.sendKeys(mname);
		
	}
	
	@FindBy(id="amount")
	private WebElement amount; 
	
	public void amount(String amount) {
		this.amount.sendKeys(amount);
		
	}
	
	@FindBy(xpath="	//select[@id='type']/option[@value='14']")
	private WebElement select; 
	
	public void selectTrans(){
		this.select.click();
	}
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement des; 
	
	public void Description(String description){
		this.des.sendKeys(description);
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement msubmit; 
	
	public void msubmit(){
		this.msubmit.click();
	}
	
	@FindBy(xpath="//td//input[@value='Submit']")
	private WebElement msubmit1; 
	
	public void msubmit1(){
		this.msubmit1.click();
	}
	
	@FindBy(xpath="//input[@id='newPaymentButton']")
	private WebElement npayment; 
	
	public void newPayment(){
		this.npayment.click();
	}
	
	//Transaction 2
	
	@FindBy(id="memberUsername")
	private WebElement loginName1;

	public void loginName1(String lname) {
		this.loginName1.sendKeys(lname);
		
	}

	@FindBy(id="memberName")
	private WebElement membername1; 

	public void memberName1(String mname) {
		this.membername1.sendKeys(mname);
		
	}

	@FindBy(id="amount")
	private WebElement amount1; 

	public void amount1(String amount) {
		this.amount1.sendKeys(amount);
		
	}

	@FindBy(xpath="	//select[@id='type']/option[@value='14']")
	private WebElement select1; 

	public void selectTrans1(){
		this.select1.click();
	}

	@FindBy(xpath="//textarea[@name='description']")
	private WebElement des1; 

	public void Description1(String description){
		this.des1.sendKeys(description);
	}

	@FindBy(xpath="//input[@value='Submit']")
	private WebElement msubmit11; 

	public void msubmit11(){
		this.msubmit11.click();
	}

	@FindBy(xpath="//td//input[@value='Submit']")
	private WebElement msubmit12; 

	public void msubmit12(){
		this.msubmit12.click();
	}

	@FindBy(xpath="//input[@id='newPaymentButton']")
	private WebElement npayment1; 

	public void newPayment1(){
		this.npayment1.click();
	}



	
	//Transaction 3
	
	@FindBy(id="memberUsername")
	private WebElement loginName2;
	
	public void loginName2(String lname) {
		this.loginName2.sendKeys(lname);
		
	}
	
	@FindBy(id="memberName")
	private WebElement membername2; 
	
	public void memberName2(String mname) {
		this.membername2.sendKeys(mname);
		
	}
	
	@FindBy(id="amount")
	private WebElement amount2; 
	
	public void amount2(String amount) {
		this.amount2.sendKeys(amount);
		
	}
	
	@FindBy(xpath="	//select[@id='type']/option[@value='14']")
	private WebElement select2; 
	
	public void selectTrans2(){
		this.select2.click();
	}
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement des2; 
	
	public void Description2(String description){
		this.des2.sendKeys(description);
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement msubmit21; 
	
	public void msubmit21(){
		this.msubmit21.click();
	}
	
	@FindBy(xpath="//td//input[@value='Submit']")
	private WebElement msubmit22; 
	
	public void msubmit22(){
		this.msubmit22.click();
	}
	
	@FindBy(xpath="//input[@id='newPaymentButton']")
	private WebElement npayment2; 
	
	public void newPayment2(){
		this.npayment2.click();
	}
	
	
	
	

}















