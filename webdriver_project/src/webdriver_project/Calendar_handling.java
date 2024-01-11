package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_handling {

	public static void main(String[] args) throws InterruptedException {
		// 
		String doj= "20/December/2024";
		String temp[] = doj.split("/");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Datepicker")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.id("datepicker")).click();
		String cal_month = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!cal_month.equalsIgnoreCase(month))
		{
			driver.findElement(By.linkText("Next")).click();
			cal_month = driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		String cal_year = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!cal_year.equals(year))
		{
			driver.findElement(By.linkText("Next")).click();
			cal_year = driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows= webtable.findElements(By.tagName("tr"));
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