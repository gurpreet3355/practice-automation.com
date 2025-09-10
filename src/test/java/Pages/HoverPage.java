package Pages;

import java.time.Duration;
import java.util.BitSet;
import java.util.Set;

import org.bouncycastle.util.Arrays.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverPage extends BaseclassPages
{

	public HoverPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//h3[@id='mouse_over']")
	WebElement hover;
	@FindBy(xpath = "//div[@class='popup-content']")   // <-- element that appears after hover
    WebElement popupMsg;
	@FindBy(xpath="//div[@id='popmake-1272']//button[@aria-label='Close'][normalize-space()='×']")
	WebElement ads;
	@FindBy(xpath="//div[@id='moveMeHeader']")
			WebElement drag;
	@FindBy(xpath="//button[@onclick='newTab()']")
	WebElement newtab;
	@FindBy(xpath="//button[@onclick='newWindow()']")
	WebElement newWindowOpen;
	
	public String hovertest()
	{
		// s1=hover.getText();
		Actions action=new Actions(driver);
		action.moveToElement(hover).perform();
		return hover.getText();
		
		
	}
public void ads()
{
	ads.click();
	//driver.switchTo().alert().dismiss();
	
}
public void dragdrop1()
{
	Actions actions=new Actions (driver);
	
	actions.dragAndDropBy(drag, 200,200).perform();
}
public void newtab()
{
	driver.get("https://practice-automation.com/window-operations/");
	newtab.click();
}

public void switchTowindowhandles()
{
	String currentWindow=driver.getWindowHandle();
	Set<String> Handles=driver.getWindowHandles();
	java.util.Iterator<String> iter=Handles.iterator();
	String newWindow=null;
	while(iter.hasNext())
			 {
		newWindow=iter.next();
		if(!currentWindow.equals(newWindow))
		{
			driver.switchTo().window(newWindow);
			
		
		}}
}
public void newWindowOpen()
{
	driver.get("https://practice-automation.com/window-operations/");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(12));
	wait.until(ExpectedConditions.elementToBeClickable(newWindowOpen));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", newWindowOpen);
   // Javascript js=new (JavaScriptExecutor) driver;
	newWindowOpen.click();
}
public void SwitchTonewPage1()
{
String currentWindow1=driver.getWindowHandle();
Set<String> Handles1=driver.getWindowHandles();
java.util.Iterator<String> iter1=Handles1.iterator();
String newWindow1=null;
while(iter1.hasNext())
{
 newWindow1=iter1.next();
 if(!currentWindow1.equals(newWindow1))
 {
	 driver.switchTo().window(newWindow1);
	 driver.manage().window().maximize();
	 driver.switchTo().defaultContent();
		}
 
}
}
	
}
