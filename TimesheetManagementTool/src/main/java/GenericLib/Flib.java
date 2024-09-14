package GenericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String getDataFromPropertyFile(String path,String key) throws IOException
	{
		FileInputStream f= new FileInputStream(path);
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(key);
	}
	
	public String getDataFromExcelFile(String path,String sheetName, int rowNo, int CellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(f);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(CellNo);
		return cell.getStringCellValue();
		
	}
	
	
	
}
