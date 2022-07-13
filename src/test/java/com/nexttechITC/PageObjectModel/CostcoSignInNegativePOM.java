package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoSignInNegativePOM {

	
	WebDriver driver;
    public CostcoSignInNegativePOM (WebDriver driver) {
    this.driver=driver;	
    PageFactory.initElements(driver, this);	
    }
    
    @FindBy (id="header_sign_in")
    WebElement click_Sign_in;
    public WebElement Sign_in(){
    return click_Sign_in;
    }
    @FindBy (id="signInName")
    WebElement type_invalidemail;
    public WebElement type_invalidemail() {
    	return type_invalidemail;
    }
    @FindBy (id="password")
    WebElement type_validpassword;
    public WebElement type_validpassword() {
    	return type_validpassword;
    }
    
    
    
    
    
    
    
}
