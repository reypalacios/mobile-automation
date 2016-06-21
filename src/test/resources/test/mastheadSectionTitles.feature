Feature: Masthead Section Titles

# Scenario: Setup
#    Given User is in the Home Vertical

 Scenario Outline: As a user, I want to see a vertical heading on the masthead so I can see where I am in the app as I navigate around.

    When User swipes to the left
    Then Verify <vertical> is rendered

    Examples:
     | vertical |
     | LATEST |
     #| TECH |
     | ENTERPRISE |
     | SCIENCE |
     | FINANCE |
     | MARKETS |
     | YOUR MONEY |
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









