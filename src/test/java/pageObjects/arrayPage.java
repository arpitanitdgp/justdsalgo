package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import stepDefinitions.BaseClass;

public class arrayPage extends BaseClass {

	WebDriver driver;
	ConfigFileReader configFileReader;

	By getStartedBtn = By.xpath("//div/a[@href= 'array']");
	By arraysInPythonLink = By.xpath("//a[@href='arrays-in-python']");
	By tryHere = By.xpath("//a[@href='/tryEditor']");
	By practiceQues = By.xpath("//a[contains(text(),'Practice Questions')]");
	By searchArray = By.xpath("//a[contains(text(),'Search the array')]");
	By textEditor = By.xpath("//textarea[@tabindex='0']");

	public arrayPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	public void clickGetStartedBtn() {
		Helper.webClick(driver.findElement(getStartedBtn));
	}

	public void clickarrayInPythonLink() {
		driver.findElement(arraysInPythonLink).click();
	}

	public void clickTryHereBtn() {
		driver.findElement(tryHere).click();
	}

	public void clickPracticeQuestions() {
		driver.findElement(practiceQues).click();
		Helper.webClick(driver.findElement(searchArray));
	}
}