package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy (xpath="//*[@id='homepage']")
	WebElement email;
	
	@FindBy (xpath="//*[@id='homepage']")
	WebElement password;
}
