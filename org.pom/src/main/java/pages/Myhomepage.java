package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethod;

public class Myhomepage extends ProjectSpecificMethod {

	public Myhomepage(ChromeDriver driver) {
		this.driver = driver;
	}

	public Myhomepage verifyLoginpage() {
		System.out.println(driver.getTitle());
		return this;
	}

	public LeadsDashboard clickCRM() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new LeadsDashboard(driver);
	}

	public Loginpage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Loginpage(driver);

	}

}
