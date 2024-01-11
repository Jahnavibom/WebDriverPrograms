package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Collection {

	public static void main(String[] args) throws InterruptedException {
	//Write a script to get collection of hyperlinks in webpage which are stored into HTML tag'a'
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(3000);
		
		List <WebElement> all_Links =driver.findElements(By.tagName("a"));

		System.out.println("No of links are:   "+all_Links.size());
		
		for (WebElement each : all_Links) {
			
			System.out.println(each.getText());
			
		}
		driver.quit();

	}

}
