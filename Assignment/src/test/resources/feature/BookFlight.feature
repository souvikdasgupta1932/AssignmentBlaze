@Test
Feature: Flight Booking

  Background: 
    Given user is on the home page

  Scenario: Book flight and verify
    Then the user selects "departureCity" place as "Paris"
    Then the user selects "destinationCity" place as "Rome"
    Then the user clicks on "Find Flights" button
    Then the user selects flight "Virgin America" and No "43"
    And verify the flight is reserved
    Then user fills in the purchase details
      | Name   | Address | City | State       | Zip Code | Card Type | Credit Card Number | Month | Year | Name on Card |
      | Souvik | Pune    | Pune | Maharashtra |   412207 | Visa      |         1234567890 |    11 | 2017 | Souvik       |
    Then the user clicks on "Purchase Flight" button
    Then the user verify ID is generated
    Then the user verify Status is generated