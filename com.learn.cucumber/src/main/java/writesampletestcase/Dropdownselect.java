package writesampletestcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdownselect {
	
	WebDriver driver;

	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nimje\\Documents\\Automationpractice\\src\\main\\resources\\chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void selectDropdown() throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		WebElement clkcta = driver.findElement(By.xpath("//*[contains(text(),'Create new account')]"));
		clkcta.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String title= driver.getTitle();
		System.out.println(title);
		boolean a = driver.findElement(By.xpath("//*[@id='facebook']/body/div[3]/div[2]/div/div/div[1]/div[1]")).isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(a, "Sign up is displayed");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select s = new Select(month);
		s.selectByVisibleText("Nov");
		
		Select s1 = new Select(day);
		s1.selectByVisibleText("");
		
		
		Select s2= new Select(year);
		s2.selectByVisibleText("");
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clkcta);
	} 
	
	
	
	public void selectfromdropdown(WebElement ele, String value) {
		
		Select s = new Select(ele);
		s.selectByVisibleText(value);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
