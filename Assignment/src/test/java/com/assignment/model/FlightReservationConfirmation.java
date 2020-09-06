package com.assignment.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightReservationConfirmation {
	WebDriver driver;
	private WebElement getValue;
	
	public FlightReservationConfirmation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String captureDetails(String detailsLabel) {
		getValue = driver.findElement(By.xpath("//*[contains(text(),'"+detailsLabel+"')]/following::td[1]"));
		
		return getValue.getText();
	}
	
	

}
