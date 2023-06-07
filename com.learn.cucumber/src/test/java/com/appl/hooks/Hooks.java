package com.appl.hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.test.utility.ConfigReader;
import com.test.utility.DriverFactory;

import io.cucumber.java.Before;

public class Hooks {

	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		
	}
	
	
	
	
	
	
	
}
