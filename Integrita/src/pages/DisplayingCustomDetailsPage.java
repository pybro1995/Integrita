package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCustomDetailsPage {
	
	@FindBy(linkText = "Home")
	private WebElement home;
	
	@FindBy(id="Campaignstab")
	private WebElement canvas;
	
		public  class CanvasListPage {
			@FindBy(xpath="//input[@value='New Campaign']")
			private  WebElement newCanvasButton;
			
			public CanvasListPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			
		}
		
		CanvasListPage clp;
	
	public DisplayingCustomDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		clp = new CanvasListPage(driver);
		
	}
	
	public void clickOnCanvas() {
		canvas.click();
	}
	
	public  void clickOnNewCanvasButton() {
		clp.newCanvasButton.click();
	}
	public  WebElement getNewCanvasButton() {
		return this.clp.newCanvasButton; 
	}
	
	
	
}
