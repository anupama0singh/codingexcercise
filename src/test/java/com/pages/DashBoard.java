package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	WebDriver driver;

	public DashBoard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Accounting')]")
	WebElement accounting;

	@FindBy(xpath = "//a[@data-navigation-id='accounting-bank-accounts']")
	WebElement bankAccount;
	
	@FindBy(xpath = "//span[contains(text(),'Add Bank Account')]")
	WebElement addbankAccount;

	public void clickonAddAccount() {
		accounting.click();
		bankAccount.click();
		addbankAccount.click();
	
	}

}
