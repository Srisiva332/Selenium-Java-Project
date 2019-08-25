package configurations;

import java.util.ArrayList;
import java.util.Hashtable;

public class DataBaseConfigurations {
	
	public Hashtable<String, String> getDataBaseDetails(String dbname, String environment)
	{
		
		Hashtable<String,String> dbDetails = new Hashtable<String,String>();
		
		try {
		
		if(dbname.trim().equalsIgnoreCase("mssqldbname"))
		{
			dbDetails.put("dbtype","SQL Server");
			if(environment.trim().equalsIgnoreCase("QA"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else if(environment.trim().equalsIgnoreCase("Staging"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else if(environment.trim().equalsIgnoreCase("UAT"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else
				throw new IllegalArgumentException("Selected DB : "+dbname+" is not available in Environment : "+environment);
		}
		else if(dbname.trim().equalsIgnoreCase("qatesting"))
		{
			dbDetails.put("dbtype","MySQL");
			if(environment.trim().equalsIgnoreCase("QA"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else if(environment.trim().equalsIgnoreCase("Staging"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else if(environment.trim().equalsIgnoreCase("UAT"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else
				throw new IllegalArgumentException("Selected DB : "+dbname+" is not available in Environment : "+environment);
		}
		else if(dbname.trim().equalsIgnoreCase("oracledbname"))
		{
			dbDetails.put("dbtype","Oracle SQL");
			if(environment.trim().equalsIgnoreCase("QA"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else if(environment.trim().equalsIgnoreCase("Staging"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else if(environment.trim().equalsIgnoreCase("UAT"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else
				throw new IllegalArgumentException("Selected DB : "+dbname+" is not available in Environment : "+environment);
		}
		else if(dbname.trim().equalsIgnoreCase("postgresqldbname"))
		{
			dbDetails.put("dbtype","Oracle SQL");
			if(environment.trim().equalsIgnoreCase("QA"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else if(environment.trim().equalsIgnoreCase("Staging"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else if(environment.trim().equalsIgnoreCase("UAT"))
			{
				dbDetails.put("hostname","localhost");
				dbDetails.put("username","root");
				dbDetails.put("password","Srisiva@332");
			}
			else
				throw new IllegalArgumentException("Selected DB : "+dbname+" is not available in Environment : "+environment);
		}
		else
			throw new IllegalArgumentException("Selected DB : "+dbname+" is not configured");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return dbDetails;
	}

}
