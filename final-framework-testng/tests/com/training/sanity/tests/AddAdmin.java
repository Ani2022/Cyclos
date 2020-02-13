package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.pom.AdddvertisementPOM;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddAdmin {
	
	private WebDriver driver;
	private String baseUrl;
	private AdddvertisementPOM addpom;
	private static Properties properties;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		addpom = new AdddvertisementPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	@Test (priority = 1)
	public void Step1() throws InterruptedException, AWTException{
		addpom.sendcyclosUsername("admin");
		addpom.clickcyclosPassword();
		addpom.clickButton1();
		addpom.clickButton2();
		addpom.clickButton3();
		addpom.clickButton4();
		addpom.clickButton5();
		addpom.clickButton6();
		addpom.clickSubmitbtn();
		addpom.sendmemberUsername("manzoor");
		 JavascriptExecutor a = (JavascriptExecutor)driver; 
		  a.executeScript("window.scrollBy(0,700)");
		  Thread.sleep(1000);
		  addpom.clickMansubbtn();
		  addpom.clicknewButton();
		  addpom.clickCategory();
		  Robot robot=new Robot();
          robot.keyPress(KeyEvent.VK_DOWN);
          robot.keyPress(KeyEvent.VK_ENTER);
          addpom.sendUnits("7");
          addpom.clicknotExpirableCheck();
         addpom.clicksaveButton();
          addpom.clickbackButton();
	}
	
	
	
	
	
}
