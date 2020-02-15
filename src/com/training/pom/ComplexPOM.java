package com.training.pom;


//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class ComplexPOM {
	private WebDriver driver;

	public ComplexPOM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(id="cyclosUsername")//by inspecting we need to take id
	private WebElement Username ;
	
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

	@FindBy(xpath="//input[@class='button']")
	private WebElement loginBtn;
	
	@FindBy(id="memberUsername")
	private WebElement memberUsername;
	
	@FindBy(xpath="//input[@linkurl='grantLoan?memberId=9']")
	private WebElement Grantloanbtn;
	
	@FindBy(id="amount")
	private WebElement amount ;
	
	@FindBy(id="description")
	private WebElement description;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement Submit1;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement Submit2;
	
	// Alert a= driver.switchTo().alert();
	// String saman=a.getText();
 
     
public void cyclosUsername(String Username) {

	this.Username.sendKeys(Username);
	}
    public void cyclosPassword() {
		this.userPassword.click();
	}

	public void password1(){
	this.password1.click();
	}
	public void password2(){
	this.password2.click();
	}
	public void password3(){
	this.password3.click();
	}
	public void password4(){
	this.password4.click();
	}
	public void login(){
		this.loginBtn.click();}
	
	public void membername(String Username) {

		this.memberUsername.sendKeys(Username);
	}
		
		public void grant(){
			this.Grantloanbtn.click();}

		public void amount(String num) {

			this.amount.sendKeys(num);
			
		}	
			
		public void description(String des) {

			this.description.sendKeys(des);}
			
			
		public void submit1(){
			this.Submit1.click();}
		
		public void submit2(){
			this.Submit2.click();}
	
	
	

}
