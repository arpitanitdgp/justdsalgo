package stepDefinitions;

import static org.testng.Assert.assertEquals;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.listPage;

public class listPageSteps extends BaseClass {

	ConfigFileReader configFileReader = new ConfigFileReader();;

	@When("User click Get Started button for the list card")
	public void user_click_get_started_button_for_list_card() {
		listPg = new listPage(Helper.getDriver());
		listPg.clickGetStartedBtn();
	}

	@Then("User should redirected to linked list page")
	public void user_should_redirected_to_linked_list_page() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getlinkedlistPageUrl());
	}

	@When("User click introduction link")
	public void user_click_introduction_link() {
		listPg.clickIntroductionLink();
	}

	@When("User click creating link list link")
	public void user_click_creating_link_list_link() {
		listPg.clickCreateLinkedList();
	}

	@When("User click types of linked list link")
	public void user_click_types_of_linked_list_link() {
		listPg.clickTypesOfLinkedList();
	}

	@When("User click implement linked list in python link")
	public void user_click_implement_linked_list_in_python_link() {
		listPg.clickImplementLinkedList();
	}

	@When("User click traversal link")
	public void user_click_traversal_link() {
		listPg.clickTraversalLink();
	}

	@When("User click insertion link")
	public void user_click_insertion_link() {
		listPg.clickInsertionLink();
	}

	@When("User click deletion link")
	public void user_click_deletion_link() {
		listPg.clickDeletionLink();
	}

	@Then("User click practice questions link")
	public void user_click_practice_questions_link() {
		listPg = new listPage(Helper.getDriver());
		listPg.clickPracticeQues();
	}

	@Then("User validates the title")
	public void user_validates_the_title() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getListPracticeQuesPageUrl());
	}
}