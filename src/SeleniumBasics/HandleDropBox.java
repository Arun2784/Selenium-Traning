package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleDropBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		driver.findElement(By.name("userType")).click();
		
		
		 Select select2 = new Select(driver.findElement(By.name("city")));
		select2.selectByVisibleText("Delhi");
        driver.quit();
	}

}
