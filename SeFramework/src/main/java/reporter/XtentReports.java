package reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.websocket.common.events.EventDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class XtentReports extends AbstractReporter {
		

	public static ExtentReports extent;
	public static ExtentTest test;
	
		public String testCaseName;
		public String TestDescription;
		public String category;
		public String author;
		
		
		public void startResult() {
			
			 extent = new ExtentReports("./reports/reports.html",false); 
			 extent.loadConfig(new File("./src/main/resources/extent-config.xml"));
					
		}
			
				
		public void startTestCase(String testCaseName, String testDescription, String category, String author){
			test = extent.startTest(testCaseName, testDescription);
			System.out.println(author);
			test.assignCategory(category);
			test.assignAuthor(author);
			
		}
		
		public abstract EventFiringWebDriver getEventDriver(); 
			

		public abstract long takeSnap();
		
		
		public void reportStep(String desc, String status){
			long snapnumber=takeSnap();
			
			if(status.equalsIgnoreCase("PASS")){
				test.log(LogStatus.PASS, desc+test.addScreenCapture("./../reports/images/"+snapnumber+".jpg"));
			}else if(status.equalsIgnoreCase("FAIL")){
				test.log(LogStatus.FAIL, desc+test.addScreenCapture("./../reports/images/"+snapnumber+".jpg"));
				throw new RuntimeException("FAILED");
			}else if(status.equalsIgnoreCase("WARN")){
				test.log(LogStatus.WARNING, desc+test.addScreenCapture("./../reports/images/"+snapnumber+".jpg"));
			}else if(status.equalsIgnoreCase("INFO")){
				test.log(LogStatus.INFO, desc+test.addScreenCapture("./../reports/images/"+snapnumber+".jpg"));
			}
		}
		
			
		public void endResult() {
			extent.flush();
			
		}
		
		public void endTest() {
			extent.endTest(test);
			
		}
		
}
