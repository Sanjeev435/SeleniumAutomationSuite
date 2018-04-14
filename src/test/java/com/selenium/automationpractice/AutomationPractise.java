package com.selenium.automationpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.common.BaseClass;

public class AutomationPractise extends BaseClass {

	private static final String webUrl = "http://www.automationpractice.com";

	private static final String womanTopMenuId = "//*[@id='block_top_menu']/ul/li[1]/a";

	private static final String topBreadCrumb = "//*[@id='center_column']/h1/span";

	/*
	 * @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a") public WebElement
	 * womanMenu ;
	 */

	public WebDriver openAutomationPractise() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(webUrl);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public void getWomanTopMenu() {
		WebElement womanMenu = driver.findElement(By.xpath(womanTopMenuId));
		womanMenu.click();
	}

	public boolean verifyClickForMainMenu() {
		
		useJavaScriptScroller(driver);
		
		WebElement womanCategories = driver.findElement(By.id("categories_block_left"));

		List<WebElement> womanSubCategories = womanCategories.findElements(ByTagName.tagName("h2"));

		for (WebElement subCategory : womanSubCategories) {
			if ("WOMEN".equals(subCategory.getText())) {
				return true;
			}
		}

		return false;
	}

	public void filterForTops() {
		
		useJavaScriptScroller(driver);
		
		WebElement tops = driver.findElement(By.id("uniform-layered_category_4"));

		WebElement topCheckBox = tops.findElement(By.className("checkbox"));

		useJavaScriptClick(driver, topCheckBox);
		
		implicit_5sec_Wait();
	}

	public boolean verifyTopsFilterSelection() {
		useJavaScriptScroller(driver);
		
		WebElement topOptionInBreadCrumb = driver.findElement(By.xpath(topBreadCrumb));

		if (topOptionInBreadCrumb != null && topOptionInBreadCrumb.getText().equals("WOMEN > CATEGORIES TOPS")) {
			return true;
		}

		return false;
	}
	
	public void select1stItemForDetailView() {
		List<WebElement> tops = driver.findElements(ByClassName.className("product-image-container"));
		WebElement matchedTop = null;
		
		for(WebElement top: tops) {
			top.findElement(By.xpath(".//a"));
			WebElement topTitle = top.findElement(By.xpath("/a"));
			if("Faded Short Sleeve T-shirts".equalsIgnoreCase(topTitle.getAttribute("Title"))) {
				matchedTop = top;
				break;
			}
		}
		
		List<WebElement> spanElements = matchedTop.findElements(By.tagName("span"));
		for(WebElement span: spanElements) {
			if("More".equalsIgnoreCase(span.getText())) {
				span.findElement(ByXPath.xpath("./*")).click();
				break;
			}
		}
	}

}
