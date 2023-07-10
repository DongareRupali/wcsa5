package readExelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//write the data in excel sheet
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the path of file
		Workbook wb = WorkbookFactory.create(fis); //make the file for ready to read
		 Sheet sheet = wb.getSheet("IPL");// get into sheet
		 sheet.createRow(0);
		 Row row = sheet.createRow(12);// get into the desired row
		 //create a cell by using Row interface
		 
		 Cell cell = row.createCell(0);//get into desired cell or column
		 //write the data into cell
		 cell.setCellValue("Pune");
		 
		 FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		 wb.write(fos);

	}

		
	}


