package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Table1 {

	public static void main(String[] args) throws Throwable {
		// Write a script to capture specific row coloumn data in a table
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//print specific row cell data  in a table
		String TableText1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[1]")).getText();
		String TableText2 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[2]")).getText();
		System.out.println(TableText1+ "     "+TableText2);
		driver.quit();
		

		
		
		

	}

}
