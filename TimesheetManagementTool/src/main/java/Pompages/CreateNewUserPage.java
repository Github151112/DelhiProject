package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

public class CreateNewUserPage extends BaseClass {

	public CreateNewUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//idenify create new user button
	@FindBy(name = "username")
	private WebElement newUserNameTextField;
	
	@FindBy(name = "passwordText")
	private WebElement newPasswordTextField;
	
	@FindBy(name = "passwordTextRetype")
	private WebElement retypePassword;
	
	@FindBy(name = "firstName")
	private WebElement fnTextField;
	
	public WebElement getNewUserNameTextField() {
		return newUserNameTextField;
	}

	public WebElement getNewPasswordTextField() {
		return newPasswordTextField;
	}

	public WebElement getRetypePassword() {
		return retypePassword;
	}

	public WebElement getFnTextField() {
		return fnTextField;
	}

	public WebElement getLnTextField() {
		return lnTextField;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	@FindBy(name = "lastName")
	private WebElement lnTextField;
	
	@FindBy(xpath = "//input[contains(@value,'Create User')]")
	private WebElement createUserButton;
	
	
	public void createUser(String username,String password,String fn,String ln) throws InterruptedException
	{
		newUserNameTextField.sendKeys(username);
		Thread.sleep(2000);
		newPasswordTextField.sendKeys(password);
		Thread.sleep(2000);
		retypePassword.sendKeys(password);
		Thread.sleep(2000);
		fnTextField.sendKeys(fn);
		Thread.sleep(2000);
		lnTextField.sendKeys(ln);
		Thread.sleep(2000);
		createUserButton.click();
	}
	

}
