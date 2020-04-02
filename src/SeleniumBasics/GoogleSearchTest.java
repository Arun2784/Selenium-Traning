package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.name("q")).sendKeys("Aakash");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role=listbox]//li/descendant::div[@class='sbl1']"));

		System.out.println("Total number of suggestion :------>" + list.size());

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("Aakash gupta")) {

				list.get(i).click();

				break;
			}

		}
	}

}
