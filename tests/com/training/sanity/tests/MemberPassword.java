package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.MemberPasswordPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MemberPassword {
	private WebDriver driver;
	private String baseUrl;
	private MemberPasswordPOM password;
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
		password = new MemberPasswordPOM(driver); 
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
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);				
		password.sendUserName("admin");
		password.sendPassword();
		password.Btn1(); 
		password.Btn2();
		password.Btn3();
		password.Btn4();
		password.Submitbuton();
		password.memberlogin("manzoor");
		//Thread.sleep(3000);
		JavascriptExecutor a=(JavascriptExecutor)driver;
		a.executeScript("window.scrollBy(0,500)");
		//Thread.sleep(1000);
		password.ManageSubmitbtn();
		password.Newpassword("manzoor");
		password.Confirmpassword("manzoor");
		password.Forcechange();
		password.ResetSubmit();
		Alert alt=driver.switchTo().alert();
		String alert=alt.getText();
		alt.accept();
		alt.accept();
		driver.findElement(By.id("backButton")).click();
		//screenShot.captureScreenShot("First");
	}

}
