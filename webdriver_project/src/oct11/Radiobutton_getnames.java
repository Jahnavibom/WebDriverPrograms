package oct11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_getnames {

	public static void main(String[] args) throws Throwable {
		//Write a script to get the names of radio buttons in facebook singup page 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		List<WebElement> all_radio = driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
		System.out.println("No of radio buttons present are "+all_radio.size());
		for (WebElement each : all_radio) {
			System.out.println(each.getText());
		}
		Thread.sleep(3000);
		driver.quit();
		

	}

}
