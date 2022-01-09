package TestSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageBase extends Page{

	@Override
	public String getPageTitle() {

		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void waitForElemenetPresent(By locator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitForPageTitle(String title) {
		// TODO Auto-generated method stub
		
	}

}
