package com.bankguru.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.CommonFunctions;

public class NewCustomerPage extends CommonFunctions {

	public NewCustomerPage(WebDriver driver) {
		super(driver);
	}

//	public static String CUSTOMERNAME_TXT = "//input[@name='name']";
	@FindBy(name = "name")
	WebElement CUSTOMERNAME_TXT;

//	public static String CUSTOMERNAME_ERRORMESSAGE_LBL = "//label[@id='message' and contains(@style,'visibil')]";
	@FindBy(xpath = "//label[@id='message' and contains(@style,'visibil')]")
	WebElement CUSTOMERNAME_ERRORMESSAGE_LBL;

	// NC05
//	public static String ADDRESS_TXT = "//textarea[@name='addr']";
	@FindBy(name = "addr")
	WebElement ADDRESS_TXT;

//	public static String ADDRESS_ERRORMESSAGE_LBL = "//label[@id='message3' and contains(@style,'visibil')]";
	@FindBy(xpath = "//label[@id='message3' and contains(@style,'visibil')]")
	WebElement ADDRESS_ERRORMESSAGE_LBL;

	// NC08
//	public static String CITY_TXT = "//input[@name='city']";
	@FindBy(name = "city")
	WebElement CITY_TXT;

//	public static String CITY_ERRORMESSAGE_LBL = "//label[@id='message4' and contains(@style,'visibil')]";
	@FindBy(xpath = "//label[@id='message4' and contains(@style,'visibil')]")
	WebElement CITY_ERRORMESSAGE_LBL;

	// NC12
//	public static String STATE_TXT = "//input[@name='state']";
	@FindBy(name = "state")
	WebElement STATE_TXT;

//	public static String STATE_ERRORMESSAGE_LBL = "//label[@id='message5' and contains(@style,'visibil')]";
	@FindBy(xpath = "//label[@id='message5' and contains(@style,'visibil')]")
	WebElement STATE_ERRORMESSAGE_LBL;

	// NC16
//	public static String PIN_TXT = "//input[@name='pinno']";
	@FindBy(name = "pinno")
	WebElement PIN_TXT;

//	public static String PIN_ERRORMESSAGE_LBL = "//label[@id='message6' and contains(@style,'visibil')]";
	@FindBy(xpath = "//label[@id='message6' and contains(@style,'visibil')]")
	WebElement PIN_ERRORMESSAGE_LBL;

	// NC22
//	public static String MOBILENUMBER_TXT = "//input[@name='telephoneno']";
	@FindBy(name = "telephoneno")
	WebElement MOBILENUMBER_TXT;

//	public static String MOBILENUMBER_ERRORMESSAGE_LBL = "//label[@id='message7' and contains(@style,'visibil')]";
	@FindBy(xpath = "//label[@id='message7' and contains(@style,'visibil')]")
	WebElement MOBILENUMBER_ERRORMESSAGE_LBL;

	// NC26
//	public static String EMAIL_TXT = "//input[@name='emailid']";
	@FindBy(name = "emailid")
	WebElement EMAIL_TXT;

//	public static String EMAIL_ERRORMESSAGE_LBL = "//label[@id='message9' and contains(@style,'visibil')]";
	@FindBy(xpath = "//label[@id='message9' and contains(@style,'visibil')]")
	WebElement EMAIL_ERRORMESSAGE_LBL;

	// NC30
//	public static String CUSTOMERNAME_LBL = "//input[@name='name']//../preceding-sibling::td";
	@FindBy(xpath = "//input[@name='name']//../preceding-sibling::td")
	WebElement CUSTOMERNAME_LBL;

//	public static String ADDRESS_LBL = "//textarea[@name='addr']//../preceding-sibling::td";
	@FindBy(xpath = "//textarea[@name='addr']//../preceding-sibling::td")
	WebElement ADDRESS_LBL;

//	public static String CITY_LBL = "//input[@name='city']//../preceding-sibling::td";
	@FindBy(xpath = "//input[@name='city']//../preceding-sibling::td")
	WebElement CITY_LBL;

//	public static String STATE_LBL = "//input[@name='state']//../preceding-sibling::td";
	@FindBy(xpath = "//input[@name='state']//../preceding-sibling::td")
	WebElement STATE_LBL;

//	public static String PIN_LBL = "//input[@name='pinno']//../preceding-sibling::td";
	@FindBy(xpath = "//input[@name='pinno']//../preceding-sibling::td")
	WebElement PIN_LBL;

//	public static String MOBILENUMBER_LBL = "//input[@name='telephoneno']//../preceding-sibling::td";
	@FindBy(xpath = "//input[@name='telephoneno']//../preceding-sibling::td")
	WebElement MOBILENUMBER_LBL;

//	public static String EMAIL_LBL = "//input[@name='emailid']//../preceding-sibling::td";
	@FindBy(xpath = "//input[@name='emailid']//../preceding-sibling::td")
	WebElement EMAIL_LBL;

//	public static String GENDERMALE_RBTN = "//input[@value='m']";
	@FindBy(xpath = "//input[@value='m']")
	WebElement GENDERMALE_RBTN;

//	public static String GENDERFEMALE_RBTN = "//input[@value='f']";
	@FindBy(xpath = "//input[@value='f']")
	WebElement GENDERFEMALE_RBTN;

//	public static String DATEOFBIRTH_DDL = "//input[@id='dob']";
	@FindBy(id = "dob")
	WebElement DATEOFBIRTH_DDL;

//	public static String PASSWORD_TXT = "//input[@name='password']";
	@FindBy(name = "password")
	WebElement PASSWORD_TXT;

//	public static String SUBMIT_BTN = "//input[@value='Submit']";
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement SUBMIT_BTN;

//	public static String CUSTOMERIDVALUE_LBL = "//td[text()='Customer ID']/following-sibling::td";
	@FindBy(xpath = "//td[text()='Customer ID']/following-sibling::td")
	WebElement CUSTOMERIDVALUE_LBL;

	// NC01 Test Step
	public void inputTabCustomerName() {
		waitForElemenVisible(CUSTOMERNAME_TXT);
		sendKeyPress(CUSTOMERNAME_TXT, Keys.TAB);

	}

	// NC04 Test Step
	public void inputSpaceCustomerName() {
		waitForElemenVisible(CUSTOMERNAME_TXT);
//		WebElement webl = driver.findElement(By.xpath(CUSTOMERNAME_TXT));		 
//		JavascriptExecutor js = (JavascriptExecutor)driver;		 
//		js.executeScript("arguments[0].value=  ' ';", webl); // 'text'
		waitForElemenVisible(CUSTOMERNAME_TXT);
		sendKeyPress(CUSTOMERNAME_TXT, Keys.SPACE);
	}
//	public void inputKeyCustomerName(Keys key) {
//		waitForElemenVisible(CITY_TXT);
//		WebElement webl = driver.findElement(By.xpath(CUSTOMERNAME_TXT));		 
//		JavascriptExecutor js = (JavascriptExecutor)driver;		 
//		js.executeScript("arguments[0].value =  '" + key + "';", webl); // 'text'	
//	}

	// NC02 - 03 Test Step
	public void inputCustomerName(String value) {
		waitForElemenVisible(CUSTOMERNAME_TXT);
		inputElement(CUSTOMERNAME_TXT, value);
	}

	// NC01-04 Expected Result
	public String getCustomerNameErrorMessage() {
		waitForElemenVisible(CUSTOMERNAME_ERRORMESSAGE_LBL);
		return getTextElement(CUSTOMERNAME_ERRORMESSAGE_LBL);
	}

	// NC05 - 06 Test Steps
	public void inputKeyIntoAddress(Keys key) {
		waitForElemenVisible(ADDRESS_TXT);
		sendKeyPress(ADDRESS_TXT, key);
	}

	// NC05-06 Expected Result
	public String getAddressErrorMessage() {
		waitForElemenVisible(ADDRESS_ERRORMESSAGE_LBL);
		return getTextElement(ADDRESS_ERRORMESSAGE_LBL);
	}

	// NC08, 11 Test Steps
	public void inputKeyCity(Keys key) {
		waitForElemenVisible(CITY_TXT);
		sendKeyPress(CITY_TXT, key);
	}

	// NC09, 10 Test Steps
	public void inputCity(String value) {
		waitForElemenVisible(CITY_TXT);
		inputElement(CITY_TXT, value);
	}

	// NC08-11 Expected Result
	public String getCityErrorMessage() {
		waitForElemenVisible(CITY_ERRORMESSAGE_LBL);
		return getTextElement(CITY_ERRORMESSAGE_LBL);
	}

	// NC12, 15 Test Steps
	public void inputKeyState(Keys key) {
		waitForElemenVisible(STATE_TXT);
		sendKeyPress(STATE_TXT, key);
	}

	// NC13, 14 Test Steps
	public void inputState(String value) {
		waitForElemenVisible(STATE_TXT);
		inputElement(STATE_TXT, value);
	}

	// NC12-15 Expected Result
	public String getStateErrorMessage() {
		waitForElemenVisible(STATE_ERRORMESSAGE_LBL);
		return getTextElement(STATE_ERRORMESSAGE_LBL);
	}

	// NC16, 18_1, 18_2, 19
	public void inputPIN(String value) {
		waitForElemenVisible(PIN_TXT);
		inputElement(PIN_TXT, value);
	}

	// NC17, 20
	public void inputKeyPIN(Keys key) {
		waitForElemenVisible(PIN_TXT);
		sendKeyPress(PIN_TXT, key);
	}

	// NC16-21 Expected Result
	public String getPINErrorMessage() {
		waitForElemenVisible(PIN_ERRORMESSAGE_LBL);
		return getTextElement(PIN_ERRORMESSAGE_LBL);
	}

	// NC22, 25 Test Steps
	public void inputKeyTelephone(Keys key) {
		waitForElemenVisible(MOBILENUMBER_TXT);
		sendKeyPress(MOBILENUMBER_TXT, key);
	}

	// N23, 24 Test Steps
	public void inputTelephone(String value) {
		waitForElemenVisible(MOBILENUMBER_TXT);
		inputElement(MOBILENUMBER_TXT, value);
	}

	// NC22-25 Expected Result
	public String getTelephoneErrorMessage() {
		waitForElemenVisible(MOBILENUMBER_ERRORMESSAGE_LBL);
		return getTextElement(MOBILENUMBER_ERRORMESSAGE_LBL);
	}

	// NC26, 29 Test Steps
	public void inputKeyEmail(Keys key) {
		waitForElemenVisible(EMAIL_TXT);
		sendKeyPress(EMAIL_TXT, key);
	}

	// N27 Test Steps
	public void inputEmail(String value) {
		waitForElemenVisible(EMAIL_TXT);
		inputElement(EMAIL_TXT, value);
	}

	// NC26, 27, 29 Expected Result
	public String getEmailErrorMessage() {
		waitForElemenVisible(EMAIL_ERRORMESSAGE_LBL);
		return getTextElement(EMAIL_ERRORMESSAGE_LBL);
	}

	// NC30
	public String getCustomerLable() {
		waitForElemenVisible(CUSTOMERNAME_LBL);
		return getTextElement(CUSTOMERNAME_LBL);
	}

	public String getAddressLable() {
		waitForElemenVisible(ADDRESS_LBL);
		return getTextElement(ADDRESS_LBL);
	}

	public String getCityLable() {
		waitForElemenVisible(CITY_LBL);
		return getTextElement(CITY_LBL);
	}

	public String getStateLable() {
		waitForElemenVisible(STATE_LBL);
		return getTextElement(STATE_LBL);
	}

	public String getPinLable() {
		waitForElemenVisible(PIN_LBL);
		return getTextElement(PIN_LBL);
	}

	public String getMobileLable() {
		waitForElemenVisible(MOBILENUMBER_LBL);
		return getTextElement(MOBILENUMBER_LBL);
	}

	public String getEmailLable() {
		waitForElemenVisible(EMAIL_LBL);
		return getTextElement(EMAIL_LBL);
	}

	//
	public void inputAddress(String value) {
		waitForElemenVisible(ADDRESS_TXT);
		inputElement(ADDRESS_TXT, value);
	}

	public void selectGender(String value) {
		waitForElemenVisible(GENDERMALE_RBTN);
		if (value == "male") {
			clickToElement(GENDERMALE_RBTN);
		} else
			clickToElement(GENDERFEMALE_RBTN);

	}

	public void inputDateOfBirth(String value) {
		waitForElemenVisible(DATEOFBIRTH_DDL);
		removeAttributeElement(DATEOFBIRTH_DDL, "type");
//		removeAttributeElement("input#dob", "type");
		inputElement(DATEOFBIRTH_DDL, value);
	}

	public void inputPassword(String value) {
		waitForElemenVisible(PASSWORD_TXT);
		inputElement(PASSWORD_TXT, value);
	}

	public void clickSubmit() {
		waitForElemenVisible(SUBMIT_BTN);
		clickToElement(SUBMIT_BTN);
	}

	public String getCustomerID() {
		waitForElemenVisible(CUSTOMERIDVALUE_LBL);
		return getTextElement(CUSTOMERIDVALUE_LBL);
	}
}
