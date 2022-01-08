package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class SignInUser extends TestBase {

	public SignInUser() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public void validateSignInUser(String userName) {
		driver.findElement(By.xpath("//span[text()='Hello, " + userName + "']"));
	}

}
