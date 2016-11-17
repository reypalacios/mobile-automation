@ios @menu
Feature: App Menu

 Scenario Outline: Verify all the menu options are linkable
    Given Hamburger menu is open
    When I click <menuOption> option
    Then Verify <menuOption> is rendered

    Examples:
     | menuOption |
     | LATEST |
     | HOME |
     | TECH |
     | ENTERPRISE |
     | SCIENCE |
     | FINANCE |
     | MARKETS |
     | YOUR MONEY|
     | WEALTH ADVISOR |
     | POLITICS |
     | MILITARY & DEFENSE |
     | LAW & ORDER |
     | STRATEGY |
     | CAREERS |
     | ADVERTISING |
     | RETAIL |
     | SMALL BUSINESS |
     | LIFE |
     | TRANSPORTATION |
     | EDUCATION |
     | ENTERTAINMENT |
     | SPORTS |







