package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) throws Throwable {
		//Write a script to verify first name , Reenter email id and radio button using conditional methods
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u')]")).click();
		Thread.sleep(3000);
		//verify first name is textbox is enabled or disabled
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		boolean is_enabled = firstName.isEnabled();
		Thread.sleep(2000);
		System.out.println("First name text box is    "+ is_enabled);
		//verify reenter text box is displayed or hidden
		WebElement Re_EnterEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		boolean is_Displayed = Re_EnterEmail.isDisplayed();
		Thread.sleep(2000);
		System.out.println("Reenter text box is ::"+ is_Displayed);
		// verify radio button is selected or not
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='1']"));
		boolean is_selected = radioButton.isSelected();
		Thread.sleep(2000);
		System.out.println("Radio button is ::" +is_selected);
		driver.quit();

	}

}
