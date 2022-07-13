package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageObjectModel.FacebookSignUpPOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSignup {
	
	WebDriver driver;
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");   
	driver =new ChromeDriver();
	//driver.manage().window().fullscreen();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php");
	
	}

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		FacebookSignUpPOM obj = new FacebookSignUpPOM (driver);
		obj.First_Name().sendKeys(arg1);
		obj.Last_Name().sendKeys(arg2);
		obj.email_address().sendKeys(arg3);
		obj.Password().sendKeys(arg4);
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		FacebookSignUpPOM se1 = new FacebookSignUpPOM (driver) ;
		Select dropdown1 = new Select (se1.click_month);
		//dropdown.selectByIndex(8);
		dropdown1.selectByVisibleText("Dec");
		
		Select dropdown2 = new Select (se1.click_day);
		dropdown2.selectByValue("15");
		
		Select dropdown3 = new Select (se1.click_year);
		dropdown3.selectByVisibleText("2020");
		
	}


}
