package pageobjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageui.RegisterPageUI;
import common.AbstractPage;

public class RegisterPageObject extends AbstractPage {
	WebDriver driver;

	public RegisterPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public void inputRandomwEmail(String email) {
		waitForControlVisible(driver, RegisterPageUI.EMAIL_ID_TXT);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_ID_TXT, email);
	}

	public void clickSubmitBtn() {
		waitForControlVisible(driver, RegisterPageUI.SUBMIT_BTN);
		clickToElement(driver, RegisterPageUI.SUBMIT_BTN);
	}

	public String getUserID() {
		waitForControlVisible(driver, RegisterPageUI.USER_ID_TEXT);
		return getTextFromElement(driver, RegisterPageUI.USER_ID_TEXT);
	}

	public String getPassword() {
		waitForControlVisible(driver, RegisterPageUI.PASSWORD_ID_TEXT);
		return getTextFromElement(driver, RegisterPageUI.PASSWORD_ID_TEXT);
	}

	public LoginPageObject openLoginPage(String url) {
		openAnyUrl(driver, url);
		return new LoginPageObject(driver);
	}

}
