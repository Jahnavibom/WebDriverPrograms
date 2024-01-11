package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_alert {

	public static void main(String[] args) throws Throwable {
		// Write a script for Handling popup window or alert box
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		String error_Text = driver.switchTo().alert().getText();
		System.out.println(error_Text);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.quit();
		

	}

}
