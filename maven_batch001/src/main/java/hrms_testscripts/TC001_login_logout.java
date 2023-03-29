package hrms_testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_login_logout {	
public static void main(String[] args) throws Exception {
	
System.setProperty("webdriver.chromedriver","C:\\Users\\USER\\Downloads\\Naresh IT\\"
+ "Suresh sir automation download\\selenium web driver\\chromedriver.exe");


WebDriver driver = new ChromeDriver();

driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
System.out.println("login Done");


driver.findElement(By.linkText("Logout")).click();
Thread.sleep(4000);
System.out.println("Logout complete");
driver.close();

	}}



