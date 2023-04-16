/**
 * 
 */
package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.BasePage;

/**
 * @author ariel
 *
 */
public class SystemUserPage extends BasePage {
	
	public SystemUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
