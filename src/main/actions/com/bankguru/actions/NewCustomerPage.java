package com.bankguru.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import com.bankguru.ui.RegisterPageUI;
import com.bankguru.ui.NewCustomerPageUI;

import Common.CommonFunctions;

public class NewCustomerPage extends CommonFunctions{

	public NewCustomerPage(WebDriver driver) {
		super(driver);		
	}
	//NC01 Test Step
	public void inputTabCustomerName() {
		waitForElemenVisible(NewCustomerPageUI.CUSTOMERNAME_TXT);
		sendKeyPress(NewCustomerPageUI.CUSTOMERNAME_TXT, Keys.TAB);
		
	}	
	//NC04 Test Step
	public void inputSpaceCustomerName() {
		waitForElemenVisible(NewCustomerPageUI.CUSTOMERNAME_TXT);
//		WebElement webl = driver.findElement(By.xpath(NewCustomerPageUI.CUSTOMERNAME_TXT));		 
//		JavascriptExecutor js = (JavascriptExecutor)driver;		 
//		js.executeScript("arguments[0].value=  ' ';", webl); // 'text'
		waitForElemenVisible(NewCustomerPageUI.CUSTOMERNAME_TXT);
		sendKeyPress(NewCustomerPageUI.CUSTOMERNAME_TXT, Keys.SPACE);		
	}
//	public void inputKeyCustomerName(Keys key) {
//		waitForElemenVisible(NewCustomerPageUI.CITY_TXT);
//		WebElement webl = driver.findElement(By.xpath(NewCustomerPageUI.CUSTOMERNAME_TXT));		 
//		JavascriptExecutor js = (JavascriptExecutor)driver;		 
//		js.executeScript("arguments[0].value =  '" + key + "';", webl); // 'text'	
//	}
	
	//NC02 - 03  Test Step
	public void inputCustomerName(String value) {
		waitForElemenVisible(NewCustomerPageUI.CUSTOMERNAME_TXT);
		inputElement(NewCustomerPageUI.CUSTOMERNAME_TXT, value);
	}	
	//NC01-04 Expected Result
	public String getCustomerNameErrorMessage() {
		waitForElemenVisible(NewCustomerPageUI.CUSTOMERNAME_ERRORMESSAGE_LBL);
		return getTextElement(NewCustomerPageUI.CUSTOMERNAME_ERRORMESSAGE_LBL);
	}
	
	//NC05 - 06 Test Steps
	public void inputKeyIntoAddress(Keys key) {
		waitForElemenVisible(NewCustomerPageUI.ADDRESS_TXT);
		sendKeyPress(NewCustomerPageUI.ADDRESS_TXT, key);		
	}

	
	//NC05-06 Expected Result
	public String getAddressErrorMessage() {
		waitForElemenVisible(NewCustomerPageUI.ADDRESS_ERRORMESSAGE_LBL);
		return getTextElement(NewCustomerPageUI.ADDRESS_ERRORMESSAGE_LBL);
	}
	
	
	//NC08, 11 Test Steps
	public void inputKeyCity(Keys key) {
		waitForElemenVisible(NewCustomerPageUI.CITY_TXT);
		sendKeyPress(NewCustomerPageUI.CITY_TXT, key);		
	}
	//NC09, 10  Test Steps
	public void inputCity(String value) {
		waitForElemenVisible(NewCustomerPageUI.CITY_TXT);
		inputElement(NewCustomerPageUI.CITY_TXT, value);
	}	
	//NC08-11 Expected Result
	public String getCityErrorMessage() {
		waitForElemenVisible(NewCustomerPageUI.CITY_ERRORMESSAGE_LBL);
		return getTextElement(NewCustomerPageUI.CITY_ERRORMESSAGE_LBL);
	}
	
	//NC12, 15 Test Steps
	public void inputKeyState(Keys key) {
		waitForElemenVisible(NewCustomerPageUI.STATE_TXT);
		sendKeyPress(NewCustomerPageUI.STATE_TXT, key);		
	}
	//NC13, 14  Test Steps
	public void inputState(String value) {
		waitForElemenVisible(NewCustomerPageUI.STATE_TXT);
		inputElement(NewCustomerPageUI.STATE_TXT, value);
	}	
	//NC12-15 Expected Result
	public String getStateErrorMessage() {
		waitForElemenVisible(NewCustomerPageUI.STATE_ERRORMESSAGE_LBL);
		return getTextElement(NewCustomerPageUI.STATE_ERRORMESSAGE_LBL);
	}
	
	//NC16, 18_1, 18_2, 19
	public void inputPIN(String value) {
		waitForElemenVisible(NewCustomerPageUI.PIN_TXT);
		inputElement(NewCustomerPageUI.PIN_TXT, value);
	}	
	
	//NC17, 20
	public void inputKeyPIN(Keys key) {
		waitForElemenVisible(NewCustomerPageUI.PIN_TXT);
		sendKeyPress(NewCustomerPageUI.PIN_TXT, key);		
	}
	
	//NC16-21 Expected Result
	public String getPINErrorMessage() {
		waitForElemenVisible(NewCustomerPageUI.PIN_ERRORMESSAGE_LBL);
		return getTextElement(NewCustomerPageUI.PIN_ERRORMESSAGE_LBL);
	}
	
	//NC22, 25 Test Steps
	public void inputKeyTelephone(Keys key) {
		waitForElemenVisible(NewCustomerPageUI.MOBILENUMBER_TXT);
		sendKeyPress(NewCustomerPageUI.MOBILENUMBER_TXT, key);		
	}
	//N23, 24  Test Steps
	public void inputTelephone(String value) {
		waitForElemenVisible(NewCustomerPageUI.MOBILENUMBER_TXT);
		inputElement(NewCustomerPageUI.MOBILENUMBER_TXT, value);
	}	
	//NC22-25 Expected Result
	public String getTelephoneErrorMessage() {
		waitForElemenVisible(NewCustomerPageUI.MOBILENUMBER_ERRORMESSAGE_LBL);
		return getTextElement(NewCustomerPageUI.MOBILENUMBER_ERRORMESSAGE_LBL);
	}
	
	//NC26, 29 Test Steps
	public void inputKeyEmail(Keys key) {
		waitForElemenVisible(NewCustomerPageUI.EMAIL_TXT);
		sendKeyPress(NewCustomerPageUI.EMAIL_TXT, key);		
	}
	//N27  Test Steps
	public void inputEmail(String value) {
		waitForElemenVisible(NewCustomerPageUI.EMAIL_TXT);
		inputElement(NewCustomerPageUI.EMAIL_TXT, value);
	}	
	//NC26, 27, 29 Expected Result
	public String getEmailErrorMessage() {
		waitForElemenVisible(NewCustomerPageUI.EMAIL_ERRORMESSAGE_LBL);
		return getTextElement(NewCustomerPageUI.EMAIL_ERRORMESSAGE_LBL);
	}
	
	//NC30
	public String getCustomerLable() {
		waitForElemenVisible(NewCustomerPageUI.CUSTOMERNAME_LBL);
		return getTextElement(NewCustomerPageUI.CUSTOMERNAME_LBL);
	}
	
	public String getAddressLable() {
		waitForElemenVisible(NewCustomerPageUI.ADDRESS_LBL);
		return getTextElement(NewCustomerPageUI.ADDRESS_LBL);
	}
	
	public String getCityLable() {
		waitForElemenVisible(NewCustomerPageUI.CITY_LBL);
		return getTextElement(NewCustomerPageUI.CITY_LBL);
	}
	
	public String getStateLable() {
		waitForElemenVisible(NewCustomerPageUI.STATE_LBL);
		return getTextElement(NewCustomerPageUI.STATE_LBL);
	}
	
	public String getPinLable() {
		waitForElemenVisible(NewCustomerPageUI.PIN_LBL);
		return getTextElement(NewCustomerPageUI.PIN_LBL);
	}
	
	public String getMobileLable() {
		waitForElemenVisible(NewCustomerPageUI.MOBILENUMBER_LBL);
		return getTextElement(NewCustomerPageUI.MOBILENUMBER_LBL);
	}
	
	public String getEmailLable() {
		waitForElemenVisible(NewCustomerPageUI.EMAIL_LBL);
		return getTextElement(NewCustomerPageUI.EMAIL_LBL);
	}
	
	//
	public void inputAddress(String value) {
		waitForElemenVisible(NewCustomerPageUI.ADDRESS_TXT);
		inputElement(NewCustomerPageUI.ADDRESS_TXT, value);		
	}
	public void selectGender(String value) {
		waitForElemenVisible(NewCustomerPageUI.GENDERMALE_RBTN);
		if (value == "male") {
			clickToElement(NewCustomerPageUI.GENDERMALE_RBTN);	
		} else clickToElement(NewCustomerPageUI.GENDERFEMALE_RBTN);
		
	}
	
	public void inputDateOfBirth(String value) {
		waitForElemenVisible(NewCustomerPageUI.DATEOFBIRTH_DDL);
		removeAttributeElement(NewCustomerPageUI.DATEOFBIRTH_DDL, "type");
//		removeAttributeElement("input#dob", "type");
		inputElement(NewCustomerPageUI.DATEOFBIRTH_DDL, value);	
	}
	public void inputPassword(String value) {
		waitForElemenVisible(NewCustomerPageUI.PASSWORD_TXT);
		inputElement(NewCustomerPageUI.PASSWORD_TXT, value);	
	}
	public void clickSubmit() {
		waitForElemenVisible(NewCustomerPageUI.SUBMIT_BTN);
		clickToElement(NewCustomerPageUI.SUBMIT_BTN);	
	}
	
	public String getCustomerID() {
		waitForElemenVisible(NewCustomerPageUI.CUSTOMERIDVALUE_LBL); 
		return getTextElement(NewCustomerPageUI.CUSTOMERIDVALUE_LBL);
	}
}
