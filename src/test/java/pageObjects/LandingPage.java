package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import stepDefinitions.BaseClass;

public class LandingPage extends BaseClass {

	WebDriver driver;
	ConfigFileReader configFileReader;

	public LandingPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	By getStarted = By.xpath("//button[contains(text(),'Get Started')]");
	By homePageTitle = By.xpath("//a[contains(text(), 'NumpyNinja')]");

	public void ClickGetStartedBtn() {
		Helper.webClick(driver.findElement(getStarted));
	}

	public String getLandingPgTitle() {
		return driver.getTitle();
	}

	public boolean isButtonDisplayed() {
		return driver.findElement(getStarted).isDisplayed();
	}

	public String getHomePageTitle() {
		return driver.findElement(homePageTitle).getText();
	}

}