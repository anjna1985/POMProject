package com.ohrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLandingPage {

	WebDriver driver;

	public OrangeLandingPage(WebDriver driver) {

		this.driver = driver;

	}
	@FindBy (xpath = "//b[contains(text(),'Admin')]")
	public WebElement admin;

	@FindBy(xpath = "//input[@id='searchSystemUser_userName']")
	public WebElement usernameSearch;

	@FindBy(xpath = "//input[@id='searchBtn']")
	public WebElement search;

	public OrangeLandingPage doLogin(String myusernameSearch) {
		admin.click();
		usernameSearch.sendKeys(myusernameSearch);
		search.click();
		return PageFactory.initElements(driver, OrangeLandingPage.class);
	}
}
