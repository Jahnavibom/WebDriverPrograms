package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect_printSelected {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/Dell/Downloads/MultiListboxHtmlpage_lyst3968.html");
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		System.out.println(dropdown.isMultiple());
		//to select first 6 items in the list box
		for (int i=0;i<=5;i++)
		{
			dropdown.selectByIndex(i);
		}
		List<WebElement> selected_items = dropdown.getAllSelectedOptions();
		System.out.println("Items selected are   "+ selected_items.size());
		for (WebElement each : selected_items) {
			System.out.println(each.getText());
					
		}
		dropdown.deselectAll();
		driver.quit();
		

	}

}
