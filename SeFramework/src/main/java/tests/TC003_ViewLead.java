package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Annotations;
import base.WdMethods;
import pagefactory.AbstractClass;
import pagefactory.CreateLeadPage;
import pagefactory.LoginPage;
import pagefactory.ViewLeadPage;

public class TC003_ViewLead extends Annotations {
	
	@Test(dataProvider = "refSathya")
	public void viewLead(String useName, String pawval, String cmpName, String fName, String lName, String Sval, String marVal, String phoNum)  {
		
	new LoginPage()
	.typeUserName(useName)
	.typePassword(pawval)
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
		
	new ViewLeadPage()
	.leadLinkClick();
//	.leadIdCapture(testval);
	
	}
	
@BeforeClass
	
	public void testcaseAfter() {
		
dataSheetName="testdata_viewlead";	
	}
	
	
}