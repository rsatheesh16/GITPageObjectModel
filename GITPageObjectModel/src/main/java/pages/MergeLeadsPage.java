package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods {

	public MergeLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "(//img[@alt='Lookup'])[1]")
	private WebElement eleFromLeadIcon;

	public FindLeadsWindowPage clickFromLeadIcon() {
		click(eleFromLeadIcon);
		return new FindLeadsWindowPage(driver, test);
	}

	@FindBy(how = How.XPATH, using = "(//img[@alt='Lookup'])[2]")
	private WebElement eleToLeadIcon;

	public FindLeadsWindowPage clickToLeadIcon() {
		click(eleToLeadIcon);
		return new FindLeadsWindowPage(driver, test);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Merge")
	private WebElement eleMergeBtn;

	public MergeLeadsPage clickMergeBtn() {
		click(eleMergeBtn);
		return this;
	}
	
	public ViewLeadPage acceptMergeAlert() {
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
	
}
