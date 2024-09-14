package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//identify the username text field
	@FindBy(name = "username")
	private WebElement usernameTextField;
	
	//identify the password
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	//idenify the login button
	@FindBy(id = "loginButton")
	private WebElement loginButton;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	public void login(String username, String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loginButton.click();
	}
	
	public void invalidLogin(String username, String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loginButton.click();
		usernameTextField.clear();
	}
	
	

	
	
	
	
}
