package tests;

import org.testng.annotations.Test;

import base.Annotations;
import pagefactory.CreateLeadPage;
import pagefactory.LoginPage;
import pagefactory.UpdateLeadPage;
import pagefactory.ViewLeadPage;

public class Login_TC100 extends Annotations {
	@Test
	
	public void login_TC100(String useName, String pawval) {
		new LoginPage()
		.typeUserName(useName)
		.typePassword(pawval)
		.clickLogin();
		new CreateLeadPage()
		.crmLinkClick();
		
			
		
	}

}
