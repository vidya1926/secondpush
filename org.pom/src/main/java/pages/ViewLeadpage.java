package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethod;

public class ViewLeadpage extends ProjectSpecificMethod {

	public ViewLeadpage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewLeadpage verifyLeadPage() {
		System.out.println(driver.getTitle());
		return this;
	}

}
