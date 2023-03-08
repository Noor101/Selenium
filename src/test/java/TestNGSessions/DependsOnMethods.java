package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test(priority=1)
	public void loginTest() {
		System.out.println("login  test");
		//int i=9/0;
	}
	
	@Test(priority=2, dependsOnMethods= "loginTest")
	public void homePageTest() {
		System.out.println("Home page  test");
	}
	
	@Test(priority=3, dependsOnMethods= {"loginTest" , "homePageTest"} )
	public void searchTest() {
		System.out.println("Search test ...");
	}
}


