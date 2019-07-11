package pageobjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageui.BalanceEnquiryPageUI;
import common.AbstractPage;

public class BalanceEnquiryPageObject extends AbstractPage {
	WebDriver driver;

	public BalanceEnquiryPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public void inputAccountNo(String accountNo) {
		waitForControlVisible(driver, BalanceEnquiryPageUI.ACCOUNT_NO);
		sendkeyToElement(driver, BalanceEnquiryPageUI.ACCOUNT_NO, accountNo);
	}

	public void clickSubmitButton() {
		waitForControlVisible(driver, BalanceEnquiryPageUI.SUBMIT_BTN);
		clickToElement(driver, BalanceEnquiryPageUI.SUBMIT_BTN);
	}

	public String getText_Balance() {
		waitForControlVisible(driver, BalanceEnquiryPageUI.BALANCE);
		return getTextFromElement(driver, BalanceEnquiryPageUI.BALANCE);
	}

	public String getText_Balance_successfulMsg() {
		waitForControlVisible(driver, BalanceEnquiryPageUI.BALANCE_ENQUIRY_MSG);
		return getTextFromElement(driver, BalanceEnquiryPageUI.BALANCE_ENQUIRY_MSG);
	}

}
