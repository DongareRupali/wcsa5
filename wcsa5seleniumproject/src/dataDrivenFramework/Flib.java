package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib
             {
	        // to store generic reusable methods
			// all the methods are non static
			// it is used to read the data from excel sheet

	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the path of file
		Workbook wb = WorkbookFactory.create(fis); //make the file for read./data/ActiTimeTestData.xlsx","invalidcreds", i, 0./data/ActiTimeTestData.xlsx","invalidcreds", i, 0y to read
		 Sheet sheet = wb.getSheet("IPL");// get into sheet
		 sheet.createRow(0);
		 Row row = sheet.createRow(12);// get into the desired row
		 //create a cell by using Row interface
		 
		 Cell cell = row.createCell(0);//get into desired cell or column
		 String data = cell.getStringCellValue();// to read the value from cell
		 return data;
     }
             
             
	// It is use to get last count of row where we store data
    
	public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);// provide the path of the file
		Workbook wb = WorkbookFactory.create(fis);// make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
		
	}
	// it is use to write the data in excel sheet
	
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellcount,String data) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis=new FileInputStream(excelPath);// provide the path of the file
	Workbook wb = WorkbookFactory.create(fis);// make the file ready to read
	Sheet sheet = wb.getSheet(sheetName);
	Row row = sheet.getRow(rowCount);
	Cell cell= row.createCell(cellcount);
	cell.setCellValue(data);
	
	FileOutputStream fos = new FileOutputStream(excelPath);
	wb.write(fos);	
	
	}
            
 }

