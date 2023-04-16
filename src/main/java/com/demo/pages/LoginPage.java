package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.BasePage;

public class LoginPage extends BasePage {
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userNameTxt;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passTxt;
	
	
	@FindBy(css=".oxd-button--main")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[2]/img[@alt='orangehrm-logo']")
	WebElement logoImg;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this );
		
	}


	public boolean verifyLogo() {
		
		return logoImg.isDisplayed();
		
	}
	
	public HomePage login(String user, String pass) {
		userNameTxt.sendKeys(user);
		passTxt.sendKeys(pass);
		loginBtn.click();
		return new HomePage(driver);
	}
	
	
}
