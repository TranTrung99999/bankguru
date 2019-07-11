
package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewCustomer {

	@SerializedName("numeric")
	@Expose
	private String numeric;
	@SerializedName("specialChar")
	@Expose
	private String specialChar;
	@SerializedName("PINvalue")
	@Expose
	private String PINvalue;
	@SerializedName("PIN_3digit")
	@Expose
	private String PIN_3digit;
	@SerializedName("PIN_haveSpace")
	@Expose
	private String PIN_haveSpace;
	@SerializedName("telephone_invalid")
	@Expose
	private String telephone_invalid;
	@SerializedName("email_invalid")
	@Expose
	private String email_invalid;
	@SerializedName("nameCannotEmptyErrorMsg")
	@Expose
	private String nameCannotEmptyErrorMsg;
	@SerializedName("nameCannotNumericErrorMsg")
	@Expose
	private String nameCannotNumericErrorMsg;
	@SerializedName("nameCannotHaveSpecialCharacterErrorMsg")
	@Expose
	private String nameCannotHaveSpecialCharacterErrorMsg;
	@SerializedName("nameFirstCharacterCannotHaveSpaceErrorMsg")
	@Expose
	private String nameFirstCharacterCannotHaveSpaceErrorMsg;
	@SerializedName("addressCannotEmptyErrorMsg")
	@Expose
	private String addressCannotEmptyErrorMsg;
	@SerializedName("addressFirstCharacterCannotHaveSpaceErrorMsg")
	@Expose
	private String addressFirstCharacterCannotHaveSpaceErrorMsg;
	@SerializedName("cityCannotEmptyErrorMsg")
	@Expose
	private String cityCannotEmptyErrorMsg;
	@SerializedName("cityCannotNumericErrorMsg")
	@Expose
	private String cityCannotNumericErrorMsg;
	@SerializedName("cityCannotHaveSpecialCharacterErrorMsg")
	@Expose
	private String cityCannotHaveSpecialCharacterErrorMsg;
	@SerializedName("cityFirstCharacterCannotHaveSpaceErrorMsg")
	@Expose
	private String cityFirstCharacterCannotHaveSpaceErrorMsg;
	@SerializedName("stateCannotEmptyErrorMsg")
	@Expose
	private String stateCannotEmptyErrorMsg;
	@SerializedName("stateCannotNumericErrorMsg")
	@Expose
	private String stateCannotNumericErrorMsg;
	@SerializedName("stateCannotHaveSpecialCharacterErrorMsg")
	@Expose
	private String stateCannotHaveSpecialCharacterErrorMsg;
	@SerializedName("stateFirstCharacterCannotHaveSpaceErrorMsg")
	@Expose
	private String stateFirstCharacterCannotHaveSpaceErrorMsg;
	@SerializedName("pinMustBeNumericErrorMsg")
	@Expose
	private String pinMustBeNumericErrorMsg;
	@SerializedName("pinCannotEmptyErrorMsg")
	@Expose
	private String pinCannotEmptyErrorMsg;
	@SerializedName("pinMustHave6Digits")
	@Expose
	private String pinMustHave6Digits;
	@SerializedName("pinCannotHaveFirstBlankSpaceErrorMsg")
	@Expose
	private String pinCannotHaveFirstBlankSpaceErrorMsg;
	@SerializedName("pinCannotHaveSpecialCharacterErrorMsg")
	@Expose
	private String pinCannotHaveSpecialCharacterErrorMsg;
	@SerializedName("pinCannotHaveBlankSpace")
	@Expose
	private String pinCannotHaveBlankSpace;
	@SerializedName("telephoneCannotEmptyErrorMsg")
	@Expose
	private String telephoneCannotEmptyErrorMsg;
	@SerializedName("telephoneCannotHaveSpace")
	@Expose
	private String telephoneCannotHaveSpace;
	@SerializedName("telephoneCannotHaveSpecialCharacterErrorMsg")
	@Expose
	private String telephoneCannotHaveSpecialCharacterErrorMsg;
	@SerializedName("telephoneFirstCharacterCannotHaveSpaceErrorMsg")
	@Expose
	private String telephoneFirstCharacterCannotHaveSpaceErrorMsg;
	@SerializedName("emailCannotEmptyErrorMsg ")
	@Expose
	private String emailCannotEmptyErrorMsg;
	@SerializedName("emailCannotHaveSpace")
	@Expose
	private String emailCannotHaveSpace;
	@SerializedName("emailMustBeCorrectFormat")
	@Expose
	private String emailMustBeCorrectFormat;

	public String getNumeric() {
		return numeric;
	}

	public String getSpecialChar() {
		return specialChar;
	}

	public String getPINvalue() {
		return PINvalue;
	}

	public String getPIN_3digit() {
		return PIN_3digit;
	}

	public String getPIN_haveSpace() {
		return PIN_haveSpace;
	}

	public String getTelephone_invalid() {
		return telephone_invalid;
	}
	public String getEmail_invalid() {
		return email_invalid;
	}

	public String getNameCannotEmptyErrorMsg() {
		return nameCannotEmptyErrorMsg;
	}

	public String getNameCannotNumericErrorMsg() {
		return nameCannotNumericErrorMsg;
	}

	public String getNameCannotHaveSpecialCharacterErrorMsg() {
		return nameCannotHaveSpecialCharacterErrorMsg;
	}

	public String getNameFirstCharacterCannotHaveSpaceErrorMsg() {
		return nameFirstCharacterCannotHaveSpaceErrorMsg;
	}

	public String getAddressCannotEmptyErrorMsg() {
		return addressCannotEmptyErrorMsg;
	}

	public String getAddressFirstCharacterCannotHaveSpaceErrorMsg() {
		return addressFirstCharacterCannotHaveSpaceErrorMsg;
	}

	public String getCityCannotEmptyErrorMsg() {
		return cityCannotEmptyErrorMsg;
	}

	public String getCityCannotNumericErrorMsg() {
		return cityCannotNumericErrorMsg;
	}

	public String getCityCannotHaveSpecialCharacterErrorMsg() {
		return cityCannotHaveSpecialCharacterErrorMsg;
	}

	public String getCityFirstCharacterCannotHaveSpaceErrorMsg() {
		return cityFirstCharacterCannotHaveSpaceErrorMsg;
	}

	public String getStateCannotEmptyErrorMsg() {
		return stateCannotEmptyErrorMsg;
	}

	public String getStateCannotNumericErrorMsg() {
		return stateCannotNumericErrorMsg;
	}

	public String getStateCannotHaveSpecialCharacterErrorMsg() {
		return stateCannotHaveSpecialCharacterErrorMsg;
	}

	public String getStateFirstCharacterCannotHaveSpaceErrorMsg() {
		return stateFirstCharacterCannotHaveSpaceErrorMsg;
	}

	public String getPinMustBeNumericErrorMsg() {
		return pinMustBeNumericErrorMsg;
	}

	public String getPinCannotEmptyErrorMsg() {
		return pinCannotEmptyErrorMsg;
	}

	public String getPinMustHave6Digits() {
		return pinMustHave6Digits;
	}

	public String getPinCannotHaveFirstBlankSpaceErrorMsg() {
		return pinCannotHaveFirstBlankSpaceErrorMsg;
	}

	public String getPinCannotHaveSpecialCharacterErrorMsg() {
		return pinCannotHaveSpecialCharacterErrorMsg;
	}

	public String getPinCannotHaveBlankSpace() {
		return pinCannotHaveBlankSpace;
	}

	public String getTelephoneCannotEmptyErrorMsg() {
		return telephoneCannotEmptyErrorMsg;
	}

	public String getTelephoneCannotHaveSpace() {
		return telephoneCannotHaveSpace;
	}

	public String getTelephoneCannotHaveSpecialCharacterErrorMsg() {
		return telephoneCannotHaveSpecialCharacterErrorMsg;
	}

	public String getTelephoneFirstCharacterCannotHaveSpaceErrorMsg() {
		return telephoneFirstCharacterCannotHaveSpaceErrorMsg;
	}

	public String getEmailCannotEmptyErrorMsg() {
		return emailCannotEmptyErrorMsg;
	}

	public String getEmailCannotHaveSpace() {
		return emailCannotHaveSpace;
	}

	public String getEmailMustBeCorrectFormat() {
		return emailMustBeCorrectFormat;
	}

}
