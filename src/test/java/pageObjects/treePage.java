package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import stepDefinitions.BaseClass;

public class treePage extends BaseClass {

	WebDriver driver;
	ConfigFileReader configFileReader;

	By getStartedBtn = By.xpath("//div/a[@href='tree']");
	By overviewTree = By.xpath("//a[@href='overview-of-trees']");
	By terminologiesLink = By.xpath("//a[@href='terminologies']");
	By typesOfTrees = By.xpath("//a[@href='tree-traversals']");
	By traversalIllustration = By.xpath("//a[@href='tree-traversals']");
	By binaryTreeLink = By.xpath("//a[@href='binary-trees']");
	By binaryTreeTypesLink = By.xpath("//a[@href='types-of-binary-trees']");
	By implementPythonTree = By.xpath("//a[@href='implementation-in-python']");
	By binaryTreeTraversals = By.xpath("//a[@href='binary-tree-traversals']");
	By implementBinaryTree = By.xpath("//a[@href='implementation-of-binary-trees']");
	By applicationsOfBinaryTree = By.xpath("//a[@href='implementation-of-binary-trees']");
	By binarySearchTree = By.xpath("//a[@href='binary-search-trees']");
	By implementBst= By.xpath("//a[@href='implementation-of-bst']");

	public treePage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	public void clickGetStartedBtn() {
		Helper.webClick(driver.findElement(getStartedBtn));
	}

	public void clickOverviewOfTreesLink() {
		driver.findElement(overviewTree).click();
	}

	public void clickTerminologieslink() {
		driver.findElement(terminologiesLink).click();
	}

	public void clickTypesOfTrees() {
		driver.findElement(typesOfTrees).click();
	}

	public void clickTraversalsIllustration() {
		driver.findElement(traversalIllustration).click();
	}

	public void click_binary_trees_link() {
		driver.findElement(binaryTreeLink).click();
	}

	public void clickTypesOfBinaryTrees() {
		driver.findElement(binaryTreeTypesLink).click();
	}

	public void clickImplementationPythonTrees() {
		driver.findElement(implementPythonTree).click();
	}

	public void clickBinaryTreeTraversals() {
		driver.findElement(binaryTreeTraversals).click();
	}

	public void clickImplementationOfBinaryTree() {
		driver.findElement(implementBinaryTree).click();
	}
	
	public void clickApplicationsOfBinaryTrees() {
		driver.findElement(applicationsOfBinaryTree).click();
	}
	
	public void clickBinarySearchTree() {
		driver.findElement(binarySearchTree).click();
	}
	
	public void clickImplementBstLink() {
		driver.findElement(implementBst).click();
	}

}