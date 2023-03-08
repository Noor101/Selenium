package Exercises;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	public static ArrayList<String> rightClick(WebElement element, WebDriver driver ) {
		
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
		
		List<WebElement> menuItem = driver.findElements(By.className("context-menu-item"));
		ArrayList<String> ar = new ArrayList<String>();
		for(int i=0;i<menuItem.size();i++) {
			String menuText = menuItem.get(i).getText();
			ar.add(menuText);
			if(menuText.equals("")) {
				menuText.trim();
			}else {
				System.out.println(menuText);
			}
			
		}
		
		return ar;

	}

}

