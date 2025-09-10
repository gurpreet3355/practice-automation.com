package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframe extends BaseclassPages  {

	public iframe(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="iframe-1")
	WebElement iframe;
	@FindBy(xpath="//span[@class='highlight_gXVj']")
	WebElement scrollview;
	@FindBy(xpath="//a[@class='getStarted_Sjon']")
	WebElement Getstarted;
public void iframeMethod()
{
	driver.get("https://practice-automation.com/iframes/");
	driver.switchTo().frame(iframe);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", scrollview);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    wait.until(ExpectedConditions.elementToBeClickable(Getstarted));
  
    Getstarted.click();
  
    System.out.println("Page Title inside iframe: " + driver.getTitle());

   // Getstarted.click();
    driver.switchTo().defaultContent();
	
}
}
