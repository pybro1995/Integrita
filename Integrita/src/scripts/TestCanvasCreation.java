package scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.BaseTest;
import pages.DisplayingCustomDetailsPage;
import pages.DisplayingCustomDetailsPage.CanvasListPage;

public class TestCanvasCreation extends BaseTest {
	
	@Test(groups = "ete1")
	public void testCanvasCreation() {
		
		DisplayingCustomDetailsPage dp = new DisplayingCustomDetailsPage(driver);
		dp.clickOnCanvas();
		
		wait.until(ExpectedConditions.elementToBeClickable(dp.getNewCanvasButton()));
		
		dp.clickOnNewCanvasButton();
	}
}
