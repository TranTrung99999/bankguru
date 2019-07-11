package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bankguru.pageui.EditCustomerPageUI;
import common.AbstractPage;

public class EditCustomerPageObject extends AbstractPage {
	WebDriver driver;

	public EditCustomerPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public String getUrlEditCustomer() {
		return getCurrentPageUrl(driver);
	}

	// CustomerID
	public void InputValidCustomerID(String validCustomerID) {
		waitForControlVisible(driver, EditCustomerPageUI.CUSTOMER_ID);
		sendkeyToElement(driver, EditCustomerPageUI.CUSTOMER_ID, validCustomerID);

	}

	public void PressTabToEditCustomerID() {
		waitForControlVisible(driver, EditCustomerPageUI.CUSTOMER_ID);
		sendKeyPress(driver, EditCustomerPageUI.CUSTOMER_ID, Keys.TAB);
	}

	public void InputSpecialCharacterToCustomerID(String specialChar) {
		waitForControlVisible(driver, EditCustomerPageUI.CUSTOMER_ID);
		sendkeyToElement(driver, EditCustomerPageUI.CUSTOMER_ID, specialChar);

	}

	public void InputCharacterToEditCustomerID(String invalidCustomerID) {
		waitForControlVisible(driver, EditCustomerPageUI.CUSTOMER_ID);
		sendkeyToElement(driver, EditCustomerPageUI.CUSTOMER_ID, invalidCustomerID);

	}

	public void PressSpaceToCustomerID() {
		waitForControlVisible(driver, EditCustomerPageUI.CUSTOMER_ID);
		sendKeyPress(driver, EditCustomerPageUI.CUSTOMER_ID, Keys.SPACE);
	}

	public void Click_CustomerID_Submit_Btn() {
		waitForControlVisible(driver, EditCustomerPageUI.SUBMIT_BTN);
		clickToElement(driver, EditCustomerPageUI.SUBMIT_BTN);
	}

	public void Click_CustomerID_Reset_Btn() {
		waitForControlVisible(driver, EditCustomerPageUI.RESET_BTN);
		clickToElement(driver, EditCustomerPageUI.RESET_BTN);
	}

	// Address
	public void updateAddress(String address) {
		waitForControlVisible(driver, EditCustomerPageUI.ADDRESS_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.ADDRESS_TXTBOX, address);
	}

	public void PressTabToEditCustomer_Address() {
		waitForControlVisible(driver, EditCustomerPageUI.ADDRESS_TXTBOX);
		sendKeyPress(driver, EditCustomerPageUI.ADDRESS_TXTBOX, Keys.TAB);
	}

	// City
	public void updateCity(String city) {
		waitForControlVisible(driver, EditCustomerPageUI.CITY_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.CITY_TXTBOX, city);
	}

	public void PressTabToEditCustomer_City() {
		waitForControlVisible(driver, EditCustomerPageUI.CITY_TXTBOX);
		sendKeyPress(driver, EditCustomerPageUI.CITY_TXTBOX, Keys.TAB);
	}

	public void InputNummericToCity(String numeric) {
		waitForControlVisible(driver, EditCustomerPageUI.CITY_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.CITY_TXTBOX, numeric);

	}

	public void InputSpecialCharacterToCity(String specialChar) {
		waitForControlVisible(driver, EditCustomerPageUI.CITY_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.CITY_TXTBOX, specialChar);

	}

	// State
	public void updateState(String state) {
		waitForControlVisible(driver, EditCustomerPageUI.STATE_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.STATE_TXTBOX, state);
	}

	public void PressTabToEditCustomer_State() {
		waitForControlVisible(driver, EditCustomerPageUI.STATE_TXTBOX);
		sendKeyPress(driver, EditCustomerPageUI.STATE_TXTBOX, Keys.TAB);
	}

	public void InputNummericToState(String numeric) {
		waitForControlVisible(driver, EditCustomerPageUI.STATE_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.STATE_TXTBOX, numeric);

	}

	public void InputSpecialCharacterToState(String specialChar) {
		waitForControlVisible(driver, EditCustomerPageUI.STATE_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.STATE_TXTBOX, specialChar);

	}

	// PIN
	public void InputValueIntoPIN(String PINvalue) {
		waitForControlVisible(driver, EditCustomerPageUI.PIN_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.PIN_TXTBOX, PINvalue);
	}

	public void InputNumericToEditCustomerPIN(String numericvalues) {
		waitForControlVisible(driver, EditCustomerPageUI.PIN_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.PIN_TXTBOX, numericvalues);
	}

	public void InputSpecialCharacterToEditCustomerPIN(String specialcharacter) {
		waitForControlVisible(driver, EditCustomerPageUI.PIN_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.PIN_TXTBOX, specialcharacter);
	}

	public void PressTabToEditCustomerPIN() {
		waitForControlVisible(driver, EditCustomerPageUI.PIN_TXTBOX);
		sendKeyPress(driver, EditCustomerPageUI.PIN_TXTBOX, Keys.TAB);
	}

	// TELEPHONE
	public void updateTelephone(String telephone) {
		waitForControlVisible(driver, EditCustomerPageUI.TELEPHONE_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.TELEPHONE_TXTBOX, telephone);
	}

	public void PressTabToEditCustomerTelephone() {
		waitForControlVisible(driver, EditCustomerPageUI.TELEPHONE_TXTBOX);
		sendKeyPress(driver, EditCustomerPageUI.TELEPHONE_TXTBOX, Keys.TAB);
	}

	public void InputSpecialCharacterToEditCustomerTelephone(String specialcharacter) {
		waitForControlVisible(driver, EditCustomerPageUI.TELEPHONE_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.TELEPHONE_TXTBOX, specialcharacter);
	}

	// Email
	public void updateEmail(String email) {
		waitForControlVisible(driver, EditCustomerPageUI.EMAIL_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.EMAIL_TXTBOX, email);
	}

	public void PressTabToEditCustomerEmail() {
		waitForControlVisible(driver, EditCustomerPageUI.EMAIL_TXTBOX);
		sendKeyPress(driver, EditCustomerPageUI.EMAIL_TXTBOX, Keys.TAB);
	}

	public void InputValueIntoEmail(String email) {
		waitForControlVisible(driver, EditCustomerPageUI.EMAIL_TXTBOX);
		sendkeyToElement(driver, EditCustomerPageUI.EMAIL_TXTBOX, email);
	}

	public void PressSpaceToEditCustomerEmail() {
		waitForControlVisible(driver, EditCustomerPageUI.EMAIL_TXTBOX);
		sendKeyPress(driver, EditCustomerPageUI.EMAIL_TXTBOX, Keys.SPACE);
	}

	// Error Message
	public String getTextEditCustomer_ID_ErrorMsg() {
		waitForControlVisible(driver, EditCustomerPageUI.CUSTOMER_ID_ERRORMESSAGE);
		return getTextFromElement(driver, EditCustomerPageUI.CUSTOMER_ID_ERRORMESSAGE);
	}

	public String getTextEditCustomer_Address_ErrorMsg() {
		waitForControlVisible(driver, EditCustomerPageUI.ADDRESS_ERRORMESSAGE);
		return getTextFromElement(driver, EditCustomerPageUI.ADDRESS_ERRORMESSAGE);
	}

	public String getTextEditCustomer_City_ErrorMsg() {
		waitForControlVisible(driver, EditCustomerPageUI.CITY_ERRORMESSAGE);
		return getTextFromElement(driver, EditCustomerPageUI.CITY_ERRORMESSAGE);
	}

	public String getTextEditCustomer_State_ErrorMsg() {
		waitForControlVisible(driver, EditCustomerPageUI.STATE_ERRORMESSAGE);
		return getTextFromElement(driver, EditCustomerPageUI.STATE_ERRORMESSAGE);
	}

	public String getTextEditCustomer_PIN_ErrorMsg() {
		waitForControlVisible(driver, EditCustomerPageUI.PIN_ERRORMESSAGE);
		return getTextFromElement(driver, EditCustomerPageUI.PIN_ERRORMESSAGE);
	}

	public String getTextEditCustomer_Telephone_ErrorMsg() {
		waitForControlVisible(driver, EditCustomerPageUI.TELEPHONE_ERRORMESSAGE);
		return getTextFromElement(driver, EditCustomerPageUI.TELEPHONE_ERRORMESSAGE);
	}

	public String getTextEditCustomer_Email_ErrorMsg() {
		waitForControlVisible(driver, EditCustomerPageUI.EMAIL_ERRORMESSAGE);
		return getTextFromElement(driver, EditCustomerPageUI.EMAIL_ERRORMESSAGE);
	}

}
