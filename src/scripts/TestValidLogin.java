package scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;
import pages.GooglePopupLoginPage;
import pages.TAHomePage;
import pages.TALoginPage;

public class TestValidLogin extends BaseTest {

	@Test(priority = 2, description = "this is to test Valid Login scenario", groups = { "sanity", "prerequisite" })
	public void testValidLogin() {
		Reporter.log("##################this is to test Valid Login scenario###############", true);
		TALoginPage talp = new TALoginPage(driver);
		GooglePopupLoginPage glp = new GooglePopupLoginPage(driver);
		TAHomePage tahp = new TAHomePage(driver);
		String actualGmailPopupTitle;

		// close initial popup
		talp.closeInitialPopup();

		// get main window handle
		String mainWindowHandle = driver.getWindowHandle();

		// click on profile to login
		talp.profileClick();

		// wait for 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Switch to frame for login popup
		driver.switchTo().frame(driver.findElement(By.id("overlayRegFrame")));

		// click on continue with Google
		talp.continueWithGoogle();

		// get all the window handles
		Set<String> allWH = driver.getWindowHandles();

		// traverse between all the windows (popups)
		for (String wh : allWH) {
			driver.switchTo().window(wh);

			// get the title of gmail login popup
			actualGmailPopupTitle = driver.getTitle();
			Reporter.log(actualGmailPopupTitle + " ---------->");

			// check the actual login popup and login using UN and PW
			try {
				if (actualGmailPopupTitle.contains("Google accounts")) {
					glp.enterEmail("workdata200@gmail.com");
					glp.enterPW("Computercs@1");
					Reporter.log("Entered username and pswd", true);
				} else {
				}
			} catch (Exception e) {
				Reporter.log("POPUP TITLE NOT MATCHING");
				Assert.fail("Failed because not found the proper window to enter UN and PW");
			}
		}

		// wait for 20 seconds
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		// switch to main window
		driver.switchTo().window(mainWindowHandle);
		String mainWindowTitle = driver.getTitle();
		Reporter.log(mainWindowTitle + " ---------->", true);

		// Verify home page is displayed by checking the LOGOUT option
		try {
			if (mainWindowTitle.equalsIgnoreCase("TripAdvisor: Read Reviews, Compare Prices & Book")) {
				Reporter.log("SWITCHING TO MAIN WINDOW", true);
				Thread.sleep(3000);
				tahp.clickProfile();
				Reporter.log("clicked on profile of homepage", true);
				tahp.verifyHomePage();

			} else {
				Reporter.log("\n\n\n POPUP TITLE NOT MATCHING", true);
			}
		} catch (Exception e) {
			Assert.fail("FAILED:: Popup did not close or Exception Occured: \n " + e);

		}
	}
}
