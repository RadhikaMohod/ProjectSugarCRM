package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.utils.PagesUtils;

public class HomePage extends BaseClass{

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="user_name")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement password;
	
	@FindBy(id="login_button")
	public WebElement loginbutton;
	
	@FindBy(id = "HoverTheMouse")
	public WebElement hoverthemouse;
	
	@FindBy(id = "AddDashlets")
	public WebElement adddashlets ;

	public void validLogin(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbutton.click();
		
	}

	public boolean hoverTheMouse() {
		Actions action = new Actions(driver);
		action.moveToElement(hoverthemouse).perform();
		PagesUtils.click(adddashlets);
		String actString = driver.getTitle();
		String expTitle = "Home » WebStocker";
		if (actString.equals(expTitle)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkAddDashlets() {
		
		Actions action = new Actions(driver);
		action.moveToElement(hoverthemouse).perform();
		PagesUtils.click(adddashlets);
		String actString = driver.getTitle();
		String expTitle = "Home » WebStocker";
		if (actString.equals(expTitle)) {
			return true;
		}else {
			return false;
		
	}
}
}