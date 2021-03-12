package com.rs.print_pdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rs.common.CommonFunctions;

public class MultiPrinting_PDF {

CommonFunctions commFun=null;
	
    // execution of first test case
	@Test
	public void tc_0001() throws InterruptedException
	{
		// import driver from common class
		WebDriver driver = CommonFunctions.driver;
		Thread.sleep(3000);
		
		// click on showroom
		driver.findElement(By.xpath("//span[contains(.,'Showroom')]")).click();
		Thread.sleep(2000);
		
		// click on masterlist's first item
		driver.findElement(By.xpath("//*[@id='url']")).click();
		Thread.sleep(2000);
		
		// click on print tag
		driver.findElement(By.xpath("//i[contains(.,'turned_in')]")).click();
		Thread.sleep(1000);
		
		// switching the window
		driver.switchTo().window(driver.getWindowHandle());
		Thread.sleep(1000);
		
		// downloading pdf
		driver.findElement(By.xpath("//button[contains(.,'Download PDF')]")).click();
		Thread.sleep(1000);
		
		// accepting alert
		System.out.println("going to click on ok");
		driver.switchTo().alert().accept();
    }
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		commFun = new CommonFunctions();
		commFun.launchBrower();
		commFun.login();
		commFun.selectLocation();
	}
	
}
