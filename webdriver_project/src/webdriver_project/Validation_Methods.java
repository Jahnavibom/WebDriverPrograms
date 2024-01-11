package webdriver_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



	
		
		public class Validation_Methods {



			public static void main(String[] args) throws Throwable {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://www.tatacliq.com/");
				Thread.sleep(5000);
				String pagetitle = driver.getTitle();
				System.out.println(pagetitle);
				System.out.println(pagetitle.length());
				String strurl = driver.getCurrentUrl();
				System.out.println(strurl);
				System.out.println(strurl.length());
				Thread.sleep(3000);
				driver.close();

			}

		


	}


