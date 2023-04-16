/**
 * 
 */
package com.demo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demo.base.BasePage;
import com.demo.base.BaseTest;
import com.demo.pages.HomePage;

/**
 * @author ariel
 *
 */
public class LoginTest extends BaseTest{
	
	
	HomePage home;

	
	@Test(priority = 1)
	public void verifyLogoImgTest() {
		boolean flag = login.verifyLogo();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=2) 
	public void verifyLoginTest() {
		
		home = login.login("admin", "admin123");
		
		String actualUrl = getDriver().getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
}
