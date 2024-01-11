package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Muti_Selection {

	public static void main(String[] args) throws InterruptedException {
		// verify dropdown is multi list box or single list box
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(By.name("selenium_commands")));
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		
		dropdown.selectByVisibleText("Navigation Commands");
		dropdown.selectByVisibleText("WebElement Commands");
		dropdown.selectByVisibleText("Wait Commands");
		Thread.sleep(2000);
		dropdown.deselectByVisibleText("Wait Commands");
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
