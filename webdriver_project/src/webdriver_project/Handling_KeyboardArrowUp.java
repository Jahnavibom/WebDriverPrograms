package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_KeyboardArrowUp {

	public static void main(String[] args) throws Throwable {
		// Write a script to perform Arrow_down in google page
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium openings");
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
