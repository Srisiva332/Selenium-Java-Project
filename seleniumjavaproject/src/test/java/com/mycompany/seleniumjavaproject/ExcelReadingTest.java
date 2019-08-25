package com.mycompany.seleniumjavaproject;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import datareaders.ExcelReader;

public class ExcelReadingTest {
	String sheetName = "TestData";
	String testCaseName = "test2";
	String filePath ="<filePath>";
	// Test Data excel template file is placed in Selenium-Java-Project Repository
	
	
	@Test
	public void getCellValue() throws IOException
	{
		ExcelReader xlReader = new ExcelReader(filePath);
		String cellValue = xlReader.getCellData(sheetName,testCaseName,"DOB");
		System.out.println(cellValue);
	}

	@Test
	public void getDataToArrayList() throws IOException
	{
		ExcelReader xlReader = new ExcelReader(filePath);
		ArrayList<String> testData = new ArrayList<String>();
		testData = xlReader.getTestcaseDataToArrayList(sheetName,testCaseName);
		System.out.println(testData);
	}

}
