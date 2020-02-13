package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.pom.AdminPOM;
import com.training.pom.LogPOM;
import com.training.pom.MemPayPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MemPayView {
	
	private WebDriver driver;
	private String baseUrl;
	private MemPayPOM mempom;
	private LogPOM logpom;
	private AdminPOM adminpom;
	private static Properties properties;

	@BeforeTest
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeClass
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		mempom = new MemPayPOM(driver); 
		logpom = new LogPOM(driver);
		adminpom = new AdminPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);
	//	driver.quit();
	}
	
	@Test (priority = 1)
	public void Step1() throws AWTException, InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logpom.sendcyclosUsername("admin");
		logpom.clickcyclosPassword();
		logpom.clickButton1();
		logpom.clickButton2();
		logpom.clickButton3();
		logpom.clickButton4();
		logpom.clickButton5();
		logpom.clickButton6();
		logpom.clickSubmitbtn();
	    mempom.clickAccount();
	//    Robot robot = new Robot();
	//  robot.keyPress(KeyEvent.VK_DOWN);
	//    robot.keyPress(KeyEvent.VK_DOWN);
	//    robot.keyPress(KeyEvent.VK_DOWN);
	//    robot.keyPress(KeyEvent.VK_DOWN);
	//    robot.keyPress(KeyEvent.VK_DOWN);
	//    robot.keyPress(KeyEvent.VK_DOWN);
	//    robot.keyPress(KeyEvent.VK_DOWN);
	//    robot.keyPress(KeyEvent.VK_ENTER);
	  
	    
	    adminpom.memberPaym();
	    adminpom.memberUsername("Kavya");
	    adminpom.memberName("Kavya");
	    adminpom.amount("5");
	    adminpom.sel();
	    //Thread.sleep(3000);
	  //  adminpom.clickTrans();
	    //Thread.sleep(3000);
//	    Robot robot1 = new Robot();
	//    robot1.keyPress(KeyEvent.VK_DOWN);
	//    robot1.keyPress(KeyEvent.VK_DOWN);
	//    robot1.keyPress(KeyEvent.VK_ENTER);
	    adminpom.description("WELCOME");
	    adminpom.submitBtn1();
	    adminpom.submitBtn2();
	    adminpom.clickLogOut();
	    Alert alt = driver.switchTo().alert();
		String aleartmsg = alt.getText();
		//System.out.println("The alert message is " +aleartmsg);
		alt.accept();
		
	    logpom.sendcyclosUsername("Kavya");
	    logpom.clickcyclosPassword();
	/*	logpom.clickM();
		logpom.clickA();
		logpom.clickN();
		logpom.clickZ();
		logpom.clickO();
		logpom.clickOo();
		logpom.clickR(); */
	    
	    logpom.clickButton1();
		logpom.clickButton2();
		logpom.clickButton3();
		logpom.clickButton4();
		logpom.clickButton5();
		logpom.clickButton6();
	    
		logpom.clickSubmitbtn();
		mempom.Account();
	    mempom.clickInfo();
	}

}
