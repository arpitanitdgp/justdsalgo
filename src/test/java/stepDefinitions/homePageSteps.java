package stepDefinitions;
import static org.testng.Assert.assertEquals;

import org.junit.Assert;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class homePageSteps extends BaseClass {
	ConfigFileReader configFileReader = new ConfigFileReader();

	@Given("User is on homepage of DS Algo")
	public void user_is_on_homepage_of_DS_Algo() {
		homePage = new HomePage(Helper.getDriver());
		Helper.openPage(configFileReader.getHomePageUrl());
	}

	@When("^User click on \"([^\"]*)\" for the data structure option without login$")
	public void user_click_on_for_the_data_structure_option_without_login(String getStartedBtn) {
		Assert.assertTrue(homePage.isDropdownDisplayed());
		homePage.getStartedButtonClick(getStartedBtn);
	}

	@Then("^User should get error message \"([^\"]*)\"$")
	public void user_should_get_error_message(String errorMsg) {
		Assert.assertEquals(homePage.verifyErrorMessage(), errorMsg);
	}

	@When("^User click on \"([^\"]*)\" from drop down menu without login$")
	public void user_click_on_from_drop_down_menu_without_login(String arrayLink) {
		homePage.selectDropdownOption();
	}

	@When("^User click on register \"([^\"]*)\" button$")
	public void user_click_on_button(String register) {
		String linkName = homePage.clickRegisterBtn();
		assertEquals(linkName, register);

	}

	@When("^User click on login \"([^\"]*)\" button$")
	public void user_click_on_login_button(String login) {
		String linkName = homePage.clickSignInBtn();
		assertEquals(linkName, "Sign in");

	}

	@Then("User should redirected to Register \"([^\"]*)\" page$")
	public void user_should_redirected_to_Register_page(String register) {
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getRegisterPageUrl());
	}

	@Then("User should redirected to login \"([^\"]*)\" page$")
	public void user_should_redirected_to_login_page(String login) {
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getLoginPageUrl());
	}

	@When("User click signout button")
	public void user_click_signout_button() {
		homePage = new HomePage(Helper.getDriver());
		homePage.clickSignout();
	}

	@Then("User is redirected to home page")
	public void user_is_redirected_to_home_page() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getHomePageUrl());
	}

}