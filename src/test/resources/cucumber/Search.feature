@search
Feature: Search

  Scenario: Verify Users are able to search

    When I click the search icon
    Then I enter text The Two Apples
    Then I click the search result
    And  I compare search result


