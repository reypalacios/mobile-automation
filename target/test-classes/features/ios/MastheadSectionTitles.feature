 @ios @android @masthead
Feature: Masthead Section Titles

 As a user, I want to see a vertical heading on the masthead so I can see where I am in the app as I navigate around.

 Scenario: User is in home vertical
   Given I am on the home vertical

 Scenario Outline: Swiping to the left
    When User swipes to the left
    Then Verify <vertical> is rendered

    Examples:
     | vertical |
     | LATEST |
     | TECH |
#     | ENTERPRISE |
#     | SCIENCE |
#     | FINANCE |
#     | MARKETS |
#     | YOUR MONEY |
#     | WEALTH ADVISOR |
#     | POLITICS |
#     | MILITARY & DEFENSE |
#     | LAW & ORDER |
#     | STRATEGY |
#     | CAREERS |
#     | ADVERTISING |
#     | RETAIL |
#     | SMALL BUSINESS |
#     | LIFE |
#     | TRANSPORTATION |
#     | EDUCATION |
#     | ENTERTAINMENT |
#     | SPORTS |
#     | HOME |

 Scenario Outline: Swiping to the right
  When User swipes to the right
  Then Verify <vertical> is rendered

  Examples:
   | vertical |
#   | SPORTS |
#   | ENTERTAINMENT |
#   | EDUCATION |
#   | TRANSPORTATION |
#   | LIFE |
#   | SMALL BUSINESS |
#   | RETAIL |
#   | ADVERTISING |
#   | CAREERS |
#   | STRATEGY |
#   | LAW & ORDER |
#   | MILITARY & DEFENSE |
#   | POLITICS |
#   | WEALTH ADVISOR |
#   | YOUR MONEY |
#   | MARKETS |
#   | FINANCE |
#   | SCIENCE |
#   | ENTERPRISE |
#   | TECH |
   | LATEST |
   | HOME |










