package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Commands {

	public static void main(String[] args) throws Throwable {
		
		// write a script to print gmail text and gmail URL
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.co.in");
		Thread.sleep(3000);
		//to capture Gmail link name  in google page
		String element = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(element);
		// to capture gmail URL which is not visible in web page. Giving property name "href" is must 
		String element1= driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
		System.out.println(element1);
        //driver.close();
	}
	

}
