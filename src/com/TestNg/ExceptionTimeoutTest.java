package com.TestNg;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
//
//	@Test(timeOut = 2000)
//
//	public void infinetloop() {
//
//		int i = 1;
//		while (i == 1) {
//
//			System.out.println(i);
//
//		}
//
//	}

	@Test(expectedExceptions = NumberFormatException.class)

	public void test2() {

		
		String x ="100A";
		
		Integer.parseInt(x);
		
		
		
		
	}

}
