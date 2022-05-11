package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import pages.Loginpage;

public class Loginlogout extends ProjectSpecificMethod {
	
	@BeforeTest
	public void teDetails() {
		testName="Loginpage";
		testDesc="Login with Positive Credentials";
		author="Babu";
		category="Smoke test";	
	}
	
	
	
	
	@Test
	public void runLoginAndLogout() throws IOException {		
	
		new Loginpage(driver).enterUsername().enterPassword().clickLogin();		
		
					}

}
