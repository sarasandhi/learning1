package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {
	WebDriver driver;
	 //Constructor is not a method but a special type of method.Constructor name should be same as class name alwsys.
	 
	  public AmazonsearchPOM (WebDriver driver) {
	    this.driver=driver;
	   
	    PageFactory.initElements(driver, this);
	   }
	  
	  
	  //@FindBy(name="field-keywords")
	  @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	  WebElement edit_serchbox;
	  public WebElement Search () { 
		return edit_serchbox;
	
	   
	  }
	  @FindBy(id="nav-search-submit-button")
	  WebElement click_searchbutton;
	  public WebElement searchbutton(){
	  return click_searchbutton;
	   

}

}
