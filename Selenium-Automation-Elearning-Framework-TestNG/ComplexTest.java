package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.ComplexPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ComplexTest {
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
	
	@Test (dataProvider="db-inputs",dataProviderClass=LoginDataProviders.class)
	public void validLoginTest(String member_login, String amount, String description )  {
	complexPOM.sendUserName("admin");
	complexPOM.password();
	complexPOM.But1();
	complexPOM.But2();
	complexPOM.But3();
	complexPOM.But4();
	complexPOM.submit();
	complexPOM.member(member_login);
	complexPOM.grant1();  
	complexPOM.amount(amount);
	complexPOM.description(description);
	complexPOM.subm();
	complexPOM.subm1();
	complexPOM.assert1();
	complexPOM.alert();
	}
	

}
