package stepDefinitions;

import static org.testng.Assert.assertEquals;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.arrayPage;
import pageObjects.dataStructure;

public class arrayPageSteps extends BaseClass {
	ConfigFileReader configFileReader = new ConfigFileReader();;

	@When("User click Get Started button for Array card")
	public void user_click_get_started_button_array_card() {
		arryPage = new arrayPage(Helper.getDriver());
		arryPage.clickGetStartedBtn();
	}

	@Then("User should redirected to Array page")
	public void user_should_redirected_to_array_pag() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getArrayPageUrl());
	}

	@When("User click arrays in python link")
	public void user_click_arrays_in_python_link() {
		arryPage.clickarrayInPythonLink();
		dsPage = new dataStructure(Helper.getDriver());
	}

	@And("User click Try Here button")
	public void user_click_try_here_button() {
		arryPage = new arrayPage(Helper.getDriver());
		arryPage.clickTryHereBtn();
	}

	@Then("User navigate to practice search the array question")
	public void user_practice_search_the_array_question() {
		arryPage.clickPracticeQuestions();
	}

}