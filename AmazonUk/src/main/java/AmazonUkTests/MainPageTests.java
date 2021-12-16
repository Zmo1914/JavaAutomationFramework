package AmazonUkTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainPageTests extends BaseTest{

	@Parameters({ "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more" })
	@Test()
	public void loginTest(){
		mainPage.loginAmazonUk("https://www.amazon.co.uk/");
		mainPage.clickAcceptAllButton();
	}


}
