package writesampletestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTest {

	
		WebDriver driver; //initialize webdriver
	
	
	
public GoogleTest(WebDriver driver) {
		this.driver = driver;
	}



@BeforeSuite 
public void setUp(){
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nimje\\Documents\\Automationpractice\\src\\main\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nimje\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(co); //launch Browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}
	
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest(){
		String Title= driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Google", "title is no matched");
	
	}
	
	@Test(priority=3,groups="Logo")
	public void googleLogoTest(){
		boolean b= driver.findElement(By.xpath("//*[@class='lnXdpd']")).isDisplayed();
		Assert.assertTrue(b, "this is displayed");
	}
	
	@Test(priority=2,groups="Link")
	public void mailLinkTest(){
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();	
	}
	
	@Test(priority=4,groups="Test")
	public void test1(){
		System.out.println("test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2(){
		System.out.println("test2");
	}
	@Test(priority=6,groups="Test")
	public void test3(){
		System.out.println("test3");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
}
