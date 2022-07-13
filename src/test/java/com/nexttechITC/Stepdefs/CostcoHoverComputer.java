package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.CostcoHoverComputerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CostcoHoverComputer {
	
	
	WebDriver driver;
	@Given("^user will visit Costco homepage url$")
	public void user_visits_Costco_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.costco.com/");
    // WebDriverWait wait = new WebDriverWait(driver,15);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    
    }
	@When("^user hovers over Shop and clicks on Computers$")
	public void user_hovers_over_Shop_and_clicks_on_Computers() throws Throwable {
	Actions act =new Actions (driver);
	CostcoHoverComputerPOM obj=new CostcoHoverComputerPOM (driver);
	act.moveToElement(obj.Shop()).build().perform();
	Thread.sleep(1500);
	act.moveToElement(obj.Computer()).click().build().perform();
	Thread.sleep(1500);
	//obj.Computer().click();
	WebDriverWait wait = new WebDriverWait (driver,20);
	}

	@Then("^user will be redirected successfully$")
	public void user_will_be_redirected_successfully() throws Throwable {
	    
	}
}
