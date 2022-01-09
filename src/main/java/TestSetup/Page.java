package TestSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page extends TestBase {

	// Abstract Methods

	WebDriverWait wait;

	public Page() {
		wait = new WebDriverWait(driver, 15);
	}

	public abstract String getPageTitle();

	public abstract String getPageHeader(By locator);

	public abstract WebElement getElement(By locator);

	public abstract void waitForElemenetPresent(By locator);

	public abstract void waitForPageTitle(String title);

}
