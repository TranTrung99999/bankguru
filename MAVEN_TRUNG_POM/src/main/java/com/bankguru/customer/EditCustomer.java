package com.bankguru.customer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ObjectPageJson.AbstractJson;
import common.AbstractTest;
import pageobjects.EditCustomerPageObject;
import pageobjects.HomePageObject;
import pageobjects.LoginPageObject;
import pageobjects.NewCustomerPageObject;
import pageobjects.RegisterPageObject;

public class EditCustomer extends AbstractTest {
	WebDriver driver;
	WebDriverWait wait;
	private LoginPageObject loginpage;
	private HomePageObject homepage;
	private RegisterPageObject registerpage;
	private NewCustomerPageObject newCustomerPage;
	private EditCustomerPageObject editCustomerPage;
	private AbstractJson data;
	private String userPath = System.getProperty("user.dir");
	private String userId, password, loginPageUrl, emailAddress, customerID;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String version, String urlName) {
		driver = openMultiBrowser(browserName, version, urlName);

		String pathDataJson = userPath.concat("/data/").concat("bankguru.json");
		emailAddress = "automation05" + randomNumber() + "@gmail.com";
		loginpage = new LoginPageObject(driver);
		data = getDataJson(pathDataJson);
		log.info("Precondition - Register - Step 01: Get current url-> http://demo.guru99.com/v4/");
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
		log.info("Precondition - Login - Step 01: Navigate to Login page->http://demo.guru99.com/v4/");
		loginpage = registerpage.openLoginPage(loginPageUrl);
		log.info("Precondition - Login - Step 05: Input UserID");
		loginpage.inputUsernameTextbox(userId);
		log.info("Precondition - Login - Step 05: Input Password");
		loginpage.inputPasswordTextbox(password);
		log.info("Precondition - Login - Step 04: Click Submit button");
		homepage = loginpage.clickSubmitButton();
		log.info("Precondition - Login - Step 05: Verify Home Page display message");
		verifyTrue(homepage.isHomePageDisplayed());
		newCustomerPage = homepage.openNewCustomerPage(driver);
		newCustomerPage.InputNewCustomerName(data.getPayment().getCustomerName());
		newCustomerPage.InputNewCustomerDOB(data.getPayment().getDateOfBirth());
		newCustomerPage.InputNewCustomerAddress(data.getPayment().getAddress());
		newCustomerPage.InputNewCustomerCity(data.getPayment().getCity());
		newCustomerPage.InputNewCustomerState(data.getPayment().getState());
		newCustomerPage.InputValueIntoPIN(data.getPayment().getPIN());
		newCustomerPage.InputValueIntoTelephone(data.getPayment().getMobileNumber());
		newCustomerPage.InputValueIntoEmail(emailAddress);
		newCustomerPage.InputNewCustomerPassword(data.getPayment().getPasswordCustomer());
		newCustomerPage.clickSubmitButton();
		verifyEquals(data.getEditCustomer().getSuccessfulMessage(),
				newCustomerPage.getTextNewCustomerSuccessfulMessage());
		customerID = newCustomerPage.getTextcustomerID();

	}

	@Test
	public void TC_01_EditCustomer_customerIDCannotBeEmpty() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Do not enter to a value in CustomerID field and press Tab");
		editCustomerPage.PressTabToEditCustomerID();
		log.info("EditCustomer - Step 03: An error message must show");
		verifyEquals(data.getEditCustomer().getCustomerIDCannotEmptyErrorMsg(),
				editCustomerPage.getTextEditCustomer_ID_ErrorMsg());
	}

	@Test
	public void TC_02_EditCustomer_customerIDMustBeNumeric() {
		log.info("EditCustomer - Step 01: Open New Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter invalid Customer ID value to CustomerID field");
		editCustomerPage.InputCharacterToEditCustomerID(data.getEditCustomer().getInvalidCustomerID());
		log.info("EditCustomer - Step 03: An error message must show");
		verifyEquals(data.getEditCustomer().getCustomerIDMustBeNumericErrorMsg(),
				editCustomerPage.getTextEditCustomer_ID_ErrorMsg());
	}

	@Test
	public void TC_03_EditCustomer_customerIDCannotHaveSpecialCharacter() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter special character to CustomerID field");
		editCustomerPage.InputSpecialCharacterToCustomerID(data.getEditCustomer().getSpecialChar());
		log.info("EditCustomer - Step 03: An error message must show");
		verifyEquals(data.getEditCustomer().getCustomerIDCannotHaveSpecialCharacterErrorMsg(),
				editCustomerPage.getTextEditCustomer_ID_ErrorMsg());
	}

	@Test
	public void TC_04_EditCustomer_validCustomerID() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Successfully redirect to Edit Customer page");
		verifyEquals("http://demo.guru99.com/v4/manager/editCustomerPage.php", editCustomerPage.getUrlEditCustomer());
	}

	// Skip TC_05,TC_06,TC_07

	@Test
	public void TC_08_EditCustomer_addressCannotEmpty() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Press tab to Address field ");
		editCustomerPage.PressTabToEditCustomer_Address();
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getAddressFieldCannotEmptyErrorMsg(),
				editCustomerPage.getTextEditCustomer_Address_ErrorMsg());
	}

	@Test
	public void TC_09_EditCustomer_cityCannotEmpty() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Press tab to City field ");
		editCustomerPage.PressTabToEditCustomer_City();
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getCityCannotEmptyErrorMsg(),
				editCustomerPage.getTextEditCustomer_City_ErrorMsg());
	}

	@Test
	public void TC_10_EditCustomer_cityCannotNumeric() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Input numeric to City field ");
		editCustomerPage.InputNummericToCity(data.getEditCustomer().getNumeric());
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getCityCannotBeNumericErrorMsg(),
				editCustomerPage.getTextEditCustomer_City_ErrorMsg());
	}

	@Test
	public void TC_11_EditCustomer_cityCannotHaveSpecialCharacter() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Input special character to City field ");
		editCustomerPage.InputSpecialCharacterToCity(data.getEditCustomer().getSpecialChar());
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getCityCannotHaveSpecialCharacterErrorMsg(),
				editCustomerPage.getTextEditCustomer_City_ErrorMsg());
	}

	@Test
	public void TC_12_EditCustomer_stateCannotEmpty() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Press tab to State field ");
		editCustomerPage.PressTabToEditCustomer_State();
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getStateCannotEmptyErrorMsg(),
				editCustomerPage.getTextEditCustomer_State_ErrorMsg());
	}

	@Test
	public void TC_13_EditCustomer_stateCannotBeNumeric() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Input numeric to State field ");
		editCustomerPage.InputNummericToState(data.getEditCustomer().getNumeric());
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getStateCannotBeNumericErrorMsg(),
				editCustomerPage.getTextEditCustomer_State_ErrorMsg());
	}

	@Test
	public void TC_14_EditCustomer_StateCannotHaveSpecialCharacter() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Input special character to State field ");
		editCustomerPage.InputSpecialCharacterToState(data.getEditCustomer().getSpecialChar());
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getStateCannotHaveSpecialCharacterErrorMsg(),
				editCustomerPage.getTextEditCustomer_State_ErrorMsg());
	}

	@Test
	public void TC_15_EditCustomer_pinMustBeNumeric() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Input PIN to State field ");
		editCustomerPage.InputValueIntoPIN(data.getEditCustomer().getInvalidPIN());
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getPinCannotBeCharactersErrorMsg(),
				editCustomerPage.getTextEditCustomer_PIN_ErrorMsg());
	}

	@Test
	public void TC_16_EditCustomer_pinCannotBeEmpty() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Press Tab to PIN field ");
		editCustomerPage.PressTabToEditCustomerPIN();
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getPinCannotEmptyErrorMsg(),
				editCustomerPage.getTextEditCustomer_PIN_ErrorMsg());
	}

	@Test
	public void TC_17_EditCustomer_pinMustHave06Digits() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Input <06 digits to PIN field ");
		editCustomerPage.InputValueIntoPIN(data.getEditCustomer().getNumeric());
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getPinMustHave06Digit(),
				editCustomerPage.getTextEditCustomer_PIN_ErrorMsg());
	}

	@Test
	public void TC_18_EditCustomer_pinCannotHaveSpecialCharacter() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Input special characters to PIN field ");
		editCustomerPage.InputSpecialCharacterToEditCustomerPIN(data.getEditCustomer().getSpecialChar());
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getPinCannotHaveSpecialCharacterErrorMsg(),
				editCustomerPage.getTextEditCustomer_PIN_ErrorMsg());
	}

	@Test
	public void TC_19_EditCustomer_telephoneCannotBeEmpty() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Press Tab to Telephone field");
		editCustomerPage.PressTabToEditCustomerTelephone();
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getTelephoneCannotEmptyErrorMsg(),
				editCustomerPage.getTextEditCustomer_Telephone_ErrorMsg());
	}

	@Test
	public void TC_20_EditCustomer_telephoneCannotHaveSpecialCharacter() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Input special characters to Telephone field ");
		editCustomerPage.InputSpecialCharacterToEditCustomerTelephone(data.getEditCustomer().getSpecialChar());
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getTelephoneCannotHaveSpecialCharacterErrorMsg(),
				editCustomerPage.getTextEditCustomer_Telephone_ErrorMsg());
	}

	@Test
	public void TC_21_EditCustomer_emailCannotBeEmpty() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Press Tab to Email field ");
		editCustomerPage.PressTabToEditCustomerEmail();
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getEmailCannotEmptyErrorMsg(),
				editCustomerPage.getTextEditCustomer_Email_ErrorMsg());
	}

	@Test
	public void TC_22_EditCustomer_emailMustBeCorrectFormat() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Input incorrect format email into Email field");
		editCustomerPage.InputValueIntoEmail(data.getEditCustomer().getInvalidEmail());
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getEmailMustBeCorrectFormat(),
				editCustomerPage.getTextEditCustomer_Email_ErrorMsg());
	}

	@Test
	public void TC_23_EditCustomer_emailFirstCharacterCannotBeBlank() {
		log.info("EditCustomer - Step 01: Open Edit Customer Page");
		editCustomerPage = homepage.openEditCustomerPage(driver);
		log.info("EditCustomer - Step 02: Enter valid CustomerID ");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("EditCustomer - Step 03: Click Submit button ");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("EditCustomer - Step 04: Press Space to Email field ");
		editCustomerPage.PressSpaceToEditCustomerEmail();
		log.info("EditCustomer - Step 05: An error message must show");
		verifyEquals(data.getEditCustomer().getEmailCannotHaveBlankSpace(),
				editCustomerPage.getTextEditCustomer_Email_ErrorMsg());
	}

	@AfterClass
	public void afterClass() {
		closeBroswer(driver);
	}

}
