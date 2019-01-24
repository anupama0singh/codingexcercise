package com.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AddAccount {
	WebDriver driver;
	

	public AddAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "xui-searchfield-1018-inputEl")
	WebElement account;

	@FindBy(id = "component-1027")
	WebElement addAnyway;
	
	@FindBy(xpath = "//li[contains(text(),'ANZ (NZ)')]")
	WebElement anzNZ;

	@FindBy(xpath = "//input[starts-with(@id, 'accountname-')]")
	WebElement accountName;

	@FindBy(xpath = "//input[starts-with(@id, 'accounttype-')]")
	WebElement accountType;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement ccNumber;
	
	@FindBy(xpath = "//a[@data-automationid='continueButton']")
	WebElement continuebutton;



	public void searchAccount()  {
		account.sendKeys("ANZ (NZ)");
		addAnyway.click();
		anzNZ.click();
		accountName.sendKeys("ANZ NZ");
		accountType.click();
		accountType.sendKeys(Keys.TAB);
		ccNumber.sendKeys("12345");
	//	continuebutton.click();
	}
}
