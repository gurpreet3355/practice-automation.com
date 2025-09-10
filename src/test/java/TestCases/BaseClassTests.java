package TestCases;

import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClassTests {
	
	public Logger  logger;
	  WebDriver driver;
	 Properties p=new Properties();
	 
	@BeforeClass
	
	public void setup()
	{
		logger=LogManager.getLogger(this.getClass());
						{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origions=*");
		driver=new ChromeDriver(op);
		driver.manage().deleteAllCookies();
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger.info("loading webpage");
		driver.get("https://practice-automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
		
	}
	
/*
@AfterClass
public void teardown()
{
driver.close();

}*/

	}



	
	/*@AfterClass
	public void teardown() {
	    if (driver != null) {
	        try {
	            driver.quit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }*/

