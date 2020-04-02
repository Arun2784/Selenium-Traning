package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.aakash.ac.in/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.switchTo().frame(3);

		System.out.println("Ohh yes reach on Frame");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//iframe[@id='container-notification-frame-5df31f9afe26132f47b2139a']")).click();

	}

}
