package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    
    // Define locators for elements on the homepage
    private By searchBoxLocator = By.id("search-box");
    private By searchButtonLocator = By.id("search-button");
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    // Method to enter a search query in the search box
    public void enterSearchQuery(String query) {
        driver.findElement(searchBoxLocator).sendKeys(query);
    }
    
    // Method to click the search button
    public void clickSearchButton() {
        driver.findElement(searchButtonLocator).click();
    }
    
    // Other methods for interacting with elements on the homepage
}
