package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Table2 {

	public static void main(String[] args) throws Throwable {
		// Write a script to get no of rows in a table and count no of cell in each row
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		// Store table into Webelement
		WebElement Webtable = driver.findElement(By.className("dataTable"));
		// Get list of rows in webtable
		List<WebElement> rows = Webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows are:  "+ row);
		//iterate all rows
		for(int i=1;i<rows.size();i++)
		{
			// get cell collection in each row
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row no :"+ i+ "   "+"Column size:"+ cols.size());
		}
		driver.quit();
		
		
		
		
		

	}

}
