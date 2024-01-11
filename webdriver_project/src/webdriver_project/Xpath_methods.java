package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_methods {

	public static void main(String[] args) throws Throwable {
		// Write a script to access facebook  using xpath methods
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='reg']//following::input[2]")).sendKeys("jahnavi");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[3]")).sendKeys("bommisetty");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[4]")).sendKeys("jahnavibommisetty@gmill.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[5]")).sendKeys("jahnavibommisetty@gmill.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[6]")).sendKeys("jajaj@112");
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[1]"))).selectByVisibleText("9");
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[2]"))).selectByValue("7");
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[3]"))).selectByVisibleText("1990");
		driver.findElement(By.xpath("//form[@id='reg']//following::label[1]")).click();
		driver.findElement(By.xpath("//form[@id='reg']//following::button")).click();
		
		

		

	}

}
