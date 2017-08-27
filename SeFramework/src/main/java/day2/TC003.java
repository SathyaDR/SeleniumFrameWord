package day2;

import org.testng.annotations.Test;

import base.WdMethods;

public class TC003 extends WdMethods {
	
	@Test
	public void deleteLead(){
		//invokeApp("chrome", url);
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		//clickByLocator(locateElement("className", "decorativeSubmit"));
		clickElement(locateElement("type", "submit"));
		clickElement(locateElement("linkText", "CRM/SFA"));
		clickElement(locateElement("linkText", "Leads"));
		clickElement(locateElement("linkText", "Find Leads"));
		clickElement(locateElement("linkText", "Phone"));
		//clearTextField(locateElement("name", "phoneCountryCode"));
		type(locateElement("name", "phoneNumber"), "9790888529");
		
/**
 * 		

		clickByLocator(locateElement("xpath", "//button[text()='Find Leads']"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String firstLead = getText(locateElement("xpath", "(//a[@class = 'linktext'])[4]"));
		System.out.println("First Lead in search :: " +firstLead);
		clickByLocator(locateElement("xpath", "(//a[@class = 'linktext'])[4]"));
		clickByLocator(locateElement("linkText", "Delete"));
		clickByLocator(locateElement("linkText", "Find Leads"));
		enterValue(locateElement("name", "id"), firstLead);
		clickByLocator(locateElement("xpath", "//button[text()='Find Leads']"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String errorMsg = getText(locateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Error Message :: "+errorMsg);
		String verifyNoLeadMsg = getText(locateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Verify Deleted Leads not present in list "+verifyNoLeadMsg);
		//closeBrowser();
		
 */
}
}
