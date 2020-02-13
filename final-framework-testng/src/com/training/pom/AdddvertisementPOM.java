package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdddvertisementPOM {
	private WebDriver driver; 
	
	public AdddvertisementPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="cyclosUsername")
	private WebElement cyclosUsername; 
	
	@FindBy(id="cyclosPassword")
	private WebElement cyclosPassword;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement Button1;
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement Button2;

	@FindBy(xpath="//input[@value='3']")
	private WebElement Button3;

	@FindBy(xpath="//input[@value='4']")
	private WebElement Button4;

	@FindBy(xpath="//input[@value='5']")
	private WebElement Button5;

	@FindBy(xpath="//input[@value='6']")
	private WebElement Button6;

	@FindBy(xpath="//tr//tr//td//input[@value='Submit']")
	private WebElement Submitbtn;

	@FindBy(id="memberUsername")
	private WebElement memberUsername;

	@FindBy(xpath="//input[@linkurl='memberAds?memberId=9']")
	private WebElement Mansubbtn;

	@FindBy(id="newButton")
	private WebElement newButton;

	@FindBy(name="ad(category)")
	private WebElement Category;

	@FindBy(xpath="//input[@name='ad(price)']")
	private WebElement Units;

	@FindBy(id="notExpirableCheck")
	private WebElement notExpirableCheck;

	@FindBy(id="saveButton")
	private WebElement saveButton;

	@FindBy(id="backButton")
	private WebElement backButton;


	public void sendcyclosUsername(String username) {
		this.cyclosUsername.sendKeys(username);
	}
	
	public void clickcyclosPassword() { 
		this.cyclosPassword.click();
	}
    
	
	public void clickButton1() { 
		this.Button1.click();
	}
	
	public void clickButton2() { 
		this.Button2.click();
	}
	
	public void clickButton3() { 
		this.Button3.click();
	}
	
	public void clickButton4() { 
		this.Button4.click();
	}
	
	public void clickButton5() { 
		this.Button5.click();
	}
	
	public void clickButton6() { 
		this.Button6.click();
	}
	
	public void clickSubmitbtn() { 
		this.Submitbtn.click();
	}
	
	public void sendmemberUsername(String memberUsername) {
		this.memberUsername.clear();
		this.memberUsername.sendKeys(memberUsername);
	}
	
	public void clickMansubbtn() {
		this.Mansubbtn.click();
	}
	
	public void clicknewButton() {
		this.newButton.click();
	}
	
	public void clickCategory(){
		this.Category.click();
	}
	
	public void sendUnits(String Units) {
		this.Units.clear();
		this.Units.sendKeys(Units);
	}
	
	public void clicknotExpirableCheck() {
		this.notExpirableCheck.click();
	}
	
	public void clicksaveButton() {
		this.saveButton.click();
	}
	
	public void clickbackButton() {
		this.backButton.click();
	}
	
	
}
