package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noor Mohammed\\eclipse-workspace\\Selenium\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app-eu1.hubspot.com/login");
		
		// 1. id
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("noormohammed1050@gmaill.com");
		
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Email@100");
		
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.linkText("Sign up")).click();
	
	}

}