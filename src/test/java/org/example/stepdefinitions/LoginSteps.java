package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps extends TestBase {
    private String lastUsername;
    private String lastPassword;

    @Given("the browser is launched")
    public void the_browser_is_launched() {
        launchBrowser();
    }

    @And("the user navigates to the login page URL")
    public void the_user_navigates_to_the_login_page_url() {
        navigateToLoginPage();
    }

    @Then("the login page should be displayed successfully")
    public void the_login_page_should_be_displayed_successfully() {
        String expectedUrl = BASE_URL;
        if (!driver.getCurrentUrl().equals(expectedUrl)) {
            throw new AssertionError("Login page not displayed. Current URL: " + driver.getCurrentUrl());
        }
    }

    @When("the user enters username {string}")
    public void the_user_enters_username(String username) {
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(username);
    }

    @And("the user enters password {string}")
    public void the_user_enters_password(String password) {
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("clicks the login button")
    public void clicks_the_login_button() {
        // Wait for the button to be clickable and scroll into view if needed
        WebElement button = driver.findElement(By.cssSelector("button[type='submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        new WebDriverWait(driver, Duration.ofSeconds(5))
            .until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }

    @Then("Verify that the user is redirected to the \\/secure page")
    public void verify_that_the_user_is_redirected_to_the_secure_page() {
        if (!driver.getCurrentUrl().contains("/secure")) {
            throw new AssertionError("User not redirected to /secure page. Current URL: " + driver.getCurrentUrl());
        }
    }

    @Then("Confirm the success message {string} is visible.")
    public void confirm_success_message_visible(String message) {
        String actualMsg = driver.findElement(By.cssSelector(".flash.success")).getText();
        if (!actualMsg.contains(message)) {
            throw new AssertionError("Expected success message not found. Actual: " + actualMsg);
        }
    }

    @Then("verify Verify that a Logout button is displayed")
    public void verify_logout_button_displayed() {
        if (!driver.findElement(By.cssSelector("a.button.secondary.radius")).isDisplayed()) {
            throw new AssertionError("Logout button not displayed");
        }
    }

    @Then("an error message {string} should be displayed")
    public void error_message_should_be_displayed(String errorMsg) {
        // Wait for the error message to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".flash")));
        String actualMsg = errorElement.getText();
        if (!actualMsg.contains(errorMsg)) {
            throw new AssertionError("Expected error message not found. Actual: " + actualMsg);
        }
    }

    @Then("the user should remain on the login page")
    public void user_should_remain_on_login_page() {
        if (!driver.getCurrentUrl().equals(BASE_URL)) {
            throw new AssertionError("User did not remain on login page. Current URL: " + driver.getCurrentUrl());
        }
    }
}
