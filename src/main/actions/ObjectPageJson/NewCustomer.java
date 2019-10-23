
package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewCustomer {

    @SerializedName("numbericValue")
    @Expose
    private String numbericValue;
    @SerializedName("numbericandBlankValue")
    @Expose
    private String numbericandBlankValue;
    @SerializedName("specialCharacter")
    @Expose
    private String specialCharacter;
    @SerializedName("numbericAndCharacter")
    @Expose
    private String numbericAndCharacter;
    @SerializedName("lessThanSixDigit")
    @Expose
    private String lessThanSixDigit;
    @SerializedName("moreThanSixDigit")
    @Expose
    private String moreThanSixDigit;
    @SerializedName("invalidEmail")
    @Expose
    private String invalidEmail;
    @SerializedName("customerMustNotBeBlankMsg")
    @Expose
    private String customerMustNotBeBlankMsg;
    @SerializedName("numbersAreNotAllowedMsg")
    @Expose
    private String numbersAreNotAllowedMsg;
    @SerializedName("specialCharactersAreNotAllowedMsg")
    @Expose
    private String specialCharactersAreNotAllowedMsg;
    @SerializedName("firstCharacterCannotBeSpaceMsg")
    @Expose
    private String firstCharacterCannotBeSpaceMsg;
    @SerializedName("addressMustNotBeBlankMsg")
    @Expose
    private String addressMustNotBeBlankMsg;
    @SerializedName("cityMustNotBeBlankMsg")
    @Expose
    private String cityMustNotBeBlankMsg;
    @SerializedName("stateMustNotBeBlankMsg")
    @Expose
    private String stateMustNotBeBlankMsg;
    @SerializedName("pINMustNotBeBlankMsg")
    @Expose
    private String pINMustNotBeBlankMsg;
    @SerializedName("mobileNumberMustNotBeBlankMsg")
    @Expose
    private String mobileNumberMustNotBeBlankMsg;
    @SerializedName("emailMustNotBeBlankMsg")
    @Expose
    private String emailMustNotBeBlankMsg;
    @SerializedName("charactersAreNotAllowedMsg")
    @Expose
    private String charactersAreNotAllowedMsg;
    @SerializedName("pINCodeMustHave6digitsMsg")
    @Expose
    private String pINCodeMustHave6digitsMsg;
    @SerializedName("emailIDIsNotValidMsg")
    @Expose
    private String emailIDIsNotValidMsg;
    @SerializedName("customerLbl")
    @Expose
    private String customerLbl;
    @SerializedName("adressLbl")
    @Expose
    private String adressLbl;
    @SerializedName("cityLbl")
    @Expose
    private String cityLbl;
    @SerializedName("stateLbl")
    @Expose
    private String stateLbl;
    @SerializedName("pinLbl")
    @Expose
    private String pinLbl;
    @SerializedName("mobileNumberLbl")
    @Expose
    private String mobileNumberLbl;
    @SerializedName("emailLbl")
    @Expose
    private String emailLbl;
    @SerializedName("customerName")
    @Expose
    private String customerName;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("dateOfBirth")
    @Expose
    private String dateOfBirth;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("pin")
    @Expose
    private String pin;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("passwordNewCustomer")
    @Expose
    private String passwordNewCustomer;

    public String getNumbericValue() {
        return numbericValue;
    }

    public void setNumbericValue(String numbericValue) {
        this.numbericValue = numbericValue;
    }

    public String getNumbericandBlankValue() {
        return numbericandBlankValue;
    }

    public void setNumbericandBlankValue(String numbericandBlankValue) {
        this.numbericandBlankValue = numbericandBlankValue;
    }

    public String getSpecialCharacter() {
        return specialCharacter;
    }

    public void setSpecialCharacter(String specialCharacter) {
        this.specialCharacter = specialCharacter;
    }

    public String getNumbericAndCharacter() {
        return numbericAndCharacter;
    }

    public void setNumbericAndCharacter(String numbericAndCharacter) {
        this.numbericAndCharacter = numbericAndCharacter;
    }

    public String getLessThanSixDigit() {
        return lessThanSixDigit;
    }

    public void setLessThanSixDigit(String lessThanSixDigit) {
        this.lessThanSixDigit = lessThanSixDigit;
    }

    public String getMoreThanSixDigit() {
        return moreThanSixDigit;
    }

    public void setMoreThanSixDigit(String moreThanSixDigit) {
        this.moreThanSixDigit = moreThanSixDigit;
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }

    public void setInvalidEmail(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    public String getCustomerMustNotBeBlankMsg() {
        return customerMustNotBeBlankMsg;
    }

    public void setCustomerMustNotBeBlankMsg(String customerMustNotBeBlankMsg) {
        this.customerMustNotBeBlankMsg = customerMustNotBeBlankMsg;
    }

    public String getNumbersAreNotAllowedMsg() {
        return numbersAreNotAllowedMsg;
    }

    public void setNumbersAreNotAllowedMsg(String numbersAreNotAllowedMsg) {
        this.numbersAreNotAllowedMsg = numbersAreNotAllowedMsg;
    }

    public String getSpecialCharactersAreNotAllowedMsg() {
        return specialCharactersAreNotAllowedMsg;
    }

    public void setSpecialCharactersAreNotAllowedMsg(String specialCharactersAreNotAllowedMsg) {
        this.specialCharactersAreNotAllowedMsg = specialCharactersAreNotAllowedMsg;
    }

    public String getFirstCharacterCannotBeSpaceMsg() {
        return firstCharacterCannotBeSpaceMsg;
    }

    public void setFirstCharacterCannotBeSpaceMsg(String firstCharacterCannotBeSpaceMsg) {
        this.firstCharacterCannotBeSpaceMsg = firstCharacterCannotBeSpaceMsg;
    }

    public String getAddressMustNotBeBlankMsg() {
        return addressMustNotBeBlankMsg;
    }

    public void setAddressMustNotBeBlankMsg(String addressMustNotBeBlankMsg) {
        this.addressMustNotBeBlankMsg = addressMustNotBeBlankMsg;
    }

    public String getCityMustNotBeBlankMsg() {
        return cityMustNotBeBlankMsg;
    }

    public void setCityMustNotBeBlankMsg(String cityMustNotBeBlankMsg) {
        this.cityMustNotBeBlankMsg = cityMustNotBeBlankMsg;
    }

    public String getStateMustNotBeBlankMsg() {
        return stateMustNotBeBlankMsg;
    }

    public void setStateMustNotBeBlankMsg(String stateMustNotBeBlankMsg) {
        this.stateMustNotBeBlankMsg = stateMustNotBeBlankMsg;
    }

    public String getPINMustNotBeBlankMsg() {
        return pINMustNotBeBlankMsg;
    }

    public void setPINMustNotBeBlankMsg(String pINMustNotBeBlankMsg) {
        this.pINMustNotBeBlankMsg = pINMustNotBeBlankMsg;
    }

    public String getMobileNumberMustNotBeBlankMsg() {
        return mobileNumberMustNotBeBlankMsg;
    }

    public void setMobileNumberMustNotBeBlankMsg(String mobileNumberMustNotBeBlankMsg) {
        this.mobileNumberMustNotBeBlankMsg = mobileNumberMustNotBeBlankMsg;
    }

    public String getEmailMustNotBeBlankMsg() {
        return emailMustNotBeBlankMsg;
    }

    public void setEmailMustNotBeBlankMsg(String emailMustNotBeBlankMsg) {
        this.emailMustNotBeBlankMsg = emailMustNotBeBlankMsg;
    }

    public String getCharactersAreNotAllowedMsg() {
        return charactersAreNotAllowedMsg;
    }

    public void setCharactersAreNotAllowedMsg(String charactersAreNotAllowedMsg) {
        this.charactersAreNotAllowedMsg = charactersAreNotAllowedMsg;
    }

    public String getPINCodeMustHave6digitsMsg() {
        return pINCodeMustHave6digitsMsg;
    }

    public void setPINCodeMustHave6digitsMsg(String pINCodeMustHave6digitsMsg) {
        this.pINCodeMustHave6digitsMsg = pINCodeMustHave6digitsMsg;
    }

    public String getEmailIDIsNotValidMsg() {
        return emailIDIsNotValidMsg;
    }

    public void setEmailIDIsNotValidMsg(String emailIDIsNotValidMsg) {
        this.emailIDIsNotValidMsg = emailIDIsNotValidMsg;
    }

    public String getCustomerLbl() {
        return customerLbl;
    }

    public void setCustomerLbl(String customerLbl) {
        this.customerLbl = customerLbl;
    }

    public String getAdressLbl() {
        return adressLbl;
    }

    public void setAdressLbl(String adressLbl) {
        this.adressLbl = adressLbl;
    }

    public String getCityLbl() {
        return cityLbl;
    }

    public void setCityLbl(String cityLbl) {
        this.cityLbl = cityLbl;
    }

    public String getStateLbl() {
        return stateLbl;
    }

    public void setStateLbl(String stateLbl) {
        this.stateLbl = stateLbl;
    }

    public String getPinLbl() {
        return pinLbl;
    }

    public void setPinLbl(String pinLbl) {
        this.pinLbl = pinLbl;
    }

    public String getMobileNumberLbl() {
        return mobileNumberLbl;
    }

    public void setMobileNumberLbl(String mobileNumberLbl) {
        this.mobileNumberLbl = mobileNumberLbl;
    }

    public String getEmailLbl() {
        return emailLbl;
    }

    public void setEmailLbl(String emailLbl) {
        this.emailLbl = emailLbl;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswordNewCustomer() {
        return passwordNewCustomer;
    }

    public void setPasswordNewCustomer(String passwordNewCustomer) {
        this.passwordNewCustomer = passwordNewCustomer;
    }

}
