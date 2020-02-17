package com.training.sanity.tests;

import java.io.FileInputStream;
import com.training.dataproviders.LoginDataProviders;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddContactsPOM;
import com.training.pom.AdminLoginPOM;
import com.training.pom.MemberLoginPOM;
import com.training.pom.MemberPasswordPOM;
import com.training.pom.PaymentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

//import complex.LoginDataProviders;

public class ContactsPaymentTest {
	private WebDriver driver;
	private String baseUrl;
	private MemberLoginPOM mlogin;
	private AddContactsPOM contacts;
	private AdminLoginPOM alogin;
	private PaymentPOM payment;
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
		mlogin = new MemberLoginPOM(driver); 
		contacts = new AddContactsPOM(driver); 
		alogin = new AdminLoginPOM(driver); 
		payment = new PaymentPOM(driver); 
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
	@Test (dataProvider="cyclos", dataProviderClass=LoginDataProviders.class)
	public void contactsPayment(String Member_Name,String Contact,String Amount,String Description) throws InterruptedException{
		/*driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);				
		mlogin.sendUserName("srid");
		mlogin.sendPassword();
		mlogin.Btn1();
		mlogin.Btn2();
		mlogin.Btn3();
		mlogin.Btn4();
		mlogin.Submitbuton();
		
		contacts.personal();
		contacts.contacts();
		contacts.loginName("manzoor");
		contacts.memberName("manzoor");
		Thread.sleep(1000);
		contacts.submit();
		Alert alt=driver.switchTo().alert();
		String alert=alt.getText();
		alt.accept();
		contacts.loginName1("sunil");
		Thread.sleep(1000);
		contacts.memberName1("sunil");
		contacts.submit1();
		alt.accept();
		contacts.loginName2("Mariya");
		Thread.sleep(1000);
		contacts.memberName2("Mariya");
		contacts.submit2();
		alt.accept();
		contacts.logout1();
		alt.accept();*/
	

		alogin.sendUserName("admin");
		alogin.sendPassword();
		alogin.Btn1();
		alogin.Btn2();
		alogin.Btn3();
		alogin.Btn4();
		alogin.Submitbuton();
		

		
	    payment.account();
	    payment.managePayment();
		payment.loginName(Member_Name);
		payment.memberName(Contact);
	    Thread.sleep(1000);
		payment.amount(Amount);
		payment.selectTrans();
		payment.Description(Description);
		payment.msubmit();
		payment.msubmit1();
		payment.newPayment();
	
		/*payment.loginName1(Member_Name);
		payment.memberName1(Contact);
	    Thread.sleep(1000);
		payment.amount1(Amount);
		payment.selectTrans1();
		payment.Description1(Description);
		payment.msubmit11();
		payment.msubmit12();
		payment.newPayment1();
		payment.loginName2(Member_Name);
		payment.memberName2(Contact);
	    Thread.sleep(1000);
		payment.amount2(Amount);
		payment.selectTrans2();
		payment.Description2(Description);
		payment.msubmit21();
		payment.msubmit22();
		payment.newPayment2();
		*/
		
		/*Member_Name
		Contact
		Amount
		Description*/
	}
}
