package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Collection {

	public static void main(String[] args) throws Throwable {
		/*//write a script for checkboxes
1.get collection of checkboxes
2.verify which checkbox is true or false
3.print each check box names
4.uncheck check box which is already selected check checkbox which is not selected*/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/Dell/Downloads/checkbox_1_lyst3995.html");
		Thread.sleep(3000);
		List<WebElement> all_Checkbox = driver.findElements(By.tagName("input"));
		System.out.println("Total no of check boxes::"+all_Checkbox.size());
		//verify which check box is true or false
		for (WebElement each : all_Checkbox) {
			boolean is_selected = each.isSelected();
			//print each check box name 
			String Checkbox_name = each.getAttribute("value");
			System.out.println(Checkbox_name + "   "+ is_selected);
			
			//uncheck check boxes which are selected. check the check boxes which are not selected
			Thread.sleep(2000);

			each.click();
		}
		Thread.sleep(3000);
		//driver.quit();
		
	}

}
