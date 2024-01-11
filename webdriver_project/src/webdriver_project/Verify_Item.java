package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Item {

	public static void main(String[] args) throws Throwable {
		// Write a script to verify item exixting in the list box or not
		String Item_Present = "gift cards";
		boolean Item_Exist;	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		Select ListBox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items = ListBox.getOptions();
		System.out.println("No of items in list box    "+all_items.size());
		Thread.sleep(2000);
		for (WebElement each : all_items) {
			String actual_items = each.getText();
			System.out.println(actual_items);
			if(actual_items.equalsIgnoreCase(Item_Present))
			{
			    Item_Exist = true;
				break;
			}
			if(Item_Exist = true)
			{
				System.out.println("Item is found in the list box    " + Item_Present);
				
			}
			else
			{
				System.out.println("Item is not found in the list box     ");
				
			}
			Thread.sleep(2000);
			driver.quit();
			}
			
		}
		
		
		

	}


