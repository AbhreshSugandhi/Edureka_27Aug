package module10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyword {

	static WebDriver driver;
	
	public static void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser Launched");
	}
	
	public static void Navigate() {
		
		driver.navigate().to("https://www.google.com/");
		System.out.println("Google.com is Launched");
	}
	
	public static void ClickGmail() throws InterruptedException {
		
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("Gmail Link is clicked");
		Thread.sleep(3000);
		
	}
	
	
}
