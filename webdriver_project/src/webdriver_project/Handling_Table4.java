package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Table4 {

	public static void main(String[] args) throws InterruptedException {
		// Write a script to get  table data from orange HRM
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.className("button")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(5000);
		WebElement tabledata = driver.findElement(By.id("resultTable"));
		List<WebElement> rows, cols ;
		rows = tabledata.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows are :   "+row);
		Thread.sleep(5000);
		//iterate all rows 
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				System.out.println("\n"+ eachcell.getText());
				
			}
			System.out.println();
		}
		driver.quit();
		
		

	}

}
