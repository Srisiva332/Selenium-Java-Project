package com.mycompany.seleniumjavaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Files\\drivers\\drivers\\chromedriver 2_37.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://nitish090-trials65101.orangehrmlive.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("0@SGo7EhCm");
		driver.findElement(By.xpath("//*[@class='button']")).click();
		
		//to click on PIM
		driver.findElement(By.xpath("//li[@id='menu_pim_viewPimModule']//a[@class='collapsible-header waves-effect waves-orange']//span[contains(text(),'PIM')]")).click();
		
		Thread.sleep(3000L);
		
		//to click on the Employee list
		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
		
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//input[@id='employee_name_quick_filter_employee_list_value']")).sendKeys("son");


}
	
	
	
}
