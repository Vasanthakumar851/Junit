package com.junit.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void before() {
		System.out.println("Start Time: "+ System.currentTimeMillis());
	}
	
	@Ignore
	@Test
	public void testz() {
		System.out.println("Test 1");
	}
	
	
	@Test
	public void testb() {
		System.out.println("Test 2");
	}
	
	@Ignore
	@Test 
	public void testc() {
		System.out.println("Test 3");
	}
	
	@After
	public void after() {
		System.out.println("End Time: "+ System.currentTimeMillis());
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}
