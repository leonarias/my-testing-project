package step_definitions;

import java.net.MalformedURLException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import includes.FeatureHelpMod;

public class PageTitlesTest {
	
	FeatureHelpMod fx = new FeatureHelpMod();
	
	@Given("^I am on openweathermap current page$")
	public void i_am_on_openweathermap_current_page() throws MalformedURLException,
        InterruptedException {
    fx.createDriver();
}

	@When("^I navigate to \"(.*?)\"$")
		public void i_navigate_to(String link) throws Throwable {
		fx.navigateToLink(link);
	}

	@Then("^I check the page title is \"(.*?)\"$")
	public void i_check_the_page_title_is(String title) throws Throwable {
	    fx.checkPageTitle(title);
	}

	@And("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fx.teardown();
	}

}








