package module11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws FindFailed {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		Screen s = new Screen();
		
		s.getScreen().click("D:\\Training\\Programs\\Sikuli\\Edureka_27Aug.JPG");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		s.getScreen().click("D:\\Training\\Programs\\Sikuli\\Edureka_27Aug_1.JPG");
				
	}
}
