package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitAndEmplicitwait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.aakash.ac.in/");

		// Emplicit wait
		// Let's say that you give an Implicit wait of 20 seconds. Now while executing,
		// your webdriver is not able to find
		// an element, but since you've set implicit wait,
		// the webdriver does not throw the exception right away
		// implicit Wait is applicable for all web elements that are on a web page.

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, 10);

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(“https://www.aakash.ac.in/”))

		wait.until(ExpectedConditions.elementToBeClickable(By.id("id")));
			
	}

}
