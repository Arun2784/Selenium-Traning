package com.TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.google.com");

	}

	@Test

	public void GoogleTitleTest() {

		String title = driver.getTitle();

		System.out.println("Title is---" + title);
		
		Assert.assertEquals(title, "Google123","Title not matched");
		

	}

	@Test

	public void logotest() {

		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
		Assert.assertTrue(b);
		

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
