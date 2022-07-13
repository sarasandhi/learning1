package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.AmazonBestSellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonBestSeller {
	
	WebDriver driver;
	
	@Given("^user visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,20);
	}

	@When("^user clicks on Best seller$")
	//public void user_clicks_on_Best_seller() throws Throwable
	public void user_clicks_on_Best_seller() {
	AmazonBestSellerPOM BS = new AmazonBestSellerPOM (driver) ;
	BS.BestSeller().click();
	}

	@Then("^user should be able to redirect to the Best Seller Page$")
	public void user_should_be_able_to_redirect_to_the_Best_Seller_Page() throws Throwable {
		System.out.println(driver.getTitle());
		//driver.get("https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers");   
	}
	
}