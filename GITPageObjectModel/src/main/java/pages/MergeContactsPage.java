package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeContactsPage extends ProjectMethods {

	public MergeContactsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "(//img[@alt='Lookup'])[1]")
	private WebElement eleFromContactIcon;

	public FindContactsWindowPage clickFromContactIcon() {
		click(eleFromContactIcon);
		return new FindContactsWindowPage(driver, test);
	}

	@FindBy(how = How.XPATH, using = "(//img[@alt='Lookup'])[2]")
	private WebElement eleToContactIcon;

	public FindContactsWindowPage clickToContactIcon() {
		click(eleToContactIcon);
		return new FindContactsWindowPage(driver, test);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Merge")
	private WebElement eleMergeBtn;

	public MergeContactsPage clickMergeBtn() {
		click(eleMergeBtn);
		return this;
	}
	
	public ViewContactPage acceptMergeAlert() {
		acceptAlert();
		return new ViewContactPage(driver, test);
	}
	
}
