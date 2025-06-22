Feature: Invalid Username

  Scenario: Login attempt with invalid username
    Given the browser is launched
    And the user navigates to the login page URL
    Then the login page should be displayed successfully
    When the user enters username "wrongUser"
    And the user enters password "SuperSecretPassword!"
    And clicks the login button
    Then an error message "Invalid username." should be displayed
    And the user should remain on the login page

