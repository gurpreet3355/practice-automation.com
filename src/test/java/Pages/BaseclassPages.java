package Pages;
import java.time.Duration;

//import org.apache.logging.log4j.core.appender.rolling.action.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseclassPages 
{
	WebDriver driver;
	public WebDriverWait wait;
	public BaseclassPages(WebDriver driver)
	{
		
		this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // now driver is NOT null
  
		PageFactory.initElements(driver,this);
	}
	}


