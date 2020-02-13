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
import com.training.pom.LoginFilterPOM;
import com.training.pom.MemberPOM;
import com.training.pom.SelectPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Filter {
	private WebDriver driver;
	private String baseUrl;
	//private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private MemberPOM memberPOM;
	private SelectPOM selectPOM;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//loginPOM = new LoginPOM(driver);
		memberPOM =new MemberPOM(driver);
		selectPOM =new SelectPOM(driver);
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
		memberPOM.sendUserName("samsaravanan");
		memberPOM.But1();
		memberPOM.But2();
		memberPOM.But3();
		memberPOM.But4();
		memberPOM.submit();
		selectPOM.personal_Link();
		selectPOM.message_Link();
		selectPOM.advance_Button();
		selectPOM.message_Listbox();
		selectPOM.type_Listbox();
		selectPOM.submit_Btn1();
		selectPOM.message_Listbox1();
		selectPOM.type_Listbox1();
		selectPOM.submit_Btn2();
		selectPOM.message_Listbox2();
		selectPOM.type_Listbox2();
		selectPOM.submit_Btn3();
		
		
		
		
       
	}
	
	
	
}

