package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class UserLogin {
	
	WebDriver driver;
	public static WebDriver login(WebDriver driver) {
		
		WebElement userName =driver.findElement(By.xpath("//input[@type='email']"));
		userName.clear();
		userName.sendKeys("admin@yourstore.com");
		WebElement password =driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String DashboardTitle =driver.getTitle();
		System.out.println(DashboardTitle);
		Assert.assertEquals("Dashboard / nopCommerce administration", DashboardTitle);
		
		return driver;
	
		
		
		
	}
	
	
	

}
