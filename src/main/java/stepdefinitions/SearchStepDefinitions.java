package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import framework.WebDriverFactory;
import pages.HomePage;
import pages.SearchResultPage;
import org.openqa.selenium.WebDriver;

public class SearchStepDefinitions {

    private WebDriver driver = WebDriverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private SearchResultPage searchResultPage = new SearchResultPage(driver);

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        homePage.navigateToHomePage();
    }

    @When("I search for {string}")
    public void i_search_for(String searchTerm) {
        homePage.searchForProduct(searchTerm);
    }

    @Then("I should see search results")
    public void i_should_see_search_results() {
        // Add assertions here to verify search results
    }

    // Implement steps for other scenarios as needed
}
