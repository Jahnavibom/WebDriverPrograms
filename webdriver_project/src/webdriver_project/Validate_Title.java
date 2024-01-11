package webdriver_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Title {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		String Expected_Title ="google";
		String Actual_Title = driver.getTitle();
		if (Expected_Title.equalsIgnoreCase(Actual_Title))
		{
			System.out.println("Expeced tite is equal to Actual Title     "+ Expected_Title+ "            " + Actual_Title);
		}
		else 
		{
			System.out.println("Expected tite is not equal to Actual title       "+Expected_Title+ "              "+ Actual_Title);
			
		}
driver.close();
	}

}
