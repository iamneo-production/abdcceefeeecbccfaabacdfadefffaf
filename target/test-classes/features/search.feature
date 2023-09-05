Feature: Search Functionality

  Scenario: Verify search results
    Given I am on the homepage
    When I search for "product"
    Then I should see search results
    And the results should contain at least 10 products
    And the results should be sorted by relevance
