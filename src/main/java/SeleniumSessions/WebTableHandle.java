package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//		List<WebElement> list = driver.findElements(By.xpath("//table[@id='customers']//tr"));
//		System.out.println(list.size());
		
		int rowcount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
		System.out.println(rowcount);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int rownum = 2; rownum<=rowcount+1; rownum++) {
			String actualXpath = beforeXpath+rownum+afterXpath;
			System.out.println(actualXpath);
			
			String value = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(value);
		}
		
		
	}

}
