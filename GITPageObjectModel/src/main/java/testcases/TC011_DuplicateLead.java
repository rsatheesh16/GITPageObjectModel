package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC011_DuplicateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC011_DuplicateLead";
		testCaseName = "TC005_DuplicateLead";
		testDescription = "Check for DuplicateLead";
		category= "Smoke";
		authors	="Satheesh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String passWord,String mailId,String expectedTitle) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeads()
		.clickFindLeadPage()
		.clickEmailTab()
		.enterEmail(mailId)
		.clickFindLead()
		.captureLeadName()
		.clickLeadId()
		.clickDuplicateLead()
		.verifyDuplicateLeadTitle(expectedTitle)
		.clickCreateLead()
		.verifyLeadName(firstResLeadName);
	}

}
