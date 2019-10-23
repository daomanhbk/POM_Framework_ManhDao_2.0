package com.bankguru.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.actions.HomePage;
import com.bankguru.actions.LogInPage;
import com.bankguru.actions.NewCustomerPage;
import com.bankguru.actions.RegisterPage;

import Common.CommonTestCase;

public class RegisterScript extends CommonTestCase{
	WebDriver driver;
	LogInPage logInPage;
	RegisterPage registerPage;
	HomePage homePage;
	NewCustomerPage newCustomerPage;
	
	String email;
	static String username, password; //mngr216060 rAgEvyj  //65381	
	
	
	@Parameters({"browser","version","url"})
	@BeforeClass
	public void beforeClass(String browser, String version, String url) {
			driver = openBrowser(browser, version, url);
			email = "manh"+ randomemail() + "@gmail.com";

		}
	@Test
	public void NC00() {
		logInPage = new LogInPage(driver);
		logInPage = PageFactory.initElements(driver, LogInPage.class);		
		registerPage = logInPage.clickHereLink();	
		registerPage.inputEmail(email);
		registerPage.clickSubmit();		
		username = registerPage.getUserName();
		password = registerPage.getPassword();
	}
	
	@AfterClass
	public void afterClass() {
		closeBrowser();
	}
}
