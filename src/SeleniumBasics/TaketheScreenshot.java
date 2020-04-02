package SeleniumBasics;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;

//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

//import org.testng.annotations.Test;

public class TaketheScreenshot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		
        TakesScreenshot scrShot =((TakesScreenshot)driver);


		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File("D:\\Core Java\\SeleniumTraning\\src\\SeleniumBasics");

            //Copy file at destination

            //FileUtils.copyFile(SrcFile, DestFile);
		
		
	}

}
