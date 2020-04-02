package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new HtmlUnitDriver(); 
		
		//WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
	
		System.out.println(driver.getTitle());
		
	}

}
