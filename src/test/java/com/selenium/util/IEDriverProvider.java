package com.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

/**
 * Singleton Class for InternetExplorerDriver
 * 
 * @author Sanjeev
 *
 */
public class IEDriverProvider{

	// version 3.9-x64 version webDriver for IE is giving issue, though 3.9-32bit is
	// working correctly.
	public static String driverLocation = "//src//test//resources//SeleniumDrivers//IEDriverServer_x64_3.8.0//IEDriverServer.exe";
	public static WebDriver driver = null;

	public static WebDriver getInstance() {
			if (driver == null) {

				// It will delete all the cookies and then start a fresh window
				InternetExplorerOptions ieOptions = new InternetExplorerOptions().destructivelyEnsureCleanSession();

				// to bypass protected mode setting in IE Browser
				ieOptions.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + driverLocation);
				driver = new InternetExplorerDriver(ieOptions);
		}
		
		return driver;
	}

}
