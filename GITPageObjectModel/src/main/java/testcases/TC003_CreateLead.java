package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLead";
		testDescription = "Create Lead in Leaf Taps";
		category= "Smoke";
		authors	="Satheesh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord,String cName,String fName,String lName,String source,String marketing,String firstNameLocal,String lastNameLocal,
			String salutationTitle,String profileTitle,String deptName,String annualRevenue,String currencyType,String industryType,String empCount,String ownership,
			String sicCode,String tickerSymbol,String description,String impNotes,String primaryPhoneCountryCode,String primaryPhoneAreaCode,String primaryPhoneNo,
			String primaryPhoneExtn,String primaryPhoneHolderName,String primaryEmail,String primaryUrl,String toName,String attnName,String addressOne,String addressTwo,
			String cityName,String countryName,String stateProviceName,String postalCode,String postalCodeExtn) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeads()
		.clickCreaLeadPage()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.selectSource(source)
		.selectMarketingCampaign(marketing)
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
		.enterPrimaryPhoneCountryCode(primaryPhoneCountryCode)
		.enterPrimaryPhoneAreaCode(primaryPhoneAreaCode)
		.enterPrimaryPhoneNo(primaryPhoneNo)
		.enterPrimaryPhoneExtn(primaryPhoneExtn)
		.enterPrimaryPhoneHolderName(primaryPhoneHolderName)
		.enterPrimaryEmail(primaryEmail)
		.enterPrimaryUrl(primaryUrl)
		.enterToName(toName)
		.enterAttnName(attnName)
		.enterAddressLineOne(addressOne)
		.enterAddressLineTwo(addressTwo)
		.enterCity(cityName)
		.selectCountry(countryName)
		.selectStateProvice(stateProviceName)
		.enterPostalCode(postalCode)
		.enterPostalCodeExtn(postalCodeExtn)
		.clickCreateLead()
		.verifyLeadName(fName);
	}

}
