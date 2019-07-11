package pageobjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageui.WithdrawPageUI;
import common.AbstractPage;

public class WithdrawPageObject extends AbstractPage {
	WebDriver driver;

	public WithdrawPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public void inputAccountNo(String accountID) {
		waitForControlVisible(driver, WithdrawPageUI.ACCOUNT_NO);
		sendkeyToElement(driver, WithdrawPageUI.ACCOUNT_NO, accountID);
	}

	public void inputAmount(String amount) {
		waitForControlVisible(driver, WithdrawPageUI.AMOUNT);
		sendkeyToElement(driver, WithdrawPageUI.AMOUNT, amount);
	}

	public void inputDescription(String description) {
		waitForControlVisible(driver, WithdrawPageUI.DESCRIPTION);
		sendkeyToElement(driver, WithdrawPageUI.DESCRIPTION, description);
	}

	public void clickSubmitButton() {
		waitForControlVisible(driver, WithdrawPageUI.SUBMIT_BTN);
		clickToElement(driver, WithdrawPageUI.SUBMIT_BTN);
	}

	public String getTextsuccessfulMsg() {
		waitForControlVisible(driver, WithdrawPageUI.SUCCESSFUL_MSG);
		return getTextFromElement(driver, WithdrawPageUI.SUCCESSFUL_MSG);
	}

	public String getTextCurrentBalance() {
		waitForControlVisible(driver, WithdrawPageUI.CURRENT_BALANCE);
		return getTextFromElement(driver, WithdrawPageUI.CURRENT_BALANCE);
	}
}
