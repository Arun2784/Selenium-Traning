package WriteWebTableinToExcel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[4]/td[1]

		String beforeXpath_company = "//*[@id=\"customers\"]/tbody/tr[";

		String aferXpath_company = "]/td[1]";

		String beforeXpath_contact = "//*[@id=\"customers\"]/tbody/tr[";

		String aferXpath_contact = "]/td[2]";

		String beforeXpath_country = "//*[@id=\"customers\"]/tbody/tr[";

		String aferXpath_country = "]/td[3]";

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));

		System.out.println("Total no of row is = " + (rows.size() - 1));

		int rowCount = rows.size();

		Xls_Reader reader = new Xls_Reader(
				"D:\\Core Java\\SeleniumTraning\\src\\WriteWebTableinToExcel\\AakashProjectData.xlsx");

		if (!reader.isSheetExist("TableData")) {
			reader.addSheet("TableData");
			reader.addColumn("TableData", "CompanyName");
			reader.addColumn("TableData", "ContactName");
			reader.addColumn("TableData", "CountryName");
			
			//reader.addColumn(sheetName, colName)
		}

		for (int i = 2; i <= rowCount; i++) {

			String ActualXpath_company = beforeXpath_company + i + aferXpath_company;

			String companyName = driver.findElement(By.xpath(ActualXpath_company)).getText();

			System.out.println(companyName);

			reader.setCellData("TableData", "CompanyName", i, companyName);

			String ActualXpath_contact = beforeXpath_contact + i + aferXpath_contact;

			String contactName = driver.findElement(By.xpath(ActualXpath_contact)).getText();

			System.out.println(contactName);

			reader.setCellData("TableData", "ContactName", i, contactName);

			String ActualXpath_country = beforeXpath_country + i + aferXpath_country;

			String countryName = driver.findElement(By.xpath(ActualXpath_country)).getText();

			System.out.println(countryName);

			reader.setCellData("TableData", "CountryName", i, countryName);
			// reader.setCellData(sheetName, colName, rowNum, data)
	

		}

	}

}
