package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouse {

	public static void main(String[] args) {
		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		WebElement UName = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		
		Action newAct = act
				.moveToElement(UName)
				.click()
				.keyDown(UName, Keys.SHIFT)
				.sendKeys(UName, "abhresh")
				.keyUp(UName, Keys.SHIFT)
				.doubleClick(UName)
				.contextClick(UName)
				.build();

		newAct.perform();
	}

}
