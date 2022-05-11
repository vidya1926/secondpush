package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethod;

public class Loginpage extends ProjectSpecificMethod {

	public Loginpage(ChromeDriver driver) {
		this.driver = driver;
	}

	public Loginpage enterUsername() throws IOException {
		
	   try{
		 	driver.findElement(By.id("Username")).sendKeys(property.getProperty("Loginpage.Username.Id"));
			System.out.println(property.getProperty("Loginpage.Username.Id"));
		 	reportStep("Entered the username successfully","pass");
					}catch(Exception e)
		{
			reportStep("Enter the username unsuccessful","fail");		
	    }
		return this;
	}
	public Loginpage enterPassword() throws IOException {
		try{
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			System.out.println("Entered property value");
			reportStep("Entered the password successfully","pass");
			
		}catch(Exception e)
		{
			reportStep("Enter the password unsuccessful","fail");		
	    }
		
		return this;
	}

	public Myhomepage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Myhomepage(driver);

	}

	public Loginpage verifyLogout() {
		System.out.println(driver.getTitle());
		return this;
	}

	

}
