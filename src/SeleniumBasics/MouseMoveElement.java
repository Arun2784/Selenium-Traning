package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://spicejet.com");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		
		//driver.findElement(By.xpath("D:\\Core Java\\FreeCRMTest\\test-output\\index.html")).sendKeys(arg0);
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Visa Services")).click();
		
		
		
		
		
		

	}

}
