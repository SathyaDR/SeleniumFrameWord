package reporter;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ResultExtentReport {
	
	@Test
	
	public void testResult() {
		ExtentReports report = new ExtentReports("./reports/reports.html",false); 
		ExtentTest test = report.startTest("CreateLead", "Create a new lead");
		test.assignCategory("Regression");
		test.assignAuthor("Sathya");
		test.log(LogStatus.PASS, "Enter username", "Success" + test.addScreenCapture("/snaps/snap.jpg")); 
		test.log(LogStatus.FAIL, "Enter username", "not Success" + test.addScreenCapture("/snaps/snap.jpg")); 
		
		
		
		report.endTest(test);
		report.flush();
		
				
		
		
	}

}
