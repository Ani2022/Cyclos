package com.training.pom;


import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	

	
	@FindBy(xpath="//input[@value='1']")
	private WebElement password1;
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement password2;
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement password3;
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement password4;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//*[@class='menuText']")
	private WebElement accounts;
	
	@FindBy(xpath="//*[@class='subMenuText']")
	private WebElement Accountinfo;
	
	@FindBy(xpath="//input[@value='Advanced']")
	private WebElement advanced;
	
	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement memberlogin;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//input[@id='_id1581505870058_285']")
	private WebElement fromdate;
	
	@FindBy(xpath="//input[@id='_id1581505870062_578']")
	private WebElement todate;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchbtn2;
	
	Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
	//listbox.selectByValue("Loan Payment");

	
	
	
	
	
	
	
	
	
		
      
      
      @FindBy(xpath= "//*[@id='tdContents']/form/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
      private WebElement Search;
	
	
	
	
public void cyclosUsername(String cyclosUsername){
		this.userName.clear();
		this.userName.sendKeys(cyclosUsername);
	}
public void cyclosPassword(){}
	
	public void Password1() {
		this.password1.click();
	}
	public void Password2() {
		this.password2.click();
	}
	public void Password3() {
		this.password3.click();
	}
	public void Password4() {
		this.password4.click();
	}
		
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void account(){
		this.accounts.click();
		}
	public void manage(){
		this.Accountinfo.click();
	}
	public void query(){
		this.advanced.click();
		}
	public void select(){
		this.memberlogin.click();
	}
	public void searching(){
		this .Search.click();
	}
	public void fromd(){
		this .fromdate.click();
	}
	}

