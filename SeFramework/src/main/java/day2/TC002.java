package day2;

import org.testng.annotations.Test;

import base.WdMethods;

public class TC002 extends WdMethods {
	
	@Test
	public void mergeLead(){
		
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");		
		clickElement(locateElement("xpath", "//input[@value='Login']"));				
		clickElement(locateElement("link", "CRM/SFA"));			
		clickElement(locateElement("link", "Leads"));						
		clickElement(locateElement("link", "Find Leads"));				
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"),"bb");
		clickElement(locateElement("xpath", "//button[text()='Find Leads']"));		
	//	Thread.sleep(5000);		
		clickElement(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        
      /**  boolean checkTitle = verifyTitle("View Lead | opentaps CRM");
     //  if(checkTitle)
        {
        	        	
        	clickElement(locateElement("link", "Edit"));        	           
            type(locateElement("id", "updateLeadForm_companyName"),"Glencore");
        	            
            clickElement(locateElement("xpath", "//input[@value='Update']"));
            
        //	String companyName = getText(locateElement("id", "viewLead_companyName_sp"));
        	
        	if(companyName.contains("Glencore")){
        		System.out.println("The Company Name is updated");
        	}
        }
        else{
        	System.out.println("The Title did not match");
        }
*/
System.out.println("Merge Lead created successfully");

		}
}