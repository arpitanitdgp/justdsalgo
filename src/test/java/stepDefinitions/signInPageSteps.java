package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.*;

import Utilities.ExcelReader;
import Utilities.Helper;
import fileReader.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.signInPage;

public class signInPageSteps extends BaseClass {

	ConfigFileReader configFileReader = new ConfigFileReader();;
	private static Logger demoLogger = LogManager.getLogger(signInPageSteps.class.getName());
	String message;
	String username;
	String password;

	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		homePage = new HomePage(Helper.getDriver());
		Helper.openPage(configFileReader.getHomePageUrl());
		loginPage = new signInPage(Helper.getDriver());
		loginPage.clickSignInLink();
		demoLogger.info("User is on Sign In Page");
	}

// User read both invalid and valid data from excel

	@When("^The user enter sheet \"([^\"]*)\" and (\\d+)$")

	public void the_user_enter_sheet_and(String sheetname, Integer rownumber)

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

		message = testdata.get(rownumber).get("expectedmessage");

		demoLogger.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		if (username != null || password != null)

			loginPage.doLogin(username, password);

	}

	@And("click login button")
	public void click_login_button() {

		demoLogger.info("User clicks on login button");

		demoLogger.info("Expected Message - Excel Sheet :  " + message);

		loginPage.clickLoginBtn();

	}

	// User get an error message when login with invalid data and login successfully
	// for valid data

	@Then("User get error message")
	public void validateMessage() {
		String msg = loginPage.getErrorMsg();
		demoLogger.info("Actual Message :  " + msg);
		assertEquals(msg, message);

	}

	@Then("User get logged in message")
	public void validateLoggedInMsg() {
		String msg = loginPage.getLoggedInMsg();
		demoLogger.info("Actual Message :  " + msg);
		assertEquals(msg, message);
	}
}