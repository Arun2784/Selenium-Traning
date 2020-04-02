package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.crmpro.com/");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("batchautomation");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@12345");

		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		driver.switchTo().frame("mainpanel");

		List<WebElement> linkslist = driver.findElements(By.tagName("a"));

		linkslist.addAll(driver.findElements(By.tagName("img")));

		System.out.println("Size of full links and images---->" + linkslist.size());

		List<WebElement> activelinks = new ArrayList<WebElement>();

		for (int i = 0; i < linkslist.size(); i++) {

			if (linkslist.get(i).getAttribute("href") != null) {
				activelinks.add(linkslist.get(i));

				// get the size of active link

				System.out.println("Size of active links and images---->" + activelinks.size());

			}

		}
        for (int j=0; j<linkslist.size(); j++) {
        	
        	
        	
        	
        }
	}

}
