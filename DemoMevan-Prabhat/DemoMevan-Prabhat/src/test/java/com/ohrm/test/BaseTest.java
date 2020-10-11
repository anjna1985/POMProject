package com.ohrm.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import com.ohrm.pages.LoginPage;
import com.ohrm.pages.OrangeLandingPage;
import com.ohrm.utils.ReadConfig;

public class BaseTest {

	WebDriver driver;
	String browser;
	ReadConfig rc;

	@BeforeClass
	public void setUP() throws IOException {

		rc = new ReadConfig();

		browser = rc.getBrowser();

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else {
			driver = new FirefoxDriver();
		}
		driver.get(rc.getURL());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void login() {
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		OrangeLandingPage landingpage = lp.doLogin("Admin", "admin123");
		landingpage.doLogin("Admin");
	}
}
