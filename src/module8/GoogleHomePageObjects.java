package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {

	public GoogleHomePageObjects(WebDriver driver) {
		//there is a PageFactory in Selenium which will initialize the below element
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	public WebElement txtSearch;
	
	@FindBy(name="btnG")
	public WebElement btnSearch;
	
	@FindBy(linkText = "Selenium - Web Browser Automation")
	public WebElement linkSelenium;
	
	public void SearchGoogle(String searchTxt) {
		//Search text on the Search Bar
		txtSearch.sendKeys(searchTxt);
				
		//Click on the Search Button
		btnSearch.submit();
		
		//Click on Selenium Link
		linkSelenium.click();
		
	}
	
	
}
