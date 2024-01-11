package webdriver_project;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_ChildWindow {

	public static void main(String[] args) throws Throwable {
		//Write a script a handle specific child window when multiple windows are open in gmail
		WebDriver driver = new ChromeDriver()
;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(2000);
		ArrayList<String> allIds = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(allIds);
		// for switching to help window
		driver.switchTo().window(allIds.get(1));
		Thread.sleep(2000);
		String Expected_Title = "Google Account Help";
		String Actual_Title = driver.getTitle();
		if(Expected_Title.equalsIgnoreCase(Actual_Title))
		{
			System.out.println("Title is matching   "+Expected_Title+ "     "+Actual_Title );
		}
		else
		{
			System.out.println("Title is not matching"+Expected_Title+ "      " +Actual_Title);
		}
		Thread.sleep(2000);
		driver.close();
		//for switching to parent window
		driver.switchTo().window(allIds.get(0));
		Thread.sleep(2000);
		driver.findElement(By.name("identifier")).sendKeys("jahnavibommisetty@gmail.com");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(allIds.get(2));
		Thread.sleep(3000);
		driver.findElement(By.linkText("FAQ")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
