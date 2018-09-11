package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		//Select
		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		
		//Select by visible text
		oSelect.selectByVisibleText("Navigation Commands");
		Thread.sleep(5000);
		oSelect.deselectByVisibleText("Navigation Commands");
		Thread.sleep(5000);
		
		//Print all the names from the options
		List<WebElement> oSize = oSelect.getOptions();
		
		//Total Count of options
		int iListSize = oSize.size();
		System.out.println(iListSize);
		
		//using a for loop to select and deselect the options
		for(int i=0; i<iListSize; i++) {
			String sValue = oSelect.getOptions().get(i).getText();
			System.out.println(sValue);
			
			oSelect.selectByIndex(i);
			Thread.sleep(5000);	
			oSelect.deselectByIndex(i);
			Thread.sleep(5000);
		}
		
		//oSelect.deselectAll();
	}

}



