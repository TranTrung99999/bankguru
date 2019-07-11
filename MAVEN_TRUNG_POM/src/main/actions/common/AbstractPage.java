package common;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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

import bankguru.pageui.AbstractPageUI;
import live.pageobject.LiveGuru_PageFactoryManager;
import live.pageobject.LiveHomePageObject;
import live.pageobject.LiveMyAccountPageObject;
import live.pageui.LiveAbstractPageUI;
import pageobjects.BalanceEnquiryPageObject;
import pageobjects.DeleteAccountPageObject;
import pageobjects.DeleteCustomerPageObject;
import pageobjects.DepositPageObject;
import pageobjects.EditCustomerPageObject;
import pageobjects.FundTransferPageObject;
import pageobjects.HomePageObject;
import pageobjects.NewAccountPageObject;
import pageobjects.NewCustomerPageObject;
import pageobjects.PageFactoryManager;
import pageobjects.WithdrawPageObject;

public class AbstractPage {
	private int longTimeOut = 60;
	private int shortTimeOut = 5;

	// Web Browser
	public void openAnyUrl(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(longTimeOut, TimeUnit.SECONDS);
	}

	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrentPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public void backToPreviousPage(WebDriver driver) {
		driver.navigate().back();
	}

	public void refreshCurrentPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void forwardPage(WebDriver driver) {
		driver.navigate().forward();
	}

	// Web Element
	public void clickToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}

	public void clickToElement(WebDriver driver, String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		System.out.println("Click to dynamic element " + locator);
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}

	public void sendkeyToElement(WebDriver driver, String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(value);
	}

	public void sendkeyToElement(WebDriver driver, String locator, String inputValue, String... values) {
		locator = String.format(locator, (Object[]) values);
		System.out.println("Sendkey to dynamic element" + locator + "....");
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(inputValue);
	}

	public void sendKeysToDatePicker(WebDriver driver, String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(value);
	}

	public void selectItemInDropdown(WebDriver driver, String locator, String value) {
		Select element = new Select(driver.findElement(By.xpath(locator)));
		element.selectByVisibleText(value);
	}

	public void selectItemInDropDown(WebDriver driver, String locator, String item, String value) {
		locator = String.format(locator, value);
		System.out.println("Click to dynamic element" + locator);
		Select select = new Select(driver.findElement(By.xpath(locator)));
		select.selectByVisibleText(item);
	}

	public void selectItemInCustomDropDownList(WebDriver driver, String locatorDropdown, String locator, String value) {
		WebElement dropdown = driver.findElement(By.xpath(locatorDropdown));
		dropdown.click();
		List<WebElement> list = driver.findElements(By.xpath(locator));
		for (WebElement element : list) {
			if (element.getText().equalsIgnoreCase(value)) {
				element.click();
				break;
			}
		}

	}

	public String getFirstItemSelected(WebDriver driver, String locator, String item) {
		Select select = new Select(driver.findElement(By.xpath(locator)));
		return select.getFirstSelectedOption().getText();
	}

	public String getAttributeValue(WebDriver driver, String locator, String attributeName, String value) {
		locator = String.format(locator, value);
		WebElement element = driver.findElement(By.xpath(locator));
		return attributeName = element.getAttribute(locator);
	}

	public String getTextFromElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	}

	public String getTextFromElement(WebDriver driver, String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		System.out.println("Get Text to dynamic element" + locator + "....");
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	}

	public int getSizeElement(WebDriver driver, String locator) {
		List<WebElement> elements = driver.findElements(By.xpath(locator));
		return elements.size();
	}

	public void checkToCheckbox(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		if (!element.isSelected()) {
			element.click();
		}

	}

	public void uncheckToCheckBox(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		if (element.isSelected()) {
			element.click();
		}

	}

	public boolean isControlDisplayed(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public boolean isControlDisplayed(WebDriver driver, String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		System.out.println("Display dynamic element" + locator + "....");
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public boolean isControlUndisplayed(WebDriver driver, String locator) {
		Date date = new Date();
		System.out.println("Started time = " + date.toString());
		overrideGlobalTimeOut(driver, shortTimeOut);
		List<WebElement> element = driver.findElements(By.xpath(locator));
		if (element.size() == 0) {
			date = new Date();
			System.out.println("End Time = " + date.toString());
			overrideGlobalTimeOut(driver, longTimeOut);
			return true;
		} else {
			date = new Date();
			System.out.println("End Time = " + date.toString());
			overrideGlobalTimeOut(driver, longTimeOut);
			return false;
		}
	}

	public boolean isControlUndisplayed(WebDriver driver, String locator, String... value) {
		Date date = new Date();
		System.out.println("Started time = " + date.toString());
		overrideGlobalTimeOut(driver, shortTimeOut);
		locator = String.format(locator, (Object[]) value);
		List<WebElement> element = driver.findElements(By.xpath(locator));
		if (element.size() == 0) {
			date = new Date();
			System.out.println("End Time = " + date.toString());
			overrideGlobalTimeOut(driver, longTimeOut);
			return true;
		} else {
			date = new Date();
			System.out.println("End Time = " + date.toString());
			overrideGlobalTimeOut(driver, longTimeOut);
			return false;
		}
	}

	public void overrideGlobalTimeOut(WebDriver driver, long timeOut) {
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	}

	public boolean isControlSelected(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isSelected();
	}

	public boolean isControlEnable(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isEnabled();
	}

	public void acceptToAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void cancelToAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String getTextAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public String getTextAlert(WebDriver driver, String textOfAlert) {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void sendkeysToAlert(WebDriver driver, String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}

	public void switchToWindowByID(WebDriver driver, String parent) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindow : allWindows) {
			if (!runWindow.equals(parent)) {
				driver.switchTo().window(runWindow);
				break;
			}
		}
	}

	public void switchToWindowByTitle(WebDriver driver, String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindow : allWindows) {
			driver.switchTo().window(runWindow);
			String childWindow = driver.getTitle();
			if (childWindow.equals(title)) {
				break;
			}
		}
	}

	public boolean closeAllWindowsWithoutParent(WebDriver driver, String parent) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindow : allWindows) {
			if (!runWindow.equals(parent)) {
				driver.switchTo().window(runWindow);
				driver.close();
			}
		}
		driver.switchTo().window(parent);

		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}

	public void switchToIframe(WebDriver driver, String locator) {
		WebElement iframe = driver.findElement(By.xpath(locator));
		driver.switchTo().frame(iframe);
	}

	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	// Actions
	public void doubleClickToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	public void hoverToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void rightClickToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public void dragAndDropElement(WebDriver driver, String sourceLocator, String targetLocator) {
		WebElement dragFrom = driver.findElement(By.xpath(sourceLocator));
		WebElement DropHere = driver.findElement(By.xpath(targetLocator));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragFrom, DropHere).build().perform();
	}

	// keyPress
	public void sendKeyPress(WebDriver driver, String locator, Keys keypress) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(keypress);
	}

	public void keyUp(WebDriver driver, String locator, Keys keyUp) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.keyUp(element, keyUp);
	}

	public void keyDown(WebDriver driver, String locator, Keys keyDown) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.keyUp(element, keyDown);
	}

	// upload
	public void uploadFile(WebDriver driver, String locator, String fileName) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(fileName);
	}

	public void multipleUploadFile(WebDriver driver) {

	}

	// JavascriptExecutor
	public Object executeJavascriptToBrowser(WebDriver driver, String javaSript) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript(javaSript);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object executeJavascriptToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object scrollToBottomPage(WebDriver driver) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object scrollToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	// Wait

	private int timeOut = longTimeOut;

	public void waitForControlPresent(WebDriver driver, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public void waitForControlVisible(WebDriver driver, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitForControlVisible(WebDriver driver, String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		System.out.println("Waiting for element " + locator + " visible");
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitForControlClickable(WebDriver driver, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public void waitForControlNotVisible(WebDriver driver, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public void waitForAlertPresent(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void quitBroswer(WebDriver driver) {
		driver.quit();
	}

	// open multi page
	public HomePageObject openHomePage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.dynamic_page_link, "Manager");
		clickToElement(driver, AbstractPageUI.dynamic_page_link, "Manager");
		return PageFactoryManager.openHomePage(driver);
	}

	public NewCustomerPageObject openNewCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.dynamic_page_link, "New Customer");
		clickToElement(driver, AbstractPageUI.dynamic_page_link, "New Customer");
		return PageFactoryManager.openNewCustomerPageObject(driver);
	}

	public EditCustomerPageObject openEditCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.dynamic_page_link, "Edit Customer");
		clickToElement(driver, AbstractPageUI.dynamic_page_link, "Edit Customer");
		return PageFactoryManager.openEditCustomerPageObject(driver);
	}

	public DeleteAccountPageObject openDeleteAccountPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.dynamic_page_link, "Delete Account");
		clickToElement(driver, AbstractPageUI.dynamic_page_link, "Delete Account");
		return PageFactoryManager.openDeleteAccountPageObject(driver);
	}

	public DeleteCustomerPageObject openDeleteCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.dynamic_page_link, "Delete Customer");
		clickToElement(driver, AbstractPageUI.dynamic_page_link, "Delete Customer");
		return PageFactoryManager.openDeleteCustomerPageObject(driver);
	}

	public WithdrawPageObject openWithdrawPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.dynamic_page_link, "Withdrawal");
		clickToElement(driver, AbstractPageUI.dynamic_page_link, "Withdrawal");
		return PageFactoryManager.openWithdrawPageObject(driver);
	}

	public NewAccountPageObject openNewAccountPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.dynamic_page_link, "New Account");
		clickToElement(driver, AbstractPageUI.dynamic_page_link, "New Account");
		return PageFactoryManager.openNewAccountPageObject(driver);
	}

	public DepositPageObject openDepositPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.dynamic_page_link, "Deposit");
		clickToElement(driver, AbstractPageUI.dynamic_page_link, "Deposit");
		return PageFactoryManager.openDepositPageObject(driver);
	}

	public FundTransferPageObject openFunTransferPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.dynamic_page_link, "Fund Transfer");
		clickToElement(driver, AbstractPageUI.dynamic_page_link, "Fund Transfer");
		return PageFactoryManager.openFundTransferPageObject(driver);
	}

	public BalanceEnquiryPageObject openBalanceEnquiryTransferPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.dynamic_page_link, "Balance Enquiry");
		clickToElement(driver, AbstractPageUI.dynamic_page_link, "Balance Enquiry");
		return PageFactoryManager.openBalanceEnquiryPageObject(driver);
	}

	/* Live Guru Page */
	public LiveMyAccountPageObject openMyAccountPage(WebDriver driver) {
		waitForControlVisible(driver, LiveAbstractPageUI.dynamic_footer_link, "My Account");
		clickToElement(driver, LiveAbstractPageUI.dynamic_footer_link, "My Account");
		return LiveGuru_PageFactoryManager.getMyAccountPage(driver);
	}

	public void clickToDynamicButton(WebDriver driver, String titleName) {
		waitForControlVisible(driver, LiveAbstractPageUI.dynamic_button, titleName);
		clickToElement(driver, LiveAbstractPageUI.dynamic_button, titleName);
	}

	public void sendkeysToDynamicElement(WebDriver driver, String txtboxName, String value) {
		waitForControlVisible(driver, LiveAbstractPageUI.dynamic_textbox_radiobtn_checkbox, txtboxName);
		sendkeyToElement(driver, LiveAbstractPageUI.dynamic_textbox_radiobtn_checkbox, value, txtboxName);
	}

	public LiveHomePageObject openLogoutPage(WebDriver driver) {
		clickToElement(driver, LiveAbstractPageUI.dynamic_header_label_text, "Account");
		waitForControlVisible(driver, LiveAbstractPageUI.dynamic_header_link, "Log Out");
		clickToElement(driver, LiveAbstractPageUI.dynamic_header_link, "Log Out");
		return LiveGuru_PageFactoryManager.getHomePage(driver);
	}

	public AbstractPage openDynamicLivePage(WebDriver driver, String pageName) {
		waitForControlVisible(driver, LiveAbstractPageUI.dynamic_common_link, pageName);
		clickToElement(driver, LiveAbstractPageUI.dynamic_common_link, pageName);
		switch (pageName) {
		case "Mobile":
			return LiveGuru_PageFactoryManager.getMobilePage(driver);
		case "TV":
			return LiveGuru_PageFactoryManager.getTVPage(driver);
		default:
			return LiveGuru_PageFactoryManager.getHomePage(driver);
		}
	}

	public boolean isDynamicProductImageDisplayed(WebDriver driver, String imgName) {
		waitForControlVisible(driver, LiveAbstractPageUI.dynamic_product_image, imgName);
		return isControlDisplayed(driver, LiveAbstractPageUI.dynamic_product_image, imgName);
	}

	public boolean isDynamicProductNameDisplayed(WebDriver driver, String productName) {
		waitForControlVisible(driver, LiveAbstractPageUI.dynamic_product_name, productName);
		return isControlDisplayed(driver, LiveAbstractPageUI.dynamic_product_name, productName);
	}

	public boolean isDynamicProductPriceDisplayed(WebDriver driver, String productTitle, String expectedPrice) {
		waitForControlVisible(driver, LiveAbstractPageUI.dynamic_product_price, productTitle);
		String actualPrice = getTextFromElement(driver, LiveAbstractPageUI.dynamic_product_price, productTitle);
		System.out.println("Actual Price: " + actualPrice + "...");
		System.out.println("Actual Price: " + expectedPrice + "...");
		return actualPrice.trim() == expectedPrice;
	}

	public boolean isDynamicAddToCartButtonDisplayed(WebDriver driver, String productTitle) {
		waitForControlVisible(driver, LiveAbstractPageUI.dynamic_addToCart_btn, productTitle);
		return isControlDisplayed(driver, LiveAbstractPageUI.dynamic_addToCart_btn, productTitle);
	}

	public boolean isDynamicAddToWishlistOrAddToCompareButtonDisplayed(WebDriver driver, String productTitle,
			String wishlistOrCompare) {
		waitForControlVisible(driver, LiveAbstractPageUI.dynamic_addToWishList_Or_addToCompare_btn, productTitle,
				wishlistOrCompare);
		return isControlDisplayed(driver, LiveAbstractPageUI.dynamic_addToWishList_Or_addToCompare_btn, productTitle,
				wishlistOrCompare);
	}
}
