package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePopupLoginPage {

	@FindBy(xpath = "//*[@id='identifierId']")
	WebElement gEmailTB;

	@FindBy(xpath = "//*[@id='identifierNext']/content/span")
	WebElement emailNextBTN;

	@FindBy(xpath = "//*[@id='password']/div[1]/div/div[1]/input")
	WebElement gPW_TB;

	@FindBy(xpath = "//*[@id='passwordNext']/content/span")
	WebElement pwNextBTN;

	public GooglePopupLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String email) {
		gEmailTB.sendKeys(email);
		emailNextBTN.click();
	}

	public void enterPW(String pwd) {
		gPW_TB.sendKeys(pwd);
		pwNextBTN.click();
	}

}
