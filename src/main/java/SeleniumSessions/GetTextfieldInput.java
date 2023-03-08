package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextfieldInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("noormohammed1050@gmail.com");
		
		//To get the entered input text
		
		String inputValue = driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(inputValue);
		
		
		driver.findElement(By.id("password")).sendKeys("noor123");
		
		String inputPwd = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(inputPwd);
	}

}
