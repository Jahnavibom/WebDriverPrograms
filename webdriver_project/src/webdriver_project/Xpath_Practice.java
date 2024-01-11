package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practice {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Jahnavi");
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9956562656");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jahnavi@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("djsdk");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Female");
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("09-07-1990");
		driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
