package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateContactPage extends ProjectMethods {

	public CreateContactPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}


	@FindBy(how = How.ID, using = "firstNameField")
	private WebElement eleFirstName;

	public CreateContactPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;

	}

	@FindBy(how = How.ID, using = "lastNameField")
	private WebElement eleLastName;

	public CreateContactPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;

	}


	@FindBy(how = How.ID, using = "createContactForm_firstNameLocal")
	private WebElement eleFirstNameLocal;

	public CreateContactPage enterFirstNameLocal(String firstNameLocal) {
		type(eleFirstNameLocal, firstNameLocal);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_lastNameLocal")
	private WebElement eleLastNameLocal;

	public CreateContactPage enterLastNameLocal(String lastNameLocal) {
		type(eleLastNameLocal, lastNameLocal);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_personalTitle")
	private WebElement eleSalutation;

	public CreateContactPage enterSalutation(String salutationTitle) {
		type(eleSalutation, salutationTitle);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_generalProfTitle")
	private WebElement eleProfileTitle;

	public CreateContactPage enterProfileTitle(String profileTitle) {
		type(eleProfileTitle, profileTitle);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_departmentName")
	private WebElement eleDeptName;

	public CreateContactPage enterDapartmentName(String deptName) {
		type(eleDeptName, deptName);
		return this;

	}


	@FindBy(how = How.ID, using = "createContactForm_preferredCurrencyUomId")
	private WebElement eleCurrencyType;

	public CreateContactPage selectCurrencyType(String currencyType) {
		selectDropDownUsingText(eleCurrencyType, currencyType);
		return this;

	}


	@FindBy(how = How.ID, using = "createContactForm_description")
	private WebElement eleDescription;

	public CreateContactPage enterDescription(String description) {
		type(eleDescription, description);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_importantNote")
	private WebElement eleImpNotes;

	public CreateContactPage enterImpNotes(String impNotes) {
		type(eleImpNotes, impNotes);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_primaryPhoneCountryCode")
	private WebElement elePrimaryPhoneCountryCode;

	public CreateContactPage enterPrimaryPhoneCountryCode(String primaryPhoneCountryCode) {
		type(elePrimaryPhoneCountryCode, primaryPhoneCountryCode);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_primaryPhoneAreaCode")
	private WebElement elePrimaryPhoneAreaCode;

	public CreateContactPage enterPrimaryPhoneAreaCode(String primaryPhoneAreaCode) {
		type(elePrimaryPhoneAreaCode, primaryPhoneAreaCode);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_primaryPhoneNumber")
	private WebElement elePrimaryPhoneNo;

	public CreateContactPage enterPrimaryPhoneNo(String primaryPhoneNo) {
		type(elePrimaryPhoneNo, primaryPhoneNo);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_primaryPhoneExtension")
	private WebElement elePrimaryPhoneExtn;

	public CreateContactPage enterPrimaryPhoneExtn(String primaryPhoneExtn) {
		type(elePrimaryPhoneExtn, primaryPhoneExtn);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_primaryPhoneAskForName")
	private WebElement elePrimaryPhoneHolderName;

	public CreateContactPage enterPrimaryPhoneHolderName(String primaryPhoneHolderName) {
		type(elePrimaryPhoneHolderName, primaryPhoneHolderName);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_primaryEmail")
	private WebElement elePrimaryEmail;

	public CreateContactPage enterPrimaryEmail(String primaryEmail) {
		type(elePrimaryEmail, primaryEmail);
		return this;

	}


	@FindBy(how = How.ID, using = "generalToNameField")
	private WebElement eleToName;

	public CreateContactPage enterToName(String toName) {
		type(eleToName, toName);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_generalAttnName")
	private WebElement eleAttnName;

	public CreateContactPage enterAttnName(String attnName) {
		type(eleAttnName, attnName);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_generalAddress1")
	private WebElement eleAddressOne;

	public CreateContactPage enterAddressLineOne(String addressOne) {
		type(eleAddressOne, addressOne);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_generalAddress2")
	private WebElement eleAddressTwo;

	public CreateContactPage enterAddressLineTwo(String addressTwo) {
		type(eleAddressTwo, addressTwo);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_generalCity")
	private WebElement eleCity;

	public CreateContactPage enterCity(String cityName) {
		type(eleCity, cityName);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_generalCountryGeoId")
	private WebElement eleCountry;

	public CreateContactPage selectCountry(String countryName) {
		selectDropDownUsingText(eleCountry, countryName);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_generalStateProvinceGeoId")
	private WebElement eleStateProvince;

	public CreateContactPage selectStateProvice(String stateProviceName) {
		selectDropDownUsingText(eleStateProvince, stateProviceName);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_generalPostalCode")
	private WebElement elePostalCode;

	public CreateContactPage enterPostalCode(String postalCode) {
		type(elePostalCode, postalCode);
		return this;

	}

	@FindBy(how = How.ID, using = "createContactForm_generalPostalCodeExt")
	private WebElement elePostalCodeExtn;

	public CreateContactPage enterPostalCodeExtn(String postalCodeExtn) {
		type(elePostalCodeExtn, postalCodeExtn);
		return this;

	}

	@FindBy(how = How.NAME, using = "submitButton")
	private WebElement eleCreateContactBtn;

	public ViewContactPage clickCreateContact() throws InterruptedException {
		click(eleCreateContactBtn);
		return new ViewContactPage(driver, test);
	}

}
