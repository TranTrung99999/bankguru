package live.pageobject;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;

public class LiveMobilePageObject extends AbstractPage {
	WebDriver driver;
	public LiveMobilePageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
}
