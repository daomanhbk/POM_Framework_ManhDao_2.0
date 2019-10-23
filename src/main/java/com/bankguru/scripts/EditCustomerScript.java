package com.bankguru.scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
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

public class EditCustomerScript extends CommonTestCase {
	WebDriver driver;
	LogInPage logInPage;
	HomePage homePage;
	NewCustomerPage newCustomerPage;
	EditCustomerPage editCustomerPage;
	JsonData jsonData;
	String customerID;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void beforeClass(String browser, String version, String url) {
		inititalReport("EditCustomerScript.html");

		driver = openBrowser(browser, version, url);
		String userPath = System.getProperty("user.dir");
		String pathFileJson = userPath.concat("/data/").concat("BankGuru.json");
		jsonData = getDataJson(pathFileJson);

		logInTestCase(RegisterScript.username, RegisterScript.password);
		homePage = PageFactory.initElements(driver, HomePage.class);
		customerID = NewCustomerScript.customerID;
	}

	@Test
	public void EC01() {
		logTestCase("EC01");
		editCustomerPage = homePage.clickEditCustomerButton();
		editCustomerPage.inputKeysIntoCustomerID(Keys.TAB);
		assertEqualCommon(editCustomerPage.getCustomerIdErrorMessage(),
				jsonData.getEditCustomer().getCustomerIdIsRequiredMsg());
	}

	@Test
	public void EC02() {
		logTestCase("EC02");
		editCustomerPage = homePage.clickEditCustomerButton();
		editCustomerPage.inputCustomerID(jsonData.getEditCustomer().getNumberAndChar());
		assertEqualCommon(editCustomerPage.getCustomerIdErrorMessage(),
				jsonData.getEditCustomer().getCharactersAreNotAllowedMsg());
	}

	@Test
	public void EC03() {
		logTestCase("EC03");
		editCustomerPage = homePage.clickEditCustomerButton();
		editCustomerPage.inputCustomerID(jsonData.getEditCustomer().getSpecialCharacter());
		assertEqualCommon(editCustomerPage.getCustomerIdErrorMessage(),
				jsonData.getEditCustomer().getSpecialCharactersAreNotAllowedMsg());
	}

	@Test
	public void EC04() {
		logTestCase("EC04");
		editCustomerPage = homePage.clickEditCustomerButton();
		editCustomerPage.inputCustomerID(customerID);
		editCustomerPage.clickSumbit();
		assertEqualCommon(editCustomerPage.getEditCustomerHeading(), jsonData.getEditCustomer().getEditCustomerLabel());
	}

	@Test
	public void EC08() {
		logTestCase("EC08");
		editCustomerPage.clearAddress();
		editCustomerPage.inputKeyIntoAddress(Keys.TAB);
		assertEqualCommon(editCustomerPage.getAddressErrorMessage(),
				jsonData.getEditCustomer().getAddressFieldMustNotBeBlankMsg());
	}

	@Test
	public void EC09() {
		logTestCase("EC09");
		editCustomerPage.clearCity();
		editCustomerPage.inputKeyCity(Keys.TAB);
		assertEqualCommon(editCustomerPage.getCityErrorMessage(),
				jsonData.getEditCustomer().getCityFieldMustNotBeBlankMsg());
	}

	@Test
	public void EC10() {
		logTestCase("EC10");
		editCustomerPage.clearCity();
		editCustomerPage.inputCity(jsonData.getEditCustomer().getNumeric());
		assertEqualCommon(editCustomerPage.getCityErrorMessage(),
				jsonData.getEditCustomer().getNumbersAreNotAllowedMsg());
	}

	@Test
	public void EC11() {
		logTestCase("EC11");
		editCustomerPage.clearCity();
		editCustomerPage.inputCity(jsonData.getEditCustomer().getSpecialCharacter());
		assertEqualCommon(editCustomerPage.getCityErrorMessage(),
				jsonData.getEditCustomer().getSpecialCharactersAreNotAllowedMsg());
	}

	@Test
	public void EC12() {
		logTestCase("EC12");
		editCustomerPage.clearState();
		editCustomerPage.inputKeyState(Keys.TAB);
		assertEqualCommon(editCustomerPage.getStateErrorMessage(),
				jsonData.getEditCustomer().getStateMustNotBeBlankMsg());
	}

	@Test
	public void EC13() {
		logTestCase("EC13");
		editCustomerPage.clearState();
		editCustomerPage.inputState(jsonData.getEditCustomer().getNumeric());
		assertEqualCommon(editCustomerPage.getStateErrorMessage(),
				jsonData.getEditCustomer().getNumbersAreNotAllowedMsg());
	}

	@Test
	public void EC14() {
		logTestCase("EC14");
		editCustomerPage.clearState();
		editCustomerPage.inputState(jsonData.getEditCustomer().getSpecialCharacter());
		assertEqualCommon(editCustomerPage.getStateErrorMessage(),
				jsonData.getEditCustomer().getSpecialCharactersAreNotAllowedMsg());
	}

	@Test
	public void EC15() {
		logTestCase("EC15");
		editCustomerPage.clearPIN();
		editCustomerPage.inputPIN(jsonData.getEditCustomer().getNumberAndChar());
		assertEqualCommon(editCustomerPage.getPINErrorMessage(),
				jsonData.getEditCustomer().getCharactersAreNotAllowedMsg());
	}

	@Test
	public void EC16() {
		logTestCase("EC16");
		editCustomerPage.clearPIN();
		editCustomerPage.inputKeyPIN(Keys.TAB);
		assertEqualCommon(editCustomerPage.getPINErrorMessage(), jsonData.getEditCustomer().getPINMustNotBeBlankMsg());
	}

	@Test
	public void EC17() {
		logTestCase("EC17");
		editCustomerPage.clearPIN();
		editCustomerPage.inputPIN(jsonData.getEditCustomer().getNumeric());
		assertEqualCommon(editCustomerPage.getPINErrorMessage(),
				jsonData.getEditCustomer().getPINCodeMustHave6digitsMsg());
	}

	@Test
	public void EC18() {
		logTestCase("EC18");
		editCustomerPage.clearPIN();
		editCustomerPage.inputPIN(jsonData.getEditCustomer().getSpecialCharacter());
		assertEqualCommon(editCustomerPage.getPINErrorMessage(),
				jsonData.getEditCustomer().getSpecialCharactersAreNotAllowedMsg());
	}

	@Test
	public void EC19() {
		logTestCase("EC19");
		editCustomerPage.clearMobileNumber();
		editCustomerPage.inputKeyTelephone(Keys.TAB);
		assertEqualCommon(editCustomerPage.getTelephoneErrorMessage(),
				jsonData.getEditCustomer().getMobileNumberMustNotBeBlankMsg());
	}

	@Test
	public void EC20() {
		logTestCase("EC20");
		editCustomerPage.clearMobileNumber();
		editCustomerPage.inputTelephone(jsonData.getEditCustomer().getSpecialCharacter());
		assertEqualCommon(editCustomerPage.getTelephoneErrorMessage(),
				jsonData.getEditCustomer().getSpecialCharactersAreNotAllowedMsg());
	}

	@Test
	public void EC21() {
		logTestCase("EC21");
		editCustomerPage.clearEmail();
		editCustomerPage.inputKeyEmail(Keys.TAB);
		assertEqualCommon(editCustomerPage.getEmailErrorMessage(),
				jsonData.getEditCustomer().getEmailMustNotBeBlankMsg());
	}

	@Test
	public void EC22() {
		logTestCase("EC22");
		editCustomerPage.clearEmail();
		editCustomerPage.inputEmail(jsonData.getEditCustomer().getInvalidEmail());
		assertEqualCommon(editCustomerPage.getEmailErrorMessage(),
				jsonData.getEditCustomer().getEmailIDIsNotValidMsg());
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		getResult(result);
	}

	@AfterClass
	public void afterClass() {
		exportReport();
		driver.quit();
	}
}
