package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		WebElement day = driver.findElement(By.id("day"));
		WebElement mon = driver.findElement(By.id("month"));
		WebElement yr = driver.findElement(By.id("year"));

		//		Select select = new Select(day);
		//		select.selectByVisibleText("11");
		//		
		//		Select select1 = new Select(mon);
		//		select1.selectByVisibleText("Sep");
		//		
		//		Select select2 = new Select(yr);
		//		select2.selectByVisibleText("1995");

		//		SelectDropdowns sd = new SelectDropdowns();
		//		sd.selectByText(day, "30");
		//		sd.selectByText(mon, "Jun");
		//		sd.selectByText(yr, "1997");

		byIndex(day, 5);
		byIndex(mon, 7);
		byIndex(yr, 100);


	}

	/**
	 * This method for select by text
	 * @param element
	 * @param value
	 */
	public void selectByText(WebElement element, String value) {

		Select se = new Select(element);
		se.selectByVisibleText(value);

	}


	/*
	 * This method for selectbyIndex
	 */
	public static void byIndex(WebElement element, int i) {

		Select sel = new Select(element);
		sel.selectByIndex(i);
	}

}
