package TestCases;

import org.testng.annotations.Test;

import Pages.popuppage;

public class Popups  extends BaseClassTests{
	@Test
	
public void popuptest()
{
	driver.get("https://practice-automation.com/popups/");
	logger.info("popup pag is loaded");
	popuppage page=new popuppage(driver);
	page.p();
	logger.info("Alert ox is Clicked");
	page.c();
	logger.info("Confirm alert is Handled");
	page.pt();
	logger.info("Prompt alert is Handled");
}
}
