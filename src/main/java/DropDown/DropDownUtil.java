package DropDown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {

	/**
	 * This method to get the dropdown value based on the visibleText
	 * 
	 * @param element
	 * @param text
	 */
	public static void getValuefromtext(WebElement element, String text) {

		Select select = new Select(element);
		select.selectByVisibleText(text);

	}

	/**
	 * This method to get the dropdown valus based on the index
	 * 
	 * @param element
	 * @param value
	 */

	public static void getValuefromIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}

	/**
	 * This method to get the all values from the dropdown in the arraylist format
	 * 
	 * @param Element
	 * @return
	 */
	public static ArrayList<String> getValuesFromDropDown(WebElement Element) {

		System.out.println("------------------");
		Select select = new Select(Element);
		List<WebElement> droplist = select.getOptions(); 
		System.out.println("total no.of.value in dropdown:" + droplist.size());

		ArrayList<String> ar = new ArrayList<String>();

		for (int i = 0; i < droplist.size(); i++) {
			String text = droplist.get(i).getText();
			ar.add(text);
		}

		return ar;
	}
	/**
	 * This method to get the values without the select class and also click the specific value
	 * @param driver
	 * @param locator
	 */
	public static void getValueWithoutSelect(WebDriver driver, String locator, String value) {
		
		List<WebElement> daylist = driver.findElements(By.xpath(locator));
		System.out.println(daylist.size());
		
		for(int i=0;i<daylist.size();i++) {
			String days = daylist.get(i).getText();
			System.out.println(days);
			if(days.equals(value)) {
				daylist.get(i).click();
				break;
			}
		}
		
		
	}

}
