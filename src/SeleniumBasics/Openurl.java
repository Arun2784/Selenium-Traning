package SeleniumBasics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openurl {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/account/register/basicdetails");

		String title = driver.getTitle();

		System.out.println(title);

		// validation Point

		if (title.equals("https://www.naukri.com/account/register/basicdetails")) {

			System.out.println("correct-title");
		} else {

			System.out.println("Incorrect-title");
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
