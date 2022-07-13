package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazonsearchfeature {
	
	WebDriver driver;
	
	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		//how to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  
		driver = new ChromeDriver(); 
		  //how to open the URL
		  driver.get("https://www.amazon.com/");
	}

	@Given("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
	AmazonsearchPOM AS = new AmazonsearchPOM (driver) ; 
	AS.Search().sendKeys(arg1);
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		AmazonsearchPOM AS = new AmazonsearchPOM (driver) ; 
		AS.searchbutton().click();
	}
}
