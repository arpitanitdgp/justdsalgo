package pageObjects;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import stepDefinitions.BaseClass;

public class HomePage extends BaseClass {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public HomePage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	By dataStructureDropDwn = By.xpath("//a[contains(text(), 'Data Structures')]");
	By getStartedButton = By.xpath("//a[contains(@href, 'data-structures-introduction')]");
	By errorMessage = By.xpath("//div[contains(text(), 'You are not logged in')]");
	By navDropDwn = By.xpath("//div[@class='nav-item dropdown']/a");
	By arrayLink = By.xpath("//div[@class='dropdown-menu show']/a[1]");
	By registerLink = By.xpath("//div[@class ='navbar-nav']/ul/a[contains(text(),'Register')]");
	By signInLink = By.xpath("//div[@class ='navbar-nav']/ul/a[contains(text(),'Sign in')]");
	By signOutLink = By.xpath("//div[@class ='navbar-nav']/ul/a[contains(text(),'Sign out')]");

	public boolean isDropdownDisplayed() {
		return driver.findElement(dataStructureDropDwn).isDisplayed();
	}

	public void getStartedButtonClick(String getStartedBtn) {
		String getBtn = driver.findElement(getStartedButton).getText();
		assertEquals(getBtn, getStartedBtn);
		Helper.webClick(driver.findElement(getStartedButton));
	}

	public void selectDropdownOption() {
		driver.findElement(navDropDwn).click();
		driver.findElement(arrayLink).click();
	}

	public String verifyErrorMessage() {
		return driver.findElement(errorMessage).getText();
	}

	public String clickRegisterBtn() {
		driver.findElement(registerLink).click();
		return driver.findElement(registerLink).getText();

	}

	public String clickSignInBtn() {
		driver.findElement(signInLink).click();
		return driver.findElement(signInLink).getText();

	}

	@SuppressWarnings("deprecation")
	public String verifyPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver.getCurrentUrl();
	}
	
	public void clickSignout() {
		driver.findElement(signOutLink).click();
	}
	

}