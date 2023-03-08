package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

		//		1. Frames based on frameElement

		//		WebElement frameElement = driver.findElement(By.xpath("//frame[@name='main']"));
		//		
		//		driver.switchTo().frame(frameElement);
		//driver.switchTo().frame(driver.findElement(By.name("main")));

		//2. Based on frame name or id

		//driver.switchTo().frame("main");

		//3. Based on frame index

		driver.switchTo().frame(3);

		String text = driver.findElement(By.cssSelector("body > h3")).getText();
		System.out.println(text);

		driver.switchTo().defaultContent();


	}

}
