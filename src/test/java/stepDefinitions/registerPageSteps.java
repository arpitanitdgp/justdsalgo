package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Utilities.ExcelReader;
import Utilities.Helper;
import fileReader.ConfigFileReader;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.registerPage;

public class registerPageSteps extends BaseClass {
	ConfigFileReader configFileReader = new ConfigFileReader();;
	private static Logger demoLogger = LogManager.getLogger(signInPageSteps.class.getName());

	String message;
	String username;
	String password;
	String confirmPassword;
	String uniqueUsrname;

	@Given("New user is on Register page")
	public void new_user_is_on_register_page() {
		homePage = new HomePage(Helper.getDriver());
		Helper.openPage(configFileReader.getHomePageUrl());
		regPage = new registerPage(Helper.getDriver());
		homePage.clickRegisterBtn();
		demoLogger.info("User is on Register Page");
	}

	@And("User click on register button")
	public void user_click_on_register_button() {
		regPage.clickRegisterBtn();
	}

	@Then("User should land on Register page")
	public void user_should_land_on_Register_page() {
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getRegisterPageUrl());

	}

	@When("^User enters username \"([^\"]*)\" and password (\\d+) both as blank$")
	public void user_click_on_register_button_with_username_and_password_as_blank(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = null;
		try {
			testdata = reader.getData(
					"/Users/praveenkumarsharma/eclipse-workspace/justdsalgo/src/test/resources/Exceldata/register.xlsx",
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

		confirmPassword = testdata.get(rownumber).get("confirmpassword");

		message = testdata.get(rownumber).get("expectedmessage");

		demoLogger.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		if (username == null) {
			regPage.loginPass(password);

		} else if (password == null) {
			regPage.loginUsrname(username);

		} else if (username != null && password != null) {
			regPage.login(username, password);
		}

	}

	@Then("User should get error message for blank field")
	public void user_should_get_error_message_for_blank_field() {
		if (username == null) {
			assertTrue(message.contains(regPage.verifyUsernameValidationMessage()));
		} else if (password == null) {
			assertTrue(message.contains(regPage.verifyPasswordValidationMessage()));

		} else if (username != null && password != null && confirmPassword == null) {
			assertEquals(message, regPage.verifyConfirmPasswordValidationMessage());
		}

	}

	@Then("User should get mismatch error message")
	public void user_should_get_mismatch_error_message() {
		assertEquals(message.trim(), regPage.verifyMismatchValidationMessage().trim());
	}

	@When("^User enter username \"([^\"]*)\" and password (\\d+) but confirm password as blank$")
	public void user_enter_username_and_password_but_confirm_password_as_blank(String sheetname, Integer rownumber)

			throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = null;
		try {
			testdata = reader.getData(
					"/Users/praveenkumarsharma/eclipse-workspace/justdsalgo/src/test/resources/Exceldata/register.xlsx",
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

		confirmPassword = testdata.get(rownumber).get("confirmpassword");

		message = testdata.get(rownumber).get("expectedmessage");

		demoLogger.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		if (username == null) {
			regPage.loginPass(password);

		} else if (password == null) {
			regPage.loginUsrname(username);

		} else if (username != null && password != null && confirmPassword == null) {
			regPage.login(username, password);

		}
	}

	@When("^User enter username \"([^\"]*)\" and password (\\d+) less than 8 chars$")
	public void user_enter_username_and_password_less_than_8_chars(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = null;
		try {
			testdata = reader.getData(
					"/Users/praveenkumarsharma/eclipse-workspace/justdsalgo/src/test/resources/Exceldata/register.xlsx",
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
		confirmPassword = testdata.get(rownumber).get("confirmpassword");
		message = testdata.get(rownumber).get("expectedmessage");

		demoLogger.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		regPage.loginUsrPass(username, password, confirmPassword);

	}

	@When("^User enter username \"([^\"]*)\" and password (\\d+) as blank$")
	public void user_enter_username_and_password_as_blank(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = null;
		try {
			testdata = reader.getData(
					"/Users/praveenkumarsharma/eclipse-workspace/justdsalgo/src/test/resources/Exceldata/register.xlsx",
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

		message = testdata.get(rownumber).get("expectedmessage");

		demoLogger.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		if (username == null) {
			regPage.loginPass(password);
			regPage.clickRegisterBtn();

		} else if (password == null) {
			regPage.loginUsrname(username);

		} else if (username != null && password != null) {
			regPage.login(username, password);

		}

	}

	@When("^User enter username \"([^\"]*)\" and password (\\d+) with numeric value only$")
	public void user_enter_username_and_password_with_numeric_value_only(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = null;
		try {
			testdata = reader.getData(
					"/Users/praveenkumarsharma/eclipse-workspace/justdsalgo/src/test/resources/Exceldata/register.xlsx",
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

		confirmPassword = testdata.get(rownumber).get("confirmpassword");

		message = testdata.get(rownumber).get("expectedmessage");

		demoLogger.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		regPage.loginUsrPass(username, password.substring(1, password.length() - 1),
				password.substring(1, password.length() - 1));

	}

	@When("^User enter username \"([^\"]*)\" as blank and password (\\d+) with valid value$")
	public void user_enter_username_as_blank_and_password_with_valid_value_only(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = null;
		try {
			testdata = reader.getData(
					"/Users/praveenkumarsharma/eclipse-workspace/justdsalgo/src/test/resources/Exceldata/register.xlsx",
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

		confirmPassword = testdata.get(rownumber).get("confirmpassword");

		message = testdata.get(rownumber).get("expectedmessage");

		demoLogger.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		regPage.loginPassConfirmPass(password, confirmPassword);

	}

	@When("^User enter username \"([^\"]*)\" and different password (\\d+) and confirm password$")
	public void user_enter_username_and_different_password_and_confirm_password(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = null;
		try {
			testdata = reader.getData(
					"/Users/praveenkumarsharma/eclipse-workspace/justdsalgo/src/test/resources/Exceldata/register.xlsx",
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

		confirmPassword = testdata.get(rownumber).get("confirmpassword");

		message = testdata.get(rownumber).get("expectedmessage");

		demoLogger.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		regPage.loginUsrPass(username, password, confirmPassword);

	}

	@When("^User enter valid username \"([^\"]*)\" and password (\\d+) and confirm password$")
	public void user_enter_valid_username_and_different_password_and_confirm_password(String sheetname,
			Integer rownumber) throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = null;
		try {
			testdata = reader.getData(
					"/Users/praveenkumarsharma/eclipse-workspace/justdsalgo/src/test/resources/Exceldata/register.xlsx",
					sheetname);
		} catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		password = testdata.get(rownumber).get("password");
		confirmPassword = testdata.get(rownumber).get("confirmpassword");
		message = testdata.get(rownumber).get("expectedmessage");

		demoLogger.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		uniqueUsrname = "NumpyNinjaUser" + Integer.toString(((new Random().nextInt(10)) + 1));
		regPage.loginUsrPass(uniqueUsrname, password.trim(), confirmPassword.trim());

	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		assertEquals(message + uniqueUsrname, regPage.verifyLoggedInMsg());
	}

}