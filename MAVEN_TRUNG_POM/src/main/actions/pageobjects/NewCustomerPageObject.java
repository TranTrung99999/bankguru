package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bankguru.pageui.NewCustomerPageUI;
import common.AbstractPage;

public class NewCustomerPageObject extends AbstractPage {
	WebDriver driver;

	public NewCustomerPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	// Name
	public void InputNewCustomerName(String name) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_NAME_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_NAME_TXTBOX, name);
	}

	public void InputNumericToNewCustomerName(String numericvalues) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_NAME_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_NAME_TXTBOX, numericvalues);
	}

	public void InputSpecialCharacterToNewCustomerName(String specialcharacter) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_NAME_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_NAME_TXTBOX, specialcharacter);
	}

	public void PressTabToNewCustomerName() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_NAME_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_NAME_TXTBOX, Keys.TAB);
	}

	// Date Of Birth
	public void InputNewCustomerDOB(String dateofbirth) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_DOB_TXTBOX);
		sendKeysToDatePicker(driver, NewCustomerPageUI.NEWCUSTOMER_DOB_TXTBOX, dateofbirth);
	}

	// Address

	public void InputNewCustomerAddress(String address) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_ADDRESS_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_ADDRESS_TXTBOX, address);
	}

	public void PressTabToNewCustomerAddress() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_ADDRESS_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_ADDRESS_TXTBOX, Keys.TAB);
	}

	public void PressSpaceToNewCustomerAddress() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_ADDRESS_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_ADDRESS_TXTBOX, Keys.SPACE);
	}

	// City

	public void InputNewCustomerCity(String city) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_TXTBOX, city);
	}

	public void PressTabToNewCustomerCity() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_TXTBOX, Keys.TAB);
	}

	public void InputNumericToNewCustomerCity(String numericvalues) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_TXTBOX, numericvalues);
	}

	public void InputSpecialCharacterToNewCustomerCity(String specialcharacter) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_TXTBOX, specialcharacter);
	}

	public void PressSpaceToNewCustomerCity() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_TXTBOX, Keys.SPACE);
	}

	// State

	public void InputNewCustomerState(String state) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_TXTBOX, state);
	}

	public void PressTabToNewCustomerState() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_TXTBOX, Keys.TAB);
	}

	public void InputNumericToNewCustomerState(String numericvalues) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_TXTBOX, numericvalues);
	}

	public void InputSpecialCharacterToNewCustomerState(String specialcharacter) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_TXTBOX, specialcharacter);
	}

	public void PressSpaceToNewCustomerState() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_TXTBOX, Keys.SPACE);
	}

	// PIN
	public void InputValueIntoPIN(String PINvalue) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_TXTBOX, PINvalue);
	}

	public void InputNumericToNewCustomerPIN(String numericvalues) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_TXTBOX, numericvalues);
	}

	public void InputSpecialCharacterToNewCustomerPIN(String specialcharacter) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_TXTBOX, specialcharacter);
	}

	public void PressTabToNewCustomerPIN() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_TXTBOX, Keys.TAB);
	}

	public void PressSpaceToNewCustomerPIN() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_TXTBOX, Keys.SPACE);
	}

	// TELEPHONE
	public void PressTabToNewCustomerTelephone() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_TELEPHONE_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_TELEPHONE_TXTBOX, Keys.TAB);
	}

	public void PressSpaceToNewCustomerTelephone() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_TELEPHONE_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_TELEPHONE_TXTBOX, Keys.SPACE);
	}

	public void InputValueIntoTelephone(String telephone) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_TELEPHONE_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_TELEPHONE_TXTBOX, telephone);
	}

	public void InputSpecialCharacterToNewCustomerTelephone(String specialcharacter) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_TELEPHONE_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_TELEPHONE_TXTBOX, specialcharacter);
	}

	// EMAIL
	public void PressTabToNewCustomerEmail() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_EMAIL_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_EMAIL_TXTBOX, Keys.TAB);
	}

	public void PressSpaceToNewCustomerEmail() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_EMAIL_TXTBOX);
		sendKeyPress(driver, NewCustomerPageUI.NEWCUSTOMER_EMAIL_TXTBOX, Keys.SPACE);
	}

	public void InputValueIntoEmail(String email) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_EMAIL_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_EMAIL_TXTBOX, email);
	}

	// PASSWORD
	public void InputNewCustomerPassword(String password) {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_PASSWORD_TXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.NEWCUSTOMER_PASSWORD_TXTBOX, password);
	}

	// SUBMIT & RESET BUTTON

	public void clickSubmitButton() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_SUBMIT_BTN);
		clickToElement(driver, NewCustomerPageUI.NEWCUSTOMER_SUBMIT_BTN);
	}

	public void clickResetButton() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_RESET_BTN);
		clickToElement(driver, NewCustomerPageUI.NEWCUSTOMER_RESET_BTN);
	}

	// Error Message
	public String getTextNewCustomerNameErrorMsg() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_NAME_ERRORMESSAGE);
		return getTextFromElement(driver, NewCustomerPageUI.NEWCUSTOMER_NAME_ERRORMESSAGE);
	}

	public String getTextNewCustomerAddressErrorMsg() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_ADDRESS_ERRORMESSAGE);
		return getTextFromElement(driver, NewCustomerPageUI.NEWCUSTOMER_ADDRESS_ERRORMESSAGE);
	}

	public String getTextNewCustomerCityErrorMsg() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_ERRORMESSAGE);
		return getTextFromElement(driver, NewCustomerPageUI.NEWCUSTOMER_CITY_ERRORMESSAGE);
	}

	public String getTextNewCustomerStateErrorMsg() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_ERRORMESSAGE);
		return getTextFromElement(driver, NewCustomerPageUI.NEWCUSTOMER_STATE_ERRORMESSAGE);
	}

	public String getTextNewCustomerPINErrorMsg() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_ERRORMESSAGE);
		return getTextFromElement(driver, NewCustomerPageUI.NEWCUSTOMER_PIN_ERRORMESSAGE);
	}

	public String getTextNewCustomerTelephoneErrorMsg() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_TELEPHONE_ERRORMESSAGE);
		return getTextFromElement(driver, NewCustomerPageUI.NEWCUSTOMER_TELEPHONE_ERRORMESSAGE);
	}

	public String getTextNewCustomerEmailErrorMsg() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_EMAIL_ERRORMESSAGE);
		return getTextFromElement(driver, NewCustomerPageUI.NEWCUSTOMER_EMAIL_ERRORMESSAGE);
	}

	// sucessful Message
	public String getTextNewCustomerSuccessfulMessage() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_SUCCESSFULMESSAGE);
		return getTextFromElement(driver, NewCustomerPageUI.NEWCUSTOMER_SUCCESSFULMESSAGE);
	}

	public String getTextcustomerID() {
		waitForControlVisible(driver, NewCustomerPageUI.NEWCUSTOMER_CUSTOMERID);
		return getTextFromElement(driver, NewCustomerPageUI.NEWCUSTOMER_CUSTOMERID);
	}

}
