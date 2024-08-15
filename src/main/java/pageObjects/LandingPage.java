package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[contains(@href,'sign_in')]")
	WebElement signinlink;
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


	public WebElement getsignin() {
		return signinlink;
	}
	
}
