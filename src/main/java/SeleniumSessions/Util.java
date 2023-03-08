package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	//local variable
	WebDriver driver;
	
	
	//To initiate the local variable to the class variable using this keyword
	public Util(WebDriver driver) {
		this.driver = driver;
	}
	
	
	/**
	 * This method to get the WebElement using By locator
	 
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}*/
	
	
	/**
	 * This method to get the locate using By method uisng try catch method
	 */
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element =  driver.findElement(locator);
		}
		catch(Exception e){
			System.out.println("Some exception occured while creating the webelement");
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	public void waitForElementPresent(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	
	
	
	/**
	 * I'm calling getElement becuase it is not 
	 * This method to click on the element
	 * @param element
	 */
	public void doClick(By locator) {
		try {
		getElement(locator).click();
		}catch(Exception e)	{
			System.out.println("Some exception occured while clicking the webelement");
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * This method to pass the values to the webElement
	 * @param locator
	 * @param value
	 */
	
	public void doSendKeys(By locator, String value) {
		try {
		getElement(locator).sendKeys(value);
	}catch(Exception e) {
		System.out.println("Some exception occured while passing values to the webelement");
		System.out.println(e.getMessage());
	}
		
	
	
	}
	
}
