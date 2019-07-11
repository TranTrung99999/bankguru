package pageobjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageui.LoginPageUI;
import common.AbstractPage;

public class LoginPageObject extends AbstractPage {
	WebDriver driver;

	public LoginPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public String getLoginPageUrl() {
		return getCurrentPageUrl(driver)	;
	}

	public void inputUsernameTextbox(String userName) {
		waitForControlVisible(driver, LoginPageUI.USERID_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.USERID_TEXTBOX, userName);
	}

	public void inputPasswordTextbox(String password) {
		waitForControlVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}
	public void inputOrganiztionTextbox(String organization) {
		waitForControlVisible(driver, LoginPageUI.ORGANIZTION_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.ORGANIZTION_TEXTBOX, organization);
	}

	public HomePageObject clickSubmitButton() {
		waitForControlVisible(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return PageFactoryManager.openHomePage(driver);
	}

	public RegisterPageObject clickHereLink() {
		waitForControlVisible(driver, LoginPageUI.HERE_LINK);
		clickToElement(driver, LoginPageUI.HERE_LINK);
		return new RegisterPageObject(driver);
	}

}
