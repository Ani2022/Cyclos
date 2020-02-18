package mytestcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MineTestcase {


	public WebDriver driver;
	@BeforeClass 
	public void launch(){

		System.setProperty("webdriver.chrome.driver","E:\\selenium  server\\selenium jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8585/do/login");
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


	}

	@Test(priority=2)
	public void account() throws AWTException, InterruptedException{
		driver.findElement(By.xpath("//li[@id='menu2']/span[@class='menuText']")).click();
	}
	@Test(priority=3)
	public void manage() {
		driver.findElement(By.xpath("//li[@id='submenu2.0']/span[@class='subMenuText']")).click();
	}

	@Test(priority=4)
	public void Payment() {
		WebElement p=driver.findElement(By.id("filterSelect"));
		Select sel=new Select(p);
		sel.selectByValue("1");
}

	
}






