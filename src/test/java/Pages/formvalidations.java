package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class formvalidations extends BaseclassPages {

    WebDriverWait wait;

    public formvalidations(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath="//a[normalize-space()='Form Fields']")
    WebElement formfields;

    @FindBy(id="name-input")
    WebElement name;

    @FindBy(xpath="//input[@type='password']")
    WebElement password;

    @FindBy(id="drink1")
    WebElement water;

    @FindBy(xpath="//label[@for='color1']")
    WebElement color;

    @FindBy(id="automation")
    WebElement dropdown;

    @FindBy(id="email")
    WebElement email;

    @FindBy(id="message")
    WebElement msg;

    @FindBy(id="submit-btn")
    WebElement submit;

    public void clickform() {
    	/*((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", formfields);

        wait.until(ExpectedConditions.elementToBeClickable(formfields));
        formfields.click();*/
    	WebElement formFields = driver.findElement(By.xpath("//a[normalize-space()='Form Fields']"));
    	Actions actions = new Actions(driver);
    	actions.moveToElement(formFields).click().perform();
    }

    public void fillname(String uname) {
        wait.until(ExpectedConditions.visibilityOf(name)).sendKeys(uname);
    }

    public void fillpassword(String pwd) {
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pwd);
    }

    public void checkbox() {
    	water.click();
    	//wait.until(ExpectedConditions.elementToBeSelected(water));
    	/*WebElement water = driver.findElement(By.xpath("//label[@for='drink1']"));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", water);
    	Actions actions = new Actions(driver);
    	actions.moveToElement(water).click().perform();
    	 //wait.until(ExpectedConditions.elementToBeClickable(water)).click();*/
    }

    public void color() {
    	/*((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", color);
    	color.click();
        wait.until(ExpectedConditions.elementToBeSelected(color));
        */
    	color= driver.findElement(By.xpath(
    			"//label[@for='color1']"));
    	Actions actions = new Actions(driver);
    	actions.moveToElement(color).click().perform();

    }

    public void selectDropdown(String optionText) {
        wait.until(ExpectedConditions.elementToBeClickable(dropdown));
        Select s = new Select(dropdown);
        s.selectByVisibleText(optionText);
    }

    public void email(String mail) {
        wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(mail);
    }

    public void msg(String message) {
        wait.until(ExpectedConditions.visibilityOf(msg)).sendKeys(message);
    }

    public void submit() {
    	try {
    		
        submit.submit();
    	//wait.until(ExpectedConditions.elementToBeSelected(submit));
        wait.until(ExpectedConditions.alertIsPresent());
    	}
    	catch (Exception e) {
            //logger.error("Error in form submission and alert handling: " + e.getMessage());
            throw e;
        }
        // ✅ Handle alert
      
    	
    	}
     
}


    

