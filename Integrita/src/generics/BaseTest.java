package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import scripts.TestSignInPage;

public class BaseTest implements IAutoConstant {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	@BeforeMethod
	public void openBrowser()
	{ 
		driver = new ChromeDriver();
		driver.get("http://192.168.78.128:8080/crm/HomePage.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
	
//	@AfterMethod
//	public void closeBrowser()
//	{
//		driver.quit();
//	}
}
