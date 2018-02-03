package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004";
		testCaseName = "TC004_EditLead";
		testDescription = "Edit Lead in Leaf Taps";
		category= "Smoke";
		authors	="Satheesh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String passWord,String findLeadFirstName,String cName,String fName,String lName,String firstNameLocal,String lastNameLocal,
			String salutationTitle,String profileTitle,String deptName,String annualRevenue,String currencyType,String industryType,String empCount,String ownership,
			String sicCode,String tickerSymbol,String description,String impNotes) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeads()
		.clickFindLeadPage()
		.enterFirstName(findLeadFirstName)
		.clickFindLead()
		.clickLeadId()
		.clickEditLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterFirstNameLocal(firstNameLocal)
		.enterLastNameLocal(lastNameLocal)
		.enterSalutation(salutationTitle)
		.enterProfileTitle(profileTitle)
		.enterDapartmentName(deptName)
		.enterAnnualRevenue(annualRevenue)
		.selectCurrencyType(currencyType)
		.selectIndustryType(industryType)
		.enterEmployeeCount(empCount)
		.selectOwnership(ownership)
		.enterSicCode(sicCode)
		.enterTickerSymbol(tickerSymbol)
		.enterDescription(description)
		.enterImpNotes(impNotes)
		.clickUpdate()
		.verifyLeadName(fName);
	}

}
