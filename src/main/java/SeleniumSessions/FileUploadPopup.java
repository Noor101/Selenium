package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
//		
//		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Noor Mohammed\\Downloads\\Bond.JFIF");

		
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		
		driver.findElement(By.name("userfile")).sendKeys("C:\\Users\\Noor Mohammed\\Downloads\\christian-wiediger-MAKEzgAQ6WU-unsplash.JPG");
	}

}
