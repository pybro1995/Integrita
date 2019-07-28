package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	@FindBy(id="userName")
	private WebElement unTB;
	
	@FindBy(id="passWord")
	private WebElement pwTB;
	
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement signInButton;
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this); 
	}
	
	public void setUsername(String s)
	{
		unTB.sendKeys(s);
	}
	public void setPassword(String s)
	{
		pwTB.sendKeys(s);
	}
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
}
