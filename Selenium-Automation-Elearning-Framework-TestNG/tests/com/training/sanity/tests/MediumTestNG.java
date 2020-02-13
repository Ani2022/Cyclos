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
import com.training.pom.MediumPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MediumTestNG {
	private WebDriver driver;
	private String baseUrl;
	private MediumPOM mediumPOM;
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
		mediumPOM = new MediumPOM(driver); 
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
	public void MediumTest(){
		mediumPOM.sendUserName("Nikita");
		mediumPOM.sendUserPassword();
		mediumPOM.bttn1();
		mediumPOM.bttn2();
		mediumPOM.bttn3();
		mediumPOM.bttn4();
		mediumPOM.bttn5();
		mediumPOM.LoginSubmit();
		mediumPOM.Account();
		mediumPOM.MemberPayment();
		mediumPOM.LoginR();
		mediumPOM.NameR();
		mediumPOM.Amount();
		mediumPOM.Scheduling();
		WebElement a=driver.findElement(By.id("schedulingTypeSelect"));
		Select sel =new Select(a);
		sel.selectByValue("SINGLE_FUTURE");
	
		mediumPOM.Date();
		mediumPOM.Description();
		mediumPOM.Submit();
		mediumPOM.Submit1();
		 

}}
