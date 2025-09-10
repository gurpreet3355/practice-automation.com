package TestCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Pages.formvalidations;

public class launcingBrowser extends BaseClassTests
{
	@Test(priority=1)
	public void form()
	{
		
		System.out.print("Heloo gur");
		formvalidations fv=new formvalidations(driver);
		fv.clickform();
		logger.info("form is clicked");
		fv.fillname("gurpreet");
		fv.fillpassword("gurpreet1");
		logger.info("name and password is filled");
		fv.checkbox();
		fv.color();
		logger.info("Color is selecteed");
		fv.selectDropdown("Yes");
		fv.email("gur@gmail.com");
		logger.info("email is entered");
		fv.msg("hello gur");
		fv.submit();
		logger.info("Data is submit");
		Alert alert=driver.switchTo().alert();
		alert.accept();
		logger.info("Alertaccepted Succesfully");
		
		
		
		
	}

}/*

*/