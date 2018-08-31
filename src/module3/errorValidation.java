package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class errorValidation {

	public static void main(String[] args) {

		// Initialize the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/nlogin/login");
		
		driver.findElement(By.xpath("//*[@id='usernameField']")).click();
		
		driver.findElement(By.xpath("//*[@id='passwordField']")).click();
		
		String Error = driver.findElement(By.id("usernameField_err")).getText();
		
		boolean result = Error.equals("Email ID/Username cannot be left blank");
		
		System.out.println("Ressult"+ result);

	}

}
