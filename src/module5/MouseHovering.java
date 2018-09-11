package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@name='q' and @type = 'text']")).sendKeys("Jackets");
		
		driver.findElement(By.xpath("//*[@class='vh79eN' and @type='submit']")).click();
		Thread.sleep(6000);
		
		WebElement target = driver.findElement(By.xpath("//*[@class='_1Nyybr  _30XEf0']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(target).build().perform();
		
	}

}






