package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.BasePage;

public class HomePage extends BasePage{
	
	//public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //instead of this we can use BaseClass.class
	}

	@FindBy(xpath="//*[@id='']")
	WebElement adminTab;
	
	public SystemUserPage clickOnAdminTab() {
		adminTab.click();
		return new SystemUserPage();
	}
	
	
}
