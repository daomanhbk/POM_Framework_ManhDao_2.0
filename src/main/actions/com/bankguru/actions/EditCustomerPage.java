package com.bankguru.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.bankguru.ui.EditCustomerPageUI;
//import com.bankguru.ui.RegisterPageUI;
//import com.bankguru.ui.NewCustomerPageUI;

import Common.CommonFunctions;

public class EditCustomerPage extends CommonFunctions{

	public EditCustomerPage(WebDriver driver) {
		super(driver);		
	}
	//EC01 Test Step
	public void inputKeysIntoCustomerID(Keys key) {
		waitForElemenVisible(EditCustomerPageUI.CUSTOMERNAME_TXT);
		sendKeyPress(EditCustomerPageUI.CUSTOMERNAME_TXT, key);
		
	}	

	//EC02 - 04  Test Step
	public void inputCustomerID(String value) {
		waitForElemenVisible(EditCustomerPageUI.CUSTOMERNAME_TXT);
		inputElement(EditCustomerPageUI.CUSTOMERNAME_TXT, value);
	}	
	//EC04  Test Step
	public void clickSumbit() {
		waitForElemenVisible(EditCustomerPageUI.SUBMIT_BTN);
		clickToElement(EditCustomerPageUI.SUBMIT_BTN);
	}
	
	//EC01-04 Expected Result
	public String getCustomerIdErrorMessage() {
		waitForElemenVisible(EditCustomerPageUI.CUSTOMERNAME_ERRORMESSAGE_LBL);
		return getTextElement(EditCustomerPageUI.CUSTOMERNAME_ERRORMESSAGE_LBL);
	}
	
	public String getEditCustomerHeading() {
		waitForElemenVisible(EditCustomerPageUI.EDITCUSTOMER_LBL);
		return getTextElement(EditCustomerPageUI.EDITCUSTOMER_LBL);
	}

	//Skip EC05 - EC07 because the Edit Page does not allow to edit Name Field
	
	//EC08 Test Steps
	public void clearAddress() {
		waitForElemenVisible(EditCustomerPageUI.ADDRESS_TXT);
		clearElement(EditCustomerPageUI.ADDRESS_TXT);		
	}
	
	public void inputKeyIntoAddress(Keys key) {
		waitForElemenVisible(EditCustomerPageUI.ADDRESS_TXT);
		sendKeyPress(EditCustomerPageUI.ADDRESS_TXT, key);		
	}
	
	//EC08 Expected Result
	public String getAddressErrorMessage() {
		waitForElemenVisible(EditCustomerPageUI.ADDRESS_ERRORMESSAGE_LBL);
		return getTextElement(EditCustomerPageUI.ADDRESS_ERRORMESSAGE_LBL);
	}
	
	
	//EC09 Test Steps
	public void clearCity() {
		waitForElemenVisible(EditCustomerPageUI.CITY_TXT);
		clearElement(EditCustomerPageUI.CITY_TXT);		
	}
	
	public void inputKeyCity(Keys key) {
		waitForElemenVisible(EditCustomerPageUI.CITY_TXT);
		sendKeyPress(EditCustomerPageUI.CITY_TXT, key);		
	}
	//EC10, 11  Test Steps
	public void inputCity(String value) {
		waitForElemenVisible(EditCustomerPageUI.CITY_TXT);
		inputElement(EditCustomerPageUI.CITY_TXT, value);
	}	
	//EC09-11 Expected Result
	public String getCityErrorMessage() {
		waitForElemenVisible(EditCustomerPageUI.CITY_ERRORMESSAGE_LBL);
		return getTextElement(EditCustomerPageUI.CITY_ERRORMESSAGE_LBL);
	}
	
	//EC12 Test Steps
	public void clearState() {
		waitForElemenVisible(EditCustomerPageUI.STATE_TXT);
		clearElement(EditCustomerPageUI.STATE_TXT);		
	}
	
	public void inputKeyState(Keys key) {
		waitForElemenVisible(EditCustomerPageUI.STATE_TXT);
		sendKeyPress(EditCustomerPageUI.STATE_TXT, key);		
	}
	//EC13, 14  Test Steps
	public void inputState(String value) {
		waitForElemenVisible(EditCustomerPageUI.STATE_TXT);
		inputElement(EditCustomerPageUI.STATE_TXT, value);
	}	
	//EC12-14 Expected Result
	public String getStateErrorMessage() {
		waitForElemenVisible(EditCustomerPageUI.STATE_ERRORMESSAGE_LBL);
		return getTextElement(EditCustomerPageUI.STATE_ERRORMESSAGE_LBL);
	}
	
	//EC15, 17_1, 17_2, 18
	public void clearPIN() {
		waitForElemenVisible(EditCustomerPageUI.PIN_TXT);
		clearElement(EditCustomerPageUI.PIN_TXT);		
	}
	
	public void inputPIN(String value) {
		waitForElemenVisible(EditCustomerPageUI.PIN_TXT);
		inputElement(EditCustomerPageUI.PIN_TXT, value);
	}	
	
	//EC16
	public void inputKeyPIN(Keys key) {
		waitForElemenVisible(EditCustomerPageUI.PIN_TXT);
		sendKeyPress(EditCustomerPageUI.PIN_TXT, key);		
	}
	
	//EC15-18 Expected Result
	public String getPINErrorMessage() {
		waitForElemenVisible(EditCustomerPageUI.PIN_ERRORMESSAGE_LBL);
		return getTextElement(EditCustomerPageUI.PIN_ERRORMESSAGE_LBL);
	}
	
	//EC19  Test Steps
	
	public void clearMobileNumber() {
		waitForElemenVisible(EditCustomerPageUI.MOBILENUMBER_TXT);
		clearElement(EditCustomerPageUI.MOBILENUMBER_TXT);		
	}
	public void inputKeyTelephone(Keys key) {
		waitForElemenVisible(EditCustomerPageUI.MOBILENUMBER_TXT);
		sendKeyPress(EditCustomerPageUI.MOBILENUMBER_TXT, key);		
	}
	//EC20  Test Steps
	public void inputTelephone(String value) {
		waitForElemenVisible(EditCustomerPageUI.MOBILENUMBER_TXT);
		inputElement(EditCustomerPageUI.MOBILENUMBER_TXT, value);
	}	
	//EC19-20 Expected Result
	public String getTelephoneErrorMessage() {
		waitForElemenVisible(EditCustomerPageUI.MOBILENUMBER_ERRORMESSAGE_LBL);
		return getTextElement(EditCustomerPageUI.MOBILENUMBER_ERRORMESSAGE_LBL);
	}
	
	//EC21 Test Steps
	public void clearEmail() {
		waitForElemenVisible(EditCustomerPageUI.EMAIL_TXT);
		clearElement(EditCustomerPageUI.EMAIL_TXT);		
	}
	
	public void inputKeyEmail(Keys key) {
		waitForElemenVisible(EditCustomerPageUI.EMAIL_TXT);
		sendKeyPress(EditCustomerPageUI.EMAIL_TXT, key);		
	}
	//EC22  Test Steps
	public void inputEmail(String value) {
		waitForElemenVisible(EditCustomerPageUI.EMAIL_TXT);
		inputElement(EditCustomerPageUI.EMAIL_TXT, value);
	}	
	//EC22 Expected Result
	public String getEmailErrorMessage() {
		waitForElemenVisible(EditCustomerPageUI.EMAIL_ERRORMESSAGE_LBL);
		return getTextElement(EditCustomerPageUI.EMAIL_ERRORMESSAGE_LBL);
	}	

}
