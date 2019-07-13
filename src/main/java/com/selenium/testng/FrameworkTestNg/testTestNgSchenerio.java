package com.selenium.testng.FrameworkTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class testTestNgSchenerio {
	
	public static WebDriver driver;
	
	@Test
		public void verifyHomepageTitle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");		
		Thread.sleep(5000);
		driver=new ChromeDriver();
  	
		Thread.sleep(5000);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("85sachin");
		driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("golmaal2016");
		driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();	
	}	
}
