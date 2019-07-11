
package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EditCustomer {

    @SerializedName("specialChar")
    @Expose
    private String specialChar;
    @SerializedName("invalid_CustomerID")
    @Expose
    private String invalidCustomerID;
    @SerializedName("numeric")
    @Expose
    private String numeric;
    @SerializedName("invalid_PIN")
    @Expose
    private String invalidPIN;
    @SerializedName("invalid_Email")
    @Expose
    private String invalidEmail;
    @SerializedName("successfulMessage")
    @Expose
    private String successfulMessage;
    @SerializedName("customerIDCannotEmptyErrorMsg")
    @Expose
    private String customerIDCannotEmptyErrorMsg;
    @SerializedName("customerIDMustBeNumericErrorMsg")
    @Expose
    private String customerIDMustBeNumericErrorMsg;
    @SerializedName("customerIDCannotHaveSpecialCharacterErrorMsg")
    @Expose
    private String customerIDCannotHaveSpecialCharacterErrorMsg;
    @SerializedName("addressFieldCannotEmptyErrorMsg")
    @Expose
    private String addressFieldCannotEmptyErrorMsg;
    @SerializedName("cityCannotEmptyErrorMsg")
    @Expose
    private String cityCannotEmptyErrorMsg;
    @SerializedName("cityCannotBeNumericErrorMsg")
    @Expose
    private String cityCannotBeNumericErrorMsg;
    @SerializedName("cityCannotHaveSpecialCharacterErrorMsg")
    @Expose
    private String cityCannotHaveSpecialCharacterErrorMsg;
    @SerializedName("stateCannotEmptyErrorMsg")
    @Expose
    private String stateCannotEmptyErrorMsg;
    @SerializedName("stateCannotBeNumericErrorMsg")
    @Expose
    private String stateCannotBeNumericErrorMsg;
    @SerializedName("stateCannotHaveSpecialCharacterErrorMsg")
    @Expose
    private String stateCannotHaveSpecialCharacterErrorMsg;
    @SerializedName("pinMustHave06Digit")
    @Expose
    private String pinMustHave06Digit;
    @SerializedName("pinCannotEmptyErrorMsg")
    @Expose
    private String pinCannotEmptyErrorMsg;
    @SerializedName("pinCannotBeCharactersErrorMsg")
    @Expose
    private String pinCannotBeCharactersErrorMsg;
    @SerializedName("pinCannotHaveSpecialCharacterErrorMsg")
    @Expose
    private String pinCannotHaveSpecialCharacterErrorMsg;
    @SerializedName("telephoneCannotEmptyErrorMsg")
    @Expose
    private String telephoneCannotEmptyErrorMsg;
    @SerializedName("telephoneCannotHaveSpecialCharacterErrorMsg")
    @Expose
    private String telephoneCannotHaveSpecialCharacterErrorMsg;
    @SerializedName("emailCannotEmptyErrorMsg")
    @Expose
    private String emailCannotEmptyErrorMsg;
    @SerializedName("emailMustBeCorrectFormat")
    @Expose
    private String emailMustBeCorrectFormat;
    @SerializedName("emailCannotHaveBlankSpace")
    @Expose
    private String emailCannotHaveBlankSpace;

    public String getSpecialChar() {
        return specialChar;
    }

    public void setSpecialChar(String specialChar) {
        this.specialChar = specialChar;
    }

    public String getInvalidCustomerID() {
        return invalidCustomerID;
    }

    public void setInvalidCustomerID(String invalidCustomerID) {
        this.invalidCustomerID = invalidCustomerID;
    }

    public String getNumeric() {
        return numeric;
    }

    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    public String getInvalidPIN() {
        return invalidPIN;
    }

    public void setInvalidPIN(String invalidPIN) {
        this.invalidPIN = invalidPIN;
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }

    public void setInvalidEmail(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    public String getSuccessfulMessage() {
        return successfulMessage;
    }

    public void setSuccessfulMessage(String successfulMessage) {
        this.successfulMessage = successfulMessage;
    }

    public String getCustomerIDCannotEmptyErrorMsg() {
        return customerIDCannotEmptyErrorMsg;
    }

    public void setCustomerIDCannotEmptyErrorMsg(String customerIDCannotEmptyErrorMsg) {
        this.customerIDCannotEmptyErrorMsg = customerIDCannotEmptyErrorMsg;
    }

    public String getCustomerIDMustBeNumericErrorMsg() {
        return customerIDMustBeNumericErrorMsg;
    }

    public void setCustomerIDMustBeNumericErrorMsg(String customerIDMustBeNumericErrorMsg) {
        this.customerIDMustBeNumericErrorMsg = customerIDMustBeNumericErrorMsg;
    }

    public String getCustomerIDCannotHaveSpecialCharacterErrorMsg() {
        return customerIDCannotHaveSpecialCharacterErrorMsg;
    }

    public void setCustomerIDCannotHaveSpecialCharacterErrorMsg(String customerIDCannotHaveSpecialCharacterErrorMsg) {
        this.customerIDCannotHaveSpecialCharacterErrorMsg = customerIDCannotHaveSpecialCharacterErrorMsg;
    }

    public String getAddressFieldCannotEmptyErrorMsg() {
        return addressFieldCannotEmptyErrorMsg;
    }

    public void setAddressFieldCannotEmptyErrorMsg(String addressFieldCannotEmptyErrorMsg) {
        this.addressFieldCannotEmptyErrorMsg = addressFieldCannotEmptyErrorMsg;
    }

    public String getCityCannotEmptyErrorMsg() {
        return cityCannotEmptyErrorMsg;
    }

    public void setCityCannotEmptyErrorMsg(String cityCannotEmptyErrorMsg) {
        this.cityCannotEmptyErrorMsg = cityCannotEmptyErrorMsg;
    }

    public String getCityCannotBeNumericErrorMsg() {
        return cityCannotBeNumericErrorMsg;
    }

    public void setCityCannotBeNumericErrorMsg(String cityCannotBeNumericErrorMsg) {
        this.cityCannotBeNumericErrorMsg = cityCannotBeNumericErrorMsg;
    }

    public String getCityCannotHaveSpecialCharacterErrorMsg() {
        return cityCannotHaveSpecialCharacterErrorMsg;
    }

    public void setCityCannotHaveSpecialCharacterErrorMsg(String cityCannotHaveSpecialCharacterErrorMsg) {
        this.cityCannotHaveSpecialCharacterErrorMsg = cityCannotHaveSpecialCharacterErrorMsg;
    }

    public String getStateCannotEmptyErrorMsg() {
        return stateCannotEmptyErrorMsg;
    }

    public void setStateCannotEmptyErrorMsg(String stateCannotEmptyErrorMsg) {
        this.stateCannotEmptyErrorMsg = stateCannotEmptyErrorMsg;
    }

    public String getStateCannotBeNumericErrorMsg() {
        return stateCannotBeNumericErrorMsg;
    }

    public void setStateCannotBeNumericErrorMsg(String stateCannotBeNumericErrorMsg) {
        this.stateCannotBeNumericErrorMsg = stateCannotBeNumericErrorMsg;
    }

    public String getStateCannotHaveSpecialCharacterErrorMsg() {
        return stateCannotHaveSpecialCharacterErrorMsg;
    }

    public void setStateCannotHaveSpecialCharacterErrorMsg(String stateCannotHaveSpecialCharacterErrorMsg) {
        this.stateCannotHaveSpecialCharacterErrorMsg = stateCannotHaveSpecialCharacterErrorMsg;
    }

    public String getPinMustHave06Digit() {
        return pinMustHave06Digit;
    }

    public void setPinMustHave06Digit(String pinMustHave06Digit) {
        this.pinMustHave06Digit = pinMustHave06Digit;
    }

    public String getPinCannotEmptyErrorMsg() {
        return pinCannotEmptyErrorMsg;
    }

    public void setPinCannotEmptyErrorMsg(String pinCannotEmptyErrorMsg) {
        this.pinCannotEmptyErrorMsg = pinCannotEmptyErrorMsg;
    }

    public String getPinCannotBeCharactersErrorMsg() {
        return pinCannotBeCharactersErrorMsg;
    }

    public void setPinCannotBeCharactersErrorMsg(String pinCannotBeCharactersErrorMsg) {
        this.pinCannotBeCharactersErrorMsg = pinCannotBeCharactersErrorMsg;
    }

    public String getPinCannotHaveSpecialCharacterErrorMsg() {
        return pinCannotHaveSpecialCharacterErrorMsg;
    }

    public void setPinCannotHaveSpecialCharacterErrorMsg(String pinCannotHaveSpecialCharacterErrorMsg) {
        this.pinCannotHaveSpecialCharacterErrorMsg = pinCannotHaveSpecialCharacterErrorMsg;
    }

    public String getTelephoneCannotEmptyErrorMsg() {
        return telephoneCannotEmptyErrorMsg;
    }

    public void setTelephoneCannotEmptyErrorMsg(String telephoneCannotEmptyErrorMsg) {
        this.telephoneCannotEmptyErrorMsg = telephoneCannotEmptyErrorMsg;
    }

    public String getTelephoneCannotHaveSpecialCharacterErrorMsg() {
        return telephoneCannotHaveSpecialCharacterErrorMsg;
    }

    public void setTelephoneCannotHaveSpecialCharacterErrorMsg(String telephoneCannotHaveSpecialCharacterErrorMsg) {
        this.telephoneCannotHaveSpecialCharacterErrorMsg = telephoneCannotHaveSpecialCharacterErrorMsg;
    }

    public String getEmailCannotEmptyErrorMsg() {
        return emailCannotEmptyErrorMsg;
    }

    public void setEmailCannotEmptyErrorMsg(String emailCannotEmptyErrorMsg) {
        this.emailCannotEmptyErrorMsg = emailCannotEmptyErrorMsg;
    }

    public String getEmailMustBeCorrectFormat() {
        return emailMustBeCorrectFormat;
    }

    public void setEmailMustBeCorrectFormat(String emailMustBeCorrectFormat) {
        this.emailMustBeCorrectFormat = emailMustBeCorrectFormat;
    }

    public String getEmailCannotHaveBlankSpace() {
        return emailCannotHaveBlankSpace;
    }

    public void setEmailCannotHaveBlankSpace(String emailCannotHaveBlankSpace) {
        this.emailCannotHaveBlankSpace = emailCannotHaveBlankSpace;
    }

}
