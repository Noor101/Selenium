package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.className("comboTreeArrowBtn")).click();

		//		List<WebElement> choiceList = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul/li/span[@class='comboTreeItemTitle']"));
		//		System.out.println(choiceList.size());
		//		
		//		for(int i=0;i<choiceList.size();i++) {
		//			String text = choiceList.get(i).getText();
		//			System.out.println(text);
		//			if(text.equals("choice 1")) {
		//				choiceList.get(i).click();
		//				break;
		//			}
		//		}

		//		selectChoiceValues(driver, "choice 3");
		//		selectChoiceValues(driver, "choice 6 2");
		//		selectChoiceValues(driver, "choice 7");

		//Three test cases - Multiple, Single and all values
		//selectChoiceValues(driver, "choice 3", "choice 6 2", "choice 7");
		//selectChoiceValues(driver, "choice 7");
		selectChoiceValues(driver, "all");
	}

	/**
	 * This is the generic method to jquery dropdown - Single, Multiple and All values.
	 * @param driver
	 * @param value
	 */
	public static void selectChoiceValues(WebDriver driver, String... value) {

		List<WebElement> choiceList = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul/li/span[@class='comboTreeItemTitle']"));
		//System.out.println(choiceList.size());

		if(!value[0].equalsIgnoreCase("ALL")) {

			for(int i=0;i<choiceList.size();i++) {
				String text = choiceList.get(i).getText();

				for(int k=0;k<value.length;k++) {
					if(text.equals(value[k])) {
						choiceList.get(i).click();
						break;
					}
				}

			}
		}
		//Select all values here now
		else {
			try {
				for(int all=0; all<choiceList.size();all++) {
					choiceList.get(all).click();
				}
			}catch(Exception e) {
				
			}
			}
		

	}

}
