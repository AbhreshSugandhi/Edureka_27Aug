package module6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	   public static void main(String[] args) throws InterruptedException{
	   
		   System.setProperty("webdriver.chrome.driver", "D:\\Training\\Programs\\SeleniumTutorial\\browserdrivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   
		   driver.navigate().to("http://www.google.com");

		   //driver.navigate().to("http://www.calculator.net");
	      
		   List <WebElement> alllinks = driver.findElements(By.tagName("a"));

		    //for(int i=0;i<alllinks.size();i++)
		        //System.out.println(alllinks.get(i).getText());

		    for(int i=0;i<alllinks.size();i++){
		        alllinks.get(i).click();
		        Thread.sleep(2000);
		        driver.navigate().back();
		    }
}
}