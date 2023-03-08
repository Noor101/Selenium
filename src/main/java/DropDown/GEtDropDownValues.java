package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GEtDropDownValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		//Going to create genreric method to get the dropdown values
		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);
		
	}

	/**
	 * This method to get the values from the dropdown
	 * @param element
	 */
	
	public static void getDropDownValues(WebElement element) {
		
		
		Select select = new Select(element);
		
		List<WebElement> dropList =  select.getOptions();
		System.out.println("total no.of.values in" + dropList.size());
		
		
		for(int i=0; i<dropList.size();i++) {
			String dropValue = dropList.get(i).getText();
			System.out.println(dropValue);
		}
		
		
	}
}
