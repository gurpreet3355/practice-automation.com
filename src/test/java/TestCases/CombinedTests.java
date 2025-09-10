package TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HoverPage;
import Pages.iframe;

public class CombinedTests extends BaseClassTests {
	@Test(description="Its a Hover Over Element Test")
	public void Hovertesting()
	{
		driver.get("https://practice-automation.com/hover/");
        HoverPage hp = new HoverPage(driver);

        logger.info("Calling method inside page");
        String actualMsg = hp.hovertest();   // get text from popup
        logger.info("Test is completed");

        Assert.assertEquals(actualMsg, "You did it!", "Message not matched!");	
        
	}
	@Test(description="Its ads Test")
	
	public void adstest()
	
	{
		driver.get("https://practice-automation.com/ads/");
		HoverPage hp = new HoverPage(driver);
		hp.ads();

	}
	@Test(description="I am a Drag and Drop Test")
	public void dragdrop()
	{
		driver.get("https://practice-automation.com/gestures/");
		
		HoverPage hp = new HoverPage(driver);
		
		hp.dragdrop1();
		
	}
	@Test(description="WindowHandling")
	
	public void windowhandling()
	{
		HoverPage hp = new HoverPage(driver);
	hp.newtab();
	hp.switchTowindowhandles();
Assert.assertTrue(driver.getTitle().contains("automateNow | The Best FREE Software Online Training Platform"),"Assertion Failed");
}
	@Test(description="WindowHandling2")
	
	public void windowhandling2()
	{
	HoverPage hp = new HoverPage(driver);
	hp.newWindowOpen();
	hp.SwitchTonewPage1();
	//Assert.assertEquals(driver.getTitle(), "automateNow | The Best FREE Software Online Training Platform","Wrong Title");
}
	@Test(description="Iframe TESTing")
	
public void iframetest()
{
	iframe i=new iframe(driver);
	i.iframeMethod();

}
}