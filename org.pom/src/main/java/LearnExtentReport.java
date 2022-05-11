import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       //Set up the path for the report
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
	
		//to have the exixting data history
		reporter.setAppendExisting(true);
		
		//To get the actual data to the report
		ExtentReports re=new ExtentReports();
		
		//attach the data to the reporter
		re.attachReporter(reporter);
		
		ExtentTest tc = re.createTest("Loginpage", "Login with positive Credential");		
		tc.assignAuthor("Vidya");
		tc.assignCategory("Regression test");
		
		//set the status of the tc
		tc.pass("Entered the username Successfully",
				MediaEntityBuilder.createScreenCaptureFromPath(".././sanps/shot.png").build());
		
		tc.pass("Entered the password Successfully");
		tc.fail("Login is unsuccessful");
			
		//mandatory step
		re.flush();
		
		
		
		
		
		
		
		
	}

}
