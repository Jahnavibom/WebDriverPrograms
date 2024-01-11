package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Table3 {

	public static void main(String[] args) throws Throwable {
		// Write a script to get the column data from a table
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement Webtable = driver.findElement(By.className("dataTable"));
		List<WebElement> rows, cols ;
		//get rows collection
		rows = Webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows are : "+ row);
		Thread.sleep(5000);
		//iterate all rows 
		for (WebElement eachrow : rows) {
			//iterate all rows
			cols = eachrow.findElements(By.tagName("td"));
			//iterate all cells
		for (WebElement eachcell : cols) {
			Thread.sleep(5000);
			System.out.println("\n" + eachcell.getText());
			
		}
			System.out.println();
		}
	}
}
	


