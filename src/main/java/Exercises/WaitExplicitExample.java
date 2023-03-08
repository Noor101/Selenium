package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitExplicitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait");
		
		By enable = By.id("enable-button");
		By disable = By.id("disable");
		
		driver.findElement(enable).click();
		
		UtilWrapperClass util = new UtilWrapperClass(driver);
		util.waitForElementPresent(disable, 12);
		
		WebElement dis = driver.findElement(disable);
		dis.click();
	
		
		
		
		

	}

}
