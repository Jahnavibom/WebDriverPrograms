package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Frames {

	public static void main(String[] args) throws Throwable {
		//Write a script to drag and drop the objects in the iframes using click and hold, release
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//get collection of frames
		List<WebElement> All_Frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames are:   "+All_Frames.size());
		//Switch to frame
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		ac.clickAndHold(source).moveToElement(target).release().perform();
		Thread.sleep(000);
		//Switch to main page
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Datepicker"))).click().perform();
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
