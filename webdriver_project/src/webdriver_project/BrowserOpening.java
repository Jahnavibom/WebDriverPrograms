package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpening {

	public static void main(String[] args) throws Throwable  {
		
		WebDriver driver = new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Delete cookies
		driver.manage().deleteAllCookies();
		//Launch google
		driver.get("https://google.co.in");
		
		driver.findElement(By.className("gb_B")).click();
		//suspends tool from execution for 3 seconds
		Thread.sleep(3000);
		//closed the currently opened chrome window
		driver.close();

	}

}
