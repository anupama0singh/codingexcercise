package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(id = "email")
	WebElement emailText;

	@FindBy(id = "password")
	WebElement passwordText;

	@FindBy(id = "submitButton")
	WebElement loginButton;
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String emailiD ) {
		emailText.sendKeys(emailiD);
	}
	public void enterPassword( String password) {
		passwordText.sendKeys(password);
	}

	public void clickonLoing() {
		loginButton.click();
	}
	
	

}
