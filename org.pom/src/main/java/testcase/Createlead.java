package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import pages.Loginpage;

public class Createlead extends ProjectSpecificMethod {

	@BeforeClass
	public void teDetails() {
		testName = "Create Lead";
		testDesc = "Create with mandatory fields";
		author = "Babu";
		category = "Regression test";
		fileName = "CL";
	}

	@Test(dataProvider = "fetchData")
	public void runCreate(String Cname, String fname, String lname) throws IOException, InterruptedException {
		new Loginpage(driver).enterUsername().enterPassword().clickLogin().clickLogout().verifyLogout()
		.enterUsername().enterPassword().clickLogin()		
		   .clickCRM().clickLeads()
		  .clickCreateLead().enterCname(Cname).enterfname(fname).enterlname(lname).
		  clickCreate() .verifyLeadPage();
		 

	}

}
