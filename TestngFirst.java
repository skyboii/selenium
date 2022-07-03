package test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class TestngFirst {
	public String baseUrl = "https://www.google.com/";
	String driverPath = "/home/varunmanikoutlo/Downloads/chromedriver";
	public WebDriver driver ;

@BeforeTest
public void launchBrowser() {
	System.out.println("launching Chrome browser");
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.get(baseUrl);
}
@Test
public void verifyHomepageTitle() {
	String expectedTitle = "Google";
	String actualTitle = driver.getTitle();
	AssertJUnit.assertEquals(actualTitle, expectedTitle);
}
@AfterTest
public void terminateBrowser(){
	driver.close();
}
}
