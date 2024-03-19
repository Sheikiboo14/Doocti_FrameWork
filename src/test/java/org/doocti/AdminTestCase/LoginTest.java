package org.doocti.AdminTestCase;
import org.doocti.seleniumEnum.Locators;
import org.doocti.seleniumbase.SeleniumBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest extends SeleniumBase{
	

	
	
	@Test
	public void LoginTC001() {
		
		browaerSetup("https://console-v2.doocti.com/v2.1.106/auth/login");
		type(element(Locators.xpath, "//input[@aria-label='UserName']"), "developv2_admin");
		type(element(Locators.xpath, "//input[@aria-label='Password']"), "Doocti@123");
		click(element(Locators.xpath, "//div[text()='Login']"));
		isDisplay(element(Locators.xpath, "//div[text()='Email must be valid']"));
		quit();

		

	}
	
	@Test
	public void LoginTC002() {
		
		browaerSetup("https://console-v2.doocti.com/v2.1.106/auth/login");
		type(element(Locators.xpath, "//input[@aria-label='UserName']"), "developv2_admin@");
		type(element(Locators.xpath, "//input[@aria-label='Password']"), "Doocti@123");
		click(element(Locators.xpath, "//div[text()='Login']"));
		isDisplay(element(Locators.xpath, "//div[text()='Email must be valid']"));
		quit();
		

	}
	
	@Test
	public void LoginTC003() {
		
		browaerSetup("https://console-v2.doocti.com/v2.1.106/auth/login");
		type(element(Locators.xpath, "//input[@aria-label='UserName']"), "developv2_admin@doocti");
		type(element(Locators.xpath, "//input[@aria-label='Password']"), "Doocti@123");
		click(element(Locators.xpath, "//div[text()='Login']"));
		isDisplay(element(Locators.xpath, "//div[text()='Email must be valid']"));
		quit();

	}
	
	@Test
	public void LoginTC004() {
		
		browaerSetup("https://console-v2.doocti.com/v2.1.106/auth/login");
		type(element(Locators.xpath, "//input[@aria-label='UserName']"), "developv2_admin@doocti.com");
		type(element(Locators.xpath, "//input[@aria-label='Password']"), "Doocti@12");
		click(element(Locators.xpath, "//div[text()='Login']"));
		isDisplay(element(Locators.xpath, "(//div[@class='v-snack__wrapper red']//div)[1]"));
		click(element(Locators.xpath, "//div[text()='Close']"));
		quit();

	}
	
	@Test
	public void LoginTC005() {
		
		browaerSetup("https://console-v2.doocti.com/v2.1.106/auth/login");
		type(element(Locators.xpath, "//input[@aria-label='UserName']"), "developv2_adm@doocti.com");
		type(element(Locators.xpath, "//input[@aria-label='Password']"), "Doocti@123");
		click(element(Locators.xpath, "//div[text()='Login']"));
		isDisplay(element(Locators.xpath, "(//div[@class='v-snack__wrapper red']//div)[1]"));
		click(element(Locators.xpath, "//div[text()='Close']"));
		quit();

	}
	
	@Test
	public void LoginTC006() {
		
		browaerSetup("https://console-v2.doocti.com/v2.1.106/auth/login");
		type(element(Locators.xpath, "//input[@aria-label='UserName']"), "developv2_admin@doocti.com");
		type(element(Locators.xpath, "//input[@aria-label='Password']"), "Doocti@123");
		click(element(Locators.xpath, "//div[text()='Login']"));
		isDisplay(element(Locators.xpath, "//i[@title='Sign Out']"));
		quit();

	}


}
