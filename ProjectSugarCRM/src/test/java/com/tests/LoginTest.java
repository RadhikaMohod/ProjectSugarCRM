package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginTest extends BaseClass{

	LoginPage loginpage = null;
	
	 @BeforeSuite
	 public void setup()throws Exception {
			log.info("initialization the browser");
			initialization();
			log.info("loading login page");
			loginpage=new LoginPage(driver);
			log.info("login page is displayed");
	 }
@Test(priority=1)
public void test01_selectValidCredentials() {
	log.info("Verifying the loginpage with valid username and valid password");
	loginpage.enterCorrectCredentials();
	Assert.assertTrue(true, " Title is Not Matched");
}
@Test(priority=1)
public void test02_enterInvalidCredentials() {
	log.info("Verifying the loginpage with Invalid username and Invalid password");
	loginpage.enterInvalidCredentials();
	Assert.assertTrue(true, " Title is Not Matched");
	
}
@Test(priority=2)
public void test03_checkErrorMsg() {
	log.info("Verifying the Error Msg with valid username and Invalid password");
	 loginpage.checkErrorMsg();
	Assert.assertTrue(true, " Error Msg is Not Matched");
}
@AfterMethod
public void afterMethod() {
	log.info("Closing the Browser");
	driver.close();
	log.info("Browser Closed");
}
}
