package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindContactsWindowPage extends ProjectMethods {

	public FindContactsWindowPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.NAME, using = "id")
	private WebElement eleInputContactId;

	public FindContactsWindowPage enterContactId(String id) {
		type(eleInputContactId, id);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Find Contacts']")
	private WebElement eleFindContactsBtn;

	public FindContactsWindowPage clickFindContacts() {
		click(eleFindContactsBtn);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleContactIdLink;

	public FindContactsWindowPage clickContactId() {
		click(eleContactIdLink);
		return this;
	}

	public FindContactsWindowPage switchToChildWindow() {
		switchToWindow(1);
		return this;
	}

	public MergeContactsPage switchToParentdWindow() {
		switchToWindow(0);
		return new MergeContactsPage(driver, test);
	}

}
