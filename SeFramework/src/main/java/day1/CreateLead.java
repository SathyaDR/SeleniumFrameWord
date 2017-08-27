package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver drivers = new ChromeDriver();
		drivers.get("http://leaftaps.com/opentaps");
		drivers.findElementById("username").sendKeys("DemoSalesManager");
		drivers.findElementById("password").sendKeys("crmsfa");
		drivers.findElementByClassName("decorativeSubmit").click();
		drivers.findElementByLinkText("CRM/SFA").click();
		drivers.findElementByLinkText("Create Lead").click();
		drivers.findElementById("createLeadForm_companyName").sendKeys("Comapny2");
		drivers.findElementById("createLeadForm_firstName").sendKeys("Sathya1");
		drivers.findElementById("createLeadForm_lastName").sendKeys("Bama1");
		
		Select sels = new Select(drivers.findElementById("createLeadForm_dataSourceId"));
		sels.selectByValue("Other");
		drivers.findElementById("createLeadForm_dataSourceId").sendKeys("Other");
		drivers.findElementByName("submitButton").click();
              
		
		
	}

}
