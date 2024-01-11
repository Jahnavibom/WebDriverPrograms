package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Events {

	public static void main(String[] args) throws Throwable {
		// Write a script to perform mouse events in Flipkart
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(7000);
		//Mouse to fashion and click
		ac.moveToElement(driver.findElement(By.xpath("(//img[@alt='Fashion'])[1]"))).click().perform();
		Thread.sleep(7000);
		//Mouse to electronics
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).perform();
		Thread.sleep(7000);
		//mouse to vivo and click
		ac.moveToElement(driver.findElement(By.linkText("Vivo"))).click().perform();
		Thread.sleep(7000);
		//mouse to baby and kids
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']"))).perform();
		Thread.sleep(7000);
		//mouse to puzzles and click
		ac.moveToElement(driver.findElement(By.linkText("Puzzles"))).click().perform();
		Thread.sleep(7000);
		driver.quit();

	}

}
