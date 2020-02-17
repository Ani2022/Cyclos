package com.training.sanity.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.AdddvertisementPOM;
import com.training.pom.AdminPOM;
import com.training.pom.ComplexPOM;
import com.training.pom.LogPOM;
import com.training.pom.MemPayPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ComplexTest {
  
	private WebDriver driver;
	private String baseUrl;
	private ComplexPOM compom;
	private LogPOM logpom;
	private MemPayPOM mempom;
	private AdminPOM adminpom;
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
		compom = new ComplexPOM(driver);
		logpom = new LogPOM(driver);
		mempom = new MemPayPOM(driver);
		adminpom = new AdminPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	
	@Test (priority = 1)
	public void Step1() {
		
		logpom.sendcyclosUsername("Kavya");
		logpom.clickcyclosPassword();
		logpom.clickButton1();
		logpom.clickButton2();
		logpom.clickButton3();
		logpom.clickButton4();
		logpom.clickButton5();
		logpom.clickButton6();
		logpom.clickSubmitbtn();
		
		compom.clickPersonal();
	    compom.clickContacts();
		compom.sendMemLogin("Kavya");
	//	compom.sendMemName("Kavya");
		compom.clickSubtn1();
	    compom.clickAddContact();
	    compom.clickSubtn2();
	    compom.sendAmount("5");
	    compom.sendDescription("Welcom");
	    compom.clickSubtn3();
	    compom.clickSubtn4();
	    compom.clickLogOut();
	
	    logpom.sendcyclosUsername("Kavya");
		logpom.clickcyclosPassword();
		logpom.clickButton1();
		logpom.clickButton2();
		logpom.clickButton3();
		logpom.clickButton4();
		logpom.clickButton5();
		logpom.clickButton6();
		logpom.clickSubmitbtn();
	    
		mempom.Account();
		mempom.clickInfo();
		compom.clickView();
	    
		compom.clickBack();
	}
}