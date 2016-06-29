Feature: App Menu

 Scenario Outline: Verify all the BI sections/verticals are displayed.
    Given Hamburger menu is open
    When I click the <menuOption>
    Then Verify <menuOption> is rendered

    Examples:
     | menuOption |
     | Favorites |
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







