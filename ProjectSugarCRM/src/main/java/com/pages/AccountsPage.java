package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.model.Log;
import com.base.BaseClass;
import com.utils.PagesUtils;

public class AccountsPage extends BaseClass{

	@FindBy(id="module_5_Accounts")
	 WebElement accounts;
	
	@FindBy(id="//img[@alt='Create Accounts']")
	 WebElement createAccounts;
	
	@FindBy(id="grouptab_5")
	 WebElement allElement;
	
	@FindBy(id="user_name")
	 WebElement username;
	
	@FindBy(id="user_password")
	 WebElement password;
	
	@FindBy(id="login_button")
	 WebElement loginbutton;
		
	public AccountsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void loginApp(String uname,String password) {
		PagesUtils.sendKeys(uname,"admin");
		PagesUtils.sendKeys(password,"pass");
		PagesUtils.click(loginbutton);
	}
	public void createAccount() {
		PagesUtils.hoverTheMouse(allElement);
		accounts.click();
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(createAccounts)).click();
	}
}
