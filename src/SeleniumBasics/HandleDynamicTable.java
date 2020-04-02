package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("arunji.pandey@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Arun2784$");

		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();

		
		//html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]		
		//html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]	
		//html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]		
		Thread.sleep(3000);


		
		driver.navigate().refresh();
		
		
		//Method number1
		
		String before_xpath="//html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[";
		 
		 String after_xpath="]/td[2]";
		 
		 for(int i=1; i<=3; i++){
			 
			 String name= driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			 
			 System.out.println(name);
			 
			 if(name.contains("Arun Kumar Pandey")) {
				 
				 
	//2			 
				 
				 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]"
				 		+ "/table[1]/tbody[1]/tr["+i+"]/td[1]/div[1]/label[1]")).click();
				 
			 }
			 
			 
		 }
		 
		 
		 //method number 2 
		 
	}

}
