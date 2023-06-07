package writesampletestcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtest {
/**
Setup system property for chrome
Launch Browser
Login
Enter URL
Google Title Test
Logout from app
Close Browser
deleteAllCookies
PASSED: googleTitleTest

 */
	//Pre-condition annotations
	@BeforeSuite //1
	public void SetUp(){
		System.out.println("Setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser(){
		System.out.println("Launch Browser");
	}
	
	@BeforeClass //3
	public void login(){
		System.out.println("Login");
	}
	
	
	@BeforeMethod //4
	public void enterUrl(){
		System.out.println("Enter URL");
	}
	
	//test case
	@Test //5
	public void googleTitleTest(){
		System.out.println("Google Title Test");
	}
	@Test
	public void SearchTest(){
		System.out.println("Search test");
	}
	
	//post condition
	@AfterMethod //6
	public void Logout(){
		System.out.println("Logout from app"); 
	}
	@AfterClass //7
	public void closeBrowser(){
		System.out.println("Close Browser");
	}
	@AfterTest //8 
	public void deleteAllCookies(){
		System.out.println("deleteAllCookies");	
	}
	

}
