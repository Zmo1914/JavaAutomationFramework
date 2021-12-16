package AmazonUkTests;

import AmazonUkPages.Main.MainPage;
import DriverSetup.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class BaseTest {

	protected WebDriver driver;
	protected WebDriverWait wait;

	protected MainPage mainPage;

	@BeforeTest
	public void beforeTest(){
		driver = BasePage.start();

		mainPage = new MainPage(driver);
	}

	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}


}
