package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC008_DeactivateContact extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC008_DeactivateContact";
		testCaseName = "TC007_DeactivateContact";
		testDescription = "Deactivate Contact in Leaf Taps";
		category= "Smoke";
		authors	="Satheesh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void deactivateContact(String userName, String passWord,String findContactFirstName,String contactPageTitle,String deActivateConfirmMsg,String noRecdsConfirmMsg) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickContacts()
		.clickFindContactsPage()
		.enterFirstName(findContactFirstName)
		.clickFindContacts()
		.captureContactId()
		.clickContactId()
		.verifyContactTitle(contactPageTitle)
		.clickDeactivateContact()
		.acceptDeactivateAlert()
		.verifyDeactivateConfirmMsg(deActivateConfirmMsg)
		.clickFindContactsPage()
		.enterContactId(firstResContactId)
		.clickFindContacts()
		.verifyConfirmMsg(noRecdsConfirmMsg);
	}

}
