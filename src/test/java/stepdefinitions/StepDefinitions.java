package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    private WebDriver driver;

    @Given("User is on the homepage")
    public void userIsOnHomepage() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://example.com"); // Replace with your website URL
    }

    @When("User enters {string} in the search bar")
    public void userEntersTextInSearchBar(String searchText) {
        WebElement searchInput = driver.findElement(By.name("q")); // Replace with the actual search input locator
        searchInput.sendKeys(searchText);
    }

    @When("User clicks the search button")
    public void userClicksSearchButton() {
        WebElement searchButton = driver.findElement(By.name("search")); // Replace with the actual search button locator
        searchButton.click();
    }

    @Then("Results for {string} are displayed")
    public void resultsForTextAreDisplayed(String searchText) {
        WebElement resultElement = driver.findElement(By.id("results")); // Replace with the actual results element locator
        String displayedText = resultElement.getText();
        assertEquals("Results do not match", "Results for " + searchText, displayedText);
        driver.quit();
    }
}
