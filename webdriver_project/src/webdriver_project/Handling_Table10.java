package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Table10 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		WebElement tableData = driver.findElement(By.className("ws-table-all"));
		List<WebElement> rows, cols;
		rows = tableData.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows:   "+row );
		for (WebElement eachrow : rows) {
			cols=eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				System.out.println("\n"+eachcell.getText());
			}
			System.out.println();
			System.out.println("==========================");
		}
			driver.quit();
			
			
		}
		

	}


