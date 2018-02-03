package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ContactsPage extends ProjectMethods {

	public ContactsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.LINK_TEXT, using = "Create Contact")
	private WebElement eleCreateContact;

	public CreateContactPage clickCreateContactPage() {
		click(eleCreateContact);
		return new CreateContactPage(driver, test);
	}

	@FindBy(how = How.LINK_TEXT, using = "Find Contacts")
	private WebElement eleFindContacts;

	public FindContactsPage clickFindContactsPage() {
		click(eleFindContacts);
		return new FindContactsPage(driver, test);
	}

	@FindBy(how = How.LINK_TEXT, using = "Merge Contacts")
	private WebElement eleMergeContacts;

	public MergeContactsPage clickMergeContactsPage() {
		click(eleMergeContacts);
		return new MergeContactsPage(driver, test);
	}
}
