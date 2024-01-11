package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension_example {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("txtUsername"));
		Dimension dim = username.getSize();
		System.out.println(dim.height + "             "+ dim.width);
		WebElement loginbtn = driver.findElement(By.id("btnLogin"));
		Dimension dim1 = loginbtn.getSize();
		System.out.println(dim1.height+"        "+dim1.width);
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
