package com.bankguru.scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.actions.HomePage;
import com.bankguru.actions.LogInPage;
import com.bankguru.actions.NewCustomerPage;
import com.bankguru.actions.RegisterPage;

import Common.CommonTestCase;
import ObjectPageJson.JsonData;

public class NewCustomerScript extends CommonTestCase{
	WebDriver driver;
	LogInPage logInPage;
	RegisterPage registerPage;
	HomePage homePage;
	NewCustomerPage newCustomerPage;
	JsonData commonData;
	
//	String email, username, password; //mngr216060 rAgEvyj  //65381
	
//	String numbericValue, numbericandBlankValue, specialCharacter, numbericAndCharacter, lessThanSixDigit, moreThanSixDigit, invalidEmail;
//	
//	String customerMustNotBeBlankMsg, numbersAreNotAllowedMsg, specialCharactersAreNotAllowedMsg, firstCharacterCannotBeSpaceMsg;
//	
//	String addressMustNotBeBlankMsg, cityMustNotBeBlankMsg, stateMustNotBeBlankMsg, pINMustNotBeBlankMsg, 
//	mobileNumberMustNotBeBlankMsg, emailMustNotBeBlankMsg, charactersAreNotAllowedMsg, pINCodeMustHave6digitsMsg,
//	emailIDIsNotValidMsg;
//	
//	String customerLbl, adressLbl, cityLbl, stateLbl, pinLbl, mobileNumberLbl, emailLbl;
//	
//	String customerName, address, dateOfBirth, gender, city, state, pin, phone, emailCustomer, passwordNewCustomer;
	static String customerID;
	String emailCustomer;
	
	@Parameters({"browser","version","url"})
	@BeforeClass
	public void beforeClass(String browser, String version, String url) {
			driver = openBrowser(browser, version, url);
//			email = "manh"+ randomemail() + "@gmail.com";
			
			String userPath = System.getProperty("user.dir");
			String pathFileJson = userPath.concat("/data/").concat("BankGuru.json");
			commonData = getDataJson(pathFileJson);
			System.out.println("Text = " + commonData.getNewCustomer().getAddress());
			
			
			logInPage = PageFactory.initElements(driver, LogInPage.class);
			logInPage.inputUserID(RegisterScript.username);
			logInPage.inputPassword(RegisterScript.password);		
			homePage = logInPage.clickLogin();	
			
//			numbericValue = "1234";
//			numbericandBlankValue = "123 123";
//			specialCharacter = "!@#";
//			numbericAndCharacter = "123abc";
//			lessThanSixDigit = "12345";
//			moreThanSixDigit = "1234567";
//			invalidEmail = "guru99@gmail";
//			
//			customerMustNotBeBlankMsg = "Customer name must not be blank";
//			numbersAreNotAllowedMsg = "Numbers are not allowed";
//			specialCharactersAreNotAllowedMsg = "Special characters are not allowed";
//			firstCharacterCannotBeSpaceMsg = "First character can not have space";
//			//NC05
//			addressMustNotBeBlankMsg = "Address Field must not be blank";
//			cityMustNotBeBlankMsg = "City Field must not be blank";
//			stateMustNotBeBlankMsg = "State must not be blank";
//			pINMustNotBeBlankMsg = "PIN Code must not be blank"; 
//			mobileNumberMustNotBeBlankMsg = "Mobile no must not be blank";
//			emailMustNotBeBlankMsg = "Email-ID must not be blank";
//			charactersAreNotAllowedMsg = "Characters are not allowed";
//			pINCodeMustHave6digitsMsg = "PIN Code must have 6 Digits";
//			emailIDIsNotValidMsg = "Email-ID is not valid";
//			
//			customerLbl = "Customer Name";
//			adressLbl = "Address";
//			cityLbl = "City"; 
//			stateLbl = "State"; 
//			pinLbl = "PIN"; 
//			mobileNumberLbl = "Mobile Number"; 
//			emailLbl = "E-mail";
//			
//			customerName = "Test";
//			address = "123 Truong Chinh";
//			dateOfBirth = "10/10/2000";
//			gender = "male";
//			city = "Ho Chi Minh";
//			state = "Test State";
//			pin = "111222";
//			phone = "12346";			
//			passwordNewCustomer = "123456";	
			
			emailCustomer = "test" + randomemail() + "@abc.com";
		}
	@BeforeMethod
	public void beforeMethod() {
		newCustomerPage = homePage.clickNewCustomerButton();		
	}
//	@Test
//	public void NC00() {
//		logInPage = PageFactory.initElements(driver, LogInPage.class);
//		logInPage.inputUserID(username);
//		logInPage.inputPassword(password);		
//		homePage = logInPage.clickLogin();	
//	}
	
	@Test
	public void NC01() {		
		newCustomerPage.inputTabCustomerName();		
//		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), customerMustNotBeBlankMsg);
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), commonData.getNewCustomer().getCustomerMustNotBeBlankMsg());
	}
	@Test
	public void NC02() {		
//		newCustomerPage.inputCustomerName(numbericValue);	
		newCustomerPage.inputCustomerName(commonData.getNewCustomer().getNumbericValue());
//		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), numbersAreNotAllowedMsg);	
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), commonData.getNewCustomer().getNumbersAreNotAllowedMsg());	
		
	}
	
	@Test
	public void NC03() {		
//		newCustomerPage.inputCustomerName(specialCharacter);
		newCustomerPage.inputCustomerName(commonData.getNewCustomer().getSpecialCharacter());
//		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), specialCharactersAreNotAllowedMsg);
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), commonData.getNewCustomer().getSpecialCharactersAreNotAllowedMsg());
		
	}
	
	@Test
	public void NC04() {		
		newCustomerPage.inputSpaceCustomerName();		
//		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), firstCharacterCannotBeSpaceMsg);	
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());
	}
	
	@Test
	public void NC05() {
//		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyIntoAddress(Keys.TAB);		
//		assertEqualCommon(newCustomerPage.getAddressErrorMessage(), addressMustNotBeBlankMsg);	
		assertEqualCommon(newCustomerPage.getAddressErrorMessage(), commonData.getNewCustomer().getAddressMustNotBeBlankMsg());
	}
	
	@Test
	public void NC06() {		
		newCustomerPage.inputKeyIntoAddress(Keys.SPACE);		
//		assertEqualCommon(newCustomerPage.getAddressErrorMessage(), firstCharacterCannotBeSpaceMsg);	
		assertEqualCommon(newCustomerPage.getAddressErrorMessage(), commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());	
	}	
	//07 is not available
	@Test
	public void NC08() {
//		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyCity(Keys.TAB);
//		assertEqualCommon(newCustomerPage.getCityErrorMessage(), cityMustNotBeBlankMsg);	
		assertEqualCommon(newCustomerPage.getCityErrorMessage(), commonData.getNewCustomer().getCityMustNotBeBlankMsg());
	}
	@Test
	public void NC09() {		
//		newCustomerPage.inputCity(numbericValue);	
		newCustomerPage.inputCity(commonData.getNewCustomer().getNumbericValue());	
//		assertEqualCommon(newCustomerPage.getCityErrorMessage(), numbersAreNotAllowedMsg);	
		assertEqualCommon(newCustomerPage.getCityErrorMessage(), commonData.getNewCustomer().getNumbersAreNotAllowedMsg());	
	}
	
	@Test
	public void NC10() {		
//		newCustomerPage.inputCity(specialCharacter);
		newCustomerPage.inputCity(commonData.getNewCustomer().getSpecialCharacter());
//		assertEqualCommon(newCustomerPage.getCityErrorMessage(), specialCharactersAreNotAllowedMsg);		
		assertEqualCommon(newCustomerPage.getCityErrorMessage(), commonData.getNewCustomer().getSpecialCharactersAreNotAllowedMsg());	
	}
	@Test
	public void NC11() {		
		newCustomerPage.inputKeyCity(Keys.SPACE);
//		assertEqualCommon(newCustomerPage.getCityErrorMessage(), firstCharacterCannotBeSpaceMsg);	
		assertEqualCommon(newCustomerPage.getCityErrorMessage(), commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());	
	}
	
	@Test
	public void NC12() {
//		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyState(Keys.TAB);
//		assertEqualCommon(newCustomerPage.getStateErrorMessage(), stateMustNotBeBlankMsg);
		assertEqualCommon(newCustomerPage.getStateErrorMessage(), commonData.getNewCustomer().getStateMustNotBeBlankMsg());	
	}
	@Test
	public void NC13() {		
//		newCustomerPage.inputState(numbericValue);
		newCustomerPage.inputState(commonData.getNewCustomer().getNumbericValue());	
//		assertEqualCommon(newCustomerPage.getStateErrorMessage(), numbersAreNotAllowedMsg);		
		assertEqualCommon(newCustomerPage.getStateErrorMessage(), commonData.getNewCustomer().getNumbersAreNotAllowedMsg());	
	}
	
	@Test
	public void NC14() {		
//		newCustomerPage.inputState(specialCharacter);
		newCustomerPage.inputState(commonData.getNewCustomer().getSpecialCharacter());
//		assertEqualCommon(newCustomerPage.getStateErrorMessage(), specialCharactersAreNotAllowedMsg);	
		assertEqualCommon(newCustomerPage.getStateErrorMessage(), commonData.getNewCustomer().getSpecialCharactersAreNotAllowedMsg());	
	}
	@Test
	public void NC15() {		
		newCustomerPage.inputKeyState(Keys.SPACE);
//		assertEqualCommon(newCustomerPage.getStateErrorMessage(), firstCharacterCannotBeSpaceMsg);	
		assertEqualCommon(newCustomerPage.getStateErrorMessage(), commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());	
	}
	
	@Test
	public void NC16() {
//		newCustomerPage = homePage.clickNewCustomerButton();
//		newCustomerPage.inputPIN(numbericAndCharacter);		
		newCustomerPage.inputPIN(commonData.getNewCustomer().getNumbericAndCharacter());
//		assertEqualCommon(newCustomerPage.getPINErrorMessage(), charactersAreNotAllowedMsg);	
		assertEqualCommon(newCustomerPage.getPINErrorMessage(), commonData.getNewCustomer().getCharactersAreNotAllowedMsg());	
	}
	public void NC017() {		
		newCustomerPage.inputKeyPIN(Keys.TAB);
//		assertEqualCommon(newCustomerPage.getPINErrorMessage(), pINMustNotBeBlankMsg);
		assertEqualCommon(newCustomerPage.getPINErrorMessage(), commonData.getNewCustomer().getPINMustNotBeBlankMsg());		
	}
	
	@Test
	public void NC18_1() {		
//		newCustomerPage.inputPIN(lessThanSixDigit);		
		newCustomerPage.inputPIN(commonData.getNewCustomer().getLessThanSixDigit());	
//		assertEqualCommon(newCustomerPage.getPINErrorMessage(), pINCodeMustHave6digitsMsg);	
		assertEqualCommon(newCustomerPage.getPINErrorMessage(), commonData.getNewCustomer().getPINCodeMustHave6digitsMsg());		
	}
	//Step 18_2 because cannot enter more than 6 digits
//	@Test
//	public void NC18_2() {
//		newCustomerPage = homePage.clickNewCustomerButton();
//		newCustomerPage.inputPIN(moreThanSixDigit);		
//		assesrtEqualCommon(newCustomerPage.getPINErrorMessage(), pINCodeMustHave6digitsMsg);			
//	}
	
	@Test
	public void NC19() {		
//		newCustomerPage.inputPIN(specialCharacter);		
		newCustomerPage.inputPIN(commonData.getNewCustomer().getSpecialCharacter());	
//		assertEqualCommon(newCustomerPage.getPINErrorMessage(), specialCharactersAreNotAllowedMsg);	
		assertEqualCommon(newCustomerPage.getPINErrorMessage(), commonData.getNewCustomer().getSpecialCharactersAreNotAllowedMsg());	
	}
	@Test
	public void NC20() {		
		newCustomerPage.inputKeyPIN(Keys.SPACE);
//		assertEqualCommon(newCustomerPage.getPINErrorMessage(), firstCharacterCannotBeSpaceMsg);	
		assertEqualCommon(newCustomerPage.getPINErrorMessage(), commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());
	}
	//Skip NC21 because space after 1st digit is acceptable
	
	@Test
	public void NC22() {
//		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyTelephone(Keys.TAB);
//		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), mobileNumberMustNotBeBlankMsg);	
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), commonData.getNewCustomer().getMobileNumberMustNotBeBlankMsg());	
	}
	@Test
	public void NC23() {		
		newCustomerPage.inputKeyTelephone(Keys.SPACE);
//		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), firstCharacterCannotBeSpaceMsg);	
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());	
	}
	
	@Test
	public void NC24() {		
//		newCustomerPage.inputTelephone(numbericandBlankValue);	
		newCustomerPage.inputTelephone(commonData.getNewCustomer().getNumbericandBlankValue());	
//		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), charactersAreNotAllowedMsg);
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), commonData.getNewCustomer().getCharactersAreNotAllowedMsg());	
	}
	
	@Test
	public void NC25() {		
//		newCustomerPage.inputTelephone(specialCharacter);
		newCustomerPage.inputTelephone(commonData.getNewCustomer().getSpecialCharacter());
//		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), specialCharactersAreNotAllowedMsg);	
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), commonData.getNewCustomer().getSpecialCharactersAreNotAllowedMsg());
	}

	
	@Test
	public void NC26() {
//		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyEmail(Keys.TAB);
//		assertEqualCommon(newCustomerPage.getEmailErrorMessage(), emailMustNotBeBlankMsg);
		assertEqualCommon(newCustomerPage.getEmailErrorMessage(), commonData.getNewCustomer().getEmailMustNotBeBlankMsg());	
	}
	@Test
	public void NC27() {		
//		newCustomerPage.inputEmail(invalidEmail);
//		assertEqualCommon(newCustomerPage.getEmailErrorMessage(), emailIDIsNotValidMsg);	
		newCustomerPage.inputEmail(commonData.getNewCustomer().getInvalidEmail());
		assertEqualCommon(newCustomerPage.getEmailErrorMessage(), commonData.getNewCustomer().getEmailIDIsNotValidMsg());
	}
	
	@Test
	public void NC29() {		
		newCustomerPage.inputKeyEmail(Keys.SPACE);
//		assertEqualCommon(newCustomerPage.getEmailErrorMessage(), firstCharacterCannotBeSpaceMsg);		
		assertEqualCommon(newCustomerPage.getEmailErrorMessage(), commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());	
	}
	
	@Test
	public void NC30() {
//		newCustomerPage = homePage.clickNewCustomerButton();
//		newCustomerPage.inputKeyEmail(Keys.SPACE);
		
//		assertEqualCommon(newCustomerPage.getCustomerLable(), customerLbl);	
//		assertEqualCommon(newCustomerPage.getAddressLable(), adressLbl);	
//		assertEqualCommon(newCustomerPage.getCityLable(), cityLbl);	
//		assertEqualCommon(newCustomerPage.getStateLable(), stateLbl);
//		assertEqualCommon(newCustomerPage.getPinLable(), pinLbl);
//		assertEqualCommon(newCustomerPage.getMobileLable(), mobileNumberLbl);
//		assertEqualCommon(newCustomerPage.getEmailLable(), emailLbl);	
		
		assertEqualCommon(newCustomerPage.getCustomerLable(), commonData.getNewCustomer().getCustomerLbl());	
		assertEqualCommon(newCustomerPage.getAddressLable(), commonData.getNewCustomer().getAdressLbl());	
		assertEqualCommon(newCustomerPage.getCityLable(), commonData.getNewCustomer().getCityLbl());	
		assertEqualCommon(newCustomerPage.getStateLable(), commonData.getNewCustomer().getStateLbl());
		assertEqualCommon(newCustomerPage.getPinLable(), commonData.getNewCustomer().getPinLbl());
		assertEqualCommon(newCustomerPage.getMobileLable(), commonData.getNewCustomer().getMobileNumberLbl());
		assertEqualCommon(newCustomerPage.getEmailLable(), commonData.getNewCustomer().getEmailLbl());
	}
	
	@Test
	public void NC31() {		
//		newCustomerPage.inputCustomerName(customerName);
//		newCustomerPage.inputAddress(address);
//		newCustomerPage.inputDateOfBirth(dateOfBirth);
//		newCustomerPage.selectGender(gender);
//		newCustomerPage.inputCity(city);
//		newCustomerPage.inputState(state);
//		newCustomerPage.inputPIN(pin);
//		newCustomerPage.inputTelephone(phone);
//		newCustomerPage.inputEmail(emailCustomer);
//		newCustomerPage.inputPassword(passwordNewCustomer);
//		newCustomerPage.clickSubmit();
		
		newCustomerPage.inputCustomerName(commonData.getNewCustomer().getCustomerName());
		newCustomerPage.inputAddress(commonData.getNewCustomer().getAddress());
		newCustomerPage.inputDateOfBirth(commonData.getNewCustomer().getDateOfBirth());
		newCustomerPage.selectGender(commonData.getNewCustomer().getGender());
		newCustomerPage.inputCity(commonData.getNewCustomer().getCity());
		newCustomerPage.inputState(commonData.getNewCustomer().getState());
		newCustomerPage.inputPIN(commonData.getNewCustomer().getPin());
		newCustomerPage.inputTelephone(commonData.getNewCustomer().getPhone());
		newCustomerPage.inputEmail(emailCustomer);
		newCustomerPage.inputPassword(commonData.getNewCustomer().getPasswordNewCustomer());
		newCustomerPage.clickSubmit();
		
		customerID = newCustomerPage.getCustomerID();
	}
//	@AfterMethod
	
	@AfterClass
	public void afterClass() {
		closeBrowser();
	}
}
