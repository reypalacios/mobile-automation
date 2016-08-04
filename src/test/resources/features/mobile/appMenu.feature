@ios @menu
Feature: App Menu

 Scenario Outline: Verify all the menu options are linkable
    Given Hamburger menu is open
    When I click <menuOption> option
    Then Verify <menuOption> is rendered

    Examples:
     | menuOption |
     | Latest |
     | HOME |
     | TECH |
     | Enterprise|
     | Science |
     | FINANCE |
     | Markets |
     | Your Money|
     | Wealth Advisor |
     | POLITICS |
     | Military & Defense |
     | Law & Order |
     | STRATEGY |
     | Careers |
     | Advertising |
     | Retail |
     | Small Business |
     | LIFE |
     | Transportation |
     | Education |
     | ENTERTAINMENT |
     | Sports |







