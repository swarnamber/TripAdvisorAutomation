package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest implements IAutoConst {

	public WebDriver driver;

	static {
		System.setProperty(C_KEY, C_VALUE);
		System.setProperty(G_KEY, G_VALUE);
	}

	@BeforeMethod(alwaysRun = true)
	public void openApp() {
		driver = new ChromeDriver();
		Reporter.log("Browser Opened", true);
		driver.get("https://www.tripadvisor.in/");
		Reporter.log("App launched", true);
		int ito = Integer.parseInt(AUL.getProperties("ITO"));
		driver.manage().timeouts().implicitlyWait(ito, TimeUnit.SECONDS);
	}

	@AfterMethod(alwaysRun = true)
	public void closeApp() {
		driver.quit();
		Reporter.log("Browsers closed", true);
	}

}
