package com.mycompany.seleniumjavaproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample2Test {

	@BeforeClass
	public void Sample2BeforeClass()
	{
		System.out.println("Sample2 Before Class");
	}
	
	@AfterClass
	public void Sample2AfterClass()
	{
		System.out.println("Sample2 After Class");
	}
	
	@BeforeTest
	public void Sample2BeforeTest()
	{
		System.out.println("Sample2 Before Test");
	}
	
	@AfterTest
	public void Sample2AfterTest()
	{
		System.out.println("Sample2 After Test");
	}
	
	@BeforeMethod
	public void Sample2BeforeMethod()
	{
		System.out.println("Sample2 Before Method");
	}
	
	@AfterMethod
	public void Sample2AfterMethod()
	{
		System.out.println("Sample2 After Method");
	}
	
	@Test
	public void Sample2Test1()
	{
		System.out.println("Sample2 Test1");
	}
	
	@Test
	public void Sample2Test2()
	{
		System.out.println("Sample2 Test2");
	}
	
	@Test
	public void Sample2Test3()
	{
		System.out.println("Sample2 Test3");
	}

}
