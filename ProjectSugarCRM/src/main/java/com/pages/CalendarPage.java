package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.utils.PagesUtils;

public class CalendarPage extends BaseClass{

	public CalendarPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="day_tab")
	public WebElement daytab;
	
	@FindBy(id="t_1677409200")
	public WebElement daytime;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement name;
	
	@FindBy(xpath="//select[@id='duration']")
	public WebElement duration;
	
	@FindBy(xpath="//select[@name='status']")
	public WebElement status;
	
	@FindBy(id="location")
	public WebElement location;
	
	@FindBy(id="remindartime")
	public WebElement remindartime;
	
	@FindBy(id="description")
	public WebElement description;
	
	@FindBy(id="button")
	public WebElement savebutton;
	
	public void createActivity()throws Exception{
		Thread.sleep(1000);
		PagesUtils.click(daytab);
		Thread.sleep(1000);
		PagesUtils.click(daytime);
		Thread.sleep(1000);
		PagesUtils.sendKeys(name, "Serum Meeting");
		PagesUtils.selectDropdownList(duration,"30 minutes");
		PagesUtils.selectDropdownList(status,"Held");
		PagesUtils.sendKeys(location, "Amt");
		PagesUtils.selectDropdownList(remindartime,"30 min prior");
		PagesUtils.selectDropdownList(description,"Daily Scrum Meeting");
		PagesUtils.click(savebutton);
	}
	
}
