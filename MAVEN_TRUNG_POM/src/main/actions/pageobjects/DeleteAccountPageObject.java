package pageobjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageui.DeleteAccountPageUI;
import common.AbstractPage;

public class DeleteAccountPageObject extends AbstractPage {
	WebDriver driver;

	public DeleteAccountPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public void inputAccountNo(String accountNo) {
		waitForControlVisible(driver, DeleteAccountPageUI.ACCOUNT_NO);
		sendkeyToElement(driver, DeleteAccountPageUI.ACCOUNT_NO, accountNo);
	}

	public void clickSubmitButton() {
		waitForControlVisible(driver, DeleteAccountPageUI.SUBMIT_BTN);
		clickToElement(driver, DeleteAccountPageUI.SUBMIT_BTN);
	}

	public void acceptAlert() {
		waitForAlertPresent(driver);
		acceptToAlert(driver);
	}
	
	public String getTextAlert() {
		waitForAlertPresent(driver);
		return getTextAlert(driver);
	}
}
