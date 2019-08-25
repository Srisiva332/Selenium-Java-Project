package com.mycompany.seleniumjavaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.SignInPage;

public class MyStoreAutomationTest {
	
	@Test
	public void createAccount()
	{
		
		
		try {
			System.setProperty("webdriver.chrome.driver","G:\\Siva\\Automation\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("-- Navigated to url----- ");
		HomePage home=new HomePage(driver);
		home.clickOnSignin();
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
