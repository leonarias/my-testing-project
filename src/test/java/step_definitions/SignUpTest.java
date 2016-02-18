package step_definitions;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import includes.*;
import page_objects.BasePage;


public class SignUpTest extends FeatureHelpMod {
	
	FeatureHelpMod fx = new FeatureHelpMod();
	Signup_Methods sm = new Signup_Methods();
	
	
	@Given("^user is on openweathermap current page$")
	public void user_is_on_openweathermap_current_page() throws MalformedURLException,
	        InterruptedException {
	    fx.createDriver();
	    fx.isCurrentPageDisplayed();
	}

	@When("^user clicks on Sign Up link$")
	public void user_clicks_on_Sign_Up_link() throws Throwable {
		BasePage.pom_sign_up_link(driver).click();
	}

	@Then("^Create New Account page is displayed$")
	public void create_New_Account_page_is_displayed() throws Throwable {
		assertTrue(driver.getTitle().contains("Members"));
		fx.assertTextinPage("Create New Account");
	}

	@And("^I submit the form with valid data$")
	public void i_submit_the_form_with_valid_data(DataTable table) throws Throwable {
		sm.createNewAccount(table);
    }

	@Then("^I check that the form has been submitted$")
	public void i_check_that_the_form_has_been_submitted() throws Throwable {
		fx.assertTextinPage("Welcome! You have signed up successfully.");
		fx.teardown();
	}
	
}

