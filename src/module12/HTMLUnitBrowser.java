package module12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitBrowser {

	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement Search = driver.findElement(By.name("q"));
	
		Search.sendKeys("Edureka");
		
		Search.submit();
		
		System.out.println("Page Title is - " + driver.getTitle());
		
		driver.quit();	
		
		
	}

}
