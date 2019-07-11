package com.bankguru.customer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ObjectPageJson.AbstractJson;
import common.AbstractTest;
import pageobjects.HomePageObject;
import pageobjects.LoginPageObject;
import pageobjects.NewCustomerPageObject;
import pageobjects.RegisterPageObject;

public class NewCustomer extends AbstractTest {
	WebDriver driver;
	WebDriverWait wait;
	private LoginPageObject loginpage;
	private HomePageObject homepage;
	private RegisterPageObject registerpage;
	private NewCustomerPageObject newCustomerPage;
	private AbstractJson data;
	private String userPath = System.getProperty("user.dir");
	private String userId, password, loginPageUrl, emailAddress;
@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String version, String urlName) {
		driver = openMultiBrowser(browserName, version, urlName);
		String pathDataJson = userPath.concat("/data/").concat("bankguru.json");
		emailAddress = "automation05" + randomNumber() + "@gmail.com";
		loginpage = new LoginPageObject(driver);
		data = getDataJson(pathDataJson);
		log.info("Precondition - Register - Step 01: Get current url");
		loginPageUrl = loginpage.getLoginPageUrl();
		log.info("Precondition - Register - Step 02: Click to \"Here\" link");
		registerpage = loginpage.clickHereLink();
		log.info("Precondition - Register - Step 03: Input Email to text box");
		registerpage.inputRandomwEmail(emailAddress);
		log.info("Precondition - Register - Step 04: Click Submit button");
		registerpage.clickSubmitBtn();
		log.info("Precondition - Register - Step 05: Get UserID");
		userId = registerpage.getUserID();
		log.info("Precondition - Register - Step 06: Get Password");
		password = registerpage.getPassword();
		log.info("Precondition - Login - Step 01: Navigate to Login page");
		loginpage = registerpage.openLoginPage(loginPageUrl);
		log.info("Precondition - Login - Step 05: Input UserID");
		loginpage.inputUsernameTextbox(userId);
		log.info("Precondition - Login - Step 05: Input Password");
		loginpage.inputPasswordTextbox(password);
		log.info("Precondition - Login - Step 04: Click Submit button");
		homepage = loginpage.clickSubmitButton();
		log.info(
				"Precondition - Login - Step 05: Verify Home Page display message \"Welcome To Manager's Page of Guru99 Bank\"");
		verifyTrue(homepage.isHomePageDisplayed());
		log.info("Precondition - Login - Step 06: Verify Home Page undisplay message \"123456\"");
		verifyTrue(homepage.isUserIdUnDisplayed("123456"));
	}

	@Test
	public void TC_01_NewCustomer_NameCannotBeEmpty() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Do not enter to a value in NAME field and press Tab");
		newCustomerPage.PressTabToNewCustomerName();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getNameCannotEmptyErrorMsg(),
				newCustomerPage.getTextNewCustomerNameErrorMsg());
	}

	@Test
	public void TC_02_NewCustomer_NameCannotNumeric() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter numeric value to NAME field");
		newCustomerPage.InputNumericToNewCustomerName(data.getNewCustomer().getNumeric());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getNameCannotNumericErrorMsg(),
				newCustomerPage.getTextNewCustomerNameErrorMsg());
	}

	@Test
	public void TC_03_NewCustomer_NameCannotHaveSpecialCharacter() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter special character to NAME field");
		newCustomerPage.InputSpecialCharacterToNewCustomerName(data.getNewCustomer().getSpecialChar());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getNameCannotHaveSpecialCharacterErrorMsg(),
				newCustomerPage.getTextNewCustomerNameErrorMsg());
	}

	@Test
	public void TC_04_NewCustomer_NameFirstCharacterCannotSpace() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter space to NAME field");
		newCustomerPage.PressTabToNewCustomerName();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getNameFirstCharacterCannotHaveSpaceErrorMsg(),
				newCustomerPage.getTextNewCustomerNameErrorMsg());
	}

	@Test
	public void TC_05_NewCustomer_AddressCannotBeEmpty() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Do not enter to a value in ADDRESS field and press Tab");
		newCustomerPage.PressTabToNewCustomerAddress();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getAddressCannotEmptyErrorMsg(),
				newCustomerPage.getTextNewCustomerAddressErrorMsg());
	}

	@Test
	public void TC_06_NewCustomer_AddressFirstCharacterCannotSpace() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter space to CITY field");
		newCustomerPage.PressSpaceToNewCustomerAddress();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getAddressFirstCharacterCannotHaveSpaceErrorMsg(),
				newCustomerPage.getTextNewCustomerAddressErrorMsg());
	}

	@Test
	public void TC_07_NewCustomer_CityCannotBeEmpty() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Do not enter to a value in CITY field and press Tab");
		newCustomerPage.PressTabToNewCustomerCity();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getCityCannotEmptyErrorMsg(),
				newCustomerPage.getTextNewCustomerCityErrorMsg());
	}

	@Test
	public void TC_08_NewCustomer_CityCannotNumeric() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter numeric value to CITY field");
		newCustomerPage.InputNumericToNewCustomerCity(data.getNewCustomer().getNumeric());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getCityCannotNumericErrorMsg(),
				newCustomerPage.getTextNewCustomerCityErrorMsg());
	}

	@Test
	public void TC_09_NewCustomer_CityCannotHaveSpecialCharacter() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter special character to CITY field");
		newCustomerPage.InputSpecialCharacterToNewCustomerCity(data.getNewCustomer().getSpecialChar());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getCityCannotHaveSpecialCharacterErrorMsg(),
				newCustomerPage.getTextNewCustomerCityErrorMsg());
	}

	@Test
	public void TC_10_NewCustomer_CityFirstCharacterCannotSpace() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter space to CITY field");
		newCustomerPage.PressSpaceToNewCustomerCity();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getCityFirstCharacterCannotHaveSpaceErrorMsg(),
				newCustomerPage.getTextNewCustomerCityErrorMsg());
	}

	@Test
	public void TC_11_NewCustomer_StateCannotBeEmpty() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Do not enter to a value in STATE field and press Tab");
		newCustomerPage.PressTabToNewCustomerState();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getStateCannotEmptyErrorMsg(),
				newCustomerPage.getTextNewCustomerStateErrorMsg());
	}

	@Test
	public void TC_12_NewCustomer_StateCannotNumeric() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter numeric value to STATE field");
		newCustomerPage.InputNumericToNewCustomerState(data.getNewCustomer().getNumeric());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getStateCannotNumericErrorMsg(),
				newCustomerPage.getTextNewCustomerStateErrorMsg());
	}

	@Test
	public void TC_13_NewCustomer_StateCannotHaveSpecialCharacter() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter special character to STATE field");
		newCustomerPage.InputSpecialCharacterToNewCustomerState(data.getNewCustomer().getSpecialChar());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getStateCannotHaveSpecialCharacterErrorMsg(),
				newCustomerPage.getTextNewCustomerStateErrorMsg());
	}

	@Test
	public void TC_14_NewCustomer_StateFirstCharacterCannotSpace() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter space to STATE field");
		newCustomerPage.PressSpaceToNewCustomerState();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getStateFirstCharacterCannotHaveSpaceErrorMsg(),
				newCustomerPage.getTextNewCustomerStateErrorMsg());
	}

	@Test
	public void TC_15_NewCustomer_PINMustBeNumeric() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter character value in PIN field");
		newCustomerPage.InputValueIntoPIN(data.getNewCustomer().getPINvalue());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getPinMustBeNumericErrorMsg(),
				newCustomerPage.getTextNewCustomerPINErrorMsg());
	}

	@Test
	public void TC_16_NewCustomer_PINCannotBeEmpty() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Do not enter to a value in PIN field and press Tab");
		newCustomerPage.PressTabToNewCustomerPIN();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getPinCannotEmptyErrorMsg(),
				newCustomerPage.getTextNewCustomerPINErrorMsg());
	}

	@Test
	public void TC_17_NewCustomer_PINMustHave6Digits() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Do not enter to a value in STATE field and press Tab");
		newCustomerPage.InputValueIntoPIN(data.getNewCustomer().getPIN_3digit());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getPinMustHave6Digits(), newCustomerPage.getTextNewCustomerPINErrorMsg());
	}

	@Test
	public void TC_18_NewCustomer_PINCannotHaveSpecialCharacter() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter special character to PIN field");
		newCustomerPage.InputSpecialCharacterToNewCustomerPIN(data.getNewCustomer().getSpecialChar());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getPinCannotHaveSpecialCharacterErrorMsg(),
				newCustomerPage.getTextNewCustomerPINErrorMsg());
	}

	@Test
	public void TC_19_NewCustomer_PINFirstCharacterCannotSpace() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter space to PIN field");
		newCustomerPage.PressSpaceToNewCustomerPIN();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getPinCannotHaveFirstBlankSpaceErrorMsg(),
				newCustomerPage.getTextNewCustomerPINErrorMsg());
	}

	@Test
	public void TC_20_NewCustomer_PINCannotHaveBlankSpace() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter space to PIN field");
		newCustomerPage.InputValueIntoPIN(data.getNewCustomer().getPIN_haveSpace());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getPinCannotHaveBlankSpace(),
				newCustomerPage.getTextNewCustomerPINErrorMsg());
	}

	@Test
	public void TC_21_NewCustomer_TelephoneCannotBeEmpty() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Do not enter to a value in Telephone field and press Tab");
		newCustomerPage.PressTabToNewCustomerTelephone();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getTelephoneCannotEmptyErrorMsg(),
				newCustomerPage.getTextNewCustomerTelephoneErrorMsg());
	}

	@Test
	public void TC_22_NewCustomer_TelephoneFirstCharacterCannotSpace() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter space to Telephone field");
		newCustomerPage.PressSpaceToNewCustomerTelephone();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getTelephoneFirstCharacterCannotHaveSpaceErrorMsg(),
				newCustomerPage.getTextNewCustomerTelephoneErrorMsg());
	}

	@Test
	public void TC_23_NewCustomer_TelephoneCannotHaveBlankSpace() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter space to Telephone field");
		newCustomerPage.InputValueIntoTelephone(data.getNewCustomer().getTelephone_invalid());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getTelephoneCannotHaveSpace(),
				newCustomerPage.getTextNewCustomerTelephoneErrorMsg());
	}

	@Test
	public void TC_24_NewCustomer_TelephoneCannotHaveSpecialCharacter() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter special character to Telephone field");
		newCustomerPage.InputSpecialCharacterToNewCustomerTelephone(data.getNewCustomer().getSpecialChar());
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getTelephoneCannotHaveSpecialCharacterErrorMsg(),
				newCustomerPage.getTextNewCustomerTelephoneErrorMsg());
	}

	@Test
	public void TC_25_NewCustomer_EmailCannotBeEmpty() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Do not enter to a value in Email field and press Tab");
		newCustomerPage.PressTabToNewCustomerEmail();
		log.info("NewCustomer - Step 03: An error message must show");
		verifyEquals(data.getNewCustomer().getEmailCannotEmptyErrorMsg(),
				newCustomerPage.getTextNewCustomerEmailErrorMsg());
	}

	@Test
	public void TC_26_NewCustomer_EmailMustBeCorrectFormat() {
		log.info("NewCustomer - Step 01: Open New Customer Page");
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("NewCustomer - Step 02: Enter invalid to Email field");
		newCustomerPage.InputValueIntoEmail(data.getNewCustomer().getEmail_invalid());
		log.info("NewCustomer - Step 03: An error message \"Email-ID is not valid\" must show");
		verifyEquals(data.getNewCustomer().getEmailMustBeCorrectFormat(),
				newCustomerPage.getTextNewCustomerEmailErrorMsg());
	}

	@AfterClass
	public void afterClass() {
		closeBroswer(driver);
	}

}
