package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomeXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait

		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.aakash.ac.in/");

		driver.switchTo().frame(1);

		// driver.findElement(By.xpath("//img[@class='notimage
		// clickable-element']")).click();
		
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[contains(@class,'icon close')]")).click();
		Thread.sleep(5000);

		//driver.findElement(By.xpath("//a[text()='COURSES']")).click();
		//driver.findElement(By.xpath("//a[@class='class-crs']")).click();
		driver.findElement(By.xpath("//a[text()='COURSES']")).click();

		/*
		 * 
		 * 
		 * driver.findElement(By.xpath("//a[contains(text(),'Aakash DLP')]")).click();
		 * 
		 * System.out.println("After click on crosss icon pls hold on this page");
		 * 
		 * System.out.println("Ohh Great, nice you are moving forward very easliy");
		 * 
		 * //driver.quit();
		 * 
		 */

	}

}
