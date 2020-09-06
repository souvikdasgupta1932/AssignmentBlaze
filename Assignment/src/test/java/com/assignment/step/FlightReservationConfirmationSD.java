package com.assignment.step;

import com.assignment.cucumber.Driverfactory;
import com.assignment.model.FlightReservationConfirmation;
import com.cucumber.listener.Reporter;

import cucumber.api.java.en.Then;

public class FlightReservationConfirmationSD extends Driverfactory {
	
	FlightReservationConfirmation frc;
	
	@Then("^the user verify ID is generated$")
	public void the_user_verify_ID_is_generated() throws Throwable {
		frc = new FlightReservationConfirmation(driver);
		String value = frc.captureDetails("Id");
		Reporter.addStepLog("The Purchase Id is: "+ value);
	}

	@Then("^the user verify Status is generated$")
	public void the_user_verify_Status_is_generated() throws Throwable {
		String value = frc.captureDetails("Status");
		Reporter.addStepLog("The Purchase Status is: "+ value);
	}

}
