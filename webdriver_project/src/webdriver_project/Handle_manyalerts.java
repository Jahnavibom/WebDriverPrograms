package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_manyalerts {

	public static void main(String[] args) throws Throwable {
		//Wtite a script to handle multiple alerts
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']//img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img)[11]")).click();
		String Alert1 =driver.switchTo().alert().getText();
		System.out.println(Alert1);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String Alert2 = driver.switchTo().alert().getText();
		System.out.println(Alert2);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
