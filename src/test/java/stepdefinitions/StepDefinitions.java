// Sample StepDefinitions.java
package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import framework.DriverManager;
import framework.PropertiesReader;

public class StepDefinitions {
    private WebDriver driver;

    @Given("I open the browser")
    public void i_open_the_browser() {
        String browser = PropertiesReader.getBrowser();
        driver = DriverManager.getDriver(browser);
    }

    @When("I navigate to the homepage")
    public void i_navigate_to_the_homepage() {
        driver.get("https://example.com"); // Replace with your webpage URL
    }

    @Then("I should see the search bar")
    public void i_should_see_the_search_bar() {
        // Add assertions to check if the search bar is visible
    }

    // Implement more steps for your scenarios...

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
