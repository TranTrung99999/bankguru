package live.pageobject;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;

public class LiveMyAccountPageObject extends AbstractPage {
	WebDriver driver;

	public LiveMyAccountPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
}
