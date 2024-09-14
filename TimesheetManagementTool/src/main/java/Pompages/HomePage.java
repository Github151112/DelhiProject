package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//idenitfy user link
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement userLink;

	public WebElement getUserLink() {
		return userLink;
	}

}
