package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app-eu1.hubspot.com/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(6000);
		String errorText = driver.findElement(By.className("private-alert__title")).getText();
		System.out.println(errorText);
	}

}
