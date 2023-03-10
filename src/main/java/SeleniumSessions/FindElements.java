package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		// To print the link text on the console using for loop

		for (int i = 0; i < links.size(); i++) {
			String text = links.get(i).getText();

			if (text.equals("")) {
				text.trim();
			}
			else {
				System.out.println(text);
			}
			
			
		}
		driver.close();
	}
}