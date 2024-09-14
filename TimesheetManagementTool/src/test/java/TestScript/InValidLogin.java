package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import Pompages.LoginPage;

public class InValidLogin extends BaseTest {
	
	
	@Test
	public void invalidLogin() throws EncryptedDocumentException, IOException
	{
		Flib lib = new Flib();
		int row = lib.getRowCount(EXCEL_PATH, INVALID_SHEET);
		
		for(int i=1;i<row;i++)
		{
			String username = lib.getDataFromExcelFile(EXCEL_PATH, INVALID_SHEET, i, 0);
			String password = lib.getDataFromExcelFile(EXCEL_PATH, INVALID_SHEET, i, 1);
			LoginPage lp = new LoginPage(driver);
			lp.invalidLogin(username, password);
			
		}
	}

}
