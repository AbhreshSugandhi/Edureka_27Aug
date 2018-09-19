package MavenTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTours {

	WebDriver driver;

	@Test
	public void openApp() {

		// Browser Instantiating Or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		// Open AUT
		driver.get("http://newtours.demoaut.com/");
		System.out.println("AUT oppened succesfully");
	}

	@Test(dependsOnMethods = "openApp")
	public void Login() throws InterruptedException, IOException {
		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		System.out.println("Logged in successfully");
	}

	@Test(dependsOnMethods = "Login")
	public void Logout() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		Thread.sleep(5000);
		System.out.println("Logged out succesfully");
		
		driver.quit();		
		System.out.println("Quiting the browser");
	}

}
