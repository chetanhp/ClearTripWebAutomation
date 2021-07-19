/**
 * 
 */
package com.cleartrip.testcases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cleartrip.pages.ClearTripBookPage;
import com.cleartrip.pages.SearchflightsPage;

import utilities.ScreenShotUtiltity;

/**
 * @author User
 *
 */
public class ClearTripBooktestcase extends BaseClass{
	

	public SearchflightsPage searchflightpage;
	public ClearTripBookPage cleartripbookpage;
	

	public ClearTripBooktestcase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initilization();
		
		cleartripbookpage=new ClearTripBookPage();
		
	}
	
	@Test
	public void clickbookflight() {
		
		cleartripbookpage.clickbookbtn();
		String exp="Review your itinerary";
				String act=driver.findElement(By.xpath("//h2[text()=\"Review your itinerary\"]")).getText();
				Assert.assertEquals(true,act.contains(exp),"text did not match");

	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus());
		{
			ScreenShotUtiltity.captureScrenshot(driver,result.getName());
		}
		driver.quit();
	}}

	
