package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.base.BaseClass;
import com.utils.PagesUtils;

public class LoginPage  {

	public WebDriver driver = null;
	public static Logger log=Logger.getLogger(LoginPage.class);
	@FindBy(id="user_name")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement password;
	
	@FindBy(id="login_button")
	public WebElement loginbutton;
		
	@FindBy(id="image[@width='340']")
	public WebElement logo;
	
	@FindBy(id="error")
	public WebElement errorMsg;
	
	public LoginPage(WebDriver driver) {
	    driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void loginToApplication(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbutton.click();
	}
	public DashboardPage nevigateToDashboardPage(WebDriver driver) {
		username.sendKeys("admin");
		password.sendKeys("pass");
		loginbutton.click();
		return new DashboardPage(driver);
	}
	
	public boolean enterCorrectCredentials() {
		username.sendKeys("admin");
		password.sendKeys("pass");
		loginbutton.click();
		String actTitle=driver.getTitle();
		System.out.println("Actual Title:"+actTitle);
		String expTitle="WebStocker";
		if(actTitle.equals(expTitle)) {
			log.info("Title is Matched");
			return true;
		}else {
			log.info("Title is Not Matched");
			return false;
		}
	}

	public boolean enterInvalidCredentials() {
		username.sendKeys("admin");
		password.sendKeys("pass");
		loginbutton.click();
		String actTitle=driver.getTitle();
		System.out.println("Actual Title:"+actTitle);
		String expTitle="WebStocker";
		if(actTitle.equals(expTitle)) {
			log.info("Title is Matched");
			return true;
		}else {
			log.info("Title is Not Matched");
			return false;
	}
	}
	public boolean checkErrorMsg() {
		username.sendKeys("admin");
		password.sendKeys("pass");
		loginbutton.click();
		String ErrorMsg=driver.getTitle();
		System.out.println("Actual Title:"+ErrorMsg);
		String expTitle="WebStocker";
		if(ErrorMsg.equals(expTitle)) {
			log.info("Error Msg is Matched");
			return true;
		}else {
			log.info("Error Msg is Not Matched");
			return false;
	}
	
		
	}
	}
	
	
	

		
	
	
	
	
	

