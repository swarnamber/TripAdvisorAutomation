package scripts;

import org.testng.Reporter;
import org.testng.annotations.*;

import generic.DemoInitialTest;

//import generic.DemoInitialTest;

public class DemoTest extends DemoInitialTest{

	@Test(groups = { "sanity" })
	void test1(){
		Reporter.log("THIS IS TEST1",true);
			}

	@Test
	void test2(){
		Reporter.log("THIS IS TEST2",true);
			}
	
	@Test
	void test3(){
		Reporter.log("THIS IS TEST3",true);
			}
	
}
