package generic;

import org.testng.Reporter;
import org.testng.annotations.*;

public class DemoInitialTest {

	@BeforeSuite (alwaysRun=true)
	public void Bsuit(){
		Reporter.log("THIS IS BEFORE SUIT",true);
	}
	@AfterSuite(alwaysRun=true)
	public void Asuit(){
		Reporter.log("THIS IS AFTER SUIT",true);
	}
	@BeforeTest(alwaysRun=true)
	public void bTest(){
		Reporter.log("THIS IS BEFORE TEST",true);
	}
	@AfterTest(alwaysRun=true)
	public void Atest(){
		Reporter.log("THIS IS AFTER TEST",true);
	}
	@BeforeMethod(alwaysRun=true)
	public void BMethod(){
		Reporter.log("THIS IS BEFORE Method",true);
	}
	@AfterMethod(alwaysRun=true)
	public void AMethod(){
		Reporter.log("THIS IS After method",true);
	}
	@BeforeClass(alwaysRun=true)
	public void BClass(){
		Reporter.log("THIS IS BEFORE Class",true);
	}
	@AfterClass(alwaysRun=true)
	public void AClass(){
		Reporter.log("THIS IS After class",true);
	}
}
