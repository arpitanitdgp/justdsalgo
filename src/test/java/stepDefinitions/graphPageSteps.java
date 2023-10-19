package stepDefinitions;

import static org.testng.Assert.assertEquals;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.graphPage;

public class graphPageSteps extends BaseClass {

	ConfigFileReader configFileReader = new ConfigFileReader();
	@When("User click Get Started button for the graph card")
	public void user_click_get_started_button_for_graph_card() {
		graphPg = new graphPage(Helper.getDriver());
		graphPg.clickGetStartedBtn();
	}

	@Then("User should redirected to graph page")
	public void user_should_redirected_to_graph_page() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getGraphPageUrl());
	}

	@When("User click graph link")
	public void user_click_graph_link() {
		graphPg.clickGraphLink();
	}

	@When("User click graph representations link")
	public void user_click_graph_representations_link() {
		graphPg.clickGraphRepresentationLink();
	}

	@Then("User validates the graph practice ques title")
	public void user_validates_the_graph_practice_ques_title() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getGraphPracticeQuesPageUrl());
	}

	@Then("User click graph practice questions link")
	public void user_click_graph_practice_questions_link() {
		graphPg.clickGraphPracticeQues();
	}
}
	
