package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.selenium.util.ChromeDriverProvider;
import com.selenium.util.IEDriverProvider;

import junit.framework.Assert;

public class TestForGoogle {
	
	private static Logger LOG = Logger.getLogger(TestForGoogle.class);

	private WebDriver driver;

	@Test
	public void testGoogleForIE() {
		LOG.info("testGoogleForIE started");
		
		driver = IEDriverProvider.getInstance();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Assert.assertEquals("Google", driver.getTitle());
		
		LOG.info("testGoogleForIE end");
	}

	@Test
	public void testGoogle1ForChrome() throws InterruptedException {
		LOG.info("testGoogle1ForChrome started");
		
		driver = ChromeDriverProvider.getInstance();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Assert.assertEquals("Google", driver.getTitle());
		
		LOG.info("testGoogle1ForChrome end");
	}

	@AfterTest
	public void tearDown() {
		LOG.info("Closing  started");
		driver.quit();
	}

}
