package com.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Singleton Class for ChromeDriverProvider
 * 
 * @author Sanjeev
 *
 */
public class  ChromeDriverProvider {

	public static String driverLocation = "//src//test//resources//SeleniumDrivers//chromedriver_win32_v2.37//chromedriver.exe";
	public static WebDriver driver = null;

	public static WebDriver getInstance() {
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + driverLocation);
				driver = new ChromeDriver();
			}
		return driver;
	}
	
}
