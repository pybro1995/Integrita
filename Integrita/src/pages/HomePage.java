package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	@FindBy(linkText = "Home")
	private WebElement home;
	
	@FindBy(linkText = "Campaigns")
	private WebElement canvas;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCanvas() {
		canvas.click();
		
	}
	
}
