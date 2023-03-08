package com.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.DashboardPage;

public class DashboardPageTest extends BaseClass{
	DashboardPage dashboardpage = null;
   
	@BeforeMethod
	public void setup()throws Exception {
		log.info("initialization the browser");
		initialization();
		log.info("loading login page");
		
		log.info("dashboard page is displayed");
	}

	@Test(priority = 1)
	public void test01_checkHomepageTitle(){
		log.info("Verifying the dashboardpage Title is matched or not");
		dashboardpage.checkHomepageTitle();
		Assert.assertTrue(true, "Home page Title is  Matched");
	}
	@AfterMethod
	public void afterMethod() {
		log.info("Closing the Browser");
		driver.close();
		log.info("Browser Closed");
	
}
}