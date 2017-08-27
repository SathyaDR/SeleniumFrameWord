package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadPage extends AbstractClass {

	public WebDriver driver;

	public ViewLeadPage() {
		PageFactory.initElements(eventDriver,this);
	}
	
	@FindBy(how =How.LINK_TEXT,using = "Leads')]")
	WebElement clickLeadLink;
	public ViewLeadPage leadLinkClick() {
		clickElement(clickLeadLink);
		return this;
	}
	@FindBy(how =How.XPATH,using = "//span[contains(@id,'viewLead_companyName_sp')]")
	WebElement getLeadId;
	public ViewLeadPage leadIdCapture(String testval) {
		clickElement(getLeadId);
		return this;
	}
}