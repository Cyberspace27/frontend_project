/**
 * 
 */
package com.demo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
/**
 * @author ariel
 *
 */
public class BasePage {
	

    protected WebDriver driver;

    /**
     * Constructor method BasePage
     * @param driver
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}