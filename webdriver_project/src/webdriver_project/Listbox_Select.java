package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Select {

	public static void main(String[] args) throws Throwable {
		//write a script to select items in facebook application
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		Select date = new Select(driver.findElement(By.name("birthday_day")));
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		boolean value = date.isMultiple();
		System.out.println(value);
		Thread.sleep(2000);
		date.selectByIndex(8);
		Thread.sleep(2000);
		month.selectByValue("7");
		Thread.sleep(2000);
		year.selectByVisibleText("1990");
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

	}

}
