package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		//Creating webelement using by class
		
		By mailid = By.id("username");
		By pwd = By.id("password");
		By submit = By.xpath("//button[@type='submit']");
		
		UtilWrapperClass util = new UtilWrapperClass(driver);
//		util.getElement(mailid).sendKeys("noormohammed1050@gmail.com");
//		util.getElement(pwd).sendKeys("noor@123");
//		
		
		util.doSendKeys(mailid, "noormohammed1050@gmail.com");
		util.doSendKeys(pwd, "Test@123");
		util.doClick(submit);
	}

}
