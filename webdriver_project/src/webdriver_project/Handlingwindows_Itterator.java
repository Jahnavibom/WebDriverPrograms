package webdriver_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindows_Itterator {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		driver.findElement(By.linkText("BUSES")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("FLIGHTS")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("HOTELS")).click();
		Thread.sleep(2000);
		Set<String> allIds = driver.getWindowHandles();
		System.out.println("All window handles are    "+allIds);
		Iterator <String> each = allIds.iterator();
		while ( each.hasNext())
		{
			String child = each.next();
			if(!Parent.equals(child))
			{
				//switch to child window and close the window
				String pageTitle = driver.switchTo().window(child).getTitle();
				System.out.println(pageTitle);
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


