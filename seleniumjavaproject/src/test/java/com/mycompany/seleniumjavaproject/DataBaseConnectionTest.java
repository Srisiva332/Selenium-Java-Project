package com.mycompany.seleniumjavaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

import org.testng.annotations.Test;

import configurations.DataBaseConfigurations;
import datareaders.DataBaseHelper;

public class DataBaseConnectionTest {
	
	@Test
	public void fetchDataFromDB() throws SQLException 
	{	
		DataBaseHelper dbh = new DataBaseHelper();
		ResultSet rs = dbh.getResultFromDataBase("qatesting","select * from EmployeeDetails where firstname = 'Siva2'");
		rs.next();
		System.out.println(rs.getString("lastname"));
	}
	

}
