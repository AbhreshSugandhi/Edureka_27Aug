package module6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scenario2 {

	WebDriver driver;

	@Test
	public void openApp() {

		// Browser Instantiating Or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		// Open AUT
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(dependsOnMethods="openApp")
	public void Login() throws InterruptedException, IOException {
		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, 
				new File("D:\\Training\\EdurekaPrograms\\Edureka_27Aug\\src\\module6\\Screenshot\\"+System.currentTimeMillis()+ "ScreenShot.png"));
		
		
		/*
		 * File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(scrFile, new File(
		 * "D:\\Training\\Programs\\Edureka_Eve_WD\\Screenshot\\"+System.currentTimeMillis()+"
		 * .png"));
		 */
	}

	@Test(dependsOnMethods="Login")
	public void Logout() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();

		Thread.sleep(5000);
		
		driver.quit();

	}

}
