package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import stepDefinitions.BaseClass;

public class graphPage extends BaseClass {
	
	WebDriver driver;
	ConfigFileReader configFileReader;

	By getStartedBtn = By.xpath("//div/a[@href='graph']");
	By graphLink = By.xpath("//a[@href='graph']");
	By graphRepLink = By.xpath("//a[@href='graph-representations']");
	By practiceQuesLink = By.xpath("//a[@href='/graph/practice']");

	public graphPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	public void clickGetStartedBtn() {
		Helper.webClick(driver.findElement(getStartedBtn));
	}
	
	public void clickGraphLink() {
		driver.findElement(graphLink).click();
	}
	
	public void clickGraphRepresentationLink() {
		driver.findElement(graphRepLink).click();
	}
	
	public void clickGraphPracticeQues() {
		driver.findElement(practiceQuesLink).click();
	}

}