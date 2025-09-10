package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class popuppage extends BaseclassPages{
	public popuppage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//b[normalize-space()='Alert Popup']")
	WebElement poupbtn;
	@FindBy(xpath="//button[@id='confirm']")
	WebElement confirbtn;
	
	@FindBy(xpath="//b[normalize-space()='Prompt Popup']")
	WebElement promptbtn;
	@FindBy(xpath="//p[@id='promptResult']")
	WebElement displayedtext; 
	public void p()
	{
		poupbtn.click();
		Alert alert=driver.switchTo().alert();
	
		alert.accept();
	}
	public void c()
	{
		confirbtn.click();
		Alert alert=driver.switchTo().alert();
		
		System.out.println("confirm text"+alert.getText());	
		alert.accept();
		
	}
	public void pt()
	{
		promptbtn.click();
		Alert alert=driver.switchTo().alert();
		
alert.sendKeys("Hello gur");

//System.out.println("Confirm Txt Box Text:"+alert.getText());

		alert.accept();
		
		displayedtext.getText();
		Assert.assertEquals(displayedtext.getText(), "Nice to meet you, Hello gur!","Assertion Failed");
	}
	
}
