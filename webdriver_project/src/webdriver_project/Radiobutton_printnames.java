package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_printnames {

	public static void main(String[] args) throws Throwable {
		// Write a script to get collection of radio button and print each radio button names
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pranga82@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ranga123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//get collection of radio buttons
		List<WebElement> all_radio = driver.findElements(By.xpath("//div[@class='radio_b']"));
		System.out.println("No of radio buttons::"+all_radio.size());
		for (WebElement each : all_radio) {
			System.out.println(each.getText());
			
			
		}
			Thread.sleep(3000);
			driver.quit();

	}

}
