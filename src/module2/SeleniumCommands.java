package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumCommands {

	public static void main(String[] args) {

		//Initialize the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Initialize the Firefox Browser
		System.setProperty("webdriver.gecko.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\geckodriver.exe");
		WebDriver FF = new FirefoxDriver();
		
		//Initialized the Opera Browser
		System.setProperty("webdriver.opera.driver", "C:\\Users\\abhre\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		WebDriver O = new OperaDriver();
		
		//Close and Quit
		driver.close(); // it closes the current active window under the present instance
		driver.quit(); // when you have multiple windows oppened in an instance you can close all the windows in one go

		//Get Commands
		driver.get("URL");// To get the URL of the AUT on the Browser
		driver.getTitle(); // to get the title of the Page
		driver.getCurrentUrl(); // to get the current url of the page
		driver.getWindowHandle(); // to get the window name of the current window.
		
		//Navigation commands
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("URL");//to get the URL
		
		
	}

}









