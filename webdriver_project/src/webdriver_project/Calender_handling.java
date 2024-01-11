package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender_handling {

	public static void main(String[] args) throws Throwable {
		// Write a script to select date month and year from a calender using table concept
		String dob = "9-Jul-1990";
		String temp []= dob.split("-");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("popupDatepicker")).click();
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
		WebElement tabledata = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows, cols;
		rows = tabledata.findElements(By.tagName("tr"));
		
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date))
				{
					eachcell.click();
				}
				
			}
			
		}
		
		
		
		

	}
}

