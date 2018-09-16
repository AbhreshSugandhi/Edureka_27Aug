package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		page.SearchGoogle("SeleniumHQ");
		
		Thread.sleep(5000);
		
		SeleniumHomePageObjects selPage = new SeleniumHomePageObjects(driver);
		
		selPage.ClickDownload();
		
		Thread.sleep(5000);
		
		selPage.ClickHome();
	}

}
