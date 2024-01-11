package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript4 {

	public static void main(String[] args) throws Throwable {
		// 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://demo.opencart.com/'");
		Thread.sleep(5000);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		js.executeScript("document.querySelector(\"#input-firstname\").value='Neha'");
		js.executeScript("document.querySelector(\"#input-lastname\").value='Mandlem'");
		js.executeScript("document.querySelector(\"#input-email\").value = 'nehamandelm@gmail.com'");
		js.executeScript("document.querySelector(\"#input-password\").value='12345'");
		js.executeScript("window.scrollBy(0,300)");
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		
		
		
		

	}

}
