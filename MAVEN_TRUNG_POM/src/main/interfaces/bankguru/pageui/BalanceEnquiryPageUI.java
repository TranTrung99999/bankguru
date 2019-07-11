package bankguru.pageui;

public class BalanceEnquiryPageUI {
	public static final String ACCOUNT_NO = "//input[@name='accountno']";
	public static final String SUBMIT_BTN = "//input[@name='AccSubmit']";
	public static final String RESET_BTN = "//input[@name='res']";
	public static final String BALANCE_ENQUIRY_MSG = "//p[contains(text(),'Balance Details for Account')]";
	public static final String BALANCE = "//td[text()='Balance']/following-sibling::td";
}
