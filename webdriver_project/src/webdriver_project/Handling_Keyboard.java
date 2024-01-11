package webdriver_project;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Keyboard {

	public static void main(String[] args) throws Throwable {
		// 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(3000);
		//Create object for action class
		Actions ac = new Actions(driver);
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[3]")).click();
		Thread.sleep(3000);
		//press up arrow three times in key board 
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		//to press enter key
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
