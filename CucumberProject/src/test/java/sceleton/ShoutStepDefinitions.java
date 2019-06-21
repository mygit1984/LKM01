package sceleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ShoutStepDefinitions {
	//to import all do ctrl+shift+o
	Person rounak=new Person();
	Person rita=new Person();
	@Given("Rounak is {int} meters away from Rita")
	public void rounak_is_meters_away_from_Rita(Integer int1) {
	    rounak.setDistance(int1);
	}

	@When("Rounak shouts {string}")
	public void rounak_shouts(String string) {
	    rounak.setMessage(string);
	}

	@Then("Rita listens to the message")
	public void rita_listens_to_the_message() {
	    String message=rounak.getMessage();
	    Assert.assertEquals("Free Coffee", message);
	}


}
