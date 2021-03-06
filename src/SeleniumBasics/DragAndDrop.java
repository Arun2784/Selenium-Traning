package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.ImmutableBiMap.Builder;

public class DragAndDrop {

	public static void main(String[] args) {
		    
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).
		release()
		.build()
		.perform();

	}

}
