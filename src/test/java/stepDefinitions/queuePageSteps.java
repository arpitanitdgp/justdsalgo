package stepDefinitions;

import static org.testng.Assert.assertEquals;
import Utilities.Helper;
import fileReader.ConfigFileReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.queuePage;

public class queuePageSteps extends BaseClass {
	
	ConfigFileReader configFileReader = new ConfigFileReader();;

	@When("User click Get Started button for the queue card")
	public void user_click_get_started_button_for_queue_card() {
		queuePg = new queuePage(Helper.getDriver());
		queuePg.clickGetStartedBtn();
	}
	
	@Then("User should redirected to queue page")
	public void user_should_redirected_to_queue_page() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getQueuePageUrl());
	}
	
	@When("User click implementation of queue in python link")
	public void user_click_implementation_of_queue_in_python_link() {
		queuePg.clickImplementationOfQueueLink();
	}
	
	@When("User click implementation using collections link")
	public void user_click_implementation_using_collections_link() {
		queuePg.clickImplementationOfCollectionsLink();
	}
	
	@When("User click implementation using array link")
	public void user_click_implementation_using_array_link() {
		queuePg.clickImplementationUsingArray();
	}
	
	@When("User click queue operations link")
	public void user_click_queue_operations_link() {
		queuePg.clickQueueOperations();
	}
	
	@Then("User click practice questions link on implementation of queue in python page")
	public void user_click_practice_questions_link_on_implementation_of_queue_in_python_page() {
		queuePg.clickPracticeQuestionsForQueues();
	}
	
	@Then("User validates the queue title")
	public void user_validates_the_queue_title() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getQueuePracticeQuesPageUrl());
	}

}