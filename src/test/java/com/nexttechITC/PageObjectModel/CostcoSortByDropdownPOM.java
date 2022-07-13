package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class CostcoSortByDropdownPOM {
 WebDriver driver;
 public CostcoSortByDropdownPOM (WebDriver driver) {
 this.driver = driver ;
 PageFactory.initElements(driver, this);	 
 }
	
	@FindBy (id="search-field")
	WebElement type_searchbox;
    public WebElement searchbox() {
    	return type_searchbox;
    }
    @FindBy (xpath="//i[@automation-id='searchWidgetButton']")
    WebElement type_searchbutton;
    public WebElement searchbutton() {
    	return type_searchbutton;
    }
    	
    @FindBy (id="sort_by")
    public WebElement SoryBy;
    	
    
}
