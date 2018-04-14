package com.selenium.test;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.automationpractice.AutomationPractise;

public class AddItemInCartTest {

	private AutomationPractise automationPractise = new AutomationPractise();
	
	
	
	@Test
	public void testForAddingItemInCart() throws InterruptedException {
		WebDriver driver = automationPractise.openAutomationPractise();
		Thread.sleep(10000);
		Assert.assertEquals("My Store", driver.getTitle());
		
		automationPractise.getWomanTopMenu();
		Assert.assertEquals(true, automationPractise.verifyClickForMainMenu());
		
		automationPractise.filterForTops();
		Assert.assertEquals(true, automationPractise.verifyTopsFilterSelection());
		
		automationPractise.select1stItemForDetailView();
		
	}
}
