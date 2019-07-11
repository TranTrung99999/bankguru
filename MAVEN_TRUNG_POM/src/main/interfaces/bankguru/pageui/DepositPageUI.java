package bankguru.pageui;

public class DepositPageUI {
	public static final String ACCOUNT_NO = "//input[@name='accountno']";
	public static final String AMOUNT = "//input[@name='ammount']";
	public static final String DESCRIPTION = "//input[@name='desc']";
	public static final String SUBMIT_BTN = "//input[@name='AccSubmit']";
	public static final String RESET_BTN = "//input[@name='res']";
	public static final String SUCCESS_MSG = "//p[contains(text(),'Transaction details of Deposit for Account')]";
	public static final String CURRENT_AMOUNT = "//td[text()='Current Balance']/following-sibling::td";
}
