package pageobjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageui.HomePageUI;
import common.AbstractPage;

public class HomePageObject extends AbstractPage {
	WebDriver driver;

	public HomePageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public boolean isHomePageDisplayed() {
		waitForControlVisible(driver, HomePageUI.welcome_Message);
		return isControlDisplayed(driver, HomePageUI.welcome_Message);
	}

	public boolean isUserIdUnDisplayed(String userId) {
		return isControlUndisplayed(driver, HomePageUI.welcome_UserID, userId);
	}
}
