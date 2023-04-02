package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02Oracle {
	public static void main(String[] args) throws  Exception{
		
		String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		String dbun="system";
		String dbpq="system";
		System.out.println("================");
		Connection con=DriverManager.getConnection(dburl,dbun,dbpq);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM DETAILSTABLE");
		System.out.println("================");	
		while(rs.next())
		{String un=rs.getString(1);
		 String pw=rs.getString(2);
		 System.out.println(un);
		 System.out.println(pw);
		System.out.println("================");
		// Test Steps===========

		//System.setProperty("webdriver.gecko.driver ","C:\\Users\\USER\\Downloads\\Naresh IT\\"
		//		+ "Suresh sir automation download\\selenium web driver\\geckodriver.exe");
				
		WebDriver driver =new FirefoxDriver();
		
		//WebDriver driver =new ChromeDriver();

		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		Thread.sleep(4000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");

		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();

		Thread.sleep(4000);
		driver.close();
		}
		rs.close();
		st.close();
		con.close();
			
			

				
			
		}
}