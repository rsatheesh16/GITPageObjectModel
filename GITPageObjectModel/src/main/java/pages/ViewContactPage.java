package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewContactPage extends ProjectMethods {

	public ViewContactPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	
	public ViewContactPage verifyContactTitle(String expectedText) {
		verifyTitle(expectedText);
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "viewContact_firstName_sp")
	private WebElement eleContactFirstName;

	public ViewContactPage verifyConatctFirstName(String expectedText) {
		verifyExactText(eleContactFirstName, expectedText);
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement eleEditContactBtn;

	public EditContactPage clickEditContact() {
		click(eleEditContactBtn);
		return new EditContactPage(driver,test);
	}

	@FindBy(how = How.LINK_TEXT, using = "Deactivate Contact")
	private WebElement eleDeactivateContactBtn;

	public ViewContactPage clickDeactivateContact() {
		click(eleDeactivateContactBtn);
		return this;
	}
	
	public ViewContactPage acceptDeactivateAlert() {
		acceptAlert();
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "subSectionWarning")
	private WebElement eleConfirmMsg;

	public ContactsPage verifyDeactivateConfirmMsg(String expectedText) {
		verifyPartialText(eleConfirmMsg, expectedText);
		return new ContactsPage(driver, test);
	}
	
	public ContactsPage changeContactsPage() {
		return new ContactsPage(driver, test);
	}
	
	
}
