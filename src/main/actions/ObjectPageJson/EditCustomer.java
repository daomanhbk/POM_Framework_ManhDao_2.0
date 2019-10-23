
package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EditCustomer {

    @SerializedName("invalidEmail")
    @Expose
    private String invalidEmail;
    @SerializedName("customerIdIsRequiredMsg")
    @Expose
    private String customerIdIsRequiredMsg;
    @SerializedName("numberAndChar")
    @Expose
    private String numberAndChar;
    @SerializedName("specialCharacter")
    @Expose
    private String specialCharacter;
    @SerializedName("numeric")
    @Expose
    private String numeric;
    @SerializedName("charactersAreNotAllowedMsg")
    @Expose
    private String charactersAreNotAllowedMsg;
    @SerializedName("specialCharactersAreNotAllowedMsg")
    @Expose
    private String specialCharactersAreNotAllowedMsg;
    @SerializedName("editCustomerLabel")
    @Expose
    private String editCustomerLabel;
    @SerializedName("addressFieldMustNotBeBlankMsg")
    @Expose
    private String addressFieldMustNotBeBlankMsg;
    @SerializedName("cityFieldMustNotBeBlankMsg")
    @Expose
    private String cityFieldMustNotBeBlankMsg;
    @SerializedName("stateMustNotBeBlankMsg")
    @Expose
    private String stateMustNotBeBlankMsg;
    @SerializedName("numbersAreNotAllowedMsg")
    @Expose
    private String numbersAreNotAllowedMsg;
    @SerializedName("pINMustNotBeBlankMsg")
    @Expose
    private String pINMustNotBeBlankMsg;
    @SerializedName("pINCodeMustHave6digitsMsg")
    @Expose
    private String pINCodeMustHave6digitsMsg;
    @SerializedName("mobileNumberMustNotBeBlankMsg")
    @Expose
    private String mobileNumberMustNotBeBlankMsg;
    @SerializedName("emailIDIsNotValidMsg")
    @Expose
    private String emailIDIsNotValidMsg;
    @SerializedName("emailMustNotBeBlankMsg")
    @Expose
    private String emailMustNotBeBlankMsg;

    public String getInvalidEmail() {
        return invalidEmail;
    }

    public void setInvalidEmail(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    public String getCustomerIdIsRequiredMsg() {
        return customerIdIsRequiredMsg;
    }

    public void setCustomerIdIsRequiredMsg(String customerIdIsRequiredMsg) {
        this.customerIdIsRequiredMsg = customerIdIsRequiredMsg;
    }

    public String getNumberAndChar() {
        return numberAndChar;
    }

    public void setNumberAndChar(String numberAndChar) {
        this.numberAndChar = numberAndChar;
    }

    public String getSpecialCharacter() {
        return specialCharacter;
    }

    public void setSpecialCharacter(String specialCharacter) {
        this.specialCharacter = specialCharacter;
    }

    public String getNumeric() {
        return numeric;
    }

    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    public String getCharactersAreNotAllowedMsg() {
        return charactersAreNotAllowedMsg;
    }

    public void setCharactersAreNotAllowedMsg(String charactersAreNotAllowedMsg) {
        this.charactersAreNotAllowedMsg = charactersAreNotAllowedMsg;
    }

    public String getSpecialCharactersAreNotAllowedMsg() {
        return specialCharactersAreNotAllowedMsg;
    }

    public void setSpecialCharactersAreNotAllowedMsg(String specialCharactersAreNotAllowedMsg) {
        this.specialCharactersAreNotAllowedMsg = specialCharactersAreNotAllowedMsg;
    }

    public String getEditCustomerLabel() {
        return editCustomerLabel;
    }

    public void setEditCustomerLabel(String editCustomerLabel) {
        this.editCustomerLabel = editCustomerLabel;
    }

    public String getAddressFieldMustNotBeBlankMsg() {
        return addressFieldMustNotBeBlankMsg;
    }

    public void setAddressFieldMustNotBeBlankMsg(String addressFieldMustNotBeBlankMsg) {
        this.addressFieldMustNotBeBlankMsg = addressFieldMustNotBeBlankMsg;
    }

    public String getCityFieldMustNotBeBlankMsg() {
        return cityFieldMustNotBeBlankMsg;
    }

    public void setCityFieldMustNotBeBlankMsg(String cityFieldMustNotBeBlankMsg) {
        this.cityFieldMustNotBeBlankMsg = cityFieldMustNotBeBlankMsg;
    }

    public String getStateMustNotBeBlankMsg() {
        return stateMustNotBeBlankMsg;
    }

    public void setStateMustNotBeBlankMsg(String stateMustNotBeBlankMsg) {
        this.stateMustNotBeBlankMsg = stateMustNotBeBlankMsg;
    }

    public String getNumbersAreNotAllowedMsg() {
        return numbersAreNotAllowedMsg;
    }

    public void setNumbersAreNotAllowedMsg(String numbersAreNotAllowedMsg) {
        this.numbersAreNotAllowedMsg = numbersAreNotAllowedMsg;
    }

    public String getPINMustNotBeBlankMsg() {
        return pINMustNotBeBlankMsg;
    }

    public void setPINMustNotBeBlankMsg(String pINMustNotBeBlankMsg) {
        this.pINMustNotBeBlankMsg = pINMustNotBeBlankMsg;
    }

    public String getPINCodeMustHave6digitsMsg() {
        return pINCodeMustHave6digitsMsg;
    }

    public void setPINCodeMustHave6digitsMsg(String pINCodeMustHave6digitsMsg) {
        this.pINCodeMustHave6digitsMsg = pINCodeMustHave6digitsMsg;
    }

    public String getMobileNumberMustNotBeBlankMsg() {
        return mobileNumberMustNotBeBlankMsg;
    }

    public void setMobileNumberMustNotBeBlankMsg(String mobileNumberMustNotBeBlankMsg) {
        this.mobileNumberMustNotBeBlankMsg = mobileNumberMustNotBeBlankMsg;
    }

    public String getEmailIDIsNotValidMsg() {
        return emailIDIsNotValidMsg;
    }

    public void setEmailIDIsNotValidMsg(String emailIDIsNotValidMsg) {
        this.emailIDIsNotValidMsg = emailIDIsNotValidMsg;
    }

    public String getEmailMustNotBeBlankMsg() {
        return emailMustNotBeBlankMsg;
    }

    public void setEmailMustNotBeBlankMsg(String emailMustNotBeBlankMsg) {
        this.emailMustNotBeBlankMsg = emailMustNotBeBlankMsg;
    }

}
