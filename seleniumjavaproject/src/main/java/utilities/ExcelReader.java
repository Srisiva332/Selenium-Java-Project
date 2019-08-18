package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
	
	private FileInputStream fis = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private Iterator<Row> rows = null;
	
	public ExcelReader(String filePath) throws IOException
	{
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		fis.close();
	}
	
	private int getTestDataColumnIndex(String columnName)
	{
		int ColumnIndex=0;
		
		rows = sheet.iterator();
		Row row = rows.next();
		Iterator<Cell> column = row.cellIterator();
	
		//To get the "Testcase" column in the excel.
		int count =0;
		while (column.hasNext())
		{
			Cell value = column.next();
			if(value.getStringCellValue().trim().equalsIgnoreCase(columnName.trim()))
				ColumnIndex=count;
			count++;	
		}
		return ColumnIndex;
	}
	
	private String convertCellValue(Cell cell)
	{
		try {
			if(cell.getCellType() == CellType.STRING)
				return cell.getStringCellValue();
			else if(cell.getCellType() == CellType.NUMERIC)
			{
				String cellValue =  String.valueOf(cell.getNumericCellValue());
				if(HSSFDateUtil.isCellDateFormatted(cell))
				{
					DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					Date date = cell.getDateCellValue();
					cellValue = df.format(date);
				}
				return cellValue;
			}
			else if(cell.getCellType() == CellType.BLANK)
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "Failed to get the text from cell";
		}
	}
		
	public ArrayList<String> getTestcaseDataToArrayList(String sheetName,String testCaseName)
	{		
		ArrayList<String> testData = new ArrayList<String>();
		try	
		{
			sheet = workbook.getSheet(sheetName);
			int testCaseColumnIndex = getTestDataColumnIndex("TestCase");

			//Once column is identified then scan entire testcase column to identify required testcase data.
			while(rows.hasNext())
			{
				Row r = rows.next();
				if(r.getCell(testCaseColumnIndex).getStringCellValue().equalsIgnoreCase(testCaseName))
				{
					Iterator<Cell> cellValue = r.cellIterator();
					while(cellValue.hasNext())
					{
						testData.add(convertCellValue(cellValue.next()));
					}
				}
			}
		}
		catch(Exception e)	{
			e.printStackTrace();	
		}
		return testData;
	}
	
	public String getCellData(String sheetName,String testCaseName,String columnName)
	{
		String columnValue = null;
		Cell cellValue = null;
		try {
			sheet = workbook.getSheet(sheetName);
			int testCaseColumnIndex = getTestDataColumnIndex("TestCase");
			int columnIndex = getTestDataColumnIndex(columnName);
			
			while(rows.hasNext())
			{
				Row r = rows.next();
				if(r.getCell(testCaseColumnIndex).getStringCellValue().equalsIgnoreCase(testCaseName))
				{
					cellValue = r.getCell(columnIndex);
				}
			}
			columnValue = convertCellValue(cellValue);
			return columnValue;
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Test Case Name : " +testCaseName+"Column Name : " +columnName+ "does not exist in Excel";
		}
	}
}
