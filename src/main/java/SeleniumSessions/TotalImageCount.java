package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImageCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		List<WebElement> img = 	driver.findElements(By.tagName("img"));
		
		System.out.println(img.size());
		
		for(int i=0;i<img.size();i++) {
			String imgsrc = img.get(i).getAttribute("src");
			System.out.println(imgsrc);
		}

		
	}

}
