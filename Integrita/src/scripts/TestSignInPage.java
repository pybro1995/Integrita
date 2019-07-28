package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.FWUtils;
import pages.SignInPage;

public class TestSignInPage extends BaseTest {
	
	
	@Test(groups = "ete1")
	public void testValidSignInPage() 
	{SignInPage sp = new SignInPage(driver);
		//SignInPage sp = new SignInPage(driver);
		String username = FWUtils.getXLData( XLPATH, "SignInCredentials", 1, 0);
		String password = FWUtils.getXLData( XLPATH , "SignInCredentials", 1, 1);
		//Reporter.log(password,true);
		sp.setUsername(username);
		sp.setPassword(password);
		sp.clickOnSignInButton();
		
	}
	
	@Test(priority = 0)
	public void testInvalidSignInPage()
	{
			
	}
	
//	@Test
//	public void testInvalidSignInPage()
//	{
//		
//	}
}
