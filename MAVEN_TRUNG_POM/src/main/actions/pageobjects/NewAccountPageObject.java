package pageobjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageui.NewAccountPageUI;
import common.AbstractPage;

public class NewAccountPageObject extends AbstractPage {
	WebDriver driver;

	public NewAccountPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public void inputCustomerID(String customerID) {
		waitForControlVisible(driver, NewAccountPageUI.CUSTOMER_ID);
		sendkeyToElement(driver, NewAccountPageUI.CUSTOMER_ID, customerID);
	}

	public void selectAccountType(String accountType) {
		waitForControlVisible(driver, NewAccountPageUI.ACCOUNTTYPE_CBX);
		selectItemInDropdown(driver, NewAccountPageUI.ACCOUNTTYPE_CBX, accountType);
	}

	public void inputInitialDeposit(String initialDeposit) {
		waitForControlVisible(driver, NewAccountPageUI.INITIAL_DEPOSIT);
		sendkeyToElement(driver, NewAccountPageUI.INITIAL_DEPOSIT, initialDeposit);
	}

	public void clickSubmitBtn() {
		waitForControlVisible(driver, NewAccountPageUI.SUBMIT_BTN);
		clickToElement(driver, NewAccountPageUI.SUBMIT_BTN);
	}

	public String getText_NewAccount_SuccessMsg() {
		waitForControlVisible(driver, NewAccountPageUI.SUCCESSFUL_MSN);
		return getTextFromElement(driver, NewAccountPageUI.SUCCESSFUL_MSN);
	}

	public String getText_NewAccount_Deposit() {
		waitForControlVisible(driver, NewAccountPageUI.CURRENT_AMOUNT);
		return getTextFromElement(driver, NewAccountPageUI.CURRENT_AMOUNT);
	}

	public String getText_NewAccount_AccountID() {
		waitForControlVisible(driver, NewAccountPageUI.ACCOUNT_ID);
		return getTextFromElement(driver, NewAccountPageUI.ACCOUNT_ID);
	}

}
