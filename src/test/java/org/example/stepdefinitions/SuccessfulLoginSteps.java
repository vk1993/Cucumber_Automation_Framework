package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

// This class is no longer needed. All step definitions are now in LoginSteps.java to avoid duplication errors.
public class SuccessfulLoginSteps extends TestBase {
    // @Given("the browser is launched")
    // public void the_browser_is_launched() {
    //     launchBrowser();
    // }

    // @And("the user navigates to the login page URL")
    // public void the_user_navigates_to_the_login_page_url() {
    //     navigateToLoginPage();
    // }

    // @Then("the login page should be displayed successfully")
    // public void the_login_page_should_be_displayed_successfully() {
    //     String expectedUrl = BASE_URL;
    //     if (!driver.getCurrentUrl().equals(expectedUrl)) {
    //         throw new AssertionError("Login page not displayed. Current URL: " + driver.getCurrentUrl());
    //     }
    // }

    // @When("the user enters username {string}")
    // public void the_user_enters_username(String username) {
    //     driver.findElement(By.id("username")).clear();
    //     driver.findElement(By.id("username")).sendKeys(username);
    // }

    // @And("the user enters password {string}")
    // public void the_user_enters_password(String password) {
    //     driver.findElement(By.id("password")).clear();
    //     driver.findElement(By.id("password")).sendKeys(password);
    // }

    // @And("clicks the login button")
    // public void clicks_the_login_button() {
    //     driver.findElement(By.cssSelector("button[type='submit']")).click();
    // }

    // @Then("Verify that the user is redirected to the /secure page")
    // public void verify_user_redirected_to_secure_page() {
    //     if (!driver.getCurrentUrl().contains("/secure")) {
    //         throw new AssertionError("User not redirected to /secure page. Current URL: " + driver.getCurrentUrl());
    //     }
    // }

    // @Then("Confirm the success message {string} is visible.")
    // public void confirm_success_message_visible(String message) {
    //     String actualMsg = driver.findElement(By.cssSelector(".flash.success")).getText();
    //     if (!actualMsg.contains(message)) {
    //         throw new AssertionError("Expected success message not found. Actual: " + actualMsg);
    //     }
    // }

    // @Then("verify Verify that a Logout button is displayed")
    // public void verify_logout_button_displayed() {
    //     if (!driver.findElement(By.cssSelector("a.button.secondary.radius")).isDisplayed()) {
    //         throw new AssertionError("Logout button not displayed");
    //     }
    // }
}
