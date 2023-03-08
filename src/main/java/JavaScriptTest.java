import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.get("https://classic.freecrm.com/index.html?e=1");
		
		System.out.println(JavaScriptUtil.getTitleByJs(driver));
		
		//JavaScriptUtil.generateAlert(driver, "Generate a alert");
		//JavaScriptUtil.refreshBrowserByJS(driver);
		//System.out.println(JavaScriptUtil.getBrowserInfo(driver));
		
	//	JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "fhdfkjdf@fjdfhf");
		
		//WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign in']"));
		
	//	JavaScriptUtil.clickElementByJS(signIn, driver);
		
		//WebElement signinText = driver.findElement(By.xpath("//h1[text()='Sign in']"));
		
	//	JavaScriptUtil.drawBorder(signinText, driver);
		
		
		//JavaScriptUtil.flash(signinText, driver);
		
		
	//	System.out.println(JavaScriptUtil.getPageInnerText(driver));
		
		//JavaScriptUtil.scrollPageDown(driver);
		
		WebElement forgotPwd = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		JavaScriptUtil.scrollIntoView(forgotPwd, driver);
		forgotPwd.click();
		
	}

}
