package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoSignPOM {
	WebDriver driver;
    public CostcoSignPOM (WebDriver driver) {
    this.driver=driver;	
    PageFactory.initElements(driver, this);	
    }
    
    @FindBy (id="header_sign_in")
    WebElement click_Sign_in;
    public WebElement Sign_in(){
    return click_Sign_in;
    }
   //@FindBy (xpath="//input[@type=\\\'email\\\']")
    @FindBy (id="signInName")
    WebElement type_email;
    public WebElement type_email() {
    	return type_email;
    }
    @FindBy (id="password")
    WebElement type_password;
    public WebElement type_password() {
    	return type_password;
    }
    
}