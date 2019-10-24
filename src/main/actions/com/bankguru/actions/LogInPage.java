package com.bankguru.actions;

//import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.CommonFunctions;

public class LogInPage extends CommonFunctions {

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "here")
	WebElement HERE_LBL;

//	public static String USERID_TXT = "//input[@name='uid']";	
	@FindBy(name = "uid")
	WebElement USERID_TXT;
	
//	public static String PASSWORD_TXT = "//input[@name='password']";
	@FindBy(name = "password")
	WebElement PASSWORD_TXT;
	
//	public static String LOGIN_BTN = "//input[@name='btnLogin']";
	@FindBy(name = "btnLogin")
	WebElement LOGIN_BTN;

//	public void clickHereLink() {
//		waitForElemenVisible(LogInPageUI.HERE_LBL);
//		clickToElement(LogInPageUI.HERE_LBL);
//	} 	

	public RegisterPage clickHereLink() {
		waitForElemenVisible(HERE_LBL);
		clickToElement(HERE_LBL);
		return PageFactory.initElements(driver, RegisterPage.class);
	}

	public void inputUserID(String value) {
		waitForElemenVisible(USERID_TXT);
		inputElement(USERID_TXT, value);
	}

	public void inputPassword(String value) {
		waitForElemenVisible(PASSWORD_TXT);
		inputElement(PASSWORD_TXT, value);
	}

//	public void clickLogin() {
//		waitForElemenVisible(LogInPageUI.LOGIN_BTN);		
//		clickToElement(LogInPageUI.LOGIN_BTN);
//	}

	public HomePage clickLogin() {
		waitForElemenVisible(LOGIN_BTN);
		clickToElement(LOGIN_BTN);
		return PageFactory.initElements(driver, HomePage.class);
	}

}
