package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/csa-t20-challenge-2021-22-1299599/titans-vs-dolphins-13th-match-1299614/live-cricket-score");
		
		//I want to print the score card
		
//		List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='Dewald Brevis']//parent::td//following-sibling::td"));
//		System.out.println(scoreList.size());
//		
//		for(int i=0;i<scoreList.size();i++) {
//			System.out.println(scoreList.get(i).getText());
//		}
//		
		
		
		getScoreList(driver, "Sibonelo Makhanya");
		getScoreList(driver, "Ottniel Baartman");
	
	}
	
	
	public static void getScoreList(WebDriver driver, String value) {
		
		List<WebElement> score = driver.findElements(By.xpath("//a[text()='"+value+"']//parent::td//following-sibling::td"));
		for(int i=0;i<score.size();i++) {
			System.out.println(score.get(i).getText());
		}
	}

}
