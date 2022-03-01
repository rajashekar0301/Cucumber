package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginstepDefination {
	
	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_already_on_login_page() {
		
		driver =BrowserManager.getDriver();
	
			
	}
	
	@When("^Title of the login page is Your store. Login$")
	public void verify_Title() {
		
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Your store. Login", title);
	}
	
	@Then("^User enter UserName and password$")
	public void enter_userName_password()
	{
//		UserLogin userLogin = new UserLogin();
//		userLogin.login(driver);
		
		UserLogin.login(driver);

	}
	
	@Then("^User click on login button$")
	public void click_submit() {
		
		BrowserManager.close_driver(driver);
		
	}
}
