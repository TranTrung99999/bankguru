package com.bankguru.payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ObjectPageJson.AbstractJson;
import common.AbstractTest;
import pageobjects.BalanceEnquiryPageObject;
import pageobjects.DeleteAccountPageObject;
import pageobjects.DeleteCustomerPageObject;
import pageobjects.DepositPageObject;
import pageobjects.EditCustomerPageObject;
import pageobjects.FundTransferPageObject;
import pageobjects.HomePageObject;
import pageobjects.LoginPageObject;
import pageobjects.NewAccountPageObject;
import pageobjects.NewCustomerPageObject;
import pageobjects.RegisterPageObject;
import pageobjects.WithdrawPageObject;

public class PaymentFunction extends AbstractTest {
	WebDriver driver;
	WebDriverWait wait;
	private LoginPageObject loginpage;
	private HomePageObject homepage;
	private RegisterPageObject registerpage;
	private NewCustomerPageObject newCustomerPage;
	private EditCustomerPageObject editCustomerPage;
	private NewAccountPageObject newAccountPage;
	private DepositPageObject depositPage;
	private WithdrawPageObject withdrawPage;
	private FundTransferPageObject fundTransferPage;
	private BalanceEnquiryPageObject balanceEnquiryPage;
	private DeleteAccountPageObject deleteAccountPage;
	private DeleteCustomerPageObject deleteCustomerPage;
	private AbstractJson data;
	private String userPath = System.getProperty("user.dir");
	private String userId, password, loginPageUrl, emailAddress, customerID, accountID, updateEmailAddress;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String version, String urlName) {
		driver = openMultiBrowser(browserName, version, urlName);
		emailAddress = "automation05" + randomNumber() + "@gmail.com";
		updateEmailAddress = "testing" + randomNumber() + "@gmail.com";
		String pathDataJson = userPath.concat("/data/").concat("bankguru.json");
		data = getDataJson(pathDataJson);
		loginpage = new LoginPageObject(driver);
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
	}

	@Test
	public void TC_01_CreateNEWCustomer() {
		newCustomerPage = homepage.openNewCustomerPage(driver);
		log.info("Payment - Create New Customer - Step 01: Input Customer Name");
		// newCustomerPage.InputNewCustomerName(NewCustomer_TestData.customerName);
		newCustomerPage.InputNewCustomerName(data.getPayment().getCustomerName());
		log.info("Payment - Create New Customer - Step 02: Input Date of Birth");
		newCustomerPage.InputNewCustomerDOB(data.getPayment().getDateOfBirth());
		log.info("Payment - Create New Customer - Step 03: Input Address");
		newCustomerPage.InputNewCustomerAddress(data.getPayment().getAddress());
		log.info("Payment - Create New Customer - Step 04: Input City");
		newCustomerPage.InputNewCustomerCity(data.getPayment().getCity());
		log.info("Payment - Create New Customer - Step 05: Input State");
		newCustomerPage.InputNewCustomerState(data.getPayment().getState());
		log.info("Payment - Create New Customer - Step 06: Input PIN");
		newCustomerPage.InputValueIntoPIN(data.getPayment().getPIN());
		log.info("Payment - Create New Customer - Step 07: Input Telephone");
		newCustomerPage.InputValueIntoTelephone(data.getPayment().getMobileNumber());
		log.info("Payment - Create New Customer - Step 08: Input Email");
		newCustomerPage.InputValueIntoEmail(emailAddress);
		log.info("Payment - Create New Customer - Step 09: Input Password");
		newCustomerPage.InputNewCustomerPassword(data.getPayment().getPasswordCustomer());
		log.info("Payment - Create New Customer - Step 10: Click Submit button");
		newCustomerPage.clickSubmitButton();
		log.info("Payment - Create New Customer - Step 11: Verify successful message display!");
		verifyEquals(data.getPayment().getSuccessfulMessage(), newCustomerPage.getTextNewCustomerSuccessfulMessage());
	}

	@Test
	public void TC_02_EditCustomer() {
		customerID = newCustomerPage.getTextcustomerID();
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Payment - EditCustomer - Step 01: Input CustomerID");
		editCustomerPage.InputValidCustomerID(customerID);
		log.info("Payment - EditCustomer - Step 02: Click Submit button");
		editCustomerPage.Click_CustomerID_Submit_Btn();
		log.info("Payment - EditCustomer - Step 03: Update Address");
		editCustomerPage.updateAddress(data.getPayment().getUpdateAddress());
		log.info("Payment - EditCustomer - Step 04: Update City");
		editCustomerPage.updateCity(data.getPayment().getUpdateCity());
		log.info("Payment - EditCustomer - Step 05: Update State");
		editCustomerPage.updateState(data.getPayment().getUpdateState());
		log.info("Payment - EditCustomer - Step 06: Update PIN");
		editCustomerPage.InputValueIntoPIN(data.getPayment().getUpdatePIN());
		log.info("Payment - EditCustomer - Step 07: Update Telephone");
		editCustomerPage.updateTelephone(data.getPayment().getUpdateMobileNumber());
		log.info("Payment - EditCustomer - Step 08: Update Email");
		editCustomerPage.updateEmail(updateEmailAddress);
	}

	@Test
	public void TC_03_CreateNewAccount() {
		log.info("Payment - CreateNewAccount - Step 01: Open New Account Page");
		newAccountPage = homepage.openNewAccountPage(driver);
		log.info("Payment - CreateNewAccount - Step 02: Input CustomerID");
		newAccountPage.inputCustomerID(customerID);
		log.info("Payment - CreateNewAccount - Step 03: Select Account Type = Current");
		newAccountPage.selectAccountType(data.getPayment().getAccountType());
		log.info("Payment - CreateNewAccount - Step 04: Input Initial Desposit = Current");
		newAccountPage.inputInitialDeposit(data.getPayment().getInitialDesposit());
		log.info("Payment - CreateNewAccount - Step 05: Click to Submit button");
		newAccountPage.clickSubmitBtn();
		log.info("Payment - CreateNewAccount - Step 06: Verify successful message displays");
		verifyEquals(data.getPayment().getNewAccountSuccessfulMessage(),
				newAccountPage.getText_NewAccount_SuccessMsg());
		log.info("Payment - CreateNewAccount - Step 07: Current Amount displays");
		verifyEquals(data.getPayment().getInitialDesposit(), newAccountPage.getText_NewAccount_Deposit());
	}

	@Test
	public void TC_04_TransferMoneyToCurrentAccount() {
		accountID = newAccountPage.getText_NewAccount_AccountID();
		log.info("Payment - Deposit - Step 01: Open Deposit Page");
		depositPage = newAccountPage.openDepositPage(driver);
		log.info("Payment - Deposit - Step 02: Input Account No");
		depositPage.inputAccountNo(accountID);
		log.info("Payment - Deposit - Step 03: Input Amount Deposit");
		depositPage.inputAmount(data.getPayment().getAmountDeposit());
		log.info("Payment - Deposit - Step 04: Input Description");
		depositPage.inputDescription(data.getPayment().getDescriptionDeposit());
		log.info("Payment - Deposit - Step 05: Click Submit button");
		depositPage.clickSubmitButton();
		log.info("Payment - Deposit - Step 06: Verify successful message displays");
		verifyEquals(data.getPayment().getDepositMoneySuccessfulMessage() + accountID,
				depositPage.getTextDepositSuccessfulMsg());
		log.info("Payment - Deposit - Step 07: Verify Current Amount");
		verifyEquals(data.getPayment().getSumDeposit(), depositPage.getTextCurrentAmount());
	}

	@Test
	public void TC_05_WithdrawMoneyFromCurrentAccount() {
		log.info("Payment - Withdraw - Step 01: Open Withdraw Page");
		withdrawPage = depositPage.openWithdrawPage(driver);
		log.info("Payment - Withdraw - Step 02: Input Account No");
		withdrawPage.inputAccountNo(accountID);
		log.info("Payment - Withdraw - Step 03: Input Amount");
		withdrawPage.inputAmount(data.getPayment().getAmountWithdrawal());
		log.info("Payment - Withdraw - Step 04: Input Description");
		withdrawPage.inputDescription(data.getPayment().getDescriptionWithdrawal());
		log.info("Payment - Withdraw - Step 05: Click Submit button");
		withdrawPage.clickSubmitButton();
		log.info("Payment - Withdraw - Step 06: Verify successful message displays");
		verifyEquals(data.getPayment().getWithdrawMoneySuccessfulMessage() + accountID,
				withdrawPage.getTextsuccessfulMsg());
		log.info("Payment - Withdraw - Step 07: Verify Account Balance");
		verifyEquals(data.getPayment().getSumWithdraw(), withdrawPage.getTextCurrentBalance());
	}

	@Test
	public void TC_06_TransferMoneyToAnotherAccount() {
		log.info("Payment - Transfer - Step 01: Open Fund Transfer Page");
		fundTransferPage = withdrawPage.openFunTransferPage(driver);
		log.info("Payment - Transfer - Step 02: Input Payers account no");
		fundTransferPage.inputPayerAccount(accountID);
		log.info("Payment - Transfer - Step 03: Input Payees account no");
		fundTransferPage.inputPayeeAccount(data.getPayment().getPayeeAccount());
		log.info("Payment - Transfer - Step 04: Input Amount Transfer");
		fundTransferPage.inputAmount(data.getPayment().getAmountTransfer());
		log.info("Payment - Transfer - Step 05: Input Description");
		fundTransferPage.inputDescription(data.getPayment().getDescriptionTransfer());
		log.info("Payment - Transfer - Step 06: Click Submit button");
		fundTransferPage.clickSubmitButton();
		log.info("Payment - Transfer - Step 07: Verify successful message");
		verifyEquals(data.getPayment().getFundTransferMoneySuccessfulMessage(),
				fundTransferPage.getText_AmountTransfer_successfulMsg());
		log.info("Payment - Transfer - Step 08: Verify Amount Transfer number");
		verifyEquals(data.getPayment().getAmountTransfer(), fundTransferPage.getText_AmountTransfer());
	}

	@Test
	public void TC_07_CheckAccountBalance() {
		log.info("Payment - Balance Enquiry - Step 01: Open Balance Enquiry Page");
		balanceEnquiryPage = fundTransferPage.openBalanceEnquiryTransferPage(driver);
		log.info("Payment - Balance Enquiry - Step 02: Input Account No");
		balanceEnquiryPage.inputAccountNo(accountID);
		log.info("Payment - Balance Enquiry - Step 03: Click Submit button");
		balanceEnquiryPage.clickSubmitButton();
		log.info("Payment - Balance Enquiry - Step 03: Verify Successful message");
		verifyEquals(data.getPayment().getBalanceEnquirySuccessfulMessage() + accountID,
				balanceEnquiryPage.getText_Balance_successfulMsg());
		log.info("Payment - Balance Enquiry - Step 04: Verify Balance Enquiry");
		verifyEquals(data.getPayment().getSumBalanceEnquiry(), balanceEnquiryPage.getText_Balance());
	}

	@Test
	public void TC_08_DeleteAccount() {
		log.info("Payment - Delete Account - Step 01: Open Delete Account Page");
		deleteAccountPage = balanceEnquiryPage.openDeleteAccountPage(driver);
		log.info("Payment - Delete Account - Step 02: Input Account ID");
		deleteAccountPage.inputAccountNo(accountID);
		log.info("Payment - Delete Account - Step 03: Click Submit button");
		deleteAccountPage.clickSubmitButton();
		log.info("Payment - Delete Account - Step 04: Click Accept button");
		deleteAccountPage.acceptAlert();
		log.info("Payment - Delete Account - Step 05: Verify Successful message");
		verifyEquals(data.getPayment().getDeleteAccountSuccessfulMessage(), deleteAccountPage.getTextAlert());
		log.info("Payment - Delete Account - Step 04: Click OK button");
		deleteAccountPage.acceptAlert();
	}

	@Test
	public void TC_09_DeleteCustomer() {
		log.info("Payment - Delete Customer - Step 01: Open Delete Account Page");
		deleteCustomerPage = deleteAccountPage.openDeleteCustomerPage(driver);
		log.info("Payment - Delete Customer - Step 02: Input Customer ID");
		deleteCustomerPage.inputCustomerID(customerID);
		log.info("Payment - Delete Customer - Step 03: Click Submit button");
		deleteCustomerPage.clickSubmitButton();
		log.info("Payment - Delete Customer - Step 04: Click Accept button");
		deleteCustomerPage.acceptAlert();
		log.info("Payment - Delete Customer - Step 05: Verify Successful message");
		verifyEquals(data.getPayment().getDeleteCustomerSuccessfulMessage(), deleteCustomerPage.getTextAlert());
		log.info("Payment - Delete Customer - Step 04: Click OK button");
		deleteCustomerPage.acceptAlert();
	}

	@AfterClass
	public void afterClass() {
		closeBroswer(driver);
	}

}
