package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectPOM {
	private WebDriver driver; 
	
	public SelectPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}



@FindBy(xpath="//li[@id='menu1']")
	private WebElement personal;
	

	public void personal_Link() {
		this.personal.click();
	}
	
	@FindBy(xpath="//li[@id='submenu1.1']")
	private WebElement message;
	
	public void message_Link() {
		this.message.click();
	}
	
	@FindBy(xpath="//input[@id='modeButton']")
	private WebElement adv;
	
	public void advance_Button() {
		this.adv.click();
	}
	
	@FindBy(xpath="//input[@id='modeButton']")
	private WebElement sel;
	                             
	public void message_Listbox() {
		WebElement we=driver.findElement(By.xpath("//select[@id='messageBoxSelect']"));
		  Select s1=new Select(we);
		  s1.selectByIndex(1);
	}
	
public void type_Listbox() {
	WebElement we1=driver.findElement(By.xpath("//select[@name='query(rootType)']"));
	  Select s2=new Select(we1);
	  s2.selectByIndex(2);
}

     @FindBy(xpath="//input[@type='submit']")
    		 private WebElement see;
     public void submit_Btn1() {
    	 this.see.click();
     }
     
	
     @FindBy(xpath="//input[@id='modeButton']")
 	private WebElement se9;
 	
 	public void message_Listbox1() {
 		WebElement we=driver.findElement(By.xpath("//select[@id='messageBoxSelect']"));
 		  Select s1=new Select(we);
 		  s1.selectByIndex(0);
 	}
 	
 public void type_Listbox1() {
 	WebElement we1=driver.findElement(By.xpath("//select[@name='query(rootType)']"));
 	  Select s2=new Select(we1);
 	  s2.selectByIndex(2);
 }

      @FindBy(xpath="//input[@type='submit']")
     		 private WebElement seew;
      public void submit_Btn2() {
     	 this.seew.click();
      }
      
	
	
      @FindBy(xpath="//input[@id='modeButton']")
   	private WebElement se19;
   	
   	public void message_Listbox2() {
   		WebElement we=driver.findElement(By.xpath("//select[@id='messageBoxSelect']"));
   		  Select s1=new Select(we);
   		  s1.selectByIndex(0);
   	}
   	
   public void type_Listbox2() {
   	WebElement we1=driver.findElement(By.xpath("//select[@name='query(rootType)']"));
   	  Select s2=new Select(we1);
   	  s2.selectByIndex(0);
   }

        @FindBy(xpath="//input[@type='submit']")
       		 private WebElement swa1;
        public void submit_Btn3() {
       	 this.swa1.click();
        }
        
        
	
	
	
}