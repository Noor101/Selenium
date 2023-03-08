package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Basic Auth Popup
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		//Another Way
		
		String username = "admin";
		String pwd = "admin";
		
		driver.get("http://"+username+":"+pwd+"@the-internet.herokuapp.com/basic_auth");
		
		
	}

}
