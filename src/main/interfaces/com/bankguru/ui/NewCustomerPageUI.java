package com.bankguru.ui;

public class NewCustomerPageUI {
	//NC1
	public static String CUSTOMERNAME_TXT = "//input[@name='name']";	
	public static String CUSTOMERNAME_ERRORMESSAGE_LBL = "//label[@id='message' and contains(@style,'visibil')]";
	
	//NC05
	public static String ADDRESS_TXT = "//textarea[@name='addr']";	
	public static String ADDRESS_ERRORMESSAGE_LBL = "//label[@id='message3' and contains(@style,'visibil')]";	
	
	//NC08
	public static String CITY_TXT = "//input[@name='city']";	
	public static String CITY_ERRORMESSAGE_LBL = "//label[@id='message4' and contains(@style,'visibil')]";	
	
	//NC12
	public static String STATE_TXT = "//input[@name='state']";	
	public static String STATE_ERRORMESSAGE_LBL = "//label[@id='message5' and contains(@style,'visibil')]";	
	
	//NC16
	public static String PIN_TXT = "//input[@name='pinno']";	
	public static String PIN_ERRORMESSAGE_LBL = "//label[@id='message6' and contains(@style,'visibil')]";	
	
	//NC22
	public static String MOBILENUMBER_TXT = "//input[@name='telephoneno']";	
	public static String MOBILENUMBER_ERRORMESSAGE_LBL = "//label[@id='message7' and contains(@style,'visibil')]";	
	
	//NC26
	public static String EMAIL_TXT = "//input[@name='emailid']";	
	public static String EMAIL_ERRORMESSAGE_LBL = "//label[@id='message9' and contains(@style,'visibil')]";	
	
	//NC30
	public static String CUSTOMERNAME_LBL = "//input[@name='name']//../preceding-sibling::td";	
	public static String ADDRESS_LBL = "//textarea[@name='addr']//../preceding-sibling::td";	
	public static String CITY_LBL = "//input[@name='city']//../preceding-sibling::td";	
	public static String STATE_LBL = "//input[@name='state']//../preceding-sibling::td";
	public static String PIN_LBL = "//input[@name='pinno']//../preceding-sibling::td";
	public static String MOBILENUMBER_LBL = "//input[@name='telephoneno']//../preceding-sibling::td";	
	public static String EMAIL_LBL = "//input[@name='emailid']//../preceding-sibling::td";	
	
	public static String GENDERMALE_RBTN = "//input[@value='m']";
	public static String GENDERFEMALE_RBTN = "//input[@value='f']"; 
	public static String DATEOFBIRTH_DDL = "//input[@id='dob']";  
//	public static String DATEOFBIRTH_DDL = "input#dob";
	public static String PASSWORD_TXT = "//input[@name='password']";
	public static String SUBMIT_BTN = "//input[@value='Submit']";
	
	
	public static String CUSTOMERIDVALUE_LBL = "//td[text()='Customer ID']/following-sibling::td";
	
}
