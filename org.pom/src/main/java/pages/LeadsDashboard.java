package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethod;

public class LeadsDashboard extends ProjectSpecificMethod {

	public LeadsDashboard(ChromeDriver driver) {
		this.driver = driver;
	}

	public LeadsDashboard verifyDashboard() {
		System.out.println("Landed Successfully");
		return this;
	}

	public CreateLeadpage clickLeads() {
		driver.findElement(By.linkText(property.getProperty("Homepage.Leads.LinkText"))).click();
		return new CreateLeadpage(driver);// click Leads
	}

}
