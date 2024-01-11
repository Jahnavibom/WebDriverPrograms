package webdriver_project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_MultipleWindows {

	public static void main(String[] args) throws Throwable {
		// Write a script to handle multiple windows in IRCTC page 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		String Parent = driver.getWindowHandle();
		System.out.println("Parent window handle is     "+Parent);
		Thread.sleep(2000);
		driver.findElement(By.linkText("BUSES")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("FLIGHTS")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("HOTELS")).click();
		Thread.sleep(2000);
		Set<String> allIds = driver.getWindowHandles();
		System.out.println("All window handles are    "+allIds);
		for (String each : allIds) {
			
			if(!Parent.equals(each))
			{
				String PageTitle = driver.switchTo().window(each).getTitle();
				System.out.println(PageTitle);
				Thread.sleep(2000);
				driver.close();
				
			}
		}
			driver.switchTo().window(Parent);
			driver.findElement(By.linkText("PNR STATUS")).click();
			Thread.sleep(6000);
			driver.quit();
				
		}
		
		

	}


