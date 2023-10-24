package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import stepDefinitions.BaseClass;

public class registerPage extends BaseClass {

	WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	public registerPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	By registerBtn = By.xpath("//input[@type='submit' and @value='Register']");
	By username = By.name("username");
	By password = By.name("password1");
	By confirmPassword = By.name("password2");
	By mismatchPasswdAlert = By.xpath("//div[@class='alert alert-primary']");
	By loggedInMsg = By.xpath("//div[@class= 'alert alert-primary']");


	public void clickRegisterBtn() {
		Helper.webClick(driver.findElement(registerBtn));
	}

	public String verifyUsernameValidationMessage() {
		String message = driver.findElement(username).getAttribute("validationMessage");
		return message;
	}

	public String verifyPasswordValidationMessage() {
		String message = driver.findElement(password).getAttribute("validationMessage");
		return message;
	}

	public String verifyConfirmPasswordValidationMessage() {
		String message = driver.findElement(confirmPassword).getAttribute("validationMessage");
		return message;
	}
	
	public String verifyMismatchValidationMessage() {
		String message = driver.findElement(mismatchPasswdAlert).getText();
		return message;
	}
	
	public String verifyLoggedInMsg() {
		return driver.findElement(loggedInMsg).getText();
	}

	public void loginUsrname(String usrname) {
		driver.findElement(username).sendKeys(usrname);
	}

	public void loginPass(String passwd) {
		driver.findElement(password).sendKeys(passwd);
	}

	public void login(String usrname, String passwd) {
		driver.findElement(username).sendKeys(usrname);
		driver.findElement(password).sendKeys(passwd);
	}
	
	public void loginPassConfirmPass(String passwd, String confirmPass) {
		driver.findElement(password).sendKeys(passwd);
		driver.findElement(confirmPassword).sendKeys(confirmPass);
	}

	
	public void loginUsrPass(String usrname, String passwd, String confirmPass) {
		driver.findElement(username).sendKeys(usrname);
		driver.findElement(password).sendKeys(passwd);
		driver.findElement(confirmPassword).sendKeys(confirmPass);
	}

}