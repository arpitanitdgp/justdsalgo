package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import Utilities.ExcelReader;
import Utilities.Helper;
import fileReader.ConfigFileReader;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.dataStructure;

public class dataStructureSteps extends BaseClass {

	ConfigFileReader configFileReader = new ConfigFileReader();;
	private static Logger demoLogger = LogManager.getLogger(dataStructureSteps.class.getName());

	String username;
	String password;
	String pythonCode;
	String result;
	By runBtn = By.xpath("//button[@onclick=\"runit()\"]");
	By textEditor = By.xpath("//div[@class='CodeMirror-scroll']");

	@Then("User click Get Started button for Data Structure Introduction card")
	public void user_click_get_started_button_for_data_structure_introduction_card() {
		dsPage = new dataStructure(Helper.getDriver());
		dsPage.clickGetStartedBtn();
	}

	@Then("User should redirected to Data Structure Introduction page")
	public void user_should_redirected_to_data_structure_introduction_page() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getDSPageUrl());
	}

	@When("User click Try Here button in the Data Structure Introduction page")
	public void user_click_Try_Here_button_in_the_data_structure_introduction_page() {
		dsPage.clickTimeComplexity();
		dsPage.clickTryHere();
	}

	@Then("User should be redirected to try Text Editor page")
	public void user_should_be_redirected_to_try_Text_Editor_page() {
		dsPage = new dataStructure(Helper.getDriver());
		assertEquals(dsPage.verifyTryEditorPage(), configFileReader.getTextEditorPageUrl());
	}

	@When("^User enter invalid python code \"([^\"]*)\" in tryEditor (\\d+) and click run button$")
	public void user_enter_invalid_python_code_in_tryEditor_and_click_run_button(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {

		dsPage = new dataStructure(Helper.getDriver());
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = null;
		try {
			testdata = reader.getData(
					"/Users/praveenkumarsharma/eclipse-workspace/justdsalgo/src/test/resources/Exceldata/login.xlsx",
					sheetname);
		} catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		username = testdata.get(rownumber).get("username");

		password = testdata.get(rownumber).get("password");

		pythonCode = testdata.get(rownumber).get("pythonCode");
		result = testdata.get(rownumber).get("result");

		demoLogger.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		dsPage.enterPythonCode(pythonCode);

	}

	@Then("User should get error message alert window")
	public void user_should_get_error_message_alert_window() {
		assertTrue(dsPage.verifyEditorErrorMessage().contains(result));
		dsPage.clickOkAlertWindow();
	}

	@When("^User enter python code \"([^\"]*)\" in tryEditor (\\d+) and click run button$")
	public void user_enter_valid_python_code_in_tryEditor_and_click_run_button(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = null;
		try {
			testdata = reader.getData(
					"/Users/praveenkumarsharma/eclipse-workspace/justdsalgo/src/test/resources/Exceldata/login.xlsx",
					sheetname);
			System.out.println("hello");
		} catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		username = testdata.get(rownumber).get("username");

		password = testdata.get(rownumber).get("password");

		pythonCode = testdata.get(rownumber).get("pythonCode");
		result = testdata.get(rownumber).get("result");

		demoLogger.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		dsPage = new dataStructure(Helper.getDriver());
		dsPage.enterPythonCode(pythonCode);

	}

	@Then("User should see code executed successfully")
	public void user_should_see_code_executed_successfully() {
		assertEquals(result, dsPage.getCodeExecuteResult());
	}

	@When("User click practice questions tab")
	public void user_click_practice_questions_tab() {
		dsPage.clickTimeComplexity();
		dsPage.clickPracticeQuestions();
	}

	@Then("User should redirected to practice question page")
	public void user_should_redirected_to_practice_question_page() {
		assertEquals(dsPage.verifyPracticeQuesPage(), configFileReader.getpracticeQuesPageUrl());
	}
}