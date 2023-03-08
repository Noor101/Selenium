package DropDown;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
	
		DropDownUtil.getValuefromtext(day, "15");
		DropDownUtil.getValuefromtext(month, "May");
		DropDownUtil.getValuefromtext(year, "1998");
		
		String date = "20-Jun-1995";
		String[] datval = date.split("-");
		DropDownUtil.getValuefromtext(day, datval[0]);
		DropDownUtil.getValuefromtext(month, datval[1]);
		DropDownUtil.getValuefromtext(year, datval[2]);
		
		DropDownUtil.getValuefromIndex(day, 10);
		DropDownUtil.getValuefromIndex(month, 8);
		DropDownUtil.getValuefromIndex(year, 25);
		
		ArrayList<String> dayList = DropDownUtil.getValuesFromDropDown(day);
		System.out.println(dayList);
		
		ArrayList<String> monthList = DropDownUtil.getValuesFromDropDown(month);
		System.out.println(monthList);
		
		ArrayList<String> yearList = DropDownUtil.getValuesFromDropDown(year);
		System.out.println(yearList);
		
		
		
		
		
	}

}
