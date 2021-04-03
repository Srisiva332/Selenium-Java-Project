package com.mycompany.seleniumjavaproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class MavenParametersTest {
	
	@Test
	public void maventest() throws IOException
	{
		
		//mvn clean install -PRegression -Durl=QA -Denvironment=QA	
		
		String URL = System.getProperty("url");
		String ENVIRONMENT	= System.getProperty("environment");
		String path = System.getProperty("user.dir");
		
		System.out.println(path);
		
		
		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream(path+"\\src\\main\\java\\resources\\qa.properties");
		pr.load(fis);
		
		System.out.println(pr.getProperty("url"));
		
		System.out.println(URL + " "+ ENVIRONMENT );
	}

}
