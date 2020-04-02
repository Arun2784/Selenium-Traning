package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopuphandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.aakash.ac.in/aakash-digital-online-learning-courses");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.id("block-useraccountmenu-3")).click();
		driver.findElement(By.id("edit-submit")).click();
		
		Thread.sleep(5000);
		
		Alert alert1 = driver.switchTo().alert();
		
		System.out.println(alert1.getText());
		
		String text = alert1.getText();
		
		if(text.equals("Please enter a valid user name")) {
			
			System.out.println("Correct alert message name");
			
		}
		else {
			
			
			System.out.println("In-correct---alert message");
			
		}
		alert1.accept();
		

	}

}
