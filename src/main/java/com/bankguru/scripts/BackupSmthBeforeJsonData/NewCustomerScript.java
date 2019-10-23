package com.bankguru.scripts.BackupSmthBeforeJsonData;

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

public class NewCustomerScript extends CommonTestCase {
	WebDriver driver;
	LogInPage logInPage;
	RegisterPage registerPage;
	HomePage homePage;
	NewCustomerPage newCustomerPage;
	JsonData commonData;

	static String customerID;
	String emailCustomer;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void beforeClass(String browser, String version, String url) {
		driver = openBrowser(browser, version, url);

		String userPath = System.getProperty("user.dir");
		String pathFileJson = userPath.concat("/data/").concat("BankGuru.json");
		commonData = getDataJson(pathFileJson);
//		System.out.println("Text = " + commonData.getNewCustomer().getAddress());

		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.inputUserID(RegisterScript.username);
		logInPage.inputPassword(RegisterScript.password);
		homePage = logInPage.clickLogin();

		emailCustomer = "test" + randomemail() + "@abc.com";
	}

	@BeforeMethod
	public void beforeMethod() {
		newCustomerPage = homePage.clickNewCustomerButton();
	}

	@Test
	public void NC01() {
		newCustomerPage.inputTabCustomerName();
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(),
				commonData.getNewCustomer().getCustomerMustNotBeBlankMsg());
	}

	@Test
	public void NC02() {
		newCustomerPage.inputCustomerName(commonData.getNewCustomer().getNumbericValue());
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(),
				commonData.getNewCustomer().getNumbersAreNotAllowedMsg());

	}

	@Test
	public void NC03() {
		newCustomerPage.inputCustomerName(commonData.getNewCustomer().getSpecialCharacter());
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(),
				commonData.getNewCustomer().getSpecialCharactersAreNotAllowedMsg());
	}

	@Test
	public void NC04() {
		newCustomerPage.inputSpaceCustomerName();
		assertEqualCommon(newCustomerPage.getCustomerNameErrorMessage(),
				commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());
	}

	@Test
	public void NC05() {
		newCustomerPage.inputKeyIntoAddress(Keys.TAB);
		assertEqualCommon(newCustomerPage.getAddressErrorMessage(),
				commonData.getNewCustomer().getAddressMustNotBeBlankMsg());
	}

	@Test
	public void NC06() {
		newCustomerPage.inputKeyIntoAddress(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getAddressErrorMessage(),
				commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());
	}

	// 07 is not available
	@Test
	public void NC08() {
		newCustomerPage.inputKeyCity(Keys.TAB);
		assertEqualCommon(newCustomerPage.getCityErrorMessage(),
				commonData.getNewCustomer().getCityMustNotBeBlankMsg());
	}

	@Test
	public void NC09() {
		newCustomerPage.inputCity(commonData.getNewCustomer().getNumbericValue());
		assertEqualCommon(newCustomerPage.getCityErrorMessage(),
				commonData.getNewCustomer().getNumbersAreNotAllowedMsg());
	}

	@Test
	public void NC10() {
		newCustomerPage.inputCity(commonData.getNewCustomer().getSpecialCharacter());
		assertEqualCommon(newCustomerPage.getCityErrorMessage(),
				commonData.getNewCustomer().getSpecialCharactersAreNotAllowedMsg());
	}

	@Test
	public void NC11() {
		newCustomerPage.inputKeyCity(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getCityErrorMessage(),
				commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());
	}

	@Test
	public void NC12() {
		newCustomerPage.inputKeyState(Keys.TAB);
		assertEqualCommon(newCustomerPage.getStateErrorMessage(),
				commonData.getNewCustomer().getStateMustNotBeBlankMsg());
	}

	@Test
	public void NC13() {
		newCustomerPage.inputState(commonData.getNewCustomer().getNumbericValue());
		assertEqualCommon(newCustomerPage.getStateErrorMessage(),
				commonData.getNewCustomer().getNumbersAreNotAllowedMsg());
	}

	@Test
	public void NC14() {
		newCustomerPage.inputState(commonData.getNewCustomer().getSpecialCharacter());
		assertEqualCommon(newCustomerPage.getStateErrorMessage(),
				commonData.getNewCustomer().getSpecialCharactersAreNotAllowedMsg());
	}

	@Test
	public void NC15() {
		newCustomerPage.inputKeyState(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getStateErrorMessage(),
				commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());
	}

	@Test
	public void NC16() {
		newCustomerPage.inputPIN(commonData.getNewCustomer().getNumbericAndCharacter());
		assertEqualCommon(newCustomerPage.getPINErrorMessage(),
				commonData.getNewCustomer().getCharactersAreNotAllowedMsg());
	}

	public void NC017() {
		newCustomerPage.inputKeyPIN(Keys.TAB);
		assertEqualCommon(newCustomerPage.getPINErrorMessage(), commonData.getNewCustomer().getPINMustNotBeBlankMsg());
	}

	@Test
	public void NC18() {
		newCustomerPage.inputPIN(commonData.getNewCustomer().getLessThanSixDigit());
		assertEqualCommon(newCustomerPage.getPINErrorMessage(),
				commonData.getNewCustomer().getPINCodeMustHave6digitsMsg());
	}

	@Test
	public void NC19() {
		newCustomerPage.inputPIN(commonData.getNewCustomer().getSpecialCharacter());
		assertEqualCommon(newCustomerPage.getPINErrorMessage(),
				commonData.getNewCustomer().getSpecialCharactersAreNotAllowedMsg());
	}

	@Test
	public void NC20() {
		newCustomerPage.inputKeyPIN(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getPINErrorMessage(),
				commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());
	}
	// Skip NC21 because space after 1st digit is acceptable

	@Test
	public void NC22() {
		newCustomerPage.inputKeyTelephone(Keys.TAB);
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(),
				commonData.getNewCustomer().getMobileNumberMustNotBeBlankMsg());
	}

	@Test
	public void NC23() {
		newCustomerPage.inputKeyTelephone(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(),
				commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());
	}

	@Test
	public void NC24() {
		newCustomerPage.inputTelephone(commonData.getNewCustomer().getNumbericandBlankValue());
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(),
				commonData.getNewCustomer().getCharactersAreNotAllowedMsg());
	}

	@Test
	public void NC25() {
		newCustomerPage.inputTelephone(commonData.getNewCustomer().getSpecialCharacter());
		assertEqualCommon(newCustomerPage.getTelephoneErrorMessage(),
				commonData.getNewCustomer().getSpecialCharactersAreNotAllowedMsg());
	}

	@Test
	public void NC26() {
		newCustomerPage.inputKeyEmail(Keys.TAB);
		assertEqualCommon(newCustomerPage.getEmailErrorMessage(),
				commonData.getNewCustomer().getEmailMustNotBeBlankMsg());
	}

	@Test
	public void NC27() {
		newCustomerPage.inputEmail(commonData.getNewCustomer().getInvalidEmail());
		assertEqualCommon(newCustomerPage.getEmailErrorMessage(),
				commonData.getNewCustomer().getEmailIDIsNotValidMsg());
	}

	@Test
	public void NC29() {
		newCustomerPage.inputKeyEmail(Keys.SPACE);
		assertEqualCommon(newCustomerPage.getEmailErrorMessage(),
				commonData.getNewCustomer().getFirstCharacterCannotBeSpaceMsg());
	}

	@Test
	public void NC30() {
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

	@AfterClass
	public void afterClass() {
		closeBrowser();
	}
}
