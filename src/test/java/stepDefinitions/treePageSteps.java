package stepDefinitions;

import static org.testng.Assert.assertEquals;

import Utilities.Helper;
import fileReader.ConfigFileReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.treePage;

public class treePageSteps extends BaseClass {

	ConfigFileReader configFileReader = new ConfigFileReader();;

	@When("User click Get Started button for the tree card")
	public void user_click_get_started_button_for_tree_card() {
		treePg = new treePage(Helper.getDriver());
		treePg.clickGetStartedBtn();
	}

	@Then("User should redirected to tree page")
	public void user_should_redirected_to_tree_page() {
		homePage = new HomePage(Helper.getDriver());
		String url = homePage.verifyPage();
		assertEquals(url, configFileReader.getTreePageUrl());
	}

	@When("User click overview of trees link")
	public void user_click_overview_of_trees_link() {
		treePg.clickOverviewOfTreesLink();
	}

	@When("User click terminologies link")
	public void user_click_terminologies_link() {
		treePg.clickTerminologieslink();
	}

	@When("User click types of trees link")
	public void user_click_types_of_trees_link() {
		treePg.clickTypesOfTrees();
	}

	@When("User click traversals illustration link")
	public void user_click_traversals_illustration_link() {
		treePg.clickTraversalsIllustration();
	}

	@When("User click binary trees link")
	public void user_click_binary_trees_link() {
		treePg.click_binary_trees_link();
	}

	@When("User click types of binary trees link")
	public void user_click_types_of_binary_trees_link() {
		treePg.clickTypesOfBinaryTrees();
	}

	@When("User click implementation in python trees link")
	public void user_click_implementation_in_python_trees_link() {
		treePg.clickImplementationPythonTrees();
	}

	@When("User click binary trees traversals link")
	public void user_click_trees_traversals_link() {
		treePg.clickBinaryTreeTraversals();
	}
	
	@When("User click implementation of binary trees link")
	public void user_click_implementation_of_binary_trees_link() {
		treePg.clickImplementationOfBinaryTree();
	}
	
	@When("User click applications of binary trees link")
	public void user_click_applications_of_binary_trees() {
		treePg.clickApplicationsOfBinaryTrees();
	}
	
	@When("User click binary search trees link")
	public void user_click_binary_search_trees() {
		treePg.clickBinarySearchTree();
	}
	
	@When ("User click implementation of bst link")
	public void user_click_implementation_of_bst_link() {
		treePg.clickImplementBstLink();
	}

}