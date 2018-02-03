package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsWindowPage extends ProjectMethods {

	public FindLeadsWindowPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.NAME, using = "id")
	private WebElement eleInputLeadId;
	
	public FindLeadsWindowPage enterLeadId(String id) {
		type(eleInputLeadId,id);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement eleFindLeadsBtn;

	public FindLeadsWindowPage clickFindLeads() {
		click(eleFindLeadsBtn);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleLeadIdLink;

	public FindLeadsWindowPage clickLeadId() {
		click(eleLeadIdLink);
		return this;
	}
	
	public FindLeadsWindowPage switchToChildWindow() {
		switchToWindow(1);
		return this;
	}
	
	
	public MergeLeadsPage switchToParentdWindow() {
		switchToWindow(0);
		return new MergeLeadsPage(driver, test);
	}

}
