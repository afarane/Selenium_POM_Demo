package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {

	// PageFatory - Object Repository.

	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	@CacheLookup
	WebElement accountList;

	@FindBy(xpath = "//div[@id='nav-al-signin']//span[text()='Sign in']")
	WebElement signinBtn;


	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public SignInPage login() {
		Actions action = new Actions(driver);
		action.moveToElement(accountList).build().perform();
		signinBtn.click();
		return new SignInPage();
	}

}
