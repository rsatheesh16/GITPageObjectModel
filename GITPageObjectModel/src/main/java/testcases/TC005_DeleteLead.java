package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005";
		testCaseName = "TC005_DeleteLead";
		testDescription = "To Delete a Lead";
		category= "Smoke";
		authors	="Satheesh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String passWord,String areaCode,String phoneNo,String expectedText) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeads()
		.clickFindLeadPage()
		.clickPhoneTab()
		.enterAreaCode(areaCode)
		.enterPhoneNo(phoneNo)
		.clickFindLead()
		.captureLeadId()
		.clickLeadId()
		.clickDeleteLead()
		.clickFindLeadPage()
		.enterLeadId(firstResLeadId)
		.clickFindLead()
		.verifyConfirmMsg(expectedText);
	}

}
