package pageobjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageui.FundTransferPageUI;
import common.AbstractPage;

public class FundTransferPageObject extends AbstractPage {
	WebDriver driver;

	public FundTransferPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public void inputPayerAccount(String payerAccount) {
		waitForControlVisible(driver, FundTransferPageUI.PAYER_ACCOUNT_NO);
		sendkeyToElement(driver, FundTransferPageUI.PAYER_ACCOUNT_NO, payerAccount);
	}

	public void inputPayeeAccount(String payeeAccount) {
		waitForControlVisible(driver, FundTransferPageUI.PAYEE_ACCOUNT_NO);
		sendkeyToElement(driver, FundTransferPageUI.PAYEE_ACCOUNT_NO, payeeAccount);
	}

	public void inputAmount(String amount) {
		waitForControlVisible(driver, FundTransferPageUI.AMOUNT);
		sendkeyToElement(driver, FundTransferPageUI.AMOUNT, amount);
	}

	public void inputDescription(String description) {
		waitForControlVisible(driver, FundTransferPageUI.DESCRIPTION);
		sendkeyToElement(driver, FundTransferPageUI.DESCRIPTION, description);
	}

	public void clickSubmitButton() {
		waitForControlVisible(driver, FundTransferPageUI.SUBMIT_BTN);
		clickToElement(driver, FundTransferPageUI.SUBMIT_BTN);
	}

	public String getText_AmountTransfer() {
		waitForControlVisible(driver, FundTransferPageUI.AMOUNT_TRANSFER);
		return getTextFromElement(driver, FundTransferPageUI.AMOUNT_TRANSFER);
	}
	public String getText_AmountTransfer_successfulMsg() {
		waitForControlVisible(driver, FundTransferPageUI.AMOUNT_TRANSFER_MSG);
		return getTextFromElement(driver, FundTransferPageUI.AMOUNT_TRANSFER_MSG);
	}

}
