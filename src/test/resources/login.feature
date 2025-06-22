Feature: Successful Login

  Background:
    Given the browser is launched
    And the user navigates to the login page URL
    Then the login page should be displayed successfully

  @smoke
  Scenario: Successful login with valid credentials
    When the user enters username "practice"
    And the user enters password "SuperSecretPassword!"
    And clicks the login button
    Then Verify that the user is redirected to the \/secure page
    Then Confirm the success message "You logged into a secure area!" is visible.
    Then verify Verify that a Logout button is displayed

  @regression
  Scenario: Login attempt with invalid username
    When the user enters username "wrongUser"
    And the user enters password "SuperSecretPassword!"
    And clicks the login button
    Then an error message "Invalid username." should be displayed
    And the user should remain on the login page

  @regression
  Scenario: Login attempt with invalid password
    When the user enters username "practice"
    And the user enters password "WrongPassword"
    And clicks the login button
    Then an error message "Invalid password." should be displayed
    And the user should remain on the login page

  @smoke @regression
  Scenario Outline: Login attempts with different credentials
    When the user enters username "<username>"
    And the user enters password "<password>"
    And clicks the login button
    Then <result>

    Examples:
      | username    | password              | result                                                                 |
      | practice    | SuperSecretPassword!  | Verify that the user is redirected to the \/secure page                |
      | wrongUser   | SuperSecretPassword!  | an error message "Invalid username." should be displayed              |
      | practice    | WrongPassword         | an error message "Invalid password." should be displayed              |
