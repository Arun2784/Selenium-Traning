package com.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	@BeforeSuite

	public void setup() {

		System.out.println("@BeforeSuite--Setup System property for chrome");

	}

	@BeforeTest

	public void launchbrowser() {

		System.out.println("@BeforeTest--launchbrowser");

	}

	@BeforeClass

	public void enterUrl() {

		System.out.println("@BeforeClass--Enter the Url");

	}

	@BeforeMethod

	public void login() {

		System.out.println("@BeforeMethod--login app");

	}

	@Test

	public void googleTitleTest() {

		System.out.println("@Test case1- Google Title test");

	}

	@Test

	public void searchrecord() {

		System.out.println("@Test case 2--Google search");

	}

	@AfterMethod

	public void logout() {

		System.out.println("@AfterMethod--Log Out from App");

	}

	@AfterTest

	public void deleteAllcookies() {

		System.out.println("@AfterTest--delete all the cookies");

	}

	@AfterClass

	public void closeBrowser() {

		System.out.println("@AfterClass--Close the browser");

	}

	@AfterSuite

	public void generateTestReport() {

		System.out.println("Generate the test report");

	}

}