package bankguru.pageui;

public class FundTransferPageUI {
	public static final String PAYER_ACCOUNT_NO = "//input[@name='payersaccount']";
	public static final String PAYEE_ACCOUNT_NO = "//input[@name='payeeaccount']";
	public static final String AMOUNT = "//input[@name='ammount']";
	public static final String DESCRIPTION = "//input[@name='desc']";
	public static final String SUBMIT_BTN = "//input[@name='AccSubmit']";
	public static final String RESET_BTN = "//input[@name='res']";
	public static final String AMOUNT_TRANSFER = "//td[text()='Amount']/following-sibling::td";
	public static final String AMOUNT_TRANSFER_MSG = "//p[contains(text(),'Fund Transfer Details')]";
}
