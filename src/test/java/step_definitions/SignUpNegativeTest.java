package step_definitions;

import java.net.MalformedURLException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import includes.FeatureHelpMod;
import includes.Signup_Methods;
import page_objects.BasePage;
import page_objects.SignUpPage;

public class SignUpNegativeTest extends FeatureHelpMod {
	
	FeatureHelpMod fx = new FeatureHelpMod();
	Signup_Methods sm = new Signup_Methods();
	
	@Given("^user is on SignUp page$")
	public void user_is_on_SignUp_page() throws MalformedURLException,
        InterruptedException {
		fx.createDriver();
    	fx.isCurrentPageDisplayed();
		
		BasePage.pom_sign_up_link(driver).click();
	}

	@When("^user submits the form with blank data$")
	public void user_submits_the_form_with_blank_data() throws Throwable {
		SignUpPage.pom_create_account_btn(driver).click();
		fx.assertTextinPage("can't be blank");
		fx.assertTextinPage("must be accepted");
		
	}

	@Then("^error messages are displayed correctly$")
	public void error_messages_are_displayed_correctly() throws Throwable {
		// Wrong email
		SignUpPage.pom_email_txt(driver).sendKeys("mymail");
		SignUpPage.pom_create_account_btn(driver).click();
		fx.assertTextinPage("is invalid");
				
		//Password too small
		SignUpPage.pom_password_txt(driver).sendKeys("123");
		SignUpPage.pom_password_confirmation_txt(driver).sendKeys("123");
		SignUpPage.pom_create_account_btn(driver).click();
		fx.assertTextinPage("is too short (minimum is 8 characters)");
				
		//Password doesn't match
		SignUpPage.pom_password_txt(driver).sendKeys("12345678");
		SignUpPage.pom_password_confirmation_txt(driver).sendKeys("12345679");
		SignUpPage.pom_create_account_btn(driver).click(); // There's no validation for this scenario. Bug!
		fx.teardown();
	}

}
