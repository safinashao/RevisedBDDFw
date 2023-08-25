package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import opencartPages.LoginPage;

public class LoginPageStepDef {
	
	private WebDriver driver;
	private LoginPage loginpage;
	
	
	/*
	 * @Before public void setUp() {
	 * 
	 * }
	 * 
	 * @After public void tearDown() {
	 * 
	 * }
	 */

@Given("I am on the OpenCart login Page")
public void i_am_on_the_open_cart_login_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I have entered a valid username and password")
public void i_have_entered_a_valid_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("I click on the login button")
public void i_click_on_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("I should be logged in successfully")
public void i_should_be_logged_in_successfully() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("I click on the {string}")
public void i_click_on_the(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("I should be redirected to the password reset page")
public void i_should_be_redirected_to_the_password_reset_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
