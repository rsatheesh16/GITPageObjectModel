package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {

	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement eleCompanyName;

	public DuplicateLeadPage enterCompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement eleFirstName;

	public DuplicateLeadPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;

	public DuplicateLeadPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_dataSourceId")
	private WebElement eleSource;

	public DuplicateLeadPage selectSource(String source) {
		selectDropDownUsingText(eleSource, source);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_marketingCampaignId")
	private WebElement eleMarketing;

	public DuplicateLeadPage selectMarketingCampaign(String marketing) {
		selectDropDownUsingText(eleMarketing, marketing);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_firstNameLocal")
	private WebElement eleFirstNameLocal;

	public DuplicateLeadPage enterFirstNameLocal(String firstNameLocal) {
		type(eleFirstNameLocal, firstNameLocal);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_lastNameLocal")
	private WebElement eleLastNameLocal;

	public DuplicateLeadPage enterLastNameLocal(String lastNameLocal) {
		type(eleLastNameLocal, lastNameLocal);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_personalTitle")
	private WebElement eleSalutation;

	public DuplicateLeadPage enterSalutation(String salutationTitle) {
		type(eleSalutation, salutationTitle);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalProfTitle")
	private WebElement eleProfileTitle;

	public DuplicateLeadPage enterProfileTitle(String profileTitle) {
		type(eleProfileTitle, profileTitle);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_departmentName")
	private WebElement eleDeptName;

	public DuplicateLeadPage enterDapartmentName(String deptName) {
		type(eleDeptName, deptName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_annualRevenue")
	private WebElement eleAnnualRevenue;

	public DuplicateLeadPage enterAnnualRevenue(String annualRevenue) {
		type(eleAnnualRevenue, annualRevenue);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_currencyUomId")
	private WebElement eleCurrencyType;

	public DuplicateLeadPage selectCurrencyType(String currencyType) {
		selectDropDownUsingText(eleCurrencyType, currencyType);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_industryEnumId")
	private WebElement eleIndustryType;

	public DuplicateLeadPage selectIndustryType(String industryType) {
		selectDropDownUsingText(eleIndustryType, industryType);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_numberEmployees")
	private WebElement eleEmployeeCount;

	public DuplicateLeadPage enterEmployeeCount(String empCount) {
		type(eleEmployeeCount, empCount);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_ownershipEnumId")
	private WebElement eleOwnership;

	public DuplicateLeadPage selectOwnership(String ownership) {
		selectDropDownUsingText(eleOwnership, ownership);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_sicCode")
	private WebElement eleSicCode;

	public DuplicateLeadPage enterSicCode(String sicCode) {
		type(eleSicCode, sicCode);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_tickerSymbol")
	private WebElement eleTickerSymbol;

	public DuplicateLeadPage enterTickerSymbol(String tickerSymbol) {
		type(eleTickerSymbol, tickerSymbol);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_description")
	private WebElement eleDescription;

	public DuplicateLeadPage enterDescription(String description) {
		type(eleDescription, description);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_importantNote")
	private WebElement eleImpNotes;

	public DuplicateLeadPage enterImpNotes(String impNotes) {
		type(eleImpNotes, impNotes);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneCountryCode")
	private WebElement elePrimaryPhoneCountryCode;

	public DuplicateLeadPage enterPrimaryPhoneCountryCode(String primaryPhoneCountryCode) {
		type(elePrimaryPhoneCountryCode, primaryPhoneCountryCode);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAreaCode")
	private WebElement elePrimaryPhoneAreaCode;

	public DuplicateLeadPage enterPrimaryPhoneAreaCode(String primaryPhoneAreaCode) {
		type(elePrimaryPhoneAreaCode, primaryPhoneAreaCode);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneNumber")
	private WebElement elePrimaryPhoneNo;

	public DuplicateLeadPage enterPrimaryPhoneNo(String primaryPhoneNo) {
		type(elePrimaryPhoneNo, primaryPhoneNo);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneExtension")
	private WebElement elePrimaryPhoneExtn;

	public DuplicateLeadPage enterPrimaryPhoneExtn(String primaryPhoneExtn) {
		type(elePrimaryPhoneExtn, primaryPhoneExtn);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAskForName")
	private WebElement elePrimaryPhoneHolderName;

	public DuplicateLeadPage enterPrimaryPhoneHolderName(String primaryPhoneHolderName) {
		type(elePrimaryPhoneHolderName, primaryPhoneHolderName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	private WebElement elePrimaryEmail;

	public DuplicateLeadPage enterPrimaryEmail(String primaryEmail) {
		type(elePrimaryEmail, primaryEmail);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryWebUrl")
	private WebElement elePrimaryUrl;

	public DuplicateLeadPage enterPrimaryUrl(String primaryUrl) {
		type(elePrimaryUrl, primaryUrl);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalToName")
	private WebElement eleToName;

	public DuplicateLeadPage enterToName(String toName) {
		type(eleToName, toName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalAttnName")
	private WebElement eleAttnName;

	public DuplicateLeadPage enterAttnName(String attnName) {
		type(eleAttnName, attnName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalAddress1")
	private WebElement eleAddressOne;

	public DuplicateLeadPage enterAddressLineOne(String addressOne) {
		type(eleAddressOne, addressOne);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalAddress2")
	private WebElement eleAddressTwo;

	public DuplicateLeadPage enterAddressLineTwo(String addressTwo) {
		type(eleAddressTwo, addressTwo);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalCity")
	private WebElement eleCity;

	public DuplicateLeadPage enterCity(String cityName) {
		type(eleCity, cityName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalCountryGeoId")
	private WebElement eleCountry;

	public DuplicateLeadPage selectCountry(String countryName) {
		selectDropDownUsingText(eleCountry, countryName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalStateProvinceGeoId")
	private WebElement eleStateProvince;

	public DuplicateLeadPage selectStateProvice(String stateProviceName) {
		selectDropDownUsingText(eleStateProvince, stateProviceName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCode")
	private WebElement elePostalCode;

	public DuplicateLeadPage enterPostalCode(String postalCode) {
		type(elePostalCode, postalCode);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCodeExt")
	private WebElement elePostalCodeExtn;

	public DuplicateLeadPage enterPostalCodeExtn(String postalCodeExtn) {
		type(elePostalCodeExtn, postalCodeExtn);
		return this;

	}
	
	public DuplicateLeadPage verifyDuplicateLeadTitle(String expectedText) {
		verifyTitle(expectedText);
		return this;
	}

	@FindBy(how = How.NAME, using = "submitButton")
	private WebElement eleCreateLeadBtn;

	public ViewLeadPage clickCreateLead() throws InterruptedException {
		click(eleCreateLeadBtn);
		return new ViewLeadPage(driver, test);
	}

}
