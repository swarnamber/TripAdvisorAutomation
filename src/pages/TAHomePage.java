package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class TAHomePage {

	@FindBy(xpath = "//a[.='Sign out']")
	WebElement signOutBTN;

	@FindBy(xpath = "//*[@class='react-container']/div/div/div/div/div/div/div[5]/div/div/div")
	WebElement profile;

	@FindBy(xpath = "//*[@id='c_onboarding-interstitial']/div/div/div/form/div/div[5]/div/span/button")
	WebElement confirmBTN;

	@FindBy(xpath = "//*[@id='c_onboarding-interstitial']/div/div/div/form/div/div[2]/input")
	WebElement dispName;

	@FindBy(xpath = "//*[@id='c_onboarding-interstitial']/div/div/div/form/div/div[3]/span[3]/input")
	WebElement uName;

	@FindBy(xpath = "//*[@id='c_onboarding-interstitial']/div/div/div/div[3]/div/button")
	WebElement continueBtn;

	@FindBy(xpath = "//*[@id='c_onboarding-interstitial']/div/div/div/div/div/div[3]")
	WebElement skipNow;

	// *[@id="c_onboarding-interstitial"]/div/div/div/div/div/div[3]

	public TAHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterDisplayName(String name) {
		dispName.sendKeys(name);
	}

	public void enterUName(String name) {
		uName.sendKeys(name);
	}

	public void clickConfirm() {
		confirmBTN.click();
	}

	public void clickContinue() {
		continueBtn.click();
	}

	public void clickProfile() {
		profile.click();
	}

	public void clickSkipNow() {
		skipNow.click();
	}

	public void verifyHomePage() {
		try {
			Assert.assertTrue(signOutBTN.isDisplayed(), " SignOut button not displayed");
			Reporter.log("PASSED:: ######## Signout Button displayed ##########", true);
		} catch (NoSuchElementException e) {
			Reporter.log(e + "SIGNOUT BUTTON NOT PRESENT", true);
			Assert.fail("FAILED:: SIGNOUT BUTTON NOT PRESENT");

		}
	}

	public void clickLogout() {
		try {
			signOutBTN.click();
			Reporter.log("Clicked on Signout button ", true);
		} catch (Exception e) {
			Reporter.log("Signout button not clickable ", true);
		}

	}

}
