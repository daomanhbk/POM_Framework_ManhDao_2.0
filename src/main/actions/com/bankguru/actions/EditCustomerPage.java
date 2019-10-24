package com.bankguru.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.CommonFunctions;

public class EditCustomerPage extends CommonFunctions {

	public EditCustomerPage(WebDriver driver) {
		super(driver);
	}

//	public static String CUSTOMERNAME_TXT = "//input[@name='cusid']";
	@FindBy(name = "cusid")
	WebElement CUSTOMERNAME_TXT;
	
//	public static String CUSTOMERNAME_ERRORMESSAGE_LBL = "//label[@id='message14']";
	@FindBy(id = "message14")
	WebElement CUSTOMERNAME_ERRORMESSAGE_LBL;
	
//
//	public static String SUBMIT_BTN = "//input[@name='AccSubmit']";
	@FindBy(name = "AccSubmit")
	WebElement SUBMIT_BTN;
//
//	// EC
//	public static String ADDRESS_TXT = "//textarea[@name='addr']";
	@FindBy(name = "addr")
	WebElement ADDRESS_TXT;
	
//	public static String ADDRESS_ERRORMESSAGE_LBL = "//label[@id='message3']";
	@FindBy(id = "message3")
	WebElement ADDRESS_ERRORMESSAGE_LBL;
//
//	// EC
//	public static String CITY_TXT = "//input[@name='city']";
	@FindBy(name = "city")
	WebElement CITY_TXT;
	
//	public static String CITY_ERRORMESSAGE_LBL = "//label[@id='message4']";
	@FindBy(id = "message4")
	WebElement CITY_ERRORMESSAGE_LBL;
//
//	// EC
//	public static String STATE_TXT = "//input[@name='state']";
	@FindBy(name = "state")
	WebElement STATE_TXT;
	
//	public static String STATE_ERRORMESSAGE_LBL = "//label[@id='message5']";
	@FindBy(id = "message5")
	WebElement STATE_ERRORMESSAGE_LBL;
//
//	// EC
//	public static String PIN_TXT = "//input[@name='pinno']";
	@FindBy(name = "pinno")
	WebElement PIN_TXT;
	
//	public static String PIN_ERRORMESSAGE_LBL = "//label[@id='message6']";
	@FindBy(id = "message6")
	WebElement PIN_ERRORMESSAGE_LBL;
	
//
//	// EC
//	public static String MOBILENUMBER_TXT = "//input[@name='telephoneno']";
	@FindBy(name = "telephoneno")
	WebElement MOBILENUMBER_TXT;
	
//	public static String MOBILENUMBER_ERRORMESSAGE_LBL = "//label[@id='message7']";
	@FindBy(id = "message7")
	WebElement MOBILENUMBER_ERRORMESSAGE_LBL;
//
//	// EC
//	public static String EMAIL_TXT = "//input[@name='emailid']";
	@FindBy(name = "emailid")
	WebElement EMAIL_TXT;
	
//	public static String EMAIL_ERRORMESSAGE_LBL = "//label[@id='message9']";
	@FindBy(id = "message9")
	WebElement EMAIL_ERRORMESSAGE_LBL;
	
//	public static String EDITCUSTOMER_LBL = "//p[@class='heading3']";
	@FindBy(className = "heading3")
	WebElement EDITCUSTOMER_LBL;

	// EC01 Test Step
	public void inputKeysIntoCustomerID(Keys key) {
		waitForElemenVisible(CUSTOMERNAME_TXT);
		sendKeyPress(CUSTOMERNAME_TXT, key);

	}

	// EC02 - 04 Test Step
	public void inputCustomerID(String value) {
		waitForElemenVisible(CUSTOMERNAME_TXT);
		inputElement(CUSTOMERNAME_TXT, value);
	}

	// EC04 Test Step
	public void clickSumbit() {
		waitForElemenVisible(SUBMIT_BTN);
		clickToElement(SUBMIT_BTN);
	}

	// EC01-04 Expected Result
	public String getCustomerIdErrorMessage() {
		waitForElemenVisible(CUSTOMERNAME_ERRORMESSAGE_LBL);
		return getTextElement(CUSTOMERNAME_ERRORMESSAGE_LBL);
	}

	public String getEditCustomerHeading() {
		waitForElemenVisible(EDITCUSTOMER_LBL);
		return getTextElement(EDITCUSTOMER_LBL);
	}

	// Skip EC05 - EC07 because the Edit Page does not allow to edit Name Field

	// EC08 Test Steps
	public void clearAddress() {
		waitForElemenVisible(ADDRESS_TXT);
		clearElement(ADDRESS_TXT);
	}

	public void inputKeyIntoAddress(Keys key) {
		waitForElemenVisible(ADDRESS_TXT);
		sendKeyPress(ADDRESS_TXT, key);
	}

	// EC08 Expected Result
	public String getAddressErrorMessage() {
		waitForElemenVisible(ADDRESS_ERRORMESSAGE_LBL);
		return getTextElement(ADDRESS_ERRORMESSAGE_LBL);
	}

	// EC09 Test Steps
	public void clearCity() {
		waitForElemenVisible(CITY_TXT);
		clearElement(CITY_TXT);
	}

	public void inputKeyCity(Keys key) {
		waitForElemenVisible(CITY_TXT);
		sendKeyPress(CITY_TXT, key);
	}

	// EC10, 11 Test Steps
	public void inputCity(String value) {
		waitForElemenVisible(CITY_TXT);
		inputElement(CITY_TXT, value);
	}

	// EC09-11 Expected Result
	public String getCityErrorMessage() {
		waitForElemenVisible(CITY_ERRORMESSAGE_LBL);
		return getTextElement(CITY_ERRORMESSAGE_LBL);
	}

	// EC12 Test Steps
	public void clearState() {
		waitForElemenVisible(STATE_TXT);
		clearElement(STATE_TXT);
	}

	public void inputKeyState(Keys key) {
		waitForElemenVisible(STATE_TXT);
		sendKeyPress(STATE_TXT, key);
	}

	// EC13, 14 Test Steps
	public void inputState(String value) {
		waitForElemenVisible(STATE_TXT);
		inputElement(STATE_TXT, value);
	}

	// EC12-14 Expected Result
	public String getStateErrorMessage() {
		waitForElemenVisible(STATE_ERRORMESSAGE_LBL);
		return getTextElement(STATE_ERRORMESSAGE_LBL);
	}

	// EC15, 17_1, 17_2, 18
	public void clearPIN() {
		waitForElemenVisible(PIN_TXT);
		clearElement(PIN_TXT);
	}

	public void inputPIN(String value) {
		waitForElemenVisible(PIN_TXT);
		inputElement(PIN_TXT, value);
	}

	// EC16
	public void inputKeyPIN(Keys key) {
		waitForElemenVisible(PIN_TXT);
		sendKeyPress(PIN_TXT, key);
	}

	// EC15-18 Expected Result
	public String getPINErrorMessage() {
		waitForElemenVisible(PIN_ERRORMESSAGE_LBL);
		return getTextElement(PIN_ERRORMESSAGE_LBL);
	}

	// EC19 Test Steps

	public void clearMobileNumber() {
		waitForElemenVisible(MOBILENUMBER_TXT);
		clearElement(MOBILENUMBER_TXT);
	}

	public void inputKeyTelephone(Keys key) {
		waitForElemenVisible(MOBILENUMBER_TXT);
		sendKeyPress(MOBILENUMBER_TXT, key);
	}

	// EC20 Test Steps
	public void inputTelephone(String value) {
		waitForElemenVisible(MOBILENUMBER_TXT);
		inputElement(MOBILENUMBER_TXT, value);
	}

	// EC19-20 Expected Result
	public String getTelephoneErrorMessage() {
		waitForElemenVisible(MOBILENUMBER_ERRORMESSAGE_LBL);
		return getTextElement(MOBILENUMBER_ERRORMESSAGE_LBL);
	}

	// EC21 Test Steps
	public void clearEmail() {
		waitForElemenVisible(EMAIL_TXT);
		clearElement(EMAIL_TXT);
	}

	public void inputKeyEmail(Keys key) {
		waitForElemenVisible(EMAIL_TXT);
		sendKeyPress(EMAIL_TXT, key);
	}

	// EC22 Test Steps
	public void inputEmail(String value) {
		waitForElemenVisible(EMAIL_TXT);
		inputElement(EMAIL_TXT, value);
	}

	// EC22 Expected Result
	public String getEmailErrorMessage() {
		waitForElemenVisible(EMAIL_ERRORMESSAGE_LBL);
		return getTextElement(EMAIL_ERRORMESSAGE_LBL);
	}

}
