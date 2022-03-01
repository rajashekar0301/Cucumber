package stepDefination;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Product_Create {
	
	WebDriver driver;
	
	@Given("^User should be on Dashbaord page$")
	public void Verify_user_on_the_dashboard_page()
	{
		driver=BrowserManager.getDriver();
		UserLogin.login(driver);
		
		
	}
	
	@When("^Page Tile should be match with Dashboard / nopCommerce administration$")
	public void Dashboard_title_verify()
	{
		String DashboardTitle =driver.getTitle();
		System.out.println(DashboardTitle);
		Assert.assertEquals("Dashboard / nopCommerce administration", DashboardTitle);
		
	}
	
	@Then("^Navigate to Catalog Menu$")
	public void navigate_to_catalog_menu()
	{
		driver.findElement(By.xpath("//p[normalize-space()='Catalog']")).click();
		
	}
	@Then("^click on products Sub Menu$")
	public void click_on_products_menu()
	{
		try {
			driver.findElement(By.xpath("//p[normalize-space()='Products']")).click();
		} catch (NoSuchElementException  e) {
			// TODO: handle exception
			
			
			
			System.out.println("******************** :"+e);
		}
		driver.findElement(By.xpath("//p[normalize-space()='Products']")).click();
		String ProductTitle=driver.findElement(By.xpath("//h1[@class='float-left']")).getText();
		System.out.println("Navigated to Product Tab *** : " + ProductTitle);
		assertEquals(ProductTitle, "Products");
		
	}
	@Then("^Click on Add Product$")
	public void click_on_Add_Product() throws InterruptedException {
	    driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	    Thread.sleep(20);
	    
	}

	@Then("^enter \"(.*)\" and \"(.*)\" and Price$")
	public void enter_productName_and_ProductTags_and_Price(String ProductName,String GSTIN) {
		
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys(ProductName);
//		JavascriptExecutor jse =(JavascriptExecutor)driver;
//		jse.executeScript("scroll(0,250)");
		
//		
		WebElement tags =driver.findElement(By.xpath("//input[@id='Gtin']"));
		JavascriptExecutor jse1 =(JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,750);");
		tags.sendKeys(GSTIN);

//		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
//		jse3.executeScript("window.scrollBy(0,1500);");
//		WebElement price =driver.findElement(By.xpath("//input[@id='Price']"));
//		price.clear();
//		price.sendKeys("100");
	   	}

	@Then("^Click on save button$")
	public void click_on_save_button(){
		WebElement save =driver.findElement(By.xpath("//button[@name='save']"));
		JavascriptExecutor jse1 =(JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].scrollIntoView();",save);
		save.click();
		
		
	   }

	@Then("^close the browser$")
	public void close_the_browser() {
	    BrowserManager.close_driver(driver);
	    
	}

}
