package oct30;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anno_example {
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("Before Test");
	}
	@Test(priority=0)
	public void login()
	{
		Reporter.log("Login");
	}
	@Test(priority=1)
	public void compose()
	{
		Reporter.log("compose");
	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("After Test");
	}

}
