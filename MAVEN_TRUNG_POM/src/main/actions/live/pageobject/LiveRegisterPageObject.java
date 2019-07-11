package live.pageobject;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import live.pageui.LiveRegisterPageUI;

public class LiveRegisterPageObject extends AbstractPage {
	WebDriver driver;

	public LiveRegisterPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public LiveMyDashBoardPageObject clickToRegistercButton(WebDriver driver) {
		waitForControlVisible(driver, LiveRegisterPageUI.REGISTER_BTN);
		clickToElement(driver, LiveRegisterPageUI.REGISTER_BTN);
		return LiveGuru_PageFactoryManager.getMyDashboardPage(driver);
	}
}
