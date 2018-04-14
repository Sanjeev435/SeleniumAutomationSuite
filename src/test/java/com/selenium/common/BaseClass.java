package com.selenium.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.util.ChromeDriverProvider;


public class BaseClass {


	protected WebDriver driver = ChromeDriverProvider.getInstance();



	protected void useJavaScriptClick(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	protected void useJavaScriptScroller(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	protected void implicit_5sec_Wait() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	protected void implicit_10sec_Wait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
