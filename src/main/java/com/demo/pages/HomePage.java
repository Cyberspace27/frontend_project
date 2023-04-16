package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.BasePage;

public class HomePage extends BasePage{
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //instead of this we can use BasePage.class
	}

	@FindBy(css="ul.oxd-main-menu > li:nth-child(1) > a.oxd-main-menu-item")
	WebElement adminTab;
	
	@FindBy(xpath="//*[@alt='client brand banner']")
	WebElement logoImg;
	
	public SystemUserPage clickOnAdminTab() {
		adminTab.click();
		return new SystemUserPage(driver);
	}
	
	public boolean verifyDashboadLogo() {
		return logoImg.isDisplayed();
	}
	
	
}
