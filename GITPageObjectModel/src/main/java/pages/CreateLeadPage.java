package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement eleCompanyName;

	public CreateLeadPage enterCompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLeadPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;

	public CreateLeadPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_dataSourceId")
	private WebElement eleSource;

	public CreateLeadPage selectSource(String source) {
		selectDropDownUsingText(eleSource, source);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_marketingCampaignId")
	private WebElement eleMarketing;

	public CreateLeadPage selectMarketingCampaign(String marketing) {
		selectDropDownUsingText(eleMarketing, marketing);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_firstNameLocal")
	private WebElement eleFirstNameLocal;

	public CreateLeadPage enterFirstNameLocal(String firstNameLocal) {
		type(eleFirstNameLocal, firstNameLocal);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_lastNameLocal")
	private WebElement eleLastNameLocal;

	public CreateLeadPage enterLastNameLocal(String lastNameLocal) {
		type(eleLastNameLocal, lastNameLocal);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_personalTitle")
	private WebElement eleSalutation;

	public CreateLeadPage enterSalutation(String salutationTitle) {
		type(eleSalutation, salutationTitle);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalProfTitle")
	private WebElement eleProfileTitle;

	public CreateLeadPage enterProfileTitle(String profileTitle) {
		type(eleProfileTitle, profileTitle);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_departmentName")
	private WebElement eleDeptName;

	public CreateLeadPage enterDapartmentName(String deptName) {
		type(eleDeptName, deptName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_annualRevenue")
	private WebElement eleAnnualRevenue;

	public CreateLeadPage enterAnnualRevenue(String annualRevenue) {
		type(eleAnnualRevenue, annualRevenue);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_currencyUomId")
	private WebElement eleCurrencyType;

	public CreateLeadPage selectCurrencyType(String currencyType) {
		selectDropDownUsingText(eleCurrencyType, currencyType);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_industryEnumId")
	private WebElement eleIndustryType;

	public CreateLeadPage selectIndustryType(String industryType) {
		selectDropDownUsingText(eleIndustryType, industryType);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_numberEmployees")
	private WebElement eleEmployeeCount;

	public CreateLeadPage enterEmployeeCount(String empCount) {
		type(eleEmployeeCount, empCount);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_ownershipEnumId")
	private WebElement eleOwnership;

	public CreateLeadPage selectOwnership(String ownership) {
		selectDropDownUsingText(eleOwnership, ownership);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_sicCode")
	private WebElement eleSicCode;

	public CreateLeadPage enterSicCode(String sicCode) {
		type(eleSicCode, sicCode);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_tickerSymbol")
	private WebElement eleTickerSymbol;

	public CreateLeadPage enterTickerSymbol(String tickerSymbol) {
		type(eleTickerSymbol, tickerSymbol);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_description")
	private WebElement eleDescription;

	public CreateLeadPage enterDescription(String description) {
		type(eleDescription, description);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_importantNote")
	private WebElement eleImpNotes;

	public CreateLeadPage enterImpNotes(String impNotes) {
		type(eleImpNotes, impNotes);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneCountryCode")
	private WebElement elePrimaryPhoneCountryCode;

	public CreateLeadPage enterPrimaryPhoneCountryCode(String primaryPhoneCountryCode) {
		type(elePrimaryPhoneCountryCode, primaryPhoneCountryCode);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAreaCode")
	private WebElement elePrimaryPhoneAreaCode;

	public CreateLeadPage enterPrimaryPhoneAreaCode(String primaryPhoneAreaCode) {
		type(elePrimaryPhoneAreaCode, primaryPhoneAreaCode);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneNumber")
	private WebElement elePrimaryPhoneNo;

	public CreateLeadPage enterPrimaryPhoneNo(String primaryPhoneNo) {
		type(elePrimaryPhoneNo, primaryPhoneNo);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneExtension")
	private WebElement elePrimaryPhoneExtn;

	public CreateLeadPage enterPrimaryPhoneExtn(String primaryPhoneExtn) {
		type(elePrimaryPhoneExtn, primaryPhoneExtn);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAskForName")
	private WebElement elePrimaryPhoneHolderName;

	public CreateLeadPage enterPrimaryPhoneHolderName(String primaryPhoneHolderName) {
		type(elePrimaryPhoneHolderName, primaryPhoneHolderName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	private WebElement elePrimaryEmail;

	public CreateLeadPage enterPrimaryEmail(String primaryEmail) {
		type(elePrimaryEmail, primaryEmail);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryWebUrl")
	private WebElement elePrimaryUrl;

	public CreateLeadPage enterPrimaryUrl(String primaryUrl) {
		type(elePrimaryUrl, primaryUrl);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalToName")
	private WebElement eleToName;

	public CreateLeadPage enterToName(String toName) {
		type(eleToName, toName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalAttnName")
	private WebElement eleAttnName;

	public CreateLeadPage enterAttnName(String attnName) {
		type(eleAttnName, attnName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalAddress1")
	private WebElement eleAddressOne;

	public CreateLeadPage enterAddressLineOne(String addressOne) {
		type(eleAddressOne, addressOne);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalAddress2")
	private WebElement eleAddressTwo;

	public CreateLeadPage enterAddressLineTwo(String addressTwo) {
		type(eleAddressTwo, addressTwo);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalCity")
	private WebElement eleCity;

	public CreateLeadPage enterCity(String cityName) {
		type(eleCity, cityName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalCountryGeoId")
	private WebElement eleCountry;

	public CreateLeadPage selectCountry(String countryName) {
		selectDropDownUsingText(eleCountry, countryName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalStateProvinceGeoId")
	private WebElement eleStateProvince;

	public CreateLeadPage selectStateProvice(String stateProviceName) {
		selectDropDownUsingText(eleStateProvince, stateProviceName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCode")
	private WebElement elePostalCode;

	public CreateLeadPage enterPostalCode(String postalCode) {
		type(elePostalCode, postalCode);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCodeExt")
	private WebElement elePostalCodeExtn;

	public CreateLeadPage enterPostalCodeExtn(String postalCodeExtn) {
		type(elePostalCodeExtn, postalCodeExtn);
		return this;

	}

	@FindBy(how = How.NAME, using = "submitButton")
	private WebElement eleCreateLeadBtn;

	public ViewLeadPage clickCreateLead() throws InterruptedException {
		click(eleCreateLeadBtn);
		return new ViewLeadPage(driver, test);
	}

}
