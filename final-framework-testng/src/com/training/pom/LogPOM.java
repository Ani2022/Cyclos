package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogPOM {

private WebDriver driver; 
	
	public LogPOM(WebDriver driver) {
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

	@FindBy(xpath="//input[@class='virtualKeyboardButton virtualKeyboardContrastNormal virtualKeyboardButtonHover']")
	private WebElement M;

	@FindBy(xpath="//input[@class='virtualKeyboardButton virtualKeyboardContrastNormal virtualKeyboardButtonHover']")
	private WebElement A;	

	@FindBy(xpath="//input[@class='virtualKeyboardButton virtualKeyboardContrastNormal virtualKeyboardButtonHover']")
	private WebElement N;
	

	@FindBy(xpath="//input[@class='virtualKeyboardButton virtualKeyboardContrastNormal virtualKeyboardButtonHover']")
	private WebElement Z;
	
	@FindBy(xpath="//input[@class='virtualKeyboardButton virtualKeyboardContrastNormal virtualKeyboardButtonHover']")
	private WebElement O;
	

	@FindBy(xpath="//input[@class='virtualKeyboardButton virtualKeyboardContrastNormal virtualKeyboardButtonHover']")
	private WebElement Oo;
	
	@FindBy(xpath="//input[@class='virtualKeyboardButton virtualKeyboardContrastNormal virtualKeyboardButtonHover']")
	private WebElement R;
	
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

	public void clickM() {
		this.M.click();		
	}

	public void clickA() {
		this.A.click();		
	}

	public void clickN() {
		this.N.click();		
	}

	public void clickZ() {
		this.Z.click();		
	}

	public void clickO() {
		this.O.click();		
	}

	public void clickOo() {
		this.Oo.click();		
	}

	public void clickR() {
		this.R.click();		
	}

}
