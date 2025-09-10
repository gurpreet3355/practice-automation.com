package TestCases;

import java.time.Duration;

import org.testng.Assert;  
import org.testng.annotations.Test;

import Pages.JavaExecutorWaitElementPage;

public class JavaExecutorWaitElement extends BaseClassTests {
	@Test
	
public void TestJavScriptDelay()
{
	JavaExecutorWaitElementPage execute=new JavaExecutorWaitElementPage (driver); 
			{
				driver.get("https://practice-automation.com/javascript-delays/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		execute.start();
			}
			

}
}
