package datareaders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

import com.mysql.cj.jdbc.DatabaseMetaData;

import configurations.DataBaseConfigurations;


public class DataBaseHelper {
	
	private String fetchConnectionUrl(String dbtype,String host,String dbname)
	{
		try {
		if(dbtype.trim().equalsIgnoreCase("MySQL")) 
			return "jdbc:mysql://"+host+":3306/"+dbname;
		else if (dbtype.trim().equalsIgnoreCase("SQL Server"))
			return "jdbc:sqlserver://"+host+":1433;databaseName="+dbname;
		else if(dbtype.trim().equalsIgnoreCase("Oracle SQL"))
			return "jdbc:oracle:thin:@//"+host+":1521/"+dbname;
		else if(dbtype.trim().equalsIgnoreCase("Postgre SQL"))
			return "jdbc:postgresql://"+host+":5432/"+dbname+"?currentSchema=SCHEMA";
		else
			throw new IllegalArgumentException(String.format("Proper DBtype is not selection"));
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw new IllegalArgumentException(String.format("Proper DBtype is not selection"));
		}
		
	}
		
	public ResultSet getResultFromDataBase(String dbname,String query)
	{
		ResultSet rs = null;
		Connection conn = null;
		try {
			DataBaseConfigurations dbc = new DataBaseConfigurations();
			Hashtable dbcondetails = dbc.getDataBaseDetails(dbname,"QA");
			System.out.println(dbcondetails.get("hostname").toString());
			
			String url = fetchConnectionUrl(dbcondetails.get("dbtype").toString(), dbcondetails.get("hostname").toString(), dbname);
			System.out.println(url);
			conn = DriverManager.getConnection(url,dbcondetails.get("username").toString(),dbcondetails.get("password").toString());
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(query);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return rs;
	}
	
	

}
