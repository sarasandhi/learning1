package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoHoverComputerPOM {
	WebDriver driver;
    public  CostcoHoverComputerPOM (WebDriver driver) {
    this.driver=driver;	
    PageFactory.initElements(driver, this);	
    }
    
    @FindBy(id="navigation-dropdown")
    WebElement hover_Shop;
    public WebElement Shop() {
    	return hover_Shop;
    	
    }
    ////div[@id='level1-all-departments']//ui//li//a[@href="/computers.html"]
    @FindBy (xpath="//div[@id='level1-all-departments']//ul//li//a[text()='Computers']")
//@FindBy (xpath="//div[@id='level1-all-departments']//ul//li//a[@href='/computers.html'])[2]")
    //@FindBy (xpath="(//a[@href='/computers.html'])[2]")
    
    		WebElement hover_Computer;
    public WebElement Computer() {
    	return hover_Computer;
    }		
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
