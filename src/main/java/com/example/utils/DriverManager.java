package com.example.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.example.utils.DriverManager;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchSteps {
    private WebDriver driver;

    @Given("I am on the homepage")
    public void iAmOnHomepage() {
        driver = DriverManager.getDriver(); // Get the WebDriver instance
        driver.get("https://example.com");
    }

    // ... Rest of the step definitions ...

    @After
    public void closeBrowser() {
        DriverManager.quitDriver(); // Quit and close the WebDriver instance
    }
}
