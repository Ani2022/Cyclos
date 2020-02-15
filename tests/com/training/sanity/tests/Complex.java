package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ComplexPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Complex {

	private WebDriver driver;
	private String baseUrl;
	private ComplexPOM complexPOM;
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
		complexPOM = new ComplexPOM(driver); 
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
		complexPOM.sendUserName("admin");
		complexPOM.button1();
		complexPOM.button2();
		complexPOM.button3();
		complexPOM.button4();
		complexPOM.submit();
		complexPOM.member1();
        //Thread.sleep(3000);
		
       complexPOM.grant1();  
       complexPOM.loan1();
       complexPOM.dep();
       complexPOM.subm();
       complexPOM.subm1();
       complexPOM.assert1();
       complexPOM.alert();
       complexPOM.logout();
       complexPOM.alert();
       
       complexPOM.sendUserName("admin");
		complexPOM.button1();	
		complexPOM.button2();
		complexPOM.button3();
		complexPOM.button4();
		complexPOM.submit();
		complexPOM.member1();
		Thread.sleep(3000);
		complexPOM.loan();
		complexPOM.searc();
		Thread.sleep(4000);
        complexPOM.text();
        complexPOM.repay();
        //complexPOM.assert2();
        complexPOM.alert();
        Thread.sleep(3000);
        complexPOM.assert2();
        complexPOM.alert();
        //complexPOM.alert();
        Thread.sleep(5000);
	}
	
	
	
}
