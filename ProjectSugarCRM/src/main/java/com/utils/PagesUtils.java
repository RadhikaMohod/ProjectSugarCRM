package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PagesUtils {

	static WebDriver driver = null;
	static WebElement loginbutton = null;
	public PagesUtils(WebDriver driver) {
		PagesUtils.driver=driver;
	}
	public static void selectOptionsFromDropdown(WebElement dropdown,String options) {
		Select select = new Select(dropdown);
		select.deselectByVisibleText(options);
	}
	public static void hoverTheMouse(WebElement elements) {
		Actions action = new Actions(driver);
		action.moveToElement(elements).perform();
	}
	
	public static void selectDropdownList(WebElement duration, String options) {
		Select select = new Select(duration);
		select.deselectByVisibleText(options);
		
	}
	public static void sendKeys(String uname, String pass) {
     PagesUtils.sendKeys(uname, "admin");
     PagesUtils.sendKeys(pass, "pass");
     loginbutton.click();
		
	}
	public static void click(WebElement daytab) {
		daytab.click();
		
	}
	public static void sendKeys(WebElement username, String uname) {
		 PagesUtils.sendKeys(uname, "admin");
		
	}
	
		
	}
	
	
		
	
	
		
	
	

