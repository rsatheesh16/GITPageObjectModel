package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindContactsPage extends ProjectMethods {

	public FindContactsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;

	public FindContactsPage enterFirstName(String firstName) {
		type(eleFirstName, firstName);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Find Contacts']")
	private WebElement eleFindContactsBtn;

	public FindContactsPage clickFindContacts() {
		click(eleFindContactsBtn);
		return this;
	}

	
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleContactId;

	public FindContactsPage captureContactId() {
		firstResContactId = getText(eleContactId);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleContactIdLink;

	public ViewContactPage clickContactId() {
		click(eleContactIdLink);
		return new ViewContactPage(driver, test);
	}
	
	@FindBy(how = How.XPATH, using = "//span[text()='Phone']")
	private WebElement elePhoneTab;
	
	public FindContactsPage clickPhoneTab() {
		click(elePhoneTab);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "phoneAreaCode")
	private WebElement eleAreaCode;
	
	public FindContactsPage enterAreaCode(String areaCode) {
		type(eleAreaCode,areaCode);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "phoneNumber")
	private WebElement elePhoneNo;
	
	public FindContactsPage enterPhoneNo(String phoneNo) {
		type(elePhoneNo,phoneNo);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "id")
	private WebElement eleInputContactId;
	
	public FindContactsPage enterContactId(String id) {
		type(eleInputContactId,id);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'No records to display')]")
	private WebElement eleDivMsg;

	public FindContactsPage verifyConfirmMsg(String expectedText) {
		verifyExactText(eleDivMsg, expectedText);
		return this;
	}
}
