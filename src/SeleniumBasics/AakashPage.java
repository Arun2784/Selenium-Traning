package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AakashPage {

	WebDriver driver = new ChromeDriver();

	String url = "https://www.aakash.ac.in/";

	@BeforeTest
	public void appLaunch() {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		driver.get(url);

		System.out.println(" *** Launched Aakash Application *** ");

	}

	@Test(enabled = true)
	public void testAakash() throws InterruptedException {

		System.out.println(" *** Test Method One  *** ");
// Putting wait to close frame popup manually
		Thread.sleep(50);

		driver.findElement(By.xpath("//a[text()='COURSES']")).click();

		System.out.println(" *** Clicked at Course link successfully  *** ");

	}

	@AfterTest
	public void tearDown() {

//driver.quit();
		System.out.println(" *** Closing browser, Execution finished *** ");

	}

}