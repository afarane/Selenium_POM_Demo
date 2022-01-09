package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import TestSetup.PageBase;

public class SignInUser extends PageBase {

	public SignInUser() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public void validateSignInUser(String userName) {
		driver.findElement(By.xpath("//span[text()='Hello, " + userName + "']"));
	}

}
