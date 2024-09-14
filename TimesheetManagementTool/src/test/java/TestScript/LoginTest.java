package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import Pompages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void login() throws EncryptedDocumentException, IOException {
		Flib lib = new Flib();
		String username = lib.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);

	}

}
