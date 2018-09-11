package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		//Initialize Select Class
		Select oSelect = new Select(driver.findElement(By.id("continents")));
		
		driver.findElement(By.id("tool-0")).click();
		
		//Select Europe by Index Value
		oSelect.selectByIndex(1);
		Thread.sleep(5000);
		
		//Select Antartica by Visible Text
		oSelect.selectByVisibleText("Antartica");
		Thread.sleep(5000);
		
		//Select Australia by value
		oSelect.selectByValue("d");
		Thread.sleep(5000);
		
		driver.close();

	}

}
