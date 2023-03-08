package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTotalTextFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?");
		
		//Total number of input fields
		
		List<WebElement> listInput = 	driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(listInput.size());
		
		for(int i=0;i<listInput.size();i++) {
			listInput.get(i).sendKeys("Noor");
		}
		
		//Total number of password fields
		
		List<WebElement> listpwd = 	driver.findElements(By.xpath("//input[@type='password']"));
		System.out.println(listpwd.size());
		
		for(int i=0;i<listpwd.size();i++) {
			listpwd.get(i).sendKeys("Noor");
		}
	}

}
