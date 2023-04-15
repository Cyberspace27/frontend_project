/**
 * 
 */
package com.demo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.demo.pages.LoginPage;

/**
 * @author ariel
 *
 */
public class BasePage {
	
	public WebDriver driver;
	public LoginPage login;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();	
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ariel\\eclipse-workspace\\frontend_project\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		login = new LoginPage(driver);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
