package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import dataprovider.excelProvider;
import pagefactory.LoginPage;


public class Annotations extends WdMethods {

	public String dataSheetName;
	public static Properties prop;
	public String browserName;
	public Platform platform;
	public String version;
		
	
	@BeforeSuite
	//public void readprop() throws FileNotFoundException, IOException {
	//	 prop = new Properties();
	//	prop.load(new FileInputStream(new File("./src/main/resources/Config.properties")));
				
		public void beforeSuite() throws FileNotFoundException, IOException{
			prop = new Properties();
			prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
			startResult();
	}
	
	@BeforeTest
	public void beforetest(){
		
	}
	
	@DataProvider(name = "refSathya")
	
	public Object[][] refTest() {
		return excelProvider.getAllSheetData(dataSheetName);
	}
					
	
	public void beforeGroups(){
		System.out.println("Before groups");
	}
	
	
	@BeforeMethod
	public void start() throws MalformedURLException  {
		
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setBrowserName("chrome");
	dc.setPlatform(Platform.WIN10);
	//dc.setVersion("59.0");
	if(prop.getProperty("run").equalsIgnoreCase("remote")) {
		driver = new RemoteWebDriver(new URL(prop.getProperty("HUB")),dc);
	} else {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	eventDriver = new EventFiringWebDriver(driver);
	WebEventListener wdEvent = new WebEventListener();
	eventDriver.register(wdEvent);
	startTestCase(testCaseName, TestDescription, category, author);
	eventDriver.get(prop.getProperty("URL"));
	eventDriver.manage().window().maximize();
	eventDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	new LoginPage()
	.typeUserName(prop.getProperty("uName"))
	.typePassword(prop.getProperty("pwd"));
	}
		
	/*public void login(){
		invoeApp("chrome",prop.getProperty("URL"));
		new LoginPage()
		.typeUserName(prop.getProperty("uName"))
		.typePassword(prop.getProperty("pwd"));
	}*/

@AfterMethod
public void afterMethod(){
	endTest();
//	closeApp();
}

@AfterSuite
public void afterSuite() {
	endResult();
}

@AfterClass
public void afterClass(){
	System.out.println("After class");
}

@AfterGroups
public void afterGroups(){
	System.out.println("After Groups");
}


@AfterTest
public void afterTest(){
	System.out.println("After Test");
}



}







