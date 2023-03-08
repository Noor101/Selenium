package Exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TispringLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://stag-app.impacteers.club/login");

		By mailId = By.xpath("//input[@placeholder='Email']");
		By pwd = By.xpath("//input[@placeholder='Password']");
		By login = By.xpath("//a[text()='Login']//parent::button");
		By roomMenu = By.xpath("//a[text()='Rooms']");
		
		WebElement roomElement = driver.findElement(By.xpath("//div[text()='Attitude !']"));

		UtilWrapperClass util = new UtilWrapperClass(driver);
		
		driver.manage().window().maximize();

		util.doSendKeys(mailId, "noormohammed1050@gmail.com");
		util.doSendKeys(pwd, "Noor@100");
		util.doClick(login);
		util.waitForElementPresent(roomMenu, 30);
		util.doClick(roomMenu);
		
		UtilWrapperClass.clickElementByJS(roomElement, driver);
		
		




	}

}
