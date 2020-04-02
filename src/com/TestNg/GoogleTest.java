package com.TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

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

	@Test(priority = 1, groups = "Title")

	public void GoogleTitleTest() {

		String title = driver.getTitle();

		System.out.println("Title is---" + title);

	}

	@Test(priority = 2, groups = "logo")

	public void logotest() {

		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();

	}

	@Test(priority = 3, groups = "link")

	public void maillinkTest() {

		boolean b2 = driver.findElement(By.linkText("Gmail")).isDisplayed();

	}

	@AfterMethod

	public void tearDown() {
		driver.quit();

	}

}
