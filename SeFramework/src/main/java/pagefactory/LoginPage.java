package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginPage extends AbstractClass{
	public WebDriver driver;
	
	 	
	public LoginPage() {
		
	
		PageFactory.initElements(eventDriver,this);
		
	}
		
		@FindBy(how=How.ID,using ="username")
		WebElement uname;
		public LoginPage typeUserName(String useName) {
			type(uname, useName);
			return this;
		}
		
		@FindBy(how=How.ID,using = "password")
		WebElement pwd;
		public LoginPage typePassword(String pawval) {
			type(pwd, pawval);
			return this;
		}
		@FindBy(how= How.CLASS_NAME,using = "decorativeSubmit")
		WebElement loginBtn;
		public CreateLeadPage clickLogin() {
			clickElement(loginBtn);
			return new CreateLeadPage();
		}	
			
		}

