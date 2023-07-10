package readExelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	// read data from IPL sheet...
	
	// implementation of read the data from excel
	
	
	 FileInputStream fis = new FileInputStream("./data/TestData.xlsx");// provide the path of file
	 Workbook wb = WorkbookFactory.create(fis); //make the file for ready to read
	 Sheet sheet = wb.getSheet("IPL");// get into sheet
	 Row row = sheet.getRow(4);// get into the desired row
	 Cell cell = row.getCell(1);//get into desired cell or column
	 String data = cell.getStringCellValue();// read the data from cell
	 System.out.println(data);
	 

	}

}
