package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC009_MergeContact extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC009_MergeContact";
		testCaseName = "TC009_MergeContact";
		testDescription = "Merge Contact in Leaf Taps";
		category= "Smoke";
		authors	="Satheesh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void mergeContact(String userName, String passWord,String fromContactId,String toContactId,String noRecdsConfirmMsg) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickContacts()
		.clickMergeContactsPage()
		.clickFromContactIcon()
		.switchToChildWindow()
		.enterContactId(fromContactId)
		.clickFindContacts()
		.clickContactId()
		.switchToParentdWindow()
		.clickToContactIcon()
		.switchToChildWindow()
		.enterContactId(toContactId)
		.clickFindContacts()
		.clickContactId()
		.switchToParentdWindow()
		.clickMergeBtn()
		.acceptMergeAlert()
		.changeContactsPage()
		.clickFindContactsPage()
		.enterContactId(fromContactId)
		.clickFindContacts()
		.verifyConfirmMsg(noRecdsConfirmMsg);
	}

}
