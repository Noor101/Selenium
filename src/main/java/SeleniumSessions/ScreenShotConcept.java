package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotConcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

		WebElement userName = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));

		userName.sendKeys("noormohammed1050@gmail.com");
		pwd.sendKeys("Noor@123");
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("./target/screenshots/login1.png"));


				takePageScreenShot(driver, "page1");
				
				takePageElementShot(userName, "userName1");
				takePageElementShot(pwd, "pwd2");
				
	}

	/**
	 * This utility method to take the screenshot
	 * @param driver
	 * @param fileName
	 */
	public static void takePageScreenShot(WebDriver driver, String fileName) {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./target/screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This utitlity method to take the element screenshot using selenium 4
	 * @param element
	 * @param fileName
	 */
	public static void takePageElementShot(WebElement element, String fileName) {

		File srcFile = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./target/screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
