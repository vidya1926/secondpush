package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethod;

public class CreateLeadpage extends ProjectSpecificMethod {

	public CreateLeadpage(ChromeDriver driver) {
		this.driver = driver;
	}

	// clickcreatelead

	public CreateLeadInfo clickCreateLead() throws InterruptedException {
		try {
			driver.findElement(By.linkText("Create Lead")).click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Lead")).click();

		}
		return new CreateLeadInfo(driver);
	}

}
