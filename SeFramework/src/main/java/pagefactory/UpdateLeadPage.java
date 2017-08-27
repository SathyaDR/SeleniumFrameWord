package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UpdateLeadPage extends AbstractClass {
public WebDriver driver;

	public UpdateLeadPage() {
		PageFactory.initElements(eventDriver,this);
	}

	@FindBy(how =How.LINK_TEXT,using = "Leads")
	WebElement clickFindLeadsLink;
	public UpdateLeadPage findleadsLinkClick() {
		clickElement(clickFindLeadsLink);
		return this;
	}
	
	@FindBy(how =How.NAME,using = "enterByName")
	WebElement enterFirstName;
	public UpdateLeadPage FstNameEnter(String fName2) {
		type(enterFirstName,fName2);
		return this;
	}
	
	@FindBy(how =How.XPATH,using = "//button[contains(text(),'Find Leads')]")
	WebElement clickFindLeadsBtn;
	public UpdateLeadPage findLeadsBtnClick() {
		clickElement(clickFindLeadsBtn);
		return this;
	}
	
	@FindBy(how =How.XPATH,using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")
	WebElement clickFirstLink;
	public UpdateLeadPage FirstLinkClick() {
		clickElement(clickFirstLink);
		return this;
	}
	
	@FindBy(how =How.ID,using = "sectionHeaderTitle_leads")
	WebElement getIdValue;
	public UpdateLeadPage valueofId() {
		clickElement(getIdValue);
		return this;
	}
	
	@FindBy(how =How.LINK_TEXT,using = "Edit")
	WebElement clickEditLink;
	public UpdateLeadPage editLinkClick() {
		clickElement(clickEditLink);
		return this;
	}
	
	@FindBy(how =How.ID,using = "updateLeadForm_companyName")
	WebElement changeCompanytName;
	public UpdateLeadPage companyNameEnter(String cmpName2) {
		type(changeCompanytName,cmpName2);
		return this;
	}
	
	@FindBy(how =How.NAME,using = "submitButton")
	WebElement clickUpdateBtn;
	public UpdateLeadPage updateBtnClick() {
		clickElement(clickUpdateBtn);
		return this;
	}
	
	@FindBy(how =How.ID,using = "viewLead_companyName_sp")
	WebElement cofirmCompanytName;
	public UpdateLeadPage companyNameConfirm() {
		type(cofirmCompanytName,"22sathya");
		return this;
	}
}