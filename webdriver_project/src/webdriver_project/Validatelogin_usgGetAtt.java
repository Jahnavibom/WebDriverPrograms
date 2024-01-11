package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validatelogin_usgGetAtt {

	public static void main(String[] args) throws Throwable {
	// Write a script to validate login functionality 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		// store user name text box into web element
		WebElement username = driver.findElement(By.id("txtUsername"));
		//for clearing the user name text box
		username.clear();
		//send user name into user name text box
		username.sendKeys("Admin");
		//for printing the attribute entered 
		System.out.println(username.getAttribute("value"+ ""));
		//store password text box into web element
		WebElement password = driver.findElement(By.id("txtPassword"));
		//for clearing password text box
		password.clear();
		//send password into password text box
		password.sendKeys("Qedge123!@#");
		System.out.println(password.getAttribute("value"));
		driver.findElement(By.className("button")).click();
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if( Actual.contains(Expected))
		{
			System.out.println("Login successfully " +Expected + "   "+ Actual);
		
		}
		else
		{
			System.out.println("Login not successful "+ Expected + "      "+ Actual);
			System.out.println("Error is "+driver.findElement(By.id("spanMessage")).getText());
		}
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
