package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends AbstractClass {
	
	public WebDriver driver;
	
	public CreateLeadPage() {
				
		
		PageFactory.initElements(eventDriver,this);
	}
		
		
		@FindBy(how=How.LINK_TEXT,using = "CRM/SFA")
		WebElement clickCrmLink;
		public CreateLeadPage crmLinkClick() {
			clickElement(clickCrmLink);
			return this;
		}
		
		@FindBy(how =How.LINK_TEXT,using = "Create Lead")
		WebElement clickleadsLink;
		public CreateLeadPage leadsLinkClick() {
			clickElement(clickleadsLink);
			return this;
			
		}
		
		@FindBy(how =How.ID,using = "createLeadForm_companyName")
		WebElement entercompanyName;
		public CreateLeadPage companyNameEnter(String cmpName) {
			type(entercompanyName,cmpName);
			return this;
		}
		
		@FindBy(how = How.ID,using = "createLeadForm_firstName")
		WebElement enterFirstName;
		public CreateLeadPage FirstNameEnter(String fName) {
			type(enterFirstName, fName);
			return this;
		}
		
		@FindBy(how =How.ID,using = "createLeadForm_lastName")
		WebElement enterLastName;
		public CreateLeadPage lastNameEnter(String lName) {
			type(enterLastName, lName);
			return this;
		}
		
			
		@FindBy(how =How.ID,using = "createLeadForm_dataSourceId")
		WebElement selectSource;
		public CreateLeadPage sourceSelect(String Sval) {
			type(selectSource,Sval);
			return this;
			
		}
		
		@FindBy(how =How.ID,using = "createLeadForm_marketingCampaignId")
		WebElement selectMarketing;
		public CreateLeadPage marketingSelect(String marVal) {
			type(selectMarketing, "car and Driver");
			return this;
		}
		
		@FindBy(how =How.ID,using = "createLeadForm_primaryPhoneNumber")
		WebElement enterPhoneNumber;
		public CreateLeadPage phoneNumberEnter(String phoNum) {
			type(enterPhoneNumber, phoNum);
			return this;
		}
		
		@FindBy(how =How.ID,using = "createLeadForm_primaryEmail")
		WebElement enterEmail;
		public CreateLeadPage emailEnter() {
			type(enterEmail, "sathya@gmail.com");
			return this;
		}
		
		@FindBy(how =How.NAME,using = "submitButton")
		WebElement clickCreateLeadBtn;
		public ViewLeadPage createLeadBtnClick() {
			clickElement(clickCreateLeadBtn);
			return new ViewLeadPage();
		}
		
		

}
