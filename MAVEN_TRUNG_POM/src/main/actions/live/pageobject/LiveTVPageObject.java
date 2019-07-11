package live.pageobject;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;

public class LiveTVPageObject extends AbstractPage {
	WebDriver driver;

	public LiveTVPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

}
