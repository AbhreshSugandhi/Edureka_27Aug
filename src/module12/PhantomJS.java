package module12;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJS {

	public static void main(String[] args) {
	
		File path = new File("C:\\Users\\abhre\\Downloads\\Compressed\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		System.setProperty("phantomjs.binary.path", path.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement Search = driver.findElement(By.name("q"));
	
		Search.sendKeys("Edureka");
		
		Search.submit();
		
		System.out.println("Page Title is - " + driver.getTitle());
		
		driver.quit();	

	}

}
