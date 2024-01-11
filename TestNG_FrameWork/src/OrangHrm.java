import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrangHrm {
	WebDriver driver;
	Properties conpro;
	@Test
	public void startTest() throws Throwable
	{
		conpro = new Properties();
		conpro.load(new FileInputStream("object.properties"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(conpro.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(conpro.getProperty("ObjUser"))).sendKeys(conpro.getProperty("Username"));
		driver.findElement(By.xpath(conpro.getProperty("ObjPass"))).sendKeys(conpro.getProperty("Pcode"));
		driver.findElement(By.xpath(conpro.getProperty("ObjLogin"))).click();
		String Expected = "dashboard";
		String actual = driver.getCurrentUrl();
		if(actual.contains(Expected))
		{
			Reporter.log("Success",true);
		}
		else
		{
			Reporter.log("failed",true);
		}
		driver.quit();
	}
	

}
