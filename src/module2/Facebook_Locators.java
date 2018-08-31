package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Locators {

	public static void main(String[] args) {

		// Initialization of Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.facebook.com");
		
/*		//Id Locator
		driver.findElement(By.id("u_0_j")).sendKeys("Abhresh");
		
		//Name Locator
		driver.findElement(By.name("lastname")).sendKeys("Sugandhi");
		
		driver.findElement(By.id("u_0_o")).sendKeys("987654321");
		
		driver.findElement(By.id("u_0_a")).click();
		
		//ClassName Locators
		driver.findElement(By.className("inputtext")).sendKeys("Abhresh");
		driver.findElement(By.className("inputtext")).sendKeys("Abhresh");
		
		
		//Link and Partial Link
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot")).click();
	
		
		//css Locator
		driver.findElement(By.cssSelector("#u_0_j")).sendKeys("Abhresh");
		
		//Xpath Locator
		driver.findElement(By.xpath("//*[@id='u_0_l']")).sendKeys("Sugandhi");
		
	
		//tagname locator
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		*/
		
	}

}






