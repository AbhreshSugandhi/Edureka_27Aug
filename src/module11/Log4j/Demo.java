package TestLog;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;
	
	
	@Test
	public void testGmailLogin() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();

		// enter a valid email address
		driver.findElement(By.id("Email")).sendKeys("TestSelenium1607@gmail.com");
		Logger log = new Logger();
		
		log.info("Entered a valid Email Address.");
		// enter a invalid password
		driver.findElement(By.id("Passwd")).sendKeys("InvalidPassword");
		log.info("Entered a invalid Password.");
		// click on sign in button
		driver.findElement(By.id("signIn")).click();
		Log.info("Clicked on the Sign In Button.");
		try {
			// Verify the home page
			assertTrue("Verification Failed: User successfully landed on the Home Page.",
					driver.getTitle().equals("Gmail"));
			log.info("Verified that the user landed on the Home Page.");
		} catch (Exception e) {
			log.error("Unsuccessfull Login.");
		}
	}

}
