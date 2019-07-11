package live.pageobject;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import live.pageui.LiveMyDashBoardPageUI;

public class LiveMyDashBoardPageObject extends AbstractPage {
	WebDriver driver;

	public LiveMyDashBoardPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public boolean isMyDashBoardDisplayed() {
		waitForControlVisible(driver, LiveMyDashBoardPageUI.MY_DASHBOARD_LABEL);
		return isControlDisplayed(driver, LiveMyDashBoardPageUI.MY_DASHBOARD_LABEL);
	}
}
