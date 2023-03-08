package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageLinkedIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		//page objects
		
		By userName = By.id("username");
		By pwd = By.id("password");
		By loginButton = By.xpath("//button[@type='submit']");
		
		
		Util util = new Util(driver);
		
//		util.getElement(userName).sendKeys("noormohammed1050@gmail.com");
//		util.getElement(pwd).sendKeys("noor@123");
//		util.getElement(loginButton).click();
		
		util.doSendKeys(userName, "noormohammed1050@gmail.com");
		util.doSendKeys(pwd, "noor@123");
		util.doClick(loginButton);
	}

}
