package testFiles;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;


public class HomePageTest extends base {
	Logger log = Logger.getLogger("HomePageTest");
	
	@Test
	public void invokehomePage() throws Exception {
	
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		mylog.info("ddd");
	
		LandingPage lp = new LandingPage(driver);
		lp.getsignin().click();
		
		
		
	}

}
