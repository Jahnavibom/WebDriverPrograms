package webdriver_project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_windows {

	public static void main(String[] args) throws Throwable {
		// Write a script to switch between windows and handle child and parent window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com/");
		Thread.sleep(2000);
		//print parent gmail window ID
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//click 3 links to open in other tabs
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		for (String each : allIds) {
			// parent window should not be equal to child window
			if(!parent.equals(each))
			{
				//switch to child window and close the window
				String pageTitle = driver.switchTo().window(each).getTitle();
				System.out.println(pageTitle);
				Thread.sleep(2000);
				driver.close();
			}
		}
		//switch to parent window
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("jahnavibommisetty@gmail.com");
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
