package Common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.bankguru.actions.HomePage;
import com.bankguru.actions.LogInPage;
import com.bankguru.actions.NewCustomerPage;
import com.google.gson.Gson;

import ObjectPageJson.JsonData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class CommonTestCase {

	WebDriver driver;
	LogInPage logInPage;
	HomePage homePage;
	NewCustomerPage newCustomerPage;

	public WebDriver openBrowser(String browser, String version, String url) {
		if (browser.equals("chrome")) {
			ChromeDriverManager.getInstance().version(version).setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			FirefoxDriverManager.getInstance().version(version).setup();
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();

		return driver;

	}

	public void closeBrowser() {
		driver.quit();
	}

	public String randomemail() {
		Random rand = new Random();
		int number = rand.nextInt(900000);
		String numberString = Integer.toString(number);
		return numberString;

	}

	public void assertEqualCommon(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}

	public void assertTrue(Boolean condition) {
		Assert.assertTrue(condition);
	}

	public void assertFalse(Boolean condition) {
		Assert.assertFalse(condition);
	}

	public void logInTestCase(String username, String password) {
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.inputUserID(username);
		logInPage.inputPassword(password);
		logInPage.clickLogin();
	}

	public static String readFile(String filename) {
		String result = "";
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(filename));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
//				System.out.println("value " + line);

			}
			result = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public static JsonData getDataJson(String JsonFile) {
		String json = readFile(JsonFile);
		return new Gson().fromJson(json, JsonData.class);
	}

	public void addNewCustomer(String customerName, String address, String dateOfBirth, String gender, String city,
			String state, String pin, String phone, String email, String password) {
		newCustomerPage = PageFactory.initElements(driver, NewCustomerPage.class);
		newCustomerPage.inputCustomerName(customerName);
		newCustomerPage.inputAddress(address);
		newCustomerPage.inputDateOfBirth(dateOfBirth);
		newCustomerPage.selectGender(gender);
		newCustomerPage.inputCity(city);
		newCustomerPage.inputState(state);
		newCustomerPage.inputPIN(pin);
		newCustomerPage.inputTelephone(phone);
		newCustomerPage.inputEmail(email);
		newCustomerPage.inputPassword(password);
		newCustomerPage.clickSubmit();
	}
	
	///////////////Reports

	ExtentHtmlReporter htmlReport;
	ExtentReports extent;
	ExtentTest test;

	public void inititalReport(String report) {
		htmlReport = new ExtentHtmlReporter(
				System.getProperty("user.dir").concat("/test-output/ExtendReport/" + report));
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		htmlReport.config().setReportName("Regression Testing");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTestViewChartLocation(ChartLocation.TOP);
	}

	public void logTestCase(String name) {
		test = extent.createTest(name);
	}

	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test Case Failed is " + result.getName());
			test.log(Status.FAIL, "Test Case Failed is " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Case Passed is " + result.getName());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case Skipped is " + result.getName());
		}
	}

	public void exportReport() {
		extent.flush();
		extent.close();
	}
}
