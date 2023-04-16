/**
 * 
 */
package com.demo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.demo.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

/**
 * @author ariel
 *
 */
public class BaseTest {
	
	private WebDriver driver;
	public LoginPage login;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ariel\\eclipse-workspace\\frontend_project\\geckodriver.exe");
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		login = new LoginPage(driver);
	}
	
	@BeforeSuite
    public void beforeSuite() {
        System.setProperty("headless", "false"); // You can set this property elsewhere
        String headless = System.getProperty("headless");

        ChromeDriverManager.chromedriver();
        if("true".equals(headless)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }
	}
	
	@AfterSuite
	public void aftersuite() {
		if(null != driver) {
          //  driver.close();
            driver.quit();
        }
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
        return driver;
    }

}
