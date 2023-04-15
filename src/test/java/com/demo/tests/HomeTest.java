/**
 * 
 */
package com.demo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.base.BasePage;
import com.demo.pages.HomePage;
import com.demo.pages.SystemUserPage;

/**
 * @author ariel
 *
 */
public class HomeTest extends BasePage{
	HomePage home;
	SystemUserPage sysUser;
	//WebDriver driver;
	
	@Test(priority=3)
	public void adminTabTest() throws InterruptedException {
		home = new HomePage(driver);
		sysUser = home.clickOnAdminTab();
		Thread.sleep(3000);
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}

}
