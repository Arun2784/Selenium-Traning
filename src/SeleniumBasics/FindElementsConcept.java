package SeleniumBasics;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait

		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");

		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size(); i++) {
			
			String linkText= linkList.get(i).getText();
			System.out.println(linkText);
		}
		
		
		
		

	}

}
