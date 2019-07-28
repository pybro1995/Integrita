package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCustomDetailsPage {
	
	@FindBy(xpath="//input[@value='New Campaign']")
	private  WebElement newCanvasButton;
	
	public DisplayingCustomDetailsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewCanvasButton() {
		newCanvasButton.click();
	}
	
}
