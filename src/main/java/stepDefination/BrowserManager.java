package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;




public class BrowserManager {
	
	WebDriver driver;
	
	public static WebDriver getDriver(){
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://admin-demo.nopcommerce.com/");
		
		Reporter.log("Navigate to Chrome browser");
		return driver;
		
	}
	
	public static void close_driver(WebDriver driver) {
		
		driver.close();
		
	}
	
	

}
