package com.example.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchSteps {
    private WebDriver driver;

    @Given("I am on the homepage")
    public void iAmOnHomepage() {
        // Initialize WebDriver (ChromeDriver in this example)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();

        // Navigate to the homepage
        driver.get("https://example.com");
    }

    @When("I search for {string}")
    public void iSearchFor(String query) {
        // Find the search input element and enter the query
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys(query);

        // Submit the search
        searchInput.submit();
    }

    @Then("I should see search results")
    public void iShouldSeeSearchResults() {
        // Implement assertions to verify the presence of search results
        assertTrue(driver.findElement(By.id("search-results")).isDisplayed());
    }

    @And("the results should contain at least {int} products")
    public void theResultsShouldContainAtLeastProducts(int minProductCount) {
        // Implement assertions to check the number of products in search results
        int actualProductCount = driver.findElements(By.className("product")).size();
        assertTrue(actualProductCount >= minProductCount);
    }

    @And("the results should be sorted by relevance")
    public void theResultsShouldBeSortedByRelevance() {
        // Implement assertions to check sorting by relevance (e.g., check for relevance indicators)
        WebElement relevanceIndicator = driver.findElement(By.cssSelector(".relevance-indicator"));
        assertTrue(relevanceIndicator.isDisplayed());
    }

    @After
    public void closeBrowser() {
        // Close the browser after the scenario is completed
        driver.quit();
    }
}
