package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.CommonFunctions;

public class HomePage extends CommonFunctions{

	public HomePage(WebDriver driver) {
		super(driver);		
	}
//	public static String WELCOME_LBL = "//marquee[contains(text(),'Welcome')]";
	@FindBy(linkText = "Welcome")
	WebElement WELCOME_LBL;
	
//	public static String NEWCUSTOMER_LBL = "//a[text()='New Customer']";
	@FindBy(linkText = "New Customer")
	WebElement NEWCUSTOMER_LBL;
	
//	public static String EDITCUSTOMER_LBL = "//a[text()='Edit Customer']";
	@FindBy(linkText = "Edit Customer")
	WebElement EDITCUSTOMER_LBL;
	
	
	public String getHomePageWelcomeText() {
		waitForElemenVisible(WELCOME_LBL);
		return getTextElement(WELCOME_LBL);
	}
	
	public NewCustomerPage clickNewCustomerButton() {
		waitForElemenVisible(NEWCUSTOMER_LBL);
		clickToElement(NEWCUSTOMER_LBL);
		return PageFactory.initElements(driver, NewCustomerPage.class);
	} 
	
	public EditCustomerPage clickEditCustomerButton() {
		waitForElemenVisible(EDITCUSTOMER_LBL);
		clickToElement(EDITCUSTOMER_LBL);
		return PageFactory.initElements(driver, EditCustomerPage.class);
	} 

}
