package com.ohrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ohrm.test.BaseTest;

public class LoginPage extends BaseTest {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(xpath = "//input[@id='txtUsername']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='txtPassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;

	// Business Login
	public OrangeLandingPage doLogin(String myusername, String mypassword) {

		username.sendKeys(myusername);
		password.sendKeys(mypassword);
		login.click();
		return PageFactory.initElements(driver, OrangeLandingPage.class);
	}

}
