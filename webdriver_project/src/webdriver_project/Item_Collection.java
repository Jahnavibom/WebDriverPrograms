package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Item_Collection {

	public static void main(String[] args) throws Throwable {
		// Write a script to get collection of items in amazon list box and print name of each items
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		Select listbox =new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items = listbox.getOptions();
		System.out.println("No of items in list box     "+ all_items.size());
		Thread.sleep(2000);
		for (WebElement each : all_items) {
			System.out.println(each.getText());
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
