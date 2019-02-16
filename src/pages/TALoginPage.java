package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class TALoginPage {

	@FindBy(xpath = "//a[@title='Trips']")
	WebElement trips;

	@FindBy(xpath = "//*[@id='component_5']/div/div/div/div[1]/div/div/div[3]/div/div[1]")
	WebElement inbox;

	@FindBy(xpath = "//a[@title='Profile']")
	WebElement profile;

	@FindBy(xpath = "//a[@title='Join']")
	WebElement signUp;

	@FindBy(xpath = "//div[@title='Search']")
	WebElement search;

	@FindBy(xpath = "(//img[@alt='TripAdvisor'])[1]")
	WebElement firstLogo;

	@FindBy(xpath = "//*[@id='component_3']/div/div/div/div/div")
	WebElement whereTo;

	@FindBy(xpath = "//a[@href='/Hotels']")
	WebElement hotels;

	@FindBy(xpath = "(//a[@href='/Attractions'])[2]")
	WebElement thingsToDo;

	@FindBy(xpath = "//*[@id='component_2']/div/div/span[3]/div/div/a")
	WebElement restaurants;

	@FindBy(xpath = "//*[@id='component_2']/div/div/span[4]/div/a")
	WebElement flights;

	@FindBy(xpath = "//*[@id='component_2']/div/div/span[5]/div/div/a")
	WebElement holidayHome;

	@FindBy(xpath = "//*[@id='component_2']/div/div/span[7]/div[1]/div/div/div")
	WebElement more;

	@FindBy(xpath = "//*[@id='mainSearch']")
	WebElement searchBox;

	@FindBy(xpath = "//*[@id='GEO_SCOPED_SEARCH_INPUT']")
	WebElement enterDestinationBox;

	@FindBy(xpath = "//*[@id='SEARCH_BUTTON']")
	WebElement searchBtn;

	@FindBy(xpath = "//*[@id='googleBtn']")
	WebElement loginWithGoogleTB;

	@FindBy(xpath = "//*[@id='c_onboarding-interstitial']/div/div[2]")
	WebElement closePopup;

	public TALoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyLoginPageByTitle(WebDriver driver, String eTitle) {
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
		Reporter.log("############# PASS:: TITLE MATHCES>> LOGIN PAGE DIPLAYED #############", true);
	}

	public void verifyLoginPageByURL(WebDriver driver, String eURL) {
		String aURL = driver.getCurrentUrl();
		Assert.assertEquals(aURL, eURL);
		Reporter.log("############# PASS:: URL MATHCES>> LOGIN PAGE DIPLAYED #############", true);
	}

	public void verifyLoginPageByElement(WebElement element) {
		Assert.assertTrue(element.isDisplayed());
		Reporter.log("PASS:: " + element.getText() + " DISPLAYED >> LOGIN PAGE DIPLAYED", true);
	}

	public void profileClick() {
		profile.click();
		Reporter.log("Clicked on Profile Icon..",true);
	}

	public void closeInitialPopup() {
		closePopup.click();
		Reporter.log("Closed Initial popup ..",true);
	}

	public void continueWithGoogle() {
		loginWithGoogleTB.click();
		Reporter.log(" logging in with Google",true);
	}

}
