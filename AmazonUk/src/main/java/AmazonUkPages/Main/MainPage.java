package AmazonUkPages.Main;

import DriverSetup.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

	public MainPage(WebDriver driver) {
		super(driver);
	}

	// -- Page Elements --

	private WebElement acceptAllButton() {
		return getWait().until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@id='sp-cc-accept']")));
	}


	// -- Page Methods --

	public void clickAcceptAllButton(){
		acceptAllButton().click();
	}

	public void loginAmazonUk(String url)
	{
		maximizeBrowser();
		getDriver().manage().deleteAllCookies();
		goToUrl(url);
	}


}
