package implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginImpl {

	public static WebDriver driver;

	public LoginImpl() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement loginbutton;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}

}
