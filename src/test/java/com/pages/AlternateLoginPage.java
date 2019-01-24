package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlternateLoginPage {
	WebDriver driver;
	
	public AlternateLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@data-automationid='auth-othermethodbutton']")
	WebElement alternateMethod;
	
	public void clickonAlternateMethod() {
		alternateMethod.click();
	}

}
