/**
 * 
 */
package com.demo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.base.BasePage;
import com.demo.pages.HomePage;
import com.demo.pages.LoginPage;
import com.demo.pages.SystemUserPage;

/**
 * @author ariel
 *
 */
public class HomeTest extends BasePage{
	LoginPage login;
	HomePage home;
	SystemUserPage sysUser;
	
	@Test(priority=3)
	public void adminTabTest() throws InterruptedException {
		login = new LoginPage(driver);
		home = login.login("admin", "admin123");
		Thread.sleep(5000);
		Assert.assertTrue(home.verifyDashboadLogo());
		
	}
	
	@Test(priority=4)
	public void verifySystemUserPageTest() throws InterruptedException {
		login = new LoginPage(driver);
		home = login.login("admin", "admin123");
		Thread.sleep(5000);
		sysUser = home.clickOnAdminTab();
		Thread.sleep(3000);
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		Assert.assertEquals(actualUrl, expectedUrl);
	}

}
