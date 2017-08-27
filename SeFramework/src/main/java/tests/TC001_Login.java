package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.WdMethods;
import pagefactory.AbstractClass;
import pagefactory.CreateLeadPage;
import pagefactory.LoginPage;


public class TC001_Login extends AbstractClass{
	
	public void login_TC100(String useName, String pawval) {
		new LoginPage()
		.typeUserName(useName)
		.typePassword(pawval)
		.clickLogin();
		new CreateLeadPage()
		.crmLinkClick();
}
}