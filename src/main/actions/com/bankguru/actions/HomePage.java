package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.ui.HomePageUI;
//import com.bankguru.ui.RegisterPageUI;

import Common.CommonFunctions;

public class HomePage extends CommonFunctions{

	public HomePage(WebDriver driver) {
		super(driver);		
	}
	
	public String getHomePageWelcomeText() {
		waitForElemenVisible(HomePageUI.WELCOME_LBL);
		return getTextElement(HomePageUI.WELCOME_LBL);
	}
	
	public NewCustomerPage clickNewCustomerButton() {
		waitForElemenVisible(HomePageUI.NEWCUSTOMER_LBL);
		clickToElement(HomePageUI.NEWCUSTOMER_LBL);
		return PageFactory.initElements(driver, NewCustomerPage.class);
	} 
	
	public EditCustomerPage clickEditCustomerButton() {
		waitForElemenVisible(HomePageUI.EDITCUSTOMER_LBL);
		clickToElement(HomePageUI.EDITCUSTOMER_LBL);
		return PageFactory.initElements(driver, EditCustomerPage.class);
	} 

}
