package tests;

import org.openqa.selenium.Platform;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import base.Annotations;
import base.WdMethods;
import dataprovider.excelProvider;
import pagefactory.AbstractClass;
import pagefactory.CreateLeadPage;
import pagefactory.LoginPage;




public class TC002_CreateLead extends Annotations {
	
	@BeforeClass
	public void testcaseValue(){
	
	dataSheetName = "testdata_createlead";
	testCaseName = "TC002";
	TestDescription = "CreateLead";
	category = "Regression";
	author = "Sathya";
	
}

	@Test(dataProvider = "refSathya")
	public void createLead(String cmpName, String fName, String lName, String Sval, String marVal, String phoNum) {

	new LoginPage()
	.clickLogin();
	new CreateLeadPage()
	.crmLinkClick()
	.leadsLinkClick()
	.companyNameEnter(cmpName)
	.FirstNameEnter(fName)
	.lastNameEnter(lName)
	.sourceSelect(Sval)
	.marketingSelect(marVal)
	.phoneNumberEnter(phoNum)
	.emailEnter()
	.createLeadBtnClick();
	
	}
	@BeforeClass
	
	public void testcaseAfter() {
		
dataSheetName="testdata_createlead";	
	}

}