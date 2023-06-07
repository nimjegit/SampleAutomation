package writesampletestcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicTable {

	WebDriver driver;
	
	@Test
	public void testDynamicTable() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nimje\\Documents\\Automationpractice\\src\\main\\resources\\chromedriver.exe" );
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	
	//No. of columns
	List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	System.out.println("No. of columns" +col.size());
	
	List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td"));
	System.out.println("No. of rows" + rows.size());
	
	WebElement elcTable = driver.findElement(By.tagName("table"));
	
	//To find third row
	WebElement thirdRow = elcTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[1]"));
	String actualString = thirdRow.getText();
	System.out.println("Third row first column: " +actualString);

	Assert.assertTrue(actualString.contains(""));
	
	driver.close();
	
	}
	
}
