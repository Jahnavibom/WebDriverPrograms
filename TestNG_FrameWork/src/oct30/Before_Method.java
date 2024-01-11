package oct30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_Method {
 WebDriver driver;
	@BeforeMethod
	public void beforMethod()
	{
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get("http://calc.qedgetech.com/");
	 Reporter.log("Before method",true);
	}
	@Test(priority=2,invocationCount = 2)
	public void addition()
	{
		driver.findElement(By.name("display")).sendKeys("255");
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("255");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Reporter.log("Addition Method",true);
	}
	@Test(priority=1,enabled=false)
	public void division()
	{
		driver.findElement(By.name("display")).sendKeys("255");
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("255");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Reporter.log("Division Method",true);
	}
	@Test(priority=0)
	public void multiplication()
	{
		driver.findElement(By.name("display")).sendKeys("255");
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("255");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Reporter.log("Multiplication Method",true);
		
	}
	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
		Reporter.log("After method",true);
	}

}
