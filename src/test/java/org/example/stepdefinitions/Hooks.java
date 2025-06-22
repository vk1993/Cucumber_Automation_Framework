package org.example.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase {
    @Before
    public void setUp() {
        launchBrowser();
        navigateToLoginPage();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}

