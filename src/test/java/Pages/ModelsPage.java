package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ModelsPage extends BaseclassPages{

	public ModelsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//button[@id='simpleModal']")
	WebElement modelbtn;
	@FindBy(xpath="//div[@id='popmake-1318']//button[@aria-label='Close'][normalize-space()='×']")
	WebElement cross;
	@FindBy(xpath="//p[contains(text(),'Hi, I’m a simple modal.')]")
    WebElement text;
	@FindBy(xpath="//button[@id='formModal']")
	 WebElement formModelbtn;
	@FindBy(xpath="//input[@id='g1051-name']")
	WebElement name;
	@FindBy(xpath="//input[@id='g1051-email']")
	WebElement email;
	@FindBy(xpath="//textarea[@id='contact-form-comment-g1051-message']")
	WebElement textarea;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submitbtn;
	@FindBy(xpath="//div[@id='popmake-674']//button[@aria-label='Close'][normalize-space()='×']")
	WebElement cross2;
	@FindBy(xpath="//h4[@id='contact-form-success-header']")
	WebElement msgreceived;
	public void automatemodels()
	{
		modelbtn.click();
		Actions action=new Actions(driver);
		action.moveToElement(cross).click();
		action.perform();
		
	}
	public void automateformModelsValidInput()
	{
		formModelbtn.click();
		/*Actions action=new Actions(driver);*/
		name.sendKeys("Gurpreet kaur");
		email.sendKeys("Gurpreetroop1@gmail.com");
		textarea.sendKeys("Hello Gurpreet .You are Welcomed");
		submitbtn.click();
		System.out.print(msgreceived.getText()+"Your message has been sent");
		
		
	}
	
	}
