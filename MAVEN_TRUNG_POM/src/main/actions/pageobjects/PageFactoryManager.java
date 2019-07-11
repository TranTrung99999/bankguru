package pageobjects;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
	public static LoginPageObject openLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	
	public static HomePageObject openHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	public static EditCustomerPageObject openEditCustomerPageObject(WebDriver driver) {
		return new EditCustomerPageObject(driver);
	}
	public static NewCustomerPageObject openNewCustomerPageObject(WebDriver driver) {
		return new NewCustomerPageObject(driver);
	}
	public static RegisterPageObject openRegisterPageObject(WebDriver driver) {
		return new RegisterPageObject(driver);
	}
	public static DeleteAccountPageObject openDeleteAccountPageObject(WebDriver driver) {
		return new DeleteAccountPageObject(driver);
	}
	public static WithdrawPageObject openWithdrawPageObject(WebDriver driver) {
		return new WithdrawPageObject(driver);
	}
	
	public static NewAccountPageObject openNewAccountPageObject(WebDriver driver) {
		return new NewAccountPageObject(driver);
	}
	
	public static DepositPageObject openDepositPageObject(WebDriver driver) {
		return new DepositPageObject(driver);
	}
	
	public static FundTransferPageObject openFundTransferPageObject(WebDriver driver) {
		return new FundTransferPageObject(driver);
	}
	
	public static BalanceEnquiryPageObject openBalanceEnquiryPageObject(WebDriver driver) {
		return new BalanceEnquiryPageObject(driver);
	}
	
	public static DeleteCustomerPageObject openDeleteCustomerPageObject(WebDriver driver) {
		return new DeleteCustomerPageObject(driver);
	}
}
