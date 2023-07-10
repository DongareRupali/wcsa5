ppackage readExelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelPractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//read data from TestDataColours
		// Implementation of read data from excel
		FileInputStream fis = new FileInputStream("./data/TestDataColours.xlsx"); //provide the path of the file
		Workbook wb = WorkbookFactory.create(fis);//make ready to read the file
		Sheet sheet = wb.getSheet("TestDataColours");//to get into the sheet
		Row row = sheet.getRow(3);//get into the sheet
		Cell cell = row.getCell(2);//get into the cell
		String data = cell.getStringCellValue();//read the data from cell
		System.out.println(data);
		


	}

}
