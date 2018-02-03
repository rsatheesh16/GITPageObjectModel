package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_CreateContact extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC006_CreateContact";
		testCaseName = "TC006_CreateContact";
		testDescription = "Create Contact in Leaf Taps";
		category= "Smoke";
		authors	="Satheesh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createContact(String userName, String passWord,String fName,String lName,String firstNameLocal,String lastNameLocal,
			String salutationTitle,String profileTitle,String deptName,String currencyType,String description,String impNotes,String primaryPhoneCountryCode,
			String primaryPhoneAreaCode,String primaryPhoneNo,String primaryPhoneExtn,String primaryPhoneHolderName,String primaryEmail,String attnName,String addressOne,String addressTwo,
			String cityName,String countryName,String stateProviceName,String postalCode,String postalCodeExtn) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickContacts()
		.clickCreateContactPage()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterFirstNameLocal(firstNameLocal)
		.enterLastNameLocal(lastNameLocal)
		.enterSalutation(salutationTitle)
		.enterProfileTitle(profileTitle)
		.enterDapartmentName(deptName)
		.selectCurrencyType(currencyType)
		.enterDescription(description)
		.enterImpNotes(impNotes)
		.enterPrimaryPhoneCountryCode(primaryPhoneCountryCode)
		.enterPrimaryPhoneAreaCode(primaryPhoneAreaCode)
		.enterPrimaryPhoneNo(primaryPhoneNo)
		.enterPrimaryPhoneExtn(primaryPhoneExtn)
		.enterPrimaryPhoneHolderName(primaryPhoneHolderName)
		.enterPrimaryEmail(primaryEmail)
		.enterAttnName(attnName)
		.enterAddressLineOne(addressOne)
		.enterAddressLineTwo(addressTwo)
		.enterCity(cityName)
		.selectCountry(countryName)
		.selectStateProvice(stateProviceName)
		.enterPostalCode(postalCode)
		.enterPostalCodeExtn(postalCodeExtn)
		.clickCreateContact()
		.verifyConatctFirstName(fName);
	}

}
