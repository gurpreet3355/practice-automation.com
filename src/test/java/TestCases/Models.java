package TestCases;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ModelsPage;

public class Models extends BaseClassTests {
@Test

	public void TC_models()
	{
		driver.get("https://practice-automation.com/modals/");
		ModelsPage mp=new ModelsPage(driver);
		mp.automatemodels();
		mp.automateformModelsValidInput();
		
		
	}
}
