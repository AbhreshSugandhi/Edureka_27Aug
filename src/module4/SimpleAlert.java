package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		//Click on Display Alert Box Button
		driver.findElement(By.id("alert")).click();
		Thread.sleep(5000);
		
		Alert SA = driver.switchTo().alert();
		
		String SA_Info = SA.getText();
		Thread.sleep(5000);
		
		System.out.println(SA_Info);
		
		SA.accept();		
		
	}

}
