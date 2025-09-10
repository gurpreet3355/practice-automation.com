package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SliderPage extends BaseclassPages {
	Actions action;

	public SliderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id='slideMe']")
	WebElement slider;
public void Slider()
{
	String slidervalue=slider.getAttribute("value");
	System.out.println("Slider Total Value="+slidervalue);
	action=new Actions(driver);
	action.dragAndDropBy(slider, 50, 0);
	action.perform();
	}
}
