package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTest {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		 loginPOM.sendUserPassword();
		 loginPOM.btn1();
		 loginPOM.btn2();
		 loginPOM.btn3();
		 loginPOM.btn4();
		 loginPOM.clicksubmitbtn();
		 Thread.sleep(3000);
		 loginPOM.memberUsername();
		 loginPOM.Account();
		 loginPOM.SystemPayment();
		 loginPOM.Amount();
		 loginPOM.Transection();
		 WebElement a=driver.findElement(By.id("type"));
		 Select sel=new Select(a);
		 sel.selectByValue("1");
		 loginPOM.Description();
		 Thread.sleep(3000);
		 loginPOM.Submit();
		 Thread.sleep(2000);
		 loginPOM.FinalSubmit();
		
		
		
		
	}
}
