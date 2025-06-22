package org.example.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * TestBase contains all reusable code for browser setup, teardown, and navigation.
 * Extend this class in your step definition classes to reuse these methods.
 * Use a separate Hooks class for @Before and @After logic.
 */
public class TestBase {
    protected static WebDriver driver;
    protected static final String BASE_URL = "https://practice.expandtesting.com/login";

    public void launchBrowser() {
        if (driver == null) {
            // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Uncomment and set path if needed
            driver = new ChromeDriver();
        }
    }

    public void navigateToLoginPage() {
        driver.get(BASE_URL);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
