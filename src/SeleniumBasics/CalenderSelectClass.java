package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelectClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("arunji.pandey@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Arun2784$");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
		String date =  "29-February-2020	";
		
		String dateArr[]= date.split("-"); //29-February-2019
		
		String day=dateArr[0];
		
		String month =dateArr[1];
		
		String year = dateArr[2];
		
		
		
		//element is inside iframe & it is not supported by ChroPath currently. Please write CSS manually.
		
		
		
		
		
		
		//driver.quit();
		
		
		

	}

}
