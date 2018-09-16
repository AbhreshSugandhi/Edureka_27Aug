package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHomePageObjects {

	public SeleniumHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(linkText = "Download")
	public WebElement linkDownload;
	
	@FindBy(linkText = "Browser Automation")
	public WebElement linkHomepage;
	

	public void ClickDownload() {
		linkDownload.click();
	}
	
	public void ClickHome() {
		linkHomepage.click();
	}
}
