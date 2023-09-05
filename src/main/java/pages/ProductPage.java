package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    
    // Define locators for elements on the product page
    private By productNameLocator = By.xpath("//h1[@class='product-title']");
    private By productPriceLocator = By.xpath("//span[@class='product-price']");
    private By addToCartButtonLocator = By.xpath("//button[@class='add-to-cart']");
    
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    
    // Method to get the product name from the product page
    public String getProductName() {
        return driver.findElement(productNameLocator).getText();
    }
    
    // Method to get the product price from the product page
    public String getProductPrice() {
        return driver.findElement(productPriceLocator).getText();
    }
    
    // Method to click the "Add to Cart" button
    public void clickAddToCart() {
        driver.findElement(addToCartButtonLocator).click();
    }
    
    // Other methods for interacting with elements on the product page
}
