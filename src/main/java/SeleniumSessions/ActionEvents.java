package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		Thread.sleep(2000);
		
		WebElement userName = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Actions action = new Actions(driver);
		action.sendKeys(userName, "noormohammed1050@gmail.com").build().perform();
		action.sendKeys(pwd, "noor124").build().perform();
		action.click(login).build().perform();
		
	}

}
