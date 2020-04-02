package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlefileupload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");

		driver.manage().window().maximize();

		driver.findElement(By.id("usernameField")).sendKeys("Arunpandey2784@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("arun2784");
		driver.findElement(
				By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn']")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\T542\\Desktop//query.txt");

		System.out.println("resume updated successfully");

		// driver.quit();

	}

}
