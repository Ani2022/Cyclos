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

	@FindBy(xpath="//tr//tr//td//input [@value='Submit']")
	private WebElement loginBtn;

	@FindBy(xpath="//li[@id='menu2']/span[@class='menuText']")
	private WebElement account;
	
	@FindBy(xpath="//li[@id='submenu2.0']/span[@class='subMenuText']")
	private WebElement accountinfo;
	
	@FindBy(xpath="//input[@id='modeButton']")
	private WebElement advancebtn;
	
	@FindBy(id="memberUsername")
	private WebElement memberlogin;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchBtn;
	
	@FindBy(id="_id1581583079628_659")
	private WebElement dateBox1;

	@FindBy(id="_id1581583079632_303")
	private WebElement datebox;

	@FindBy(xpath="//input[@value='Search']")
	private WebElement search;
	
	@FindBy(xpath="//select[@name='query(paymentFilter)']")
	private WebElement payment;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement search2;
	
	public void memlogin(String Username) {

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

	public void clickLoginBtn() {
	this.loginBtn.click();
	
	}
	public void acounts() {
		this.account.click();
	}
	public void acountinfo() {
		this.accountinfo.click();
	}
	public void advanced() {
		this.advancebtn.click();
	}
	public void membername(String name) {

		this.Username.sendKeys(name);
		}
	
	public void searching() {
		this.searchBtn.click();
	}
	public void dateBox(String num){
		this.datebox.sendKeys(num);
		}

		public void dateBox1(String num){
		this.dateBox1.sendKeys(num);
		}

		public void search1() {
			this.search.click();
		}
		public void payment() {
			this.payment.click();
		}

		public void search2() {
				this.search2.click();
	
	}
}
		






	
