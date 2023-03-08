package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {


	WebDriver driver;

	By email = By.xpath("//input[@placeholder='Email']");
	By password = By.xpath("//input[@placeholder='Password']");
	By loginBtn = By.xpath("//a[text()='Login']//parent::button");
	By earlyAccessLink = By.xpath("//a[@class='signup-btn']");
	By userName = By.xpath("//p[@class='name']");

	//@BeforeTest
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://stag-app.impacteers.club/login");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test(priority=1)
	public void earlyAccessLinkTest() {

		driver.findElement(earlyAccessLink).isDisplayed();
		Assert.assertTrue(true);
	}

	@Test(priority=2)
	public void pageTitleTest() {

		String pageTitletext = driver.getTitle();
		System.out.println("The page title is : " + pageTitletext );
		Assert.assertEquals(pageTitletext, "impacteers.club | Building a better Professional community");

	}

	@Test(priority=3)
	public void loginTest() {

		driver.findElement(email).sendKeys("noormohammed1050@gmail.com");
		driver.findElement(password).sendKeys("Noor@100");
		driver.findElement(loginBtn).click();

		String userOfTheName = driver.findElement(userName).getText();

		Assert.assertEquals(userOfTheName, "Noor Mohammed");
	}
	
	//@AfterTest
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}


