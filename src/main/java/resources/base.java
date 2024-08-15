package resources;
import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	 public WebDriver driver;
	 public Properties prop = new Properties();
	 public Logger mylog ;
	 
	 
	 public WebDriver initializeDriver() throws Exception {
		 
		   Logger mylog = Logger.getLogger("HomePageTest");
			
			FileInputStream fis = new FileInputStream("C:\\Users\\folio 9480m\\selenium\\E2EPropject\\src\\main\\java\\resources\\config.properties");
			prop.load(fis);
			String browsername = prop.getProperty("browser");
				if (browsername.equals("chrome") ) {
					
					
					driver = new ChromeDriver();
					mylog.info("done");
					
				}
			
				else {
					
					 driver = new FirefoxDriver();
				}
				
				 PropertyConfigurator.configure("Log4j.properties");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			return driver;
		}

	 }
	

