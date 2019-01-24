package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurityQuestionPage {
	WebDriver driver;
	
	public SecurityQuestionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@data-automationid='auth-authwithsecurityquestionsbutton']")
	WebElement securityQuestions;
	
	public void clickonsecurityQuestions() {
		securityQuestions.click();
	}
	
}
