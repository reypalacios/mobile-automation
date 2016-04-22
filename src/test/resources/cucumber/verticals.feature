Feature: Verticals

 Scenario Outline: Verify <vertical> are appearing correctly. Users are able to scroll down verticals and click on them.
    Given Hamburger menu is open
    When I click the <vertical>
    Then Verify <vertical> is rendered

    Examples:
     | vertical |
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







