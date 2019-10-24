package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.CommonFunctions;

public class RegisterPage extends CommonFunctions {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
//	public static String EMAIL_TXT = "//input[@name='emailid']";
	@FindBy(name = "emailid")
	WebElement EMAIL_TXT;
	
//	public static String SUBMIT_BTN = "//input[@name='btnLogin']";
	@FindBy(name = "btnLogin")
	WebElement SUBMIT_BTN;
	
//	public static String USER_LBL = "//td[contains(text(),'User')]/following-sibling::td";
	@FindBy(xpath =  "//td[contains(text(),'User')]/following-sibling::td")
	WebElement USER_LBL;
	
//	public static String PASSWORD_LBL = "//td[contains(text(),'Password')]/following-sibling::td";
	@FindBy(xpath =  "//td[contains(text(),'Password :')]/following-sibling::td")
	WebElement PASSWORD_LBL;
	
	
	public void inputEmail(String value) {
		waitForElemenVisible(EMAIL_TXT);
		inputElement(EMAIL_TXT, value);		
		
	}
	
	public void clickSubmit() {
		waitForElemenVisible(SUBMIT_BTN);
		clickToElement(SUBMIT_BTN);
	}
	
	public String getUserName() {
		waitForElemenVisible(USER_LBL);
		return getTextElement(USER_LBL);
	}
	
	public String getPassword() {
		waitForElemenVisible(PASSWORD_LBL);
		return getTextElement(PASSWORD_LBL);
	}
	
//	public void logInBankURL(String url) {
//		openUrl(url);
//	}
	
	public LogInPage logInBankURL(String url) {
		openUrl(url);
		return PageFactory.initElements(driver, LogInPage.class);
	}

}
