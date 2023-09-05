Feature: Search functionality on a website

  Scenario: User searches for a product
    Given User is on the homepage
    When User enters "Laptop" in the search bar
    And User clicks the search button
    Then Results for "Laptop" are displayed
