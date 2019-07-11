package live.pageobject;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;

public class LiveHomePageObject extends AbstractPage {
	WebDriver driver;
	public LiveHomePageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
}
