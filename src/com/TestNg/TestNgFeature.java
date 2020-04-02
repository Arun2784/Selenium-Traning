package com.TestNg;

import org.testng.annotations.Test;

public class TestNgFeature {

	@Test

	public void logintest() {

		System.out.println("Login Test");

		//int i = 9 / 0;

	}

	@Test(dependsOnMethods = "logintest")

	public void homepagetest() {

		System.out.println("Login Test");

	}

	@Test(dependsOnMethods = "logintest")

	public void searchpagetest() {

		System.out.println("searchpagetest");

	}

	@Test(dependsOnMethods = "logintest")

	public void regpagetest() {

		System.out.println("registration");

	}

}
