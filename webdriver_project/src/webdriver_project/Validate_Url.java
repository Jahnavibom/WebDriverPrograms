package webdriver_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Url {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(3000);
		String Expected = "https://";
		String Actual = driver.getCurrentUrl();
		if (Actual.startsWith(Expected))
		{
			System.out.println("URL is Secured    "+Expected+    "    "+Actual);
		}
		else 
		{
			System.out.println("URL is not secured    "+Expected+ "           "+Actual);
		}
				
		driver.close();

	}

}
