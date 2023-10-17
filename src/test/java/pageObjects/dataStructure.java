package pageObjects;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import Utilities.Helper;
import fileReader.ConfigFileReader;
import stepDefinitions.BaseClass;

public class dataStructure extends BaseClass {

	WebDriver driver;
	ConfigFileReader configFileReader;

	public dataStructure(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	By getStartedBtn = By.xpath("//div/a[@href= 'data-structures-introduction']");
	By timeComplexity = By.xpath("//div/ul/a[@href='time-complexity']");
	By tryHere = By.xpath("//a[@href='/tryEditor']");
	By runBtn = By.xpath("//button[@onclick=\"runit()\"]");
	By textEditor = By.xpath("//*[@id='answer_form']//textarea[@tabindex='0']");
	By answerId = By.xpath("//*[@id='output']");
	By practiceQues = By.xpath("//a[contains(text(),'Practice Questions')]");

	public void clickGetStartedBtn() {
		Helper.webClick(driver.findElement(getStartedBtn));
	}

	public void clickTimeComplexity() {
		driver.findElement(timeComplexity).click();
	}

	public void clickTryHere() {
		Helper.webClick(driver.findElement(tryHere));
	}

	public String verifyTryEditorPage() {
		assertTrue(driver.findElement(runBtn).isDisplayed());
		return driver.getCurrentUrl();
	}

	public void enterPythonCode(String pythoncode) {
		try {
			enterCodePractice(pythoncode, driver.findElement(textEditor));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(runBtn).click();
	}

	public void enterCodePractice(String pythoncode, WebElement element) throws InterruptedException {
		// new
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).perform();
		String[] str1 = pythoncode.split("\n");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				element.sendKeys(Keys.BACK_SPACE);
			} else {
				element.sendKeys(str1[i]);
				element.sendKeys(Keys.ENTER);
			}
		}

	}

	public String verifyEditorErrorMessage() {
		String message = driver.switchTo().alert().getText();
		return message;
	}

	public void clickOkAlertWindow() {
		driver.switchTo().alert().accept();
	}

	public String getCodeExecuteResult() {
		return driver.findElement(answerId).getText();
	}

	public void clickPracticeQuestions() {
		Helper.webClick(driver.findElement(practiceQues));
	}

	public String verifyPracticeQuesPage() {
		return driver.getCurrentUrl();
	}
}