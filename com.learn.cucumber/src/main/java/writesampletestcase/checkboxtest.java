package writesampletestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkboxtest {
	
	WebDriver driver; 
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nimje\\Documents\\Automationpractice\\src\\main\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.bedbathandbeyond.com/store/giftregistry/createRegistryForm?regType=BA1");
		
		WebElement e = driver.findElement(By.id("checkbox-1"));
		boolean a=e.isSelected();
		Assert.assertEquals(a,true);
		System.out.println("Checkbox is selected");
		
		
		driver.close();
	}

}
