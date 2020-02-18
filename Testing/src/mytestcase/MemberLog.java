package mytestcase;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MemberLog {

	public WebDriver driver;
	  @BeforeClass 
		public void launch(){
			
			System.setProperty("webdriver.chrome.driver","E:\\selenium  server\\selenium jars\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("httpSelenium-Automation-Elearning-Framework-TestNG://localhost:8585/do/login");
			 driver.manage().window().maximize();
		}

		@Test(priority=1)
		public void clickedLogin() throws InterruptedException{
			driver.findElement(By.xpath("//input[@id='cyclosUsername']")).sendKeys("manzoor");
			driver.findElement(By.xpath("//input[@value='1']")).click();
			driver.findElement(By.xpath("//input[@value='2']")).click();
			driver.findElement(By.xpath("//input[@value='3']")).click();
			driver.findElement(By.xpath("//input[@value='4']")).click();
			
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			Thread.sleep(3000);
		}
		@Test(priority=2)
		public void account() throws AWTException, InterruptedException{
			driver.findElement(By.xpath("//*[@id='menu3']/span[2]")).click();
			
		}

}
