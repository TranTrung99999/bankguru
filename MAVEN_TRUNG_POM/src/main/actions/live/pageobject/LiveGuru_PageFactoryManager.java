package live.pageobject;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;

public class LiveGuru_PageFactoryManager {
	public static LiveMyAccountPageObject getLoginPage(WebDriver driver) {
		return new LiveMyAccountPageObject(driver);
	}

	public static LiveHomePageObject getHomePage(WebDriver driver) {
		return new LiveHomePageObject(driver);
	}

	public static LiveRegisterPageObject getResigterPage(WebDriver driver) {
		return new LiveRegisterPageObject(driver);
	}

	public static LiveMyAccountPageObject getMyAccountPage(WebDriver driver) {
		return new LiveMyAccountPageObject(driver);
	}

	public static LiveMyDashBoardPageObject getMyDashboardPage(WebDriver driver) {
		return new LiveMyDashBoardPageObject(driver);
	}

	public static LiveMobilePageObject getMobilePage(WebDriver driver) {
		return new LiveMobilePageObject(driver);
	}

	public static AbstractPage getTVPage(WebDriver driver) {
		return new LiveTVPageObject(driver);
	}

}
