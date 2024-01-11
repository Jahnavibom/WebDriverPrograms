package oct28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {
	public static WebDriver driver ; 
	public static void launchUrl(String URL) {
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	public static void login(String username, String password)
	{
		driver.findElement(By.name("txtuId")).sendKeys(username);
		driver.findElement(By.name("txtPword")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
}
