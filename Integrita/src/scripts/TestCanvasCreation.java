package scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generics.BaseTest;
import generics.FWUtils;
import pages.DisplayingCustomDetailsPage;
import pages.HomePage;
import pages.SignInPage;


public class TestCanvasCreation extends BaseTest {
	
	@Test
	public void testCanvasCreation() throws Exception {
		
		SignInPage sp = new SignInPage(driver);
		
		String username = FWUtils.getXLData( XLPATH, "SignInCredentials", 1, 0);
		String password = FWUtils.getXLData( XLPATH , "SignInCredentials", 1, 1);
		
		sp.setUsername(username);
		sp.setPassword(password);
		sp.clickOnSignInButton();
		

		String homePage=FWUtils.getXLData(XLPATH, "PageTitles" , 0, 0);		
		wait.until(ExpectedConditions.titleIs(homePage)); 	
		
		HomePage hp = new HomePage(driver);
		hp.clickOnCanvas();
		
		String canvas = FWUtils.getXLData(XLPATH, "PageTitles", 1, 0);		
		wait.until(ExpectedConditions.titleIs(canvas));
		
		DisplayingCustomDetailsPage cnvsList = new DisplayingCustomDetailsPage(driver);
		cnvsList.clickOnNewCanvasButton();
		
		
		
		
	}
}
