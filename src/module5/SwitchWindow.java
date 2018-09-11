package module5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumframework.com/practiceform/");
		
		//Part1: Get the main window name
		String handle = driver.getWindowHandle();
		
		System.out.println("Main Window name:- "+ handle);
		System.out.println("===============================================================");
		
		//Part2: Get all window names
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/div/p[3]/button")).click();
		Thread.sleep(5000);
		
		Set AllWindowName = driver.getWindowHandles();
		
		System.out.println("All Window name:- "+ AllWindowName);
		System.out.println("===============================================================");
		Thread.sleep(5000);
		
		//Part3: Switch between windows
		for(String NewHandle : driver.getWindowHandles()) {
			
			driver.switchTo().window(handle);
			Thread.sleep(5000);
			driver.switchTo().window(NewHandle);
			Thread.sleep(5000);
		}
	
		driver.quit();
	
	
	
	
	
	}

}
