package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Annotations;
import pagefactory.AbstractClass;
import pagefactory.CreateLeadPage;
import pagefactory.LoginPage;
import pagefactory.UpdateLeadPage;
import pagefactory.ViewLeadPage;

public class TC004_UpdateLead extends Annotations {

	
	@Test(dataProvider = "refSathya")
	public void updateLead(String useName, String pawval, String cmpName, String fName, String lName, String Sval, String marVal, String phoNum, String testval, String fName2, String cmpName2)  {
	
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
	//	.emailEnter()
		.createLeadBtnClick();
	new ViewLeadPage()
	.leadLinkClick()
	.leadIdCapture(testval);
	new UpdateLeadPage()
	.findleadsLinkClick()
	.FstNameEnter(fName2)
	.findLeadsBtnClick()
	.FirstLinkClick()
	.valueofId()
	.editLinkClick()
	.companyNameEnter(cmpName2)
	.updateBtnClick()
	.companyNameConfirm();
	}
	
@BeforeClass
	
	public void testcaseAfter() {		
	dataSheetName="testdata_viewlead";	
	}



}