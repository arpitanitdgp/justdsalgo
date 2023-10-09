package stepDefinitions;

import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import Utilities.Helper;
import fileReader.ConfigFileReader;

public class landingPageSteps extends BaseClass {

	ConfigFileReader configFileReader = new ConfigFileReader();;
	String landingPageTitle = "NumpyNinja";

	@Given("User Launches Chrome Browser")
	public void user_launches_chrome_browser() {
		landingPage = new LandingPage(Helper.getDriver());
	}

	@When("User opens DS Algo portal link")
	public void user_opens_DS_Algo_portal_link() {
		Helper.openPage(configFileReader.getApplicationUrl());
	}

	@Then("User clicks Get Started button")
	public void user_clicks_Get_Started_button() {
		if (landingPage.isButtonDisplayed()) {
			landingPage.ClickGetStartedBtn();
		}
		
	}

	@And("User lands on Home page")
	public void User_lands_on_Home_page() {
		Assert.assertEquals(landingPageTitle.replace("\\s+", "").trim(),
				landingPage.getHomePageTitle().replace("\\s+", "").trim());
	}

}