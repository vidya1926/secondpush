package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethod;

public class CreateLeadInfo extends ProjectSpecificMethod {
//Enter company name, first name and last name

	public CreateLeadInfo(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadInfo enterCname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}

	public CreateLeadInfo enterfname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}

	public CreateLeadInfo enterlname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys();
		return this;

	}

	public ViewLeadpage clickCreate() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadpage(driver);
	}

	// click create--->viewlead
}
