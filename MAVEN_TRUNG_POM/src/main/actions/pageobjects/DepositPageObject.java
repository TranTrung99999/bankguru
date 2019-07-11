package pageobjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageui.DepositPageUI;
import common.AbstractPage;

public class DepositPageObject extends AbstractPage {
	WebDriver driver;

	public DepositPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public void inputAccountNo(String accountNo) {
		waitForControlVisible(driver, DepositPageUI.ACCOUNT_NO);
		sendkeyToElement(driver, DepositPageUI.ACCOUNT_NO, accountNo);
	}

	public void inputAmount(String amount) {
		waitForControlVisible(driver, DepositPageUI.AMOUNT);
		sendkeyToElement(driver, DepositPageUI.AMOUNT, amount);
	}

	public void inputDescription(String description) {
		waitForControlVisible(driver, DepositPageUI.DESCRIPTION);
		sendkeyToElement(driver, DepositPageUI.DESCRIPTION, description);
	}

	public void clickSubmitButton() {
		waitForControlVisible(driver, DepositPageUI.SUBMIT_BTN);
		clickToElement(driver, DepositPageUI.SUBMIT_BTN);
	}

	public String getTextDepositSuccessfulMsg() {
		waitForControlVisible(driver, DepositPageUI.SUCCESS_MSG);
		return getTextFromElement(driver, DepositPageUI.SUCCESS_MSG);
	}

	public String getTextCurrentAmount() {
		waitForControlVisible(driver, DepositPageUI.CURRENT_AMOUNT);
		return getTextFromElement(driver, DepositPageUI.CURRENT_AMOUNT);
	}
}
