package com.bankguru.scripts;

import org.openqa.selenium.Keys;
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

public class LogInScript extends CommonTestCase{
	WebDriver driver;
	LogInPage logInPage;
	RegisterPage registerPage;
	HomePage homePage;
	NewCustomerPage newCustomerPage;
	
	String email, username, password; //mngr216060 rAgEvyj  //65381
	
	String numbericValue, numbericandBlankValue, specialCharacter, numbericAndCharacter, lessThanSixDigit, moreThanSixDigit, invalidEmail;
	
	String customerMustNotBeBlankMsg, numbersAreNotAllowedMsg, specialCharactersAreNotAllowedMsg, firstCharacterCannotBeSpaceMsg;
	
	String addressMustNotBeBlankMsg, cityMustNotBeBlankMsg, stateMustNotBeBlankMsg, pINMustNotBeBlankMsg, 
	mobileNumberMustNotBeBlankMsg, emailMustNotBeBlankMsg, charactersAreNotAllowedMsg, pINCodeMustHave6digitsMsg,
	emailIDIsNotValidMsg;
	
	String customerLbl, adressLbl, cityLbl, stateLbl, pinLbl, mobileNumberLbl, emailLbl;
	
	@Parameters({"browser","version","url"})
	@BeforeClass
	public void beforeClass(String browser, String version, String url) {
			driver = openBrowser(browser, version, url);
			email = "manh"+ randomemail() + "@gmail.com";
			username = "mngr216060";
			password = "rAgEvyj";
			
			numbericValue = "1234";
			numbericandBlankValue = "123 123";
			specialCharacter = "!@#";
			numbericAndCharacter = "123abc";
			lessThanSixDigit = "12345";
			moreThanSixDigit = "1234567";
			invalidEmail = "guru99@gmail";
			
			customerMustNotBeBlankMsg = "Customer name must not be blank";
			numbersAreNotAllowedMsg = "Numbers are not allowed";
			specialCharactersAreNotAllowedMsg = "Special characters are not allowed";
			firstCharacterCannotBeSpaceMsg = "First character can not have space";
			//NC05
			addressMustNotBeBlankMsg = "Address Field must not be blank";
			cityMustNotBeBlankMsg = "City Field must not be blank";
			stateMustNotBeBlankMsg = "State must not be blank";
			pINMustNotBeBlankMsg = "PIN Code must not be blank"; 
			mobileNumberMustNotBeBlankMsg = "Mobile no must not be blank";
			emailMustNotBeBlankMsg = "Email-ID must not be blank";
			charactersAreNotAllowedMsg = "Characters are not allowed";
			pINCodeMustHave6digitsMsg = "PIN Code must have 6 Digits";
			emailIDIsNotValidMsg = "Email-ID is not valid";
			
			customerLbl = "Customer Name";
			adressLbl = "Address";
			cityLbl = "City"; 
			stateLbl = "State"; 
			pinLbl = "PIN"; 
			mobileNumberLbl = "Mobile Number"; 
			emailLbl = "E-mail";
		}
//	@Parameters({"url"})
	@Test
//	public void NC00(String url) {
	public void NC00() {
//		logInPage = new LogInPage(driver);
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		
//		registerPage = logInPage.clickHereLink();		
////		registerPage = new RegisterPage(driver);
////		registerPage = PageFactory.initElements(driver, RegisterPage.class);
//		registerPage.inputEmail(email);
//		registerPage.clickSubmit();
		
//		username = registerPage.userName();
//		password = registerPage.password();

//		logInPage = registerPage.logInBankURL(url);
		
////		registerPage.openUrl(url);
//	//	registerPage.backToTwoPreviousPage();
/////		registerPage.backToPreviousPages(2);
		logInPage.inputUserID(username);
		logInPage.inputPassword(password);
		
		homePage = logInPage.clickLogin();		
////		homePage = new HomePage(driver);
//	//	homePage = PageFactory.initElements(driver, HomePage.class);
//		String welcomeText = homePage.getHomePageWelcomeText();
//		assertTrue(welcomeText.contains("Welcome"));
//	//	Assert.assertTrue(welcomeText.contains("Welcome"));
	}
	
	@Test
	public void NC01() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputTabCustomerName();		
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), customerMustNotBeBlankMsg);	
		
	}
	@Test
	public void NC02() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputCustomerName(numbericValue);		
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), numbersAreNotAllowedMsg);	
		
	}
	
	@Test
	public void NC03() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputCustomerName(specialCharacter);
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), specialCharactersAreNotAllowedMsg);	
		
	}
	
	@Test
	public void NC04() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputSpaceCustomerName();		
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(), firstCharacterCannotBeSpaceMsg);			
	}
	
	@Test
	public void NC05() {
//		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyIntoAddress(Keys.TAB);		
		assertEqualCommon(newCustomerPage.getAddressErrorMessage(), addressMustNotBeBlankMsg);			
	}
	
	@Test
	public void NC06() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyIntoAddress(Keys.SPACE);		
		assertEqualCommon(newCustomerPage.getAddressErrorMessage(), firstCharacterCannotBeSpaceMsg);			
	}	
	//07 is not available
	@Test
	public void NC08() {
//		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyCity(Keys.TAB);
		assertEqualCommon(newCustomerPage.getCityErrorMessage(), cityMustNotBeBlankMsg);			
	}
	@Test
	public void NC09() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputCity(numbericValue);		
		assertEqualCommon(newCustomerPage.getCityErrorMessage(), numbersAreNotAllowedMsg);			
	}
	
	@Test
	public void NC10() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputCity(specialCharacter);
		assertEqualCommon(newCustomerPage.getCityErrorMessage(), specialCharactersAreNotAllowedMsg);			
	}
	@Test
	public void NC11() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyCity(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getCityErrorMessage(), firstCharacterCannotBeSpaceMsg);			
	}
	
	@Test
	public void NC12() {
//		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyState(Keys.TAB);
		assertEqualCommon(newCustomerPage.getStateErrorMessage(), stateMustNotBeBlankMsg);			
	}
	@Test
	public void NC13() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputState(numbericValue);		
		assertEqualCommon(newCustomerPage.getStateErrorMessage(), numbersAreNotAllowedMsg);			
	}
	
	@Test
	public void NC14() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputState(specialCharacter);
		assertEqualCommon(newCustomerPage.getStateErrorMessage(), specialCharactersAreNotAllowedMsg);			
	}
	@Test
	public void NC15() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyState(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getStateErrorMessage(), firstCharacterCannotBeSpaceMsg);			
	}
	
	@Test
	public void NC16() {
//		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputPIN(numbericAndCharacter);		
		assertEqualCommon(newCustomerPage.getPINErrorMessage(), charactersAreNotAllowedMsg);			
	}
	public void NC017() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyPIN(Keys.TAB);
		assertEqualCommon(newCustomerPage.getPINErrorMessage(), pINMustNotBeBlankMsg);			
	}
	
	@Test
	public void NC18_1() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputPIN(lessThanSixDigit);		
		assertEqualCommon(newCustomerPage.getPINErrorMessage(), pINCodeMustHave6digitsMsg);			
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
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputPIN(specialCharacter);		
		assertEqualCommon(newCustomerPage.getPINErrorMessage(), specialCharactersAreNotAllowedMsg);			
	}
	@Test
	public void NC20() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyPIN(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getPINErrorMessage(), firstCharacterCannotBeSpaceMsg);			
	}
	//Skip NC21 because space after 1st digit is acceptable
	
	@Test
	public void NC22() {
//		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyTelephone(Keys.TAB);
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), mobileNumberMustNotBeBlankMsg);			
	}
	@Test
	public void NC23() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyTelephone(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), firstCharacterCannotBeSpaceMsg);			
	}
	
	@Test
	public void NC24() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputTelephone(numbericandBlankValue);		
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), charactersAreNotAllowedMsg);			
	}
	
	@Test
	public void NC25() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputTelephone(specialCharacter);
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(), specialCharactersAreNotAllowedMsg);			
	}

	
	@Test
	public void NC26() {
//		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyEmail(Keys.TAB);
		assertEqualCommon(newCustomerPage.getEmailErrorMessage(), emailMustNotBeBlankMsg);			
	}
	@Test
	public void NC27() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputEmail(invalidEmail);
		assertEqualCommon(newCustomerPage.getEmailErrorMessage(), emailIDIsNotValidMsg);			
	}
	
	@Test
	public void NC29() {
		newCustomerPage = homePage.clickNewCustomerButton();
		newCustomerPage.inputKeyEmail(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getEmailErrorMessage(), firstCharacterCannotBeSpaceMsg);			
	}
	
	@Test
	public void NC30() {
//		newCustomerPage = homePage.clickNewCustomerButton();
//		newCustomerPage.inputKeyEmail(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getCustomerLable(), customerLbl);	
		assertEqualCommon(newCustomerPage.getAddressLable(), adressLbl);	
		assertEqualCommon(newCustomerPage.getCityLable(), cityLbl);	
		assertEqualCommon(newCustomerPage.getStateLable(), stateLbl);
		assertEqualCommon(newCustomerPage.getPinLable(), pinLbl);
		assertEqualCommon(newCustomerPage.getMobileLable(), mobileNumberLbl);
		assertEqualCommon(newCustomerPage.getEmailLable(), emailLbl);		
	}
	
	@AfterClass
	public void afterClass() {
//		closeBrowser();
	}
}
