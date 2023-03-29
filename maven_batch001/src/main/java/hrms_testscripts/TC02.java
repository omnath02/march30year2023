package hrms_testscripts;

import org.apache.logging.log4j.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import demoLog.Log4jDemo;

public class TC02 {

private static Logger demologger = LogManager.getLogger(Log4jDemo.class.getName());
	
	
	
	@Test()
	public void testmethod () throws InterruptedException{
		
//		System.setProperty("webdriver.chromedriver","C:\\Users\\USER\\Downloads\\Naresh IT\\"
//		+ "Suresh sir automation download\\selenium web driver\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		
		System.out.println("Browser Launch");		
		Reporter.log("Browser Launch--- log Message");
	
		
		demologger.error("Error Here");
		
		demologger.fatal("Fatal Here");
		
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		System.out.println("login Done");		
		Reporter.log("login Done--- log Message");


		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		System.out.println("Logout complete");
		Reporter.log("Logout complete--- log Message");
		
		
		driver.close();

			}
	}


