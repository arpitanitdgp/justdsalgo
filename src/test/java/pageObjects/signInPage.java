package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import stepDefinitions.BaseClass;

public class signInPage extends BaseClass {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public signInPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	By signInLink = By.xpath("//a[contains(text(), 'Sign in')]");
	By loginBtn = By.xpath("//input[@type='submit' and @value='Login']");
	By errorMsg = By.xpath("//div[contains(text(),'Invalid Username and Password')]");
	By loggedInMsg = By.xpath("//div[contains(text(), 'You are logged in')]");
	By usernameField = By.xpath("//input[@id='id_username']");
	By passwdField = By.xpath("//input[@id='id_password']");

	public void clickSignInLink() {
		Helper.webClick(driver.findElement(signInLink));
	}

	public void clickLoginBtn() {
		Helper.webClick(driver.findElement(loginBtn));
	}
	
	public String getErrorMsg() {
		return driver.findElement(errorMsg).getText();
	}
	
	public String getLoggedInMsg() {
		return driver.findElement(loggedInMsg).getText();
	}
	
	public void doLogin(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwdField).sendKeys(password);

	}

}