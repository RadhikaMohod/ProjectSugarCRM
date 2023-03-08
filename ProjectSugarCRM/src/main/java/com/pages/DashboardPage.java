package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.PagesUtils;

public class DashboardPage {

	public WebDriver driver;
		
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//b[text(='SUGARCRM']")
	WebElement header;
	
	@FindBy(xpath="//span(text()='Users']")
	WebElement userbutton;
	
	@FindBy(id = "grouptab_3")
	public WebElement activities;
	
	@FindBy(id = "ModuleTab_3_Home")
	public WebElement HomeModule;
	
	@FindBy(id = "Moduletab_3_Calendar")
	public WebElement CalendarModule;
	
	public HomePage clickuser() {
		userbutton.click();
		return new HomePage(driver);
	}
	public String getheader() {
		return header.getText();
	}	
	public HomePage nevigateToHomePage(WebDriver driver) {
		Actions action =new Actions(driver);
		action.moveToElement(activities).perform();
		PagesUtils.click(HomeModule);
		return new HomePage(driver);
	}	
	public CalendarPage nevigateToCalendar(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(activities).perform();
		PagesUtils.click(CalendarModule);
		return new CalendarPage(driver);
	}
	public boolean checkHomepageTitle() {
		Actions action = new Actions(driver);
		action.moveToElement(activities).perform();
		PagesUtils.click(HomeModule);
		String actString = driver.getTitle();
		String expTitle = "Home » WebStocker";
		if (actString.equals(expTitle)) {
			return true;
		}else {
			return false;
		}
	}
		
	}

