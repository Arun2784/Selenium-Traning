package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Nagivations {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		
		driver.navigate().to("https://www.aakash.ac.in/");
		
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().back();/// Nuakri
		
		driver.navigate().refresh();
		
		
		
		
		
		
		

	}

}
