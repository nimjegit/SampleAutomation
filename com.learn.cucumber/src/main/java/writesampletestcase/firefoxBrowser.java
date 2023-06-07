package writesampletestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nimje\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\nimje\\Documents\\Automationpractice\\src\\test\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //launch Browser
		driver.get("https://www.google.com");
	}
}
