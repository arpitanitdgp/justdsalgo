package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import stepDefinitions.BaseClass;

public class queuePage extends BaseClass {

	WebDriver driver;
	ConfigFileReader configFileReader;

	By getStartedBtn = By.xpath("//div/a[@href='queue']");
	By implementQueue = By.xpath("//a[@href='implementation-lists']");
	By implementCollections = By.xpath("//a[@href='implementation-collections']");
	By implementArray = By.xpath("//a[@href='Implementation-array']");
	By queueOperations = By.xpath("//a[@href='QueueOp']");
	By practiceQuesLink = By.xpath("//a[@href='/queue/practice']");

	public queuePage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	public void clickGetStartedBtn() {
		Helper.webClick(driver.findElement(getStartedBtn));
	}

	public void clickImplementationOfQueueLink() {
		driver.findElement(implementQueue).click();
	}

	public void clickImplementationOfCollectionsLink() {
		driver.findElement(implementCollections).click();
	}
	
	public void clickImplementationUsingArray() {
		driver.findElement(implementArray).click();
	}
	
	public void clickQueueOperations() {
		driver.findElement(queueOperations).click();
	}
	
	public void clickPracticeQuestionsForQueues() {
		driver.findElement(practiceQuesLink).click();
	}
}