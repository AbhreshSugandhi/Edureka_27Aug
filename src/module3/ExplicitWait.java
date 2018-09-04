package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/5-clearintervaltimer2-counter1-counter1.html");

		WebDriverWait wait = new WebDriverWait(driver, 2);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("dynamicText4")));
		element.click();
		
		String title = driver.getTitle();
	
		System.out.println(title);
		
		
	}
}