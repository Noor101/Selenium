package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {

	
	public static ArrayList<String> getValuesFromRightClick(WebDriver driver, WebElement element) {
		
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
		
		List<WebElement> list = driver.findElements(By.className("context-menu-item"));
		System.out.println(list.size());
		ArrayList<String> ar = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			String textValue = list.get(i).getText();
			ar.add(textValue);

			if (textValue.equals("")) {
				textValue.trim();
			} else {
				System.out.println(textValue);
			}
		
	}
		return ar;
	
	}
		
		
		
		
	
}
