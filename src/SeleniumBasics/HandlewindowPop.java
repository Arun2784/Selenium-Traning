package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlewindowPop {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();
		String parentwindowId = it.next();

		System.out.println("Parent window Id." + parentwindowId);

		String childwindowid = it.next();

		System.out.println("Child window id." + childwindowid);
		driver.switchTo().window(childwindowid);
//
//		String childwindowid1 = it.next();
//
//		System.out.println("Child window id." + childwindowid1);
//		driver.switchTo().window(childwindowid1);

		System.out.println("Child window pop up title" + driver.getTitle());
		driver.close();
		// System.out.println("Child window pop up title" + driver.getTitle());
		// driver.close();

		driver.switchTo().window(parentwindowId);
		System.out.println("Parent window pop up title" + driver.getTitle());
		String childwindowid1 = it.next();

		System.out.println("Child window id." + childwindowid1);
		driver.switchTo().window(childwindowid1);
		System.out.println("Child window pop up title" + driver.getTitle());
		driver.close();
		
		
		driver.switchTo().window(parentwindowId);
		System.out.println("Parent window pop up title" + driver.getTitle());
		
	}

}
