package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "updateLeadForm_companyName")
	private WebElement eleCompanyName;

	public EditLeadPage enterCompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_firstName")
	private WebElement eleFirstName;

	public EditLeadPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_lastName")
	private WebElement eleLastName;

	public EditLeadPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;

	}

	

	@FindBy(how = How.ID, using = "updateLeadForm_firstNameLocal")
	private WebElement eleFirstNameLocal;

	public EditLeadPage enterFirstNameLocal(String firstNameLocal) {
		type(eleFirstNameLocal, firstNameLocal);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_lastNameLocal")
	private WebElement eleLastNameLocal;

	public EditLeadPage enterLastNameLocal(String lastNameLocal) {
		type(eleLastNameLocal, lastNameLocal);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_personalTitle")
	private WebElement eleSalutation;

	public EditLeadPage enterSalutation(String salutationTitle) {
		type(eleSalutation, salutationTitle);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_generalProfTitle")
	private WebElement eleProfileTitle;

	public EditLeadPage enterProfileTitle(String profileTitle) {
		type(eleProfileTitle, profileTitle);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_departmentName")
	private WebElement eleDeptName;

	public EditLeadPage enterDapartmentName(String deptName) {
		type(eleDeptName, deptName);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_annualRevenue")
	private WebElement eleAnnualRevenue;

	public EditLeadPage enterAnnualRevenue(String annualRevenue) {
		type(eleAnnualRevenue, annualRevenue);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_currencyUomId")
	private WebElement eleCurrencyType;

	public EditLeadPage selectCurrencyType(String currencyType) {
		selectDropDownUsingText(eleCurrencyType, currencyType);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_industryEnumId")
	private WebElement eleIndustryType;

	public EditLeadPage selectIndustryType(String industryType) {
		selectDropDownUsingText(eleIndustryType, industryType);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_numberEmployees")
	private WebElement eleEmployeeCount;

	public EditLeadPage enterEmployeeCount(String empCount) {
		type(eleEmployeeCount, empCount);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_ownershipEnumId")
	private WebElement eleOwnership;

	public EditLeadPage selectOwnership(String ownership) {
		selectDropDownUsingText(eleOwnership, ownership);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_sicCode")
	private WebElement eleSicCode;

	public EditLeadPage enterSicCode(String sicCode) {
		type(eleSicCode, sicCode);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_tickerSymbol")
	private WebElement eleTickerSymbol;

	public EditLeadPage enterTickerSymbol(String tickerSymbol) {
		type(eleTickerSymbol, tickerSymbol);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_description")
	private WebElement eleDescription;

	public EditLeadPage enterDescription(String description) {
		type(eleDescription, description);
		return this;

	}

	@FindBy(how = How.ID, using = "updateLeadForm_importantNote")
	private WebElement eleImpNotes;

	public EditLeadPage enterImpNotes(String impNotes) {
		type(eleImpNotes, impNotes);
		return this;

	}


	@FindBy(how = How.XPATH, using = "//input[@value='Update']")
	private WebElement eleUpdateBtn;

	public ViewLeadPage clickUpdate() throws InterruptedException {
		click(eleUpdateBtn);
		return new ViewLeadPage(driver, test);
	}

}
