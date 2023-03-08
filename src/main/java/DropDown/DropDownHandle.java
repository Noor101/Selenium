package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

//		Select select = new Select(day);
//		select.selectByVisibleText("5");
//		
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("Dec");
//		
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("1995");

		selectValueFromDropdownByText(day, "11");
		selectValueFromDropdownByText(month, "Jun");
		selectValueFromDropdownByText(year, "1995");

	}

	public static void selectValueFromDropdownByText(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void selectValueFromDropdownByIndex(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);
	}

}
