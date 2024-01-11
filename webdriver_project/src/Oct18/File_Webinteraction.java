package Oct18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Webinteraction {

	public static void main(String[] args) throws Throwable {
		// Write a script to read paragraph from the web page and print in in the console
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		File f = new File("D:/selenium.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		String para1 = driver.findElement(By.xpath("(//p[@class='style7'])[2]")).getText();
		String para2 = driver.findElement(By.xpath("(//p[@class='style7'])[3]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		driver.quit();

	}

}
