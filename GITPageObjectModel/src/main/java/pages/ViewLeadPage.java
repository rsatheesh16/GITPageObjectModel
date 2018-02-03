package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	private WebElement eleLeadName;

	public ViewLeadPage verifyLeadName(String expectedText) {
		verifyExactText(eleLeadName, expectedText);
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement eleEditLeadBtn;

	public EditLeadPage clickEditLead() {
		click(eleEditLeadBtn);
		return new EditLeadPage(driver,test);
	}

	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement eleDeleteLeadBtn;

	public LeadsPage clickDeleteLead() {
		click(eleDeleteLeadBtn);
		return new LeadsPage(driver,test);
	}
	
	public LeadsPage changeLeadsPage() {
		return new LeadsPage(driver, test);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	private WebElement eleDuplicateLeadBtn;

	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDuplicateLeadBtn);
		return new DuplicateLeadPage(driver,test);
	}
}
