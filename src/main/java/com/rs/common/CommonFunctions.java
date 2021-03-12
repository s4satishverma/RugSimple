package com.rs.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
	public static WebDriver driver = new FirefoxDriver();
	
	// public WebDriver returnWebDriverInstance() {
	//	 return driver;
	 //}
	
	// launching the browser
	// we can do it by @BeforeClass as well
		public void launchBrower() {
			driver.get("https://staging.rugsimple.com/");
		}
		
		// login to the stating.rugsimple.com
		 public void login() throws InterruptedException {
		  driver.findElement(By.name("username")).sendKeys(Constants.username);
		  driver.findElement(By.name("password")).sendKeys(Constants.password);
		  driver.findElement(By.name("action")).click();
		 }
		 
		 // selecting the location in the landing screen
		 public void selectLocation() throws InterruptedException {
			 Thread.sleep(3000);
			 driver.switchTo().window(driver.getWindowHandle());
			 Thread.sleep(1000);
			 driver.findElement(By.id("radio_33")).click();
			 driver.findElement(By.xpath("//*[@id='radio_33']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//button[contains(.,'save')]")).click();
			 }
}
