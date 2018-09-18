package module11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli1 {

	public static void main(String[] args) throws IOException, FindFailed {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		driver.findElement(By.name("photo")).click();
	
		Screen s = new Screen();
		
		Pattern Path =  new Pattern ("D:\\Training\\Programs\\Sikuli\\find.JPG");
	
		Pattern Open = new Pattern("D:\\Training\\Programs\\Sikuli\\open.JPG");
		
		s.type(Path, "D:\\Training\\Programs\\AutoIT\\open.JPG");
		
		s.click(Open);
	
	}
	}