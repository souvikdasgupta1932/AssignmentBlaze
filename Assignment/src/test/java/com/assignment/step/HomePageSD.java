package com.assignment.step;

import com.assignment.cucumber.Driverfactory;
import com.assignment.model.HomePage;
import com.assignment.utils.Inputs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSD extends Driverfactory {
	
	HomePage hp;
	
	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
	   hp = new HomePage(driver);
	   hp.goTo();
	   hp.validateHeader();
	   System.out.println("Test");
	}

	@Then("^the user selects \"([^\"]*)\" place as \"([^\"]*)\"$")
	public void the_user_selects_place_as(String direction, String place) throws Throwable {
	   
		hp.selectCity(place,direction);
	}
	
	@Then("^the user clicks on \"([^\"]*)\" button$")
	public void the_user_clicks_on_button(String name) throws Throwable {
		hp.clickFindFlights(name);
	}

}
