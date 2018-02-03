package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;

	public FindLeadsPage enterFirstName(String firstName) {
		type(eleFirstName, firstName);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement eleFindLeadBtn;

	public FindLeadsPage clickFindLead() {
		click(eleFindLeadBtn);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFirstLeadId;

	public FindLeadsPage captureLeadId() {
		firstResLeadId = getText(eleFirstLeadId);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleLeadIdLink;

	public ViewLeadPage clickLeadId() {
		click(eleLeadIdLink);
		return new ViewLeadPage(driver, test);
	}
	
	@FindBy(how = How.XPATH, using = "//span[text()='Phone']")
	private WebElement elePhoneTab;
	
	public FindLeadsPage clickPhoneTab() {
		click(elePhoneTab);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "phoneAreaCode")
	private WebElement eleAreaCode;
	
	public FindLeadsPage enterAreaCode(String areaCode) {
		type(eleAreaCode,areaCode);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "phoneNumber")
	private WebElement elePhoneNo;
	
	public FindLeadsPage enterPhoneNo(String phoneNo) {
		type(elePhoneNo,phoneNo);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "id")
	private WebElement eleLeadId;
	
	public FindLeadsPage enterLeadId(String id) {
		type(eleLeadId,id);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'No records to display')]")
	private WebElement eleLeadName;

	public FindLeadsPage verifyConfirmMsg(String expectedText) {
		verifyExactText(eleLeadName, expectedText);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//span[text()='Email']")
	private WebElement eleEmailTab;
	
	public FindLeadsPage clickEmailTab() {
		click(eleEmailTab);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "emailAddress")
	private WebElement eleEmail;
	
	public FindLeadsPage enterEmail(String email) {
		type(eleEmail,email);
		return this;
	}
	
	
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")
	private WebElement eleFirstLeadName;

	public FindLeadsPage captureLeadName() {
		firstResLeadName = getText(eleFirstLeadName);
		return this;
	}
}
