package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;
import pages.TALoginPage;

public class TestLoginPageDisplayed extends BaseTest {

	@Test(priority = 1, description = "this is login page verification", groups = { "sanity" })
	public void TestLoginPage() {
		Reporter.log("############this is login page verification#############",true);
		TALoginPage lp = new TALoginPage(driver);

		lp.verifyLoginPageByTitle(driver, "TripAdvisor: Read Reviews, Compare Prices & Book");
		lp.verifyLoginPageByURL(driver, "https://www.tripadvisor.in/");

		// lp.verifyLoginPageByElement(signUp);

	}
}
