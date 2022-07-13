package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.CostcoSignPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CostcoSign {
	
	
	WebDriver driver ;

	@Given("^user visits Costco homepage$")
	public void user_visits_Costco_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.costco.com/");
    // WebDriverWait wait = new WebDriverWait(driver,15);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    
}

@When("^user clicks on Sign In option$")
public void user_clicks_on_Sign_In_option() throws Throwable {
	CostcoSignPOM obj= new CostcoSignPOM (driver) ;
	obj.Sign_in().click();  

   
}

@When("^user types valid \"([^\"]*)\", \"([^\"]*)\"$")
public void user_types_valid(String arg1, String arg2) throws Throwable {
	CostcoSignPOM obj= new CostcoSignPOM (driver) ;
	obj.type_email().sendKeys(arg1);
    obj.type_password().sendKeys(arg2);
 
}

@Then("^user will be able to Sign in successfully$")
public void user_will_be_able_to_Sign_in_successfully() throws Throwable {
    
}
}
