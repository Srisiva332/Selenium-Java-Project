package com.mycompany.seleniumjavaproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1Test {
	

	@BeforeSuite
	public void Sample1BeforeSuite()
	{
		System.out.println("Sample1 Before Suite");
	}
	
	@AfterSuite
	public void Sample1AfterSuite()
	{
		System.out.println("Sample1 After Suite");
	}
	
	@BeforeClass
	public void Sample2BeforeClass()
	{
		System.out.println("Sample1 Before Class");
	}
	
	@AfterClass
	public void Sample2AfterClass()
	{
		System.out.println("Sample1 After Class");
	}
	
	@BeforeTest
	public void Sample1BeforeTest()
	{
		System.out.println("Sample1 Before Test");
	}
	
	@AfterTest
	public void Sample1AfterTest()
	{
		System.out.println("Sample1 After Test");
	}
	
	@BeforeMethod
	public void Sample1BeforeMethod()
	{
		System.out.println("Sample1 Before Method");
	}
	
	@AfterMethod
	public void Sample1AfterMethod()
	{
		System.out.println("Sample1 After Method");
	}
	
	@Test
	public void Sample1Test1()
	{
		System.out.println("Sample1 Test1");
	}
	
	@Test
	public void Sample1Test2()
	{
		System.out.println("Sample1 Test2");
	}
	
	@Test
	public void Sample1Test3()
	{
		System.out.println("Sample1 Test3");
	}


}
