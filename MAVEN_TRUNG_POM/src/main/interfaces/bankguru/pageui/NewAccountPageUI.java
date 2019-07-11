package bankguru.pageui;

public class NewAccountPageUI {
	public static final String CUSTOMER_ID = "//input[@name='cusid']";
	public static final String ACCOUNTTYPE_CBX = "//select[@name='selaccount']";
	public static final String INITIAL_DEPOSIT = "//input[@name='inideposit']";
	public static final String SUBMIT_BTN = "//input[@name='button2']";
	public static final String RESET_BTN = "//input[@name='reset']";
	public static final String SUCCESSFUL_MSN = "//p[text()='Account Generated Successfully!!!']";
	public static final String CURRENT_AMOUNT = "//td[contains(text(),'Current Amount')]/following-sibling::td";
	public static final String ACCOUNT_ID = "//td[contains(text(),'Account ID')]/following-sibling::td";
}
