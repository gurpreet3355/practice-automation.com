package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class JavaExecutorWaitElementPage extends BaseclassPages {

    public JavaExecutorWaitElementPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[normalize-space()='JavaScript Delays']")
    WebElement javascriptbutton;

    @FindBy(xpath="//*[@id='start']")
    WebElement start;

    @FindBy(xpath="//*[text()='Liftoff!']")
    WebElement liftoftext;

    public void start() {
        // Click "JavaScript Delays"
      //  wait.until(ExpectedConditions.elementToBeClickable(javascriptbutton)).click();

        // Click "Start"
        wait.until(ExpectedConditions.elementToBeClickable(start)).click();

        
        
        
        
        
        
        
        
        
        // Wait until "Liftoff!" is visible
        String actualText = wait.until(ExpectedConditions.visibilityOf(liftoftext)).getText();

        String expectedText = "Liftoff!";
        Assert.assertEquals(actualText, expectedText, "Text did not match!");

        System.out.println("✅ Same text matched: " + actualText);
    }
}