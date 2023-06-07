package com.datadriven.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Dataprovider {

	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/vinanimje/Desktop/Automationpractice/src/main/resources/chromedriver");
		driver = new ChromeDriver(); //launch Browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bedbathandbeyond.com/store/account/Login");
		 
	}
	
    
/*
	@DataProvider
	public Iterator<Object[]> getTestData(){
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
		
	}*/
	
	
	@Test(dataProvider="getTestData")
	public void registrationPage(String emailId, String firstName,String lastName, String mobilePh,String newPasswordField){
		
		driver.findElement(By.xpath("//*[@id='registration-email']")).clear();
		driver.findElement(By.xpath("//*[@id='registration-email']")).sendKeys(emailId);
		
		driver.findElement(By.xpath("//*[@id='registration-firstName']")).clear();
		driver.findElement(By.xpath("//*[@id='registration-firstName']")).sendKeys(firstName);
		
		driver.findElement(By.xpath("//*[@id='registration-lastName']")).clear();
		driver.findElement(By.xpath("///*[@id='registration-lastName']]")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//*[@id='registration-mobilePh']")).clear();
		driver.findElement(By.xpath("//*[@id='registration-mobilePh']")).sendKeys(mobilePh);
		
		driver.findElement(By.xpath("//*[@id='newPasswordField']")).clear();
		driver.findElement(By.xpath("//*[@id='newPasswordField']")).sendKeys(newPasswordField);
		
		driver.findElement(By.xpath("///*[@id='registration-submit']")).click();
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
