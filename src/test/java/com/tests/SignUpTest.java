package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {

	WebDriver driver;

	// By earlyAccessBtn = By.xpath("//a[@class='signup-btn']");
	By firstName = By.xpath("//input[@formcontrolname='userFirstName']");
	By email = By.xpath("//input[@formcontrolname='userEmail']");
	By termsAndConditon = By.cssSelector("label.form-check-label");
	By applyButton = By.cssSelector("button.ti-btn.medium");

	@BeforeTest
	@Parameters({ "url", "browser" })
	public void setup(String appUrl, String browser) throws Exception {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please pass the correct browser");
			throw new Exception("NoSuchBrowserException");
		}
		driver.get(appUrl);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void earlyAccessInvite() {

		// driver.findElement(earlyAccessBtn).click();
		driver.findElement(firstName).sendKeys("Raja Manikam");
		driver.findElement(email).sendKeys("noormohammed1050+70@gmail.com");
		driver.findElement(termsAndConditon).click();
		driver.findElement(applyButton).click();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
