package Common;

import java.util.List;
//import java.util.Random;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
	protected WebDriver driver;
	
	public CommonFunctions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openUrl(String url) {
		driver.get(url);
	}
	
	public String getTitle() {
		return driver.getTitle();	
		
	}
	public String getCurrentURL() {
		return driver.getCurrentUrl();		 
	}
	
	public String getPageSource() {
		return driver.getPageSource();
	}
	
	public void backToPage() {
		driver.navigate().back();  //driver.navigate().to("url");	
	}
	
//	public void backToPages(int numberOfPage) {
////		for
//		driver.navigate().back();  	
//	}
	
	public void backToTwoPreviousPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		js.executeScript("window.history.go(-2)");
	}
	public void backToPreviousPages(int numberOfPage) {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("window.history.go(-"+ numberOfPage + ")");
	}
	
	public void forwardToPage() {
		driver.navigate().forward();
	}
	
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	public void clickToElement(WebElement element) {
//		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}
	
	public String getTextElement(WebElement element) {
//		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	}
	
	public void clearElement(WebElement element) {
//		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
	}
	
	public void inputElement(WebElement element, String value) {
//		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(value);
	}
	
	public void selectCombobox(String locator, String value) {
		Select combobox = new Select(driver.findElement(By.xpath(locator)));
		combobox.deselectByVisibleText(value);		
	}
	
	public String getTextComboboxSelected(String locator) {
		Select combobox = new Select(driver.findElement(By.xpath(locator)));
		return combobox.getFirstSelectedOption().getText();
	}
	
	public String getAttribute(String locator, String attribute) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getAttribute(attribute);
	}
	
	public int getSizeOfList(String locator) {
		List<WebElement> element = driver.findElements(By.xpath(locator));
		return element.size(); //Not really sure
	}
	
	public boolean isElementDisplayed(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}
	
	public boolean isElementSelected(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isSelected();
	}
	
	public boolean isElementEnabled(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isEnabled();
	}
	
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void cancelAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public String getTextAlert() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
	
	public void inputAlert(String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}
	
	public void switchWindowByTitle(String title) {
		Set<String>allWindows = driver.getWindowHandles();
			for(String childWindows : allWindows) {
				driver.switchTo().window(childWindows);
				String childTitle = driver.getTitle();
				if(childTitle.equals(title)) {
					break;
				}
			}
	}
	
	public String getWindow() {
		return driver.getWindowHandle();
	}
	
	public void switchToIframe(String locator) {
		WebElement iframeLookingfor = driver.findElement(By.xpath(locator));
		driver.switchTo().frame(iframeLookingfor);
	}
	
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	public void hoverMouse(String locator) {
		WebElement hoverElement = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.moveToElement(hoverElement).perform();
	}
	
	public void doubleClick(String locator) {
		WebElement btnDouble = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.doubleClick(btnDouble).perform();
	}
	
	public void rightClick(String locator) {
		WebElement btnRight = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.contextClick(btnRight).build().perform();
	}
	
	public void dragAndDrop(String locatorFrom, String locatorTarget) {
		WebElement dragFrom = driver.findElement(By.xpath(locatorFrom));
		WebElement target = driver.findElement(By.xpath(locatorTarget));
		Actions action = new Actions(driver);
		action.clickAndHold(dragFrom).moveToElement(target).release(target).build().perform();
	}

	public void clickAndHold(String locator, int itemFrom, int itemTarget) {
		List<WebElement> listItems = driver.findElements(By.xpath(locator));
		Actions action = new Actions(driver);
		action.clickAndHold(listItems.get(itemFrom)).clickAndHold(listItems.get(itemTarget)).click().perform();
		action.release();
	}
	
	public void sendKeyPress(WebElement element, Keys key) {
//		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
		element.sendKeys(key);
	}
	
	public void uploadBySendKeys(String locator, String value) {
		WebElement btnBrowse = driver.findElement(By.xpath(locator));
		btnBrowse.sendKeys(value);
	}
	
	//Need to review
	public void executeScriptBrowser(String javaScript) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(javaScript);
	}
	
	//Need to review
	public void executeScriptElement(String locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(locator));
		js.executeScript("arguments[0].click()", element);
	}
	
	//Need to review
	public Object scrollToBottomPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("$('html, body').animate({scrollTop:$(document).height()}, 'slow')");		
	}
	
	//Need to review
	public Object scrollToElement(String locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(locator));
//		return js.executeScript("$('body').scrollTo()", element);	
		return js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	//Need to review
	public void highlightElement(String locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("$(locator).css('border', '4px solid blue'");	
	}
	//Need to review
//	public Object removeAttributeElement(String locator, String attribute) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		//WebElement element = driver.findElement(By.xpath(locator));
//		return js.executeScript("$(locator).removeAttr(attribute)");	
//	}


	public void removeAttributeElement(WebElement element, String attribute) {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
//		WebElement element = driver.findElement(By.xpath(locator));
		javascript.executeScript("arguments[0].removeAttribute('" + attribute + "')", element);
	}
	
	public void waitForElemenVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//??
	public void waitForElemenInvisible(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
	}
	
	public void waitForAlertPresence() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	

}
