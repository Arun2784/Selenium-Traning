package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorconcept {


		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.naukri.com/account/register/basicdetails");
			driver.manage().window().maximize();

			// 1.Xpath
			// 2.id
			// 3.name
			driver.findElement(By.name("userType")).click();

			// 4.linktext

			//driver.findElement(By.linkText("Terms and Conditions")).click();

			// 5.Partial Link text--Not use ful

			// driver.findElement(By.linkText("Terms and")).click();
			
			//6.CSS Selector
			driver.findElement(By.cssSelector("#fname")).sendKeys("21, Karol bagh");
			driver.findElement(By.cssSelector("#email")).sendKeys("arun@gmail.com");;		
			
			driver.quit();

		}

	}