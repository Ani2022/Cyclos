package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginFilterPOM {
	private WebDriver driver; 
	
	public LoginFilterPOM(WebDriver driver) {
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
	
	public void But1(){
	this.click1.click();
	}
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement click2;
	
	public void But2()
	{
	this.click2.click();
	}
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement click3;
	
	public void But3()
	{
	this.click3.click();
	}
	@FindBy(xpath="//input[@value='4']")
	private WebElement click4;
	
	public void But4(){
	this.click4.click();
	}
	
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn; 
	
	public void submit() {
		this.loginBtn.click(); 
	}
	
	
	@FindBy(xpath="//li[@id='menu1']")
	private WebElement personal;
	
	public void perso() {
		this.personal.click();
	}
	
	@FindBy(xpath="//li[@id='submenu1.1']")
	private WebElement message;
	
	public void mess() {
		this.message.click();
	}
	
	@FindBy(xpath="//input[@id='modeButton']")
	private WebElement adv;
	
	public void advance() {
		this.adv.click();
	}
	
	@FindBy(xpath="//input[@id='modeButton']")
	private WebElement sel;
	                                  //
	public void sele() {
		WebElement we=driver.findElement(By.xpath("//select[@id='messageBoxSelect']"));
		  Select s1=new Select(we);
		  s1.selectByIndex(78);
	}
	
public void sele1() {
	WebElement we1=driver.findElement(By.xpath("//select[@name='query(rootType)']"));
	  Select s2=new Select(we1);
	  s2.selectByIndex(21);
}

     @FindBy(xpath="//input[@type='submit']")
    		 private WebElement see;
     public void sees() {
    	 this.see.click();
     }
     
     //
	
	
     @FindBy(xpath="//input[@id='modeButton']")
 	private WebElement se9;
 	
 	public void selen() {
 		WebElement we=driver.findElement(By.xpath("//select[@id='messageBoxSelect']"));
 		  Select s1=new Select(we);
 		  s1.selectByIndex(0);
 	}
 	
 public void selen1() {
 	WebElement we1=driver.findElement(By.xpath("//select[@name='query(rootType)']"));
 	  Select s2=new Select(we1);
 	  s2.selectByIndex(2);
 }

      @FindBy(xpath="//input[@type='submit']")
     		 private WebElement seew;
      public void selenw() {
     	 this.seew.click();
      }
      
      
      //
	
	
      @FindBy(xpath="//input[@id='modeButton']")
   	private WebElement se19;
   	
   	public void swa() {
   		WebElement we=driver.findElement(By.xpath("//select[@id='messageBoxSelect']"));
   		  Select s1=new Select(we);
   		  s1.selectByIndex(0);
   	}
   	
   public void swa1() {
   	WebElement we1=driver.findElement(By.xpath("//select[@name='query(rootType)']"));
   	  Select s2=new Select(we1);
   	  s2.selectByIndex(0);
   }

        @FindBy(xpath="//input[@type='submit']")
       		 private WebElement swa1;
        public void swa2() {
       	 this.swa1.click();
        }
        
        
        
        
        //
	
	
	
}
