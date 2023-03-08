package Exercises;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitMechanism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait");

		By al = By.id("alert");

		WebElement ale = driver.findElement(al);
		ale.click();

		WebDriverWait wait = new WebDriverWait(driver, 6);
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();

		System.out.println(text);

		alert.dismiss();

	}

}
