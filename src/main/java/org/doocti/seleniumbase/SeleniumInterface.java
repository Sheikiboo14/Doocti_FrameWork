package org.doocti.seleniumbase;

import java.util.List;

import org.doocti.seleniumEnum.Browser;
import org.doocti.seleniumEnum.Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface SeleniumInterface {
	
	/**
	 * This function will launch the chrome with a give URL
	 * @param url - Give the URL of the site
	 * @exception NullPointerException
	 */
	void browaerSetup(String url);
	
	/**
	 * This function will launch give browser with given Url
	 * @param browserName
	 * @param url
	 */
	void browserSetup(Browser browserName, String url);
	
	/**
	 * This function will close the Window
	 */
	void close();
	
	/**
	 * This function will quit the browser
	 */
	
	void quit();
	
	
	/**
	 * This function will wait untill the element becomes clickable and click the element
	 * @param ele
	 */
	
	void click(WebElement ele);
	
	
	/**
	 * This function will identify the web element 
	 * @param type - element type eg- id,name or linkText
	 * @param value - element value
	 * @return WebElement
	 */
	
	WebElement element(Locators type,String value);
	
	
	
	/**
	 * This function will identify the web element 
	 * @param type - element type eg- id,name or linkText
	 * @param value - element value
	 * @return WebElement
	 */
	
	List<WebElement> elements(Locators type,String value);
	
	/**
	 * This function will wait untill the element becomes visible and clear the value then type the value
	 * @param ele
	 * @param value
	 */
	void type(WebElement ele, String testData);
	
	/**
	 * This function will wait untill the element becomes visible then clear the value then type the vaule and enter 
	 * @param ele
	 * @param value
	 * @param keys
	 */
	void type (WebElement ele, String testData, Keys keys);
	
	/**
	 * This function will wait untill the element becomes visible and append the value
	 * @param ele
	 * @param value
	 */
	
	void append(WebElement ele,String value);
	
	/**
	 * This fuction will switch the window based on i
	 * @param i
	 */
	
	void switchToWindow(int i);
	
	/**
	 * This function will select the value in dropdown
	 * @param ele
	 * @param value
	 * @param selectValue
	 */
	void dropdown(WebElement ele, WebElement selectValue);
	
	/**
	 * This function will wait untill the element is visible and perform assertion
	 * @param ele
	 * @return boolean
	 */
	boolean isDisplay(WebElement ele);
	

	void getTitle();
	
	void getUrl();
}
