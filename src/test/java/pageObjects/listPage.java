package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import stepDefinitions.BaseClass;

public class listPage extends BaseClass {

	WebDriver driver;
	ConfigFileReader configFileReader;

	By getStartedBtn = By.xpath("//div/a[@href= 'linked-list']");
	By introduction = By.xpath("//a[@href='introduction']");
	By createLinkedList = By.xpath("//a[@href='creating-linked-list']");
	By typesOfList = By.xpath("//a[@href='types-of-linked-list']");
	By implementList = By.xpath("//a[@href='implement-linked-list-in-python']");
	By traverseList = By.xpath("//a[@href='traversal']");
	By insertionList = By.xpath("//a[@href='insertion-in-linked-list']");
	By deletionList = By.xpath("//a[@href='deletion-in-linked-list']");
	By practiceQuesLink = By.xpath("//a[@href='/linked-list/practice']");

	public listPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	public void clickGetStartedBtn() {
		Helper.webClick(driver.findElement(getStartedBtn));
	}

	public void clickIntroductionLink() {
		driver.findElement(introduction).click();
	}

	public void clickCreateLinkedList() {
		driver.findElement(createLinkedList).click();
	}

	public void clickTypesOfLinkedList() {
		driver.findElement(typesOfList).click();
	}

	public void clickImplementLinkedList() {
		driver.findElement(implementList).click();
	}

	public void clickTraversalLink() {
		driver.findElement(traverseList).click();
	}

	public void clickInsertionLink() {
		driver.findElement(insertionList).click();
	}

	public void clickDeletionLink() {
		driver.findElement(deletionList).click();
	}

	public void clickPracticeQues() {
		driver.findElement(practiceQuesLink).click();
	}

}