package DriverSetup;

import jdk.jfr.Timespan;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public abstract class BasePage {

	private WebDriver driver;
	private WebDriverWait wait;

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait =  new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
	}

	public static WebDriver start(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\emild\\source\\repos\\JavaAutomationFramework\\chromedriver.exe");

		WebDriver chromeDriver = new ChromeDriver();
		return chromeDriver;
	}

	public void goToUrl(String url){
		driver.navigate().to(url);
	}

	public void maximizeBrowser(){
		driver.manage().window().maximize();
	}

	public void acceptAlert(){
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
