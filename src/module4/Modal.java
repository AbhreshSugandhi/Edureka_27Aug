package module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		//Open URL of the AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/04/popups.html");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click on the Modal Box button
		driver.findElement(By.xpath("//*[@href='#0']")).click();
		Thread.sleep(5000);
		
		//Enter Abhresh in the text field
		driver.findElement(By.xpath("//*[@id=\"post-body-5871078819124590039\"]/div/div/input")).sendKeys("Abhresh");
		Thread.sleep(5000);
		
		//Click on Alert button
		driver.findElement(By.xpath("//*[@id=\"post-body-5871078819124590039\"]/div/div/ul[1]/li[2]/button")).click();
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"post-body-5871078819124590039\"]/div/div/ul[1]/li[1]/button")).click();
		Thread.sleep(5000);
		
		driver.close();
	}

}







