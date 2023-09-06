Feature: Search on E-commerce Website

    Scenario: Perform a basic search
        Given I am on the homepage
        When I search for "Product Name"
        Then I should see search results

    # Add other scenarios as needed
