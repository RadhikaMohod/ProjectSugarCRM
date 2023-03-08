package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.HomePage;

public class HomePageTest extends BaseClass {

	HomePage homepage;
	@BeforeSuite
	public void setup()throws Exception{
		initialization();
		homepage = new HomePage(driver);
		
	}
	@Test
	public void test01()throws Exception{
		homepage.validLogin("admin","pass");
		
		boolean titleOfHome = homepage.hoverTheMouse();
		assertEquals(titleOfHome,"Home » WebStocker");
	}
	@Test
	public void test02()throws Exception{
		homepage.checkAddDashlets();
	}
}
