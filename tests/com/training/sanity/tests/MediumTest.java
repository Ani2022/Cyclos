package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import com.training.pom.MediumPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MediumTest {

private WebDriver driver;
private String baseUrl;
private MediumPOM mediumPOM;
private static Properties properties;
private ScreenShot screenShot;

@BeforeClass
public static void setUpBeforeClass() throws IOException  {
properties = new Properties();
FileInputStream inStream = new FileInputStream("./resources/others.properties");
properties.load(inStream);
}

@BeforeMethod
public void setUp()throws Exception {
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
public void MediumTest() throws Exception {
	mediumPOM.memlogin("manzoor");
	mediumPOM.cyclosPassword();
	mediumPOM.password1();
	mediumPOM.password2();
	mediumPOM.password3();
	mediumPOM.password4();
	mediumPOM.clickLoginBtn();
	mediumPOM.acounts();
	mediumPOM.acountinfo();
	mediumPOM.advanced();
	mediumPOM.membername("manzoor");
	mediumPOM.searching();
	Thread.sleep(3000);
	mediumPOM.dateBox1("10/02/2020");
	mediumPOM.dateBox("12/02/2020");
	mediumPOM.search1();
	Thread.sleep(3000);
	mediumPOM.payment();
	WebElement p=driver.findElement(By.xpath("//select[@name='query(paymentFilter)']"));
	Select sel=new Select(p);
		sel.selectByValue("4");
		
     mediumPOM.search2();
			
			
	
	

	
	

	
}
}
