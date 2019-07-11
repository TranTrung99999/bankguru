
package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payment {

	@SerializedName("customerName")
	@Expose
	private String customerName;

	@SerializedName("dateOfBirth")
	@Expose
	private String dateOfBirth;

	@SerializedName("address")
	@Expose
	private String address;

	@SerializedName("city")
	@Expose
	private String city;

	@SerializedName("state")
	@Expose
	private String state;

	@SerializedName("PIN")
	@Expose
	private String PIN;

	@SerializedName("mobileNumber")
	@Expose
	private String mobileNumber;

	@SerializedName("passwordCustomer")
	@Expose
	private String passwordCustomer;

	@SerializedName("updateCustomerName")
	@Expose
	private String updateCustomerName;

	@SerializedName("updateDateOfBirth")
	@Expose
	private String updateDateOfBirth;

	@SerializedName("updateAddress")
	@Expose
	private String updateAddress;

	@SerializedName("updateCity")
	@Expose
	private String updateCity;

	@SerializedName("updateState")
	@Expose
	private String updateState;
	@SerializedName("updatePIN")
	@Expose
	private String updatePIN;

	@SerializedName("updateMobileNumber")
	@Expose
	private String updateMobileNumber;

	@SerializedName("updatePasswordCustomer")
	@Expose
	private String updatePasswordCustomer;

	@SerializedName("accountType")
	@Expose
	private String accountType;

	@SerializedName("initialDesposit")
	@Expose
	private String initialDesposit;

	@SerializedName("amountDeposit")
	@Expose
	private String amountDeposit;

	@SerializedName("amountWithdrawal")
	@Expose
	private String amountWithdrawal;

	@SerializedName("amountTransfer")
	@Expose
	private String amountTransfer;

	@SerializedName("sumDeposit")
	@Expose
	private String sumDeposit;
	@SerializedName("sumWithdraw")
	@Expose
	private String sumWithdraw;
	@SerializedName("sumBalanceEnquiry")
	@Expose
	private String sumBalanceEnquiry;
	
	@SerializedName("descriptionDeposit")
	@Expose
	private String descriptionDeposit;

	@SerializedName("descriptionWithdrawal")
	@Expose
	private String descriptionWithdrawal;

	@SerializedName("descriptionTransfer")
	@Expose
	private String descriptionTransfer;

	@SerializedName("payeeAccount")
	@Expose
	private String payeeAccount;
	@SerializedName("successfulMessage")
	@Expose
	private String successfulMessage;

	@SerializedName("depositMoneySuccessfulMessage")
	@Expose
	private String depositMoneySuccessfulMessage;

	@SerializedName("withdrawMoneySuccessfulMessage")
	@Expose
	private String withdrawMoneySuccessfulMessage;

	@SerializedName("newAccountSuccessfulMessage")
	@Expose
	private String newAccountSuccessfulMessage;

	@SerializedName("fundTransferMoneySuccessfulMessage")
	@Expose
	private String fundTransferMoneySuccessfulMessage;
	@SerializedName("balanceEnquirySuccessfulMessage")
	@Expose
	private String balanceEnquirySuccessfulMessage;
	@SerializedName("deleteAccountSuccessfulMessage")
	@Expose
	private String deleteAccountSuccessfulMessage;
	@SerializedName("deleteCustomerSuccessfulMessage")
	@Expose
	private String deleteCustomerSuccessfulMessage;

	public String getCustomerName() {
		return customerName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPIN() {
		return PIN;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getPasswordCustomer() {
		return passwordCustomer;
	}

	public String getUpdateCustomerName() {
		return updateCustomerName;
	}

	public String getUpdateDateOfBirth() {
		return updateDateOfBirth;
	}

	public String getUpdateAddress() {
		return updateAddress;
	}

	public String getUpdateCity() {
		return updateCity;
	}

	public String getUpdateState() {
		return updateState;
	}

	public String getUpdatePIN() {
		return updatePIN;
	}

	public String getUpdateMobileNumber() {
		return updateMobileNumber;
	}

	public String getUpdatePasswordCustomer() {
		return updatePasswordCustomer;
	}

	public String getAccountType() {
		return accountType;
	}
	public String getInitialDesposit() {
		return initialDesposit;
	}

	public String getAmountDeposit() {
		return amountDeposit;
	}

	public String getAmountWithdrawal() {
		return amountWithdrawal;
	}

	public String getAmountTransfer() {
		return amountTransfer;
	}

	public String getSumDeposit() {
		return sumDeposit;
	}

	public String getSumWithdraw() {
		return sumWithdraw;
	}

	public String getSumBalanceEnquiry() {
		return sumBalanceEnquiry;
	}

	public String getDescriptionDeposit() {
		return descriptionDeposit;
	}

	public String getDescriptionWithdrawal() {
		return descriptionWithdrawal;
	}

	public String getPayeeAccount() {
		return payeeAccount;
	}

	public String getDescriptionTransfer() {
		return descriptionTransfer;
	}

	public String getSuccessfulMessage() {
		return successfulMessage;
	}

	public String getDepositMoneySuccessfulMessage() {
		return depositMoneySuccessfulMessage;
	}

	public String getWithdrawMoneySuccessfulMessage() {
		return withdrawMoneySuccessfulMessage;
	}

	public String getNewAccountSuccessfulMessage() {
		return newAccountSuccessfulMessage;
	}

	public String getFundTransferMoneySuccessfulMessage() {
		return fundTransferMoneySuccessfulMessage;
	}

	public String getBalanceEnquirySuccessfulMessage() {
		return balanceEnquirySuccessfulMessage;
	}

	public String getDeleteAccountSuccessfulMessage() {
		return deleteAccountSuccessfulMessage;
	}

	public String getDeleteCustomerSuccessfulMessage() {
		return deleteCustomerSuccessfulMessage;
	}

}
