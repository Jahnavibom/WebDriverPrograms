package oct30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class handling_assert {
WebDriver driver;
@Test
public void assert_test()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String Expected = "Google";
	String Actual = driver.getTitle();
	Assert.assertEquals(Expected,Actual,"Title not matching");
	driver.quit();
	
}
}
