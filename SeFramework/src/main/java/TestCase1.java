import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.WdMethods;

public class TestCase1 extends WdMethods{

	@Test
	public void createLead() {
		invoeApp("chrome", "http://leaftaps.com/opentaps");
		type((locateElement("id","username")),"DemoSalesManager");
		type((locateElement("id","password")),"crmsfa");
		clickElement((locateElement("className","decorativeSubmit")));
		clickElement((locateElement("linkText","CRM/SFA")));
		clickElement((locateElement("linkText","Create Lead")));
		type((locateElement("id","createLeadForm_companyName")),"Comapny2");
		type((locateElement("id","createLeadForm_firstName")),"Sathya1");
		type((locateElement("id","createLeadForm_lastName")),"Bama1");
	//	locateElement("id","createLeadForm_dataSourceId");
		clickElement(locateElement("id","createLeadForm_dataSourceId"));
		selectByVisibleText(locateElement("id","createLeadForm_dataSourceId"),"Other");
		clickElement(locateElement("name", "submitButton"));
	}
	
}