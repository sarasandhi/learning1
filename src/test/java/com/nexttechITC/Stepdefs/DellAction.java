package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechITC.PageObjectModel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {
	
	WebDriver driver;

	@Given("^user visits Dell homepage url$")
	public void user_visits_Dell_homepage_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");   
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dell.com/en-us");	
		Thread.sleep(5000);
	}

	@When("^users go to Solutions dropdown menu and able to see View All Solutions$")
	public void users_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
	   Actions act= new Actions(driver) ;
	   DellActionPOM obj = new DellActionPOM (driver);
	   act.moveToElement(obj.solutions()).build().perform();
	   obj.view_all_Solutions().click();
	   
	}

	@Then("^users redirect to solution portfolio$")
	public void users_redirect_to_solution_portfolio() throws Throwable {
	    
	}


}
