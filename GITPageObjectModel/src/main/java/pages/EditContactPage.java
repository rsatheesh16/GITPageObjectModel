package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditContactPage extends ProjectMethods {

	public EditContactPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "updateContactForm_firstName")
	private WebElement eleFirstName;

	public EditContactPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;

	}

	@FindBy(how = How.ID, using = "updateContactForm_lastName")
	private WebElement eleLastName;

	public EditContactPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;

	}

	

	@FindBy(how = How.ID, using = "updateContactForm_firstNameLocal")
	private WebElement eleFirstNameLocal;

	public EditContactPage enterFirstNameLocal(String firstNameLocal) {
		type(eleFirstNameLocal, firstNameLocal);
		return this;

	}

	@FindBy(how = How.ID, using = "updateContactForm_lastNameLocal")
	private WebElement eleLastNameLocal;

	public EditContactPage enterLastNameLocal(String lastNameLocal) {
		type(eleLastNameLocal, lastNameLocal);
		return this;

	}

	@FindBy(how = How.ID, using = "updateContactForm_personalTitle")
	private WebElement eleSalutation;

	public EditContactPage enterSalutation(String salutationTitle) {
		type(eleSalutation, salutationTitle);
		return this;

	}

	@FindBy(how = How.ID, using = "updateContactForm_lastNameLocal")
	private WebElement eleProfileTitle;

	public EditContactPage enterProfileTitle(String profileTitle) {
		type(eleProfileTitle, profileTitle);
		return this;

	}

	@FindBy(how = How.ID, using = "updateContactForm_departmentName")
	private WebElement eleDeptName;

	public EditContactPage enterDapartmentName(String deptName) {
		type(eleDeptName, deptName);
		return this;

	}


	@FindBy(how = How.ID, using = "updateContactForm_preferredCurrencyUomId")
	private WebElement eleCurrencyType;

	public EditContactPage selectCurrencyType(String currencyType) {
		selectDropDownUsingText(eleCurrencyType, currencyType);
		return this;

	}


	@FindBy(how = How.ID, using = "updateContactForm_description")
	private WebElement eleDescription;

	public EditContactPage enterDescription(String description) {
		type(eleDescription, description);
		return this;

	}

	@FindBy(how = How.ID, using = "updateContactForm_importantNote")
	private WebElement eleImpNotes;

	public EditContactPage enterImpNotes(String impNotes) {
		type(eleImpNotes, impNotes);
		return this;

	}


	@FindBy(how = How.XPATH, using = "//input[@value='Update']")
	private WebElement eleUpdateBtn;

	public ViewContactPage clickUpdate() throws InterruptedException {
		click(eleUpdateBtn);
		return new ViewContactPage(driver, test);
	}

}
