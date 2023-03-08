package Exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		WebElement day = driver.findElement(By.id("day"));
		WebElement mon = driver.findElement(By.id("month"));
		WebElement yr = driver.findElement(By.id("year"));
		
		getDropDownValues(day);
		getDropDownValues(mon);
		getDropDownValues(yr);
	}
	
	public static void getDropDownValues(WebElement ele) {
		
		Select select = new Select(ele);
		List<WebElement> li = select.getOptions();
		
		System.out.println("total no. of . values" + li.size());
		
		for(int i=0;i<li.size();i++) {
			String dropdowntext = li.get(i).getText();
			System.out.println(dropdowntext);
		}
	}

}
