package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC010_MergeLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC010_MergeLead";
		testCaseName = "TC010_MergeLead";
		testDescription = "Merge Lead in Leaf Taps";
		category= "Smoke";
		authors	="Satheesh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void mergeLead(String userName, String passWord,String fromLeadId,String toLeadId,String noRecdsConfirmMsg) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeads()
		.clickMergeLeadPage()
		.clickFromLeadIcon()
		.switchToChildWindow()
		.enterLeadId(fromLeadId)
		.clickFindLeads()
		.clickLeadId()
		.switchToParentdWindow()
		.clickToLeadIcon()
		.switchToChildWindow()
		.enterLeadId(toLeadId)
		.clickFindLeads()
		.clickLeadId()
		.switchToParentdWindow()
		.clickMergeBtn()
		.acceptMergeAlert()
		.changeLeadsPage()
		.clickFindLeadPage()
		.enterLeadId(fromLeadId)
		.clickFindLead()
		.verifyConfirmMsg(noRecdsConfirmMsg);
	}

}
