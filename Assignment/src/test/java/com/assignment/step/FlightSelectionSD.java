package com.assignment.step;

import com.assignment.cucumber.Driverfactory;
import com.assignment.model.FlightSelection;
import com.itextpdf.text.log.SysoCounter;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class FlightSelectionSD extends Driverfactory {
	
	FlightSelection fs;
	
	@Then("^the user selects flight \"([^\"]*)\" and No \"([^\"]*)\"$")
	public void the_user_selects_flight_and_No(String name, String no) throws Throwable {
		
		fs = new FlightSelection(driver);
		fs.selectFlight(no,name);
		
		System.out.println("Stop");
	}

	@Then("^verify the flight is reserved$")
	public void verify_the_flight_is_reserved() throws Throwable {
	    
		Assert.assertTrue(fs.verifyFlightReserved());
	}

}
