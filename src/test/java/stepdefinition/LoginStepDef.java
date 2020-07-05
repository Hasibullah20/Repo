package stepdefinition;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends Base {
	
	@Given("^User is on Hotel page$")
	public void user_is_on__Hotel_page() {
	Base.initialize();
	}
	
	@When("^User click on Login$")
	public void userClickOnLogin() {
		System.out.println("This is second step");
	}
	
	@Then("^User should see Login page$")
	public void user_should_see_Login_page() {
		System.out.println("This is third step");
	}

}
