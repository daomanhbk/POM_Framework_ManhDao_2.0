package com.bankguru.actions;

//import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.ui.LogInPageUI;

import Common.CommonFunctions;

public class LogInPage extends CommonFunctions{

	public LogInPage(WebDriver driver) {
		super(driver);		
	}
	
//	public void clickHereLink() {
//		waitForElemenVisible(LogInPageUI.HERE_LBL);
//		clickToElement(LogInPageUI.HERE_LBL);
//	} 	
	
	public RegisterPage clickHereLink() {
		waitForElemenVisible(LogInPageUI.HERE_LBL);
		clickToElement(LogInPageUI.HERE_LBL);
		return PageFactory.initElements(driver, RegisterPage.class);
	}
	
	public void inputUserID(String value) {
		waitForElemenVisible(LogInPageUI.USERID_TXT);		
		inputElement(LogInPageUI.USERID_TXT, value);
	}
	
	public void inputPassword(String value) {
		waitForElemenVisible(LogInPageUI.PASSWORD_TXT);		
		inputElement(LogInPageUI.PASSWORD_TXT, value);
	}
	
//	public void clickLogin() {
//		waitForElemenVisible(LogInPageUI.LOGIN_BTN);		
//		clickToElement(LogInPageUI.LOGIN_BTN);
//	}
	
	public HomePage clickLogin() {
		waitForElemenVisible(LogInPageUI.LOGIN_BTN);		
		clickToElement(LogInPageUI.LOGIN_BTN);
		return PageFactory.initElements(driver, HomePage.class);
	}
	

	
}
