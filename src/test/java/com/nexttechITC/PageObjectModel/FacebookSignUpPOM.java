package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignUpPOM {
 WebDriver driver;
 public FacebookSignUpPOM (WebDriver driver) {
 this.driver=driver;
 PageFactory.initElements(driver, this);
 }
 
 @FindBy (name="firstname")
 WebElement edit_First_Name;
 public WebElement First_Name () {
	 return edit_First_Name;
 }
		 
 @FindBy (name="lastname")	
 WebElement edit_Last_Name;
 public WebElement Last_Name () {
	 return edit_Last_Name;
 }
@FindBy (name="reg_email__")
WebElement edit_email_address;
public WebElement email_address() {
	return edit_email_address;
}
@FindBy (id="password_step_input")
WebElement edit_password;
public WebElement Password() {
	return edit_password;
}
//@FindBy (id="month")
@FindBy (xpath="//*[@id=\"month\"]")
public WebElement click_month;
		 
@FindBy (name="birthday_day")
public WebElement click_day;

@FindBy (name="birthday_year")
public WebElement click_year;









}
