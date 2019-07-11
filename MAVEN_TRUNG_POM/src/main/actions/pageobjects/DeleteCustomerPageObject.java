package pageobjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageui.DeleteCustomerPageUI;
import common.AbstractPage;

public class DeleteCustomerPageObject extends AbstractPage {
	WebDriver driver;

	public DeleteCustomerPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public void inputCustomerID(String accountNo) {
		waitForControlVisible(driver, DeleteCustomerPageUI.CUSTOMER_ID);
		sendkeyToElement(driver, DeleteCustomerPageUI.CUSTOMER_ID, accountNo);
	}

	public void clickSubmitButton() {
		waitForControlVisible(driver, DeleteCustomerPageUI.SUBMIT_BTN);
		clickToElement(driver, DeleteCustomerPageUI.SUBMIT_BTN);
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
