package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClick = driver.findElement(By.className("context-menu-one"));

//		Actions action = new Actions(driver);
//		action.contextClick(rightClick).build().perform();

//		List<WebElement> list = driver.findElements(By.className("context-menu-item"));
//		System.out.println(list.size());
//		for (int i = 0; i < list.size(); i++) {
//			String textValue = list.get(i).getText();
//
//			if (textValue.equals("")) {
//				textValue.trim();
//			} else {
//				System.out.println(textValue);
//			}
//		}
		
		ArrayList<String> rightClickText = ActionPractice.getValuesFromRightClick(driver, rightClick);
		System.out.println(rightClickText);
		
		

	}

}
