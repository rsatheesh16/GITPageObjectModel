package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_EditContact extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC007_EditContact";
		testCaseName = "TC007_EditContact";
		testDescription = "Edit Contact in Leaf Taps";
		category= "Smoke";
		authors	="Satheesh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void editContact(String userName, String passWord,String findContactFirstName,String contactPageTitle,String fName) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickContacts()
		.clickFindContactsPage()
		.enterFirstName(findContactFirstName)
		.clickFindContacts()
		.clickContactId()
		.verifyContactTitle(contactPageTitle)
		.clickEditContact()
		.enterFirstName(fName)
		.clickUpdate()
		.verifyConatctFirstName(fName);
	}

}
