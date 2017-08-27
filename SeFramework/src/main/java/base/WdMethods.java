package base;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WdMethods extends WebEventListener {
	public WebDriver driver;
	public static EventFiringWebDriver eventDriver;
	public void invoeApp(String browserType, String url) {
		
		switch(browserType) {
		
		case("chrome"):
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		break;
		
		case("gecko"):
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		driver = new FirefoxDriver();
		break;
	//	case("ie"):
	//	driver = new WebDriver();
	//	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	//	break;
		
	}
		eventDriver = new EventFiringWebDriver(driver);
		WebEventListener wdEvent = new WebEventListener();
		eventDriver.register(wdEvent);
		eventDriver.get(url);
		eventDriver.manage().window().maximize();
		eventDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
}
	
	public WebElement locateElement(WebElement ele) {

		return ele;
	}
	
	public WebElement locateElement(String how, String using) {
	
	 WebElement ele = null;
	 switch(how) {
	 case("id"):
	 ele = eventDriver.findElement(By.id(using)); break;
	 case("name"):
	 ele = eventDriver.findElement(By.name(using)); break;
	 case("className"):
		 ele = eventDriver.findElement(By.className(using)); break;
	 case("xpath"):
		 ele = eventDriver.findElement(By.xpath(using)); break;
	 case("linkText"):
		 ele = eventDriver.findElement(By.linkText(using)); break;
	 case("tagName"):
		 ele = eventDriver.findElement(By.tagName(using)); break;
	 case("partialLink"):
		 ele = eventDriver.findElement(By.partialLinkText(using)); break;
	 case("css"):
		 ele = eventDriver.findElement(By.cssSelector(using)); break;
	 case("type"):
		 ele = eventDriver.findElement(By.xpath("//*[@type='" +(using) + "']")); break;
	
	 }
	 return ele;
	 
	}
	public void type(WebElement ele, String value) {
		ele.sendKeys(value);
		
	}
		
	public void selectByVisibleText(WebElement ele, String txt) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(txt);
		
	}
		
	public void selectByIndex(WebElement ele, int Index) {
		Select sel = new Select(ele);
		sel.selectByIndex(Index);
	}
			
	public void selectByValue(WebElement ele, String value)	{
		Select sel = new Select(ele);
		sel.selectByValue(value);
		
	}
	public void switchToWindow(int index) {
		Set<String> allWindowHandles = eventDriver.getWindowHandles();
		List<String> allWindows  = new ArrayList<>();
		allWindows.addAll(allWindowHandles);
		eventDriver.switchTo().window(allWindows.get(index));
	}
	public void alertAccept() {
		eventDriver.switchTo().alert().accept();
	}
	public void alertDismiss() {
		eventDriver.switchTo().alert().dismiss();
		
	}
	public String alertText(String txt) {
		eventDriver.switchTo().alert().sendKeys(txt);
		return txt;
		
	}
	public String getAlertText(String txt) {
		eventDriver.switchTo().alert().getText();
		return txt;
	}
	public String getTextById(WebElement ele) {
		String tx = ele.getText();
		return tx;
			
	}
	public void verifyTitle(WebElement ele, String Title) {
		String tit = eventDriver.getTitle();
		
	}
	public void switchFrame(WebElement ele) {
		eventDriver.switchTo().frame(ele);
		
	}
	public String verifyText(String txt) {
		return txt;
	}
	public String getText(String txt) {
		return txt;
	}
	public void clickElement(WebElement ele) {
		
		ele.click();
	}
	
	public void clearElement(WebElement ele) {
		
		ele.clear();
	}
	
	public void switchWindow(int index) {
	 List<String> lstWindows = new ArrayList<>();
	 lstWindows.addAll(eventDriver.getWindowHandles());
	 eventDriver.switchTo().window(lstWindows.get(index));
		
	}
	
	public void quitBrowser() {
	eventDriver.close();
		
}
	@Override
	public EventFiringWebDriver getEventDriver() {
		return eventDriver;
			
	}
	
	@Override 
	 public long takeSnap(){
		long snapnumber=(long) Math.floor(Math.random() *900000L)+100000L;
		//File src=eventDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(eventDriver.getScreenshotAs(OutputType.FILE), new File("./reports/images/"+snapnumber+".jpg"));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return snapnumber;
	}	
}