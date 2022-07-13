package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {
	WebDriver driver;
	 public DellActionPOM (WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }

	 @FindBy(xpath="//span[text()='Solutions']")
	 //@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")
	 WebElement solutions_hover;
	 public WebElement solutions() {
		 return solutions_hover;
	 }
	 
	 @FindBy(xpath="//a[text()='View All Solutions']")
	 WebElement click_view_all_Solutions;
	 public WebElement view_all_Solutions() {
		 return click_view_all_Solutions;
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}