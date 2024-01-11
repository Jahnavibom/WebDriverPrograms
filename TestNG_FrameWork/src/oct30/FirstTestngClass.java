package oct30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestngClass {
	WebDriver driver;

	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Before Test",true);
	}
	@Test(priority=0)
	public void pBanking()
	{
		driver.findElement(By.xpath("(//img)[4]")).click();
		Reporter.log("Personal banking",true);
	}
	@Test(priority=1)
	public void cBanking()
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
		Reporter.log("cbanking",true);
	}
	@Test(priority=2) 
	public void iBanking()
	{
		driver.findElement(By.xpath("(//img)[6]")).click();
		Reporter.log("ibanking",true);
	}
	@AfterTest
	public void afterTest()
	{
		driver.quit();
		Reporter.log("After Test",true);
	}

}
