package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnswersPage {
	WebDriver driver;

	public AnswersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "auth-firstquestion")
	WebElement questionOne;

	@FindBy(className = "auth-secondquestion")
	WebElement questionTwo;

	@FindBy(xpath = "//input[@data-automationid='auth-firstanswer--input']")
	WebElement answerOne;

	@FindBy(xpath = "//input[@data-automationid='auth-secondanswer--input']")
	WebElement answerTwo;

	@FindBy(xpath = "//button[@data-automationid='auth-submitanswersbutton']")
	WebElement submitAnswers;

	public void securityAnswers() {
		
		if (questionOne.getText().contains("Who is your favourite fictional character?")) {
			answerOne.sendKeys("Lisa");
		} else if (questionOne.getText().contains("Who is your favourite poet?")) {
			answerOne.sendKeys("Robert Frost");

		} else if (questionOne.getText().contains("What is your dream car?")) {
			answerOne.sendKeys("Honda");

		}
		if (questionTwo.getText().contains("Who is your favourite fictional character?")) {
			answerTwo.sendKeys("Lisa");
		} else if (questionTwo.getText().contains("Who is your favourite poet?")) {
			answerTwo.sendKeys("Robert Frost");

		} else if (questionTwo.getText().contains("What is your dream car?")) {
			answerTwo.sendKeys("Honda");

		}

		submitAnswers.click();

	}
}