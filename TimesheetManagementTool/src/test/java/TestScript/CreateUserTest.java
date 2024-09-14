package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import GenericLib.WorkLib;
import Pompages.CreateNewUserPage;
import Pompages.HomePage;
import Pompages.LoginPage;
import Pompages.UserListPage;

public class CreateUserTest extends BaseTest {
	
	@Test
	public void createUser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//login
		Flib lib = new Flib();
		WorkLib w = new WorkLib();
		String username = lib.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 1);
		String newUserName = lib.getDataFromExcelFile(EXCEL_PATH, USER_DATA, 1, 0)+w.getRandomNo();
		String newpassword = lib.getDataFromExcelFile(EXCEL_PATH, USER_DATA, 1, 1)+w.getRandomNo();
		String fn = lib.getDataFromExcelFile(EXCEL_PATH, USER_DATA, 1, 2)+w.getRandomNo();
		String ln = lib.getDataFromExcelFile(EXCEL_PATH, USER_DATA, 1, 3)+w.getRandomNo();
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		
		//click on user link
		HomePage hp = new HomePage(driver);
		hp.clickOnUserLink();
		
		//click on createNewUser button
		UserListPage ulp = new UserListPage(driver);
		ulp.clickOnCreateNewUserButton();
		
		//create user
		CreateNewUserPage cnup = new CreateNewUserPage(driver);
		cnup.createUser(newUserName,newpassword,fn,ln);
		
	}

}
