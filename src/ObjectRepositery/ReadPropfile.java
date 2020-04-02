package ObjectRepositery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

public class ReadPropfile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"D:\\Core Java\\SeleniumTraning\\src\\ObjectRepositery\\config.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("name"));

		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");

		System.out.println(url);

		String browsname = prop.getProperty("browser");

		System.out.println(browsname);

		if (browsname.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

			driver = new ChromeDriver();// Launch chorme
			driver.manage().window().maximize();
		} else if (browsname.equals("FF")) {

			System.setProperty("webdriver.gecodriver", "E:\\Selenium Training//gecodriver.exe");

			driver = new FirefoxDriver();// Launch firefox

		} else if (browsname.equals("IE")) {

			System.setProperty("webdriver.gecodriver", "E:\\Selenium Training//intenetexplorer.exe");

			driver = new InternetExplorerDriver();// Launch chorme

		}

		
		driver.get(url);
		
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		Thread.sleep(5000);

		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("email_xpath")).sendKeys("email");
		
		 
	}

}
