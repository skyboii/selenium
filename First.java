package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class First {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/home/ur_user_name/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("xyzz@yahoo.com");
	}
}
