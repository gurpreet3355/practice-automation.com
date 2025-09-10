package TestCases;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Pages.SliderPage;

public class SliderTest extends BaseClassTests {
	Actions actions;
	@Test
	public void sliderTest()
	{ 
		driver.get("https://practice-automation.com/slider/"); // Example page
    actions = new Actions(driver);

		SliderPage sp=new SliderPage(driver);
		sp.Slider();
	}

}
