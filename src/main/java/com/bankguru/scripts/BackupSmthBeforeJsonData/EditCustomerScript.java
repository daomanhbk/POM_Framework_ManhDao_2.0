package com.bankguru.scripts.BackupSmthBeforeJsonData;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.actions.EditCustomerPage;
import com.bankguru.actions.HomePage;
import com.bankguru.actions.LogInPage;
import com.bankguru.actions.NewCustomerPage;

import Common.CommonTestCase;
import ObjectPageJson.JsonData;

public class EditCustomerScript extends CommonTestCase{
	WebDriver driver;
	LogInPage logInPage;
	HomePage homePage;
	NewCustomerPage newCustomerPage;
	EditCustomerPage editCustomerPage;
	JsonData jsonData;
	String invalidEmail;

	String customerID, numberAndChar, specialCharacter, numeric;
	String customerIdIsRequiredMsg, charactersAreNotAllowedMsg, specialCharactersAreNotAllowedMsg, editCustomerLabel,
	addressFieldMustNotBeBlankMsg, cityFieldMustNotBeBlankMsg, stateMustNotBeBlankMsg, numbersAreNotAllowedMsg,
	pINMustNotBeBlankMsg, pINCodeMustHave6digitsMsg, emailIDIsNotValidMsg, emailMustNotBeBlankMsg, mobileNumberMustNotBeBlankMsg;
	
	@Parameters({"browser","version","url"})
	@BeforeClass
	public void beforeClass(String browser, String version, String url) {
		invalidEmail = "guru99@gmail";
		
		customerIdIsRequiredMsg = "Customer ID is required";
		numberAndChar = "Acc123";
		specialCharacter = "!@#";
		numeric = "1234";
		
		charactersAreNotAllowedMsg = "Characters are not allowed";
		specialCharactersAreNotAllowedMsg = "Special characters are not allowed";
		editCustomerLabel = "Edit Customer";
		addressFieldMustNotBeBlankMsg = "Address Field must not be blank";
		cityFieldMustNotBeBlankMsg = "City Field must not be blank";
		stateMustNotBeBlankMsg = "State must not be blank";
		numbersAreNotAllowedMsg = "Numbers are not allowed";
		pINMustNotBeBlankMsg = "PIN Code must not be blank"; 
		pINCodeMustHave6digitsMsg = "PIN Code must have 6 Digits";
		mobileNumberMustNotBeBlankMsg = "Mobile no must not be blank";
		emailIDIsNotValidMsg = "Email-ID is not valid";
		emailMustNotBeBlankMsg = "Email-ID must not be blank";
		
		driver = openBrowser(browser, version, url);
		String userPath = System.getProperty("user.dir");
		String pathFileJson = userPath.concat("/data/").concat("BankGuru.json");
		jsonData = getDataJson(pathFileJson);
		
		logInTestCase(RegisterScript.username, RegisterScript.password);
		homePage = PageFactory.initElements(driver, HomePage.class);
//		newCustomerPage = homePage.clickNewCustomerButton();
//		addNewCustomer(customerName, address, dateOfBirth, gender, city, state, pin, phone, email, passwordNewCustomer);
		
//		customerID = newCustomerPage.getCustomerID();
//		System.out.println(customerID);
		customerID = NewCustomerScript.customerID;
	}
	@Test
	public void EC01() {
		editCustomerPage = homePage.clickEditCustomerButton();
		editCustomerPage.inputKeysIntoCustomerID(Keys.TAB);
		assertEqualCommon(editCustomerPage.getCustomerIdErrorMessage(), customerIdIsRequiredMsg);
	}
	@Test
	public void EC02() {		
		editCustomerPage = homePage.clickEditCustomerButton();
		editCustomerPage.inputCustomerID(numberAndChar);
		assertEqualCommon(editCustomerPage.getCustomerIdErrorMessage(), charactersAreNotAllowedMsg);
	}
	@Test
	public void EC03() {		
		editCustomerPage = homePage.clickEditCustomerButton();
		editCustomerPage.inputCustomerID(specialCharacter);
		assertEqualCommon(editCustomerPage.getCustomerIdErrorMessage(), specialCharactersAreNotAllowedMsg);
	}
	@Test
	public void EC04() {		
		editCustomerPage = homePage.clickEditCustomerButton();
		editCustomerPage.inputCustomerID(customerID);
		editCustomerPage.clickSumbit();
		assertEqualCommon(editCustomerPage.getEditCustomerHeading(), editCustomerLabel);
	}
	
	@Test
	public void EC08() {		
		editCustomerPage.clearAddress();
		editCustomerPage.inputKeyIntoAddress(Keys.TAB);
		assertEqualCommon(editCustomerPage.getAddressErrorMessage(), addressFieldMustNotBeBlankMsg);
	}
	
	@Test
	public void EC09() {		
		editCustomerPage.clearCity();
		editCustomerPage.inputKeyCity(Keys.TAB);
		assertEqualCommon(editCustomerPage.getCityErrorMessage(), cityFieldMustNotBeBlankMsg);
	}
	
	@Test
	public void EC10() {		
		editCustomerPage.clearCity();
		editCustomerPage.inputCity(numeric);
		assertEqualCommon(editCustomerPage.getCityErrorMessage(), numbersAreNotAllowedMsg);
	}
	
	@Test
	public void EC11() {		
		editCustomerPage.clearCity();
		editCustomerPage.inputCity(specialCharacter);
		assertEqualCommon(editCustomerPage.getCityErrorMessage(), specialCharactersAreNotAllowedMsg);
	}
	
	@Test
	public void EC12() {		
		editCustomerPage.clearState();
		editCustomerPage.inputKeyState(Keys.TAB);
		assertEqualCommon(editCustomerPage.getStateErrorMessage(), stateMustNotBeBlankMsg);
	}
	
	@Test
	public void EC13() {		
		editCustomerPage.clearState();
		editCustomerPage.inputState(numeric);
		assertEqualCommon(editCustomerPage.getStateErrorMessage(), numbersAreNotAllowedMsg);
	}
	
	@Test
	public void EC14() {		
		editCustomerPage.clearState();
		editCustomerPage.inputState(specialCharacter);
		assertEqualCommon(editCustomerPage.getStateErrorMessage(), specialCharactersAreNotAllowedMsg);
	}
	@Test
	public void EC15() {		
		editCustomerPage.clearPIN();
		editCustomerPage.inputPIN(numberAndChar);
		assertEqualCommon(editCustomerPage.getPINErrorMessage(), charactersAreNotAllowedMsg);
	}
	@Test
	public void EC16() {		
		editCustomerPage.clearPIN();
		editCustomerPage.inputKeyPIN(Keys.TAB);
		assertEqualCommon(editCustomerPage.getPINErrorMessage(), pINMustNotBeBlankMsg);
	}
	@Test
	public void EC17() {		
		editCustomerPage.clearPIN();
		editCustomerPage.inputPIN(numeric);
		assertEqualCommon(editCustomerPage.getPINErrorMessage(), pINCodeMustHave6digitsMsg);
	}
	
	@Test
	public void EC18() {		
		editCustomerPage.clearPIN();
		editCustomerPage.inputPIN(specialCharacter);
		assertEqualCommon(editCustomerPage.getPINErrorMessage(), specialCharactersAreNotAllowedMsg);
	}
	@Test
	public void EC19() {		
		editCustomerPage.clearMobileNumber();
		editCustomerPage.inputKeyTelephone(Keys.TAB);
		assertEqualCommon(editCustomerPage.getTelephoneErrorMessage(), mobileNumberMustNotBeBlankMsg);
	}
	
	@Test
	public void EC20() {		
		editCustomerPage.clearMobileNumber();
		editCustomerPage.inputTelephone(specialCharacter);
		assertEqualCommon(editCustomerPage.getTelephoneErrorMessage(), specialCharactersAreNotAllowedMsg);
	}
	
	@Test
	public void EC21() {		
		editCustomerPage.clearEmail();
		editCustomerPage.inputKeyEmail(Keys.TAB);
		assertEqualCommon(editCustomerPage.getEmailErrorMessage(), emailMustNotBeBlankMsg);
	}
	
	@Test
	public void EC22() {		
		editCustomerPage.clearEmail();
		editCustomerPage.inputEmail(invalidEmail);
		assertEqualCommon(editCustomerPage.getEmailErrorMessage(), emailIDIsNotValidMsg);
	}
	
	@AfterClass
	public void afterClass() {
		closeBrowser();
	}
}
