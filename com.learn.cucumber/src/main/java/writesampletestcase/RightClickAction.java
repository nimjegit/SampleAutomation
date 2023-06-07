package writesampletestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RightClickAction {

	WebDriver driver;
	@Test
	public void performRightClick() {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nimje\\Documents\\Automationpractice\\src\\main\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nimje\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(co); //launch Browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/buttons");
		WebElement element= driver.findElement(By.id("rightClickBtn"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
		
		
	}

}
