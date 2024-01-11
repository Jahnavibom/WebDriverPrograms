package webdriver_project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) {
		// Write a script to get the URL, Title and Domain name using Java Script 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Create object for java script executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//launch URL
		js.executeScript("window.location='https://www.tatacliq.com/'");
		//print title and length of title
		String PageTitle = js.executeScript("return document.title").toString();
		System.out.println(PageTitle);
		System.out.println(PageTitle.length());
		String URL = js.executeScript("return document.URL").toString();
		System.out.println(URL);
		System.out.println(URL.length());
		String DomainName = js.executeScript("return document.domain").toString();
		System.out.println(DomainName);
		System.out.println(DomainName.length());
		driver.quit();
		}

}
