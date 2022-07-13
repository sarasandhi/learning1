package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageObjectModel.CostcoSortByDropdownPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CostcoSortByDropdown {

	WebDriver driver;
	@Given("^users visit Costco homepage$")
	public void users_visit_Costco_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe") ;   
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.costco.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	}

	@When("^user types \"([^\"]*)\" and clicks search button$")
	public void user_types_and_clicks_search_button(String arg1) throws Throwable {
		CostcoSortByDropdownPOM obj = new CostcoSortByDropdownPOM (driver)  ;
		obj.searchbox().sendKeys(arg1);
		obj.searchbutton().click();
	}

	@When("^user clicks sort by dropdown and select one of the sort option$")
	public void user_clicks_sort_by_dropdown_and_select_one_of_the_sort_option() throws Throwable {
		CostcoSortByDropdownPOM  sel = new CostcoSortByDropdownPOM (driver);
		sel.SoryBy.click();
		Select dropdown1 = new Select(sel.SoryBy);		
		dropdown1.selectByIndex(4);
		//dropdown1.selectByValue(5);
		//dropdown1.selectByVisibleText("Newest");
	}

	@Then("^user will be able to see the results sorted out successfully$")
	public void user_will_be_able_to_see_the_results_sorted_out_successfully() throws Throwable {
	    
	}


	
	
	
	
}
