package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noor Mohammed\\eclipse-workspace\\Selenium\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //open the browser
		driver.get("http://www.google.com"); // 2. enter url
		
		
		String title = driver.getTitle(); //3. get the page title
		System.out.println(title);
		
		
		//4. validation part
		if(title.equals("Google")){
			System.out.println("Correct title");
		}
		else {
			System.out.println("Wrong title");
		}
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		System.out.println(driver.getTitle()); //Session ID is null. Using WebDriver after calling quit()?
	}

}
