package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.CostcoSignInNegativePOM;
import com.nexttechITC.PageObjectModel.CostcoSignPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
   
public class CostcoSignInNegative {
	
	WebDriver driver ;
	
	@Given("^user visit Costco homepage$")
	public void user_visit_Costco_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.costco.com/");
	    // WebDriverWait wait = new WebDriverWait(driver,15);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	}

	@When("^user click on Sign In and type invalid ‘’mona#@gmail\\.com” , valid ‘’<password >’’$")
	public void user_click_on_Sign_In_and_type_invalid_mona_gmail_com_valid_password() throws Throwable {
		CostcoSignInNegativePOM obj= new CostcoSignInNegativePOM (driver) ;
		obj.Sign_in().click();  
		obj.type_invalidemail().sendKeys("mona#@gmail.com");
		obj.type_validpassword().sendKeys("xyz@123");
	}

	@Then("^user click on sign in$")
	public void user_click_on_sign_in() throws Throwable {
	    
	}


}
