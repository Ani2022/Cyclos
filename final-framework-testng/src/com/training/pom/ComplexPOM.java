package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComplexPOM {
	
private WebDriver driver; 
	
	public ComplexPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//li[@id='menu1']")
	private WebElement Personal;
	
	@FindBy(xpath="//li[@id='submenu1.3']")
	private WebElement Contacts;
	
	@FindBy(id="memberUsername")
	private WebElement memlog;
	
	@FindBy(id="memberUsername")
	private WebElement memname;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit1;
	
	@FindBy(linkText="manzoor")
	private WebElement AddContact;
	
	@FindBy(xpath="//input[@linkurl='payment?to=9']")
	private WebElement submit2;
	
	@FindBy(id="amount")
	private WebElement Amount;
	
	@FindBy(id="description")
	private WebElement Description;
	
	@FindBy(id="submitButton")
	private WebElement submit3;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit4;

	@FindBy(xpath="//li[@id='menu6']")
	private WebElement LogOut;

	@FindBy(xpath="//img[@transferid='33']")
	private WebElement View;

	@FindBy(id="backButton")
	private WebElement Back;
	
	
	public void clickPersonal() {
		this.Personal.click();
		
	}

   public void clickContacts() {
	    this.Contacts.click();
		
	}

    public void sendMemLogin(String login) {
	     this.memlog.sendKeys(login);
    }
    
	/* public void sendMemName(String name) {
		     this.memname.sendKeys(name);     
	     
}  */

	public void clickSubtn1() {
		this.submit1.click();
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
	}

	public void clickAddContact() {
		this.AddContact.click();		
	}

	public void clickSubtn2() {
		this.submit2.click();
		
	}

	public void sendAmount(String amount) {
		this.Amount.sendKeys(amount);
		
	}

	public void sendDescription(String desc) {
		this.Description.sendKeys(desc);
		
	}	
	public void clickSubtn3() {
		this.submit3.click();
		
	}
	
	public void clickSubtn4() {
		this.submit4.click();
		
	}
	
	public void clickLogOut() {
		this.LogOut.click();
		 Alert alt = driver.switchTo().alert();
		 alt.accept();
	}
	
	public void clickView(){
		this.View.click();
	}
	
	public void clickBack() {
		this.Back.click();
	}
	
	
	}
	  
      
	


