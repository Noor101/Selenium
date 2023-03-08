package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick = driver.findElement(By.className("context-menu-one"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(rightClick).build().perform();
		
		String text = driver.findElement(By.xpath("//ul/li[contains(@class, 'context-menu-icon-copy')]/span")).getText();
		System.out.println(text);
	}

}
