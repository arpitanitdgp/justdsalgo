package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Utilities.Helper;
import fileReader.ConfigFileReader;
import stepDefinitions.BaseClass;

public class stackPage extends BaseClass {

	WebDriver driver;
	ConfigFileReader configFileReader;

	By getStartedBtn = By.xpath("//div/a[@href= 'stack']");
	By operationStack = By.xpath("//a[@href='operations-in-stack']");
	By implementStack = By.xpath("//a[@href='implementation']");
	By applicationsStack = By.xpath("//a[@href='stack-applications']");
	By practiceQuesLink = By.xpath("//a[@href='/stack/practice']");

	public stackPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	public void clickGetStartedBtn() {
		Helper.webClick(driver.findElement(getStartedBtn));
	}

	public void clickOperationsStackLink() {
		driver.findElement(operationStack).click();
	}

	public void clickImplementationLink() {
		driver.findElement(implementStack).click();
	}

	public void clickApplicationsLink() {
		driver.findElement(applicationsStack).click();
	}
	
	public void clickPracticeQues() {
		driver.findElement(practiceQuesLink).click();
	}
	
}