package Oct18;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
		// Write a script to take screenshot of the opened file and store it in  local system location
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		//create java time stamp
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy_mm_dd hh_mm_ss");
		String datef = df.format(date);
		//take screenshot and store
		File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy file into local system
		FileUtils.copyFile(screen,new File ("D:/ScreenShot"+datef+"home.png"));
		driver.quit();
		
		
	

	}

}
