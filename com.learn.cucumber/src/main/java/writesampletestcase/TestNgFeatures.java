package writesampletestcase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgFeatures {
	
	WebDriver driver;
	

		@BeforeMethod
		public void setUp(){
			
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\nimje\\Documents\\Automationpractice\\src\\test\\resources\\geckodriver.exe");
			//driver = new FirefoxDriver(); //launch Browser
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nimje\\Documents\\Automationpractice\\src\\main\\resources\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\nimje\\UdemyCourse_RahulShetty\\Selenium jars\\BrowserDrivers\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			}
			
		
		@Test
		public void HomepageTest(){
			driver.get("https://www.childrensplace.com/us/home");
			String title=driver.getTitle();
			System.out.println(title);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
			driver.findElement(By.xpath("//*[@id='non-login-user']/span")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[contains(text(), 'Log In')]"))));
			
			driver.findElement(By.xpath("//*[contains(text(), 'Log In')]")).click();
			driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys("idsample50@gmail.com");
			
			/*JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementsByClassName('searchBar-input').click()");
			js.executeScript("document.getElementById('search-image-icon').click()");
			js.executeScript("arguments[0].click()",logo); 
			int i=9/0;
			boolean Signin= driver.findElement(By.linkText("sign in")).isDisplayed();
			WebElement clickSignin=driver.findElement(By.className("accountTxt"));
			JavascriptExecutor js = (JavascriptExecutor)driver;	
			js.executeScript("arguments[0].click();", clickSignin);
			js.executeScript(“document.getElementByID(‘element id ’).click();”);
			*/
		}

		@Test(dependsOnMethods="HomepageTest")
		public void LoginTest(){
			System.out.println("Login Test");
		}
		
		@Test(invocationCount=10)
		public void sum(){
			int a=1;
			int b=2;
			int c= a+b;
			System.out.println("sum is==" +c);
		}
		
		@Test(invocationTimeOut=2)
		public void infiniteloopTest(){
			int i=1;
			while(i==1){
				System.out.println(i);
				
			}
		}
		@Test(expectedExceptions=NumberFormatException.class)
		public void test1(){
			String x="100A";
			Integer.parseInt(x);
		}
		
			
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
}


