package stepDefinitions;

import static org.testng.Assert.assertEquals;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.stackPage;

public class stackPageSteps extends BaseClass {

	ConfigFileReader configFileReader = new ConfigFileReader();;

	@When("User click Get Started button for the stack card")
	public void user_click_get_started_button_for_stack_card() {
		stackPg = new stackPage(Helper.getDriver());
		stackPg.clickGetStartedBtn();
	}

	@Then("User should redirected to stack page")
	public void user_should_redirected_to_stack_page() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getStackPageUrl());
	}
	
	@When("User click operations in stack link")
	public void user_click_operations_in_stack_link() {
		stackPg.clickOperationsStackLink();
	}
	
	@When("User click implementation link on stack page")
	public void user_click_implementation_link_on_stack_page() {
		stackPg.clickImplementationLink();
	}
	
	@When("User click applications link on stack page")
	public void user_click_applications_link_on_stack_page() {
		stackPg.clickApplicationsLink();
	}
	
	@Then("User click practice questions link on implementation page")
	public void user_click_practice_questions_link_on_implementation_page() {
		stackPg.clickPracticeQues();
	}
	
	@Then("User validates the stack title")
	public void user_validates_the_stack_title() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getStackPracticeQuesPageUrl());
	}

}