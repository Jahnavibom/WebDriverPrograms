package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods {

	public static void main(String[] args) throws Throwable {
		//Write a script to perform navigation methods on google page
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.co.in/");
		System.out.println("page title [1]"+ driver.getTitle());
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("page title [2]"+ driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("page Title [3]"+driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println("page Title [4]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
