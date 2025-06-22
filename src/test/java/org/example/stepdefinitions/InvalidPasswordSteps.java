package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

// This class is no longer needed. All step definitions are now in LoginSteps.java to avoid duplication errors.

public class InvalidPasswordSteps extends TestBase {
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

    // @Then("an error message {string} should be displayed")
    // public void error_message_should_be_displayed(String errorMsg) {
    //     String actualMsg = driver.findElement(By.cssSelector(".flash.error")).getText();
    //     if (!actualMsg.contains(errorMsg)) {
    //         throw new AssertionError("Expected error message not found. Actual: " + actualMsg);
    //     }
    // }

    // @Then("the user should remain on the login page")
    // public void user_should_remain_on_login_page() {
    //     if (!driver.getCurrentUrl().equals(BASE_URL)) {
    //         throw new AssertionError("User did not remain on login page. Current URL: " + driver.getCurrentUrl());
    //     }
    // }
}

