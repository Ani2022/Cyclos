package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LaunchAdminPOM;
import com.training.pom.LaunchMemberPOM;
import com.training.pom.LoginPOM;
import com.training.pom.MessagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MessageVerify {
	private WebDriver driver;
	private String baseUrl;
	private MessagePOM messagePOM;
	private LaunchMemberPOM memberPOM;
	private LaunchAdminPOM adminPOM;
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
		messagePOM = new MessagePOM(driver); 
		memberPOM = new LaunchMemberPOM(driver);
		adminPOM = new LaunchAdminPOM(driver);
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
	public void messageVerify(){
		memberPOM.sendUserName("srid");
		memberPOM.sendPassword();
		memberPOM.Btn1();
		memberPOM.Btn2();
		memberPOM.Btn3();
		memberPOM.Btn4();
		memberPOM.Submitbuton();
		messagePOM.personal();
		messagePOM.messages();
		messagePOM.Submit();
		messagePOM.Admin();
		messagePOM.loan();
		messagePOM.Subject("Hello");
	    driver.switchTo().parentFrame();
		messagePOM.Description("Welcome");
		messagePOM.submit1();
		Alert alt=driver.switchTo().alert();
		String alert=alt.getText();
	    alt.accept();
		messagePOM.logout();
	    alt.accept();
		adminPOM.sendUserName("admin");
		adminPOM.sendPassword();
		adminPOM.Btn1();
		adminPOM.Btn2();
		adminPOM.Btn3();
		adminPOM.Btn4();
		adminPOM.Submitbuton();
		adminPOM.clickadminmsg();
		adminPOM.clickmessages1();
		adminPOM.Clickhello();
		String expected="Message details";
		String actual=driver.findElement(By.xpath("//td[@class='tdHeaderTable']")).getText();
		Assert.assertEquals(expected,actual);
		
		
		
		
	}
}
